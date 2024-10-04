package com.utlity;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.google.common.io.Files;
import com.testpageclass.Testbase;

public class commonmethods extends Testbase{

	
	
	public  static void Verfiytitle(String exceptedtitle) throws IOException {
		String actualtitle=driver.getTitle();
		Assert.assertEquals( actualtitle, exceptedtitle);
		System.out.println("Vefiy pagetitle"+exceptedtitle);
		test.pass("Vefiy pagetitle"+exceptedtitle);
		takesceernshort(driver);
		
	}
	public  static void takesceernshort(WebDriver driver ) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		TakesScreenshot shot=(TakesScreenshot) driver;

		File source= shot.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Automation\\SeleniumPractice\\Scrreshots\\Bhmpyaa_"+timeStamp+ ".png");
		
		
		
		Files.copy(source, dest);
		
		test.pass( MediaEntityBuilder.createScreenCaptureFromPath(dest.toString()).build());
	}
	
	
	
}
