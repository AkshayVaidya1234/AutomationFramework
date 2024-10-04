package Actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("Akshay");
		
		driver.findElement(By.id("password")).sendKeys("kutr");
		
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ss= (TakesScreenshot)driver;
		
		 File source= ss.getScreenshotAs(OutputType.FILE);
		 
		 File dist= new File("C:\\Automation\\SeleniumPractice\\Scrreshots\\Akshay.png");
		 
		 FileUtils.copyFile(source, dist);
		 
		 
		
		
		
		
	}

}
