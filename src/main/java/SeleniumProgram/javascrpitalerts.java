package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascrpitalerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		// simple alert
		driver.switchTo().alert().accept();
		
		//confirm alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();

		// prompt alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Hii ms ");
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
