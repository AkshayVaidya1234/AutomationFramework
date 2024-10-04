package ListnersTestng;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManger  implements ITestListener{
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	

	public void onStart(ITestContext context) {
		File fis= new File("C:\\Automation\\SeleniumPractice\\Reports\\MyReports.html");
		sparkreporter= new ExtentSparkReporter(fis);
		sparkreporter.config().setDocumentTitle("Automation Report");//set report name
		sparkreporter.config().setReportName("Functional Testing");//set report name
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports ();
		extent.attachReporter(sparkreporter);
		
		
		extent.setSystemInfo("Computername", "localhopst");
		extent.setSystemInfo("Environment", "QA");
		
		
	}
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,"Test case is passed"+result.getName());
	
	}

	public void onTestStart(ITestResult result) {
		
		
	}


	

	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test case is failed"+result.getName());
		test.log(Status.FAIL, "test case is failed"+result.getName());
	}

	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test case is failed"+result.getName());
		
	}
     
	
	public void onFinsh(ITestResult result) throws IOException {
       extent.flush();
       Desktop.getDesktop().browse(new File("Reports.html").toURI());
}
}