package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import SeleniumPractice.SeleniumPractice.utility;

public class Failscreenshots {

	WebDriver driver;
	
	 @BeforeTest
   public void before() {
 	driver = new ChromeDriver();
 	driver.get("https://www.saucedemo.com/");
 	
 	driver.manage().window().maximize();
 	}
	 
	 @Test
	public void verfiytitle() {
		String actualtitle= driver.getTitle();
		String exceptedtitle="Swag Lab";
		Assert.assertEquals(actualtitle, exceptedtitle);
		
	}
	 
	 @Test
	 
	 public void login() {
		 driver.findElement(By.id("user-name")).sendKeys("standard_use");
		 driver.findElement(By.id("password")).sendKeys("1234");
		 driver.findElement(By.id("login-button")).click();
	 }
	 
	 @AfterMethod
	 
	 public void failtest(ITestResult result) throws IOException {
		 if(ITestResult.FAILURE==result.getStatus()) {
			 
			 utility.Takingscrrenshots(driver, result.getName());
			// File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				// FileUtils.copyFile(screenshotfile, new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\New folder\\Swag.png"));
		 }
	 }

	}


