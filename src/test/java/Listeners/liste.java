package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class liste implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case sucessful");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Capture sceenshort");
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
