package Javascrpit;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportsauthor {
	public static void main(String[] args) throws IOException {
		
	
	
	ExtentReports ex= new ExtentReports();
	File fis= new File("C:\\\\Automation\\\\SeleniumPractice\\\\Reports.html");
	ExtentSparkReporter spark= new ExtentSparkReporter(fis);
	ex.attachReporter(spark);
	
	ex.createTest("Test 1","Test desc")
	.assignAuthor("Akshay")
	.assignCategory("Smoke")
	.assignDevice("edge99")
	.pass("This test case is passed");
	
	ex.createTest("Test 2","Test desc")
	.assignAuthor("Sonu")
	.assignCategory("Regression")
	.assignDevice("chrome99")
	.fail("This test case is fail");
	
	
	ex.createTest("Test 3","Test functional")
	.assignAuthor("Sonu")
	.assignAuthor("Akshay")
	.assignCategory("Regression")
	.assignCategory("Smoke")
	.assignDevice("chrome99")
	.assignDevice("edge99")
	.pass("This test case is pass");
	
	
	

	
	
	ex.flush();
	Desktop.getDesktop().browse(new File("Reports.html").toURI());
	}
}


