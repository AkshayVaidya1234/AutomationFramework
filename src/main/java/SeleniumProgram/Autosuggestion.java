package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("twitter");
		
		Thread.sleep(2000);
		
	List<WebElement>autooption=	driver.findElements(By.xpath("//ul/li[@class='sbct']"));
	
	System.out.println(autooption.size());
	
	Thread.sleep(2000);
	
	for(WebElement suggestion:autooption) {
		String option=suggestion.getText();
		System.out.println(option);
		if(option.equalsIgnoreCase("twitter login")) {
			suggestion.click();
			break;
		}
		
		
	}
	
	
	
	
	
		
		
	}

}
