package Javascrpit;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentScreenShot {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		ExtentReports ex= new ExtentReports();
		File fis= new File("C:\\\\Automation\\\\SeleniumPractice\\\\Reports.html");
		ExtentSparkReporter spark= new ExtentSparkReporter(fis);
		ex.attachReporter(spark);
		
		driver= new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(5000);
		String path=capturescreenshot("goole.png");
		
		ex.createTest("Screenshot Test","Attached Scrrenshot")
		.info("this is info msg")
		.addScreenCaptureFromPath(path);
		
		ex.createTest("Screenshot Test2","Attached Scrrenshot")
		.info("this is info msg")
		.addScreenCaptureFromPath(path,"Google HomePage");
		
		ex.createTest("Screenshot Test3","Attached Scrrenshot")
		.info("this is info msg")
		.addScreenCaptureFromPath(path,"homepage1")
		.addScreenCaptureFromPath(path,"homepage2")
		.addScreenCaptureFromPath(path,"homepage3");
		
		ex.createTest("Screenshot Test4","Attached Scrrenshot logs")
		.info("this is info msg")
		.fail(MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		ex.createTest("Screenshot Test5","Attached Scrrenshot logs")
		.info("this is info msg")
		.fail("this is info msg",MediaEntityBuilder.createScreenCaptureFromPath(path,"gpage").build());
		
		
		
	
	
	
	ex.flush();
	driver.quit();
	Desktop.getDesktop().browse(new File("Reports.html").toURI());
	}
	
	public static String capturescreenshot(String filename) throws IOException {
		TakesScreenshot ss= (TakesScreenshot)driver;
		File source= ss.getScreenshotAs(OutputType.FILE);
		File folder=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\New folder\\AkshayExtent.png"+filename);
		FileUtils.copyFile(source, folder);
		return folder.getAbsolutePath();
	}

}

	


