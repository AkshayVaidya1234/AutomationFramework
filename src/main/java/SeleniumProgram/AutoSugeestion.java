package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugeestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
	List<WebElement>auto=	driver.findElements(By.xpath("//ul/li[@class='sbct']"));
	System.out.println(auto.size());
	
	Thread.sleep(3000);
	
	for(WebElement autosuggestion:auto) {
		//System.out.println(autosuggestion.getText());
		String suggest=autosuggestion.getText();
		
		System.out.println(suggest);
		
		if(suggest.equalsIgnoreCase("selenium webdriver")) {
			autosuggestion.click();
			break;
		}
		
		
		
	}
	
	
	
	
	
		
		
		
		
	}

}
