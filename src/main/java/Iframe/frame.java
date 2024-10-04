package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//1st frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		// back to main frame
		driver.switchTo().defaultContent();
		
		//2nd Frame
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.partialLinkText("WebDriver")).click();
		
		// back to main frame
		driver.switchTo().defaultContent();
		
		//3rd Frame
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//a[text()='Package']")).click();
				
	}

}
