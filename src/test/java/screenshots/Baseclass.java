package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumPractice.SeleniumPractice.utility;

public class Baseclass {
	 WebDriver driver;
	
	 @BeforeTest
    public void before() {
  	driver = new ChromeDriver();
  	driver.get("https://www.mayoclinic.org/");
  	
  	driver.manage().window().maximize();
  	}
	 
	 @Test
	 
	 public void verfiyWebTitle() {
		String actultile= driver.getTitle();
		String exceptedtitle="Top-ranked Hospital in the Nation – Mayo Clin";
		
		Assert.assertEquals(actultile, exceptedtitle);
		 
	 }
	 
	 @AfterMethod
	 public void failtestcase(ITestResult result) throws IOException {
		 if(ITestResult.FAILURE==result.getStatus());
		 
		 utility.Takingscrrenshots(driver, result.getName() );
	
		 
		 
		 // File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(screenshotfile, new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\New folder\\failure.png"));
	 }
}

