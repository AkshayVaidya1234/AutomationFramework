package Windowhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor js =(JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Page One']")));
			
			Thread.sleep(2000);
			
			
		}
		
	

	}

