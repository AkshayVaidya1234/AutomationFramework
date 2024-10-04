package Javascrpit;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {

	public static void main(String[] args) throws IOException {
		
		ExtentReports ex= new ExtentReports();
		File fis= new File("C:\\\\Automation\\\\SeleniumPractice\\\\Reports.html");
		ExtentSparkReporter spark= new ExtentSparkReporter(fis);
		ex.attachReporter(spark);
		
	ExtentTest test1=	ex.createTest("Test 1")
    .log(Status.INFO, "this is info")
    .log(Status.INFO, "this is info")
    .log(Status.SKIP, "this is skip")
	 .log(Status.PASS, "this is pass")
	 .log(Status.SKIP, "This is skip")
	// .log(Status.FAIL, "this is fail")
	 .log(Status.WARNING, "this is info");	
	 
	 
    
	ex.flush();
	Desktop.getDesktop().browse(new File("Reports.html").toURI());
	}

}
