package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		Thread.sleep(5000);
		
	List<WebElement>autosuggestion=	driver.findElements(By.xpath("//li[@class='Y5N33s']"));
	
	for(int i=0;i<autosuggestion.size()-1;i++) {
		System.out.println(autosuggestion.get(i).getText());
	}
	
	for(int i=0;i<autosuggestion.size()-1;i++) {
		if(autosuggestion.get(i).getText().contains("shoes for boys")) {
			autosuggestion.get(i).click();
		}
	}

	}

}
