package ListnersTestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylist implements ITestListener{

	public void onTestStart(ITestResult result) {
	    System.out.println("Start test");
	  }
	public void onTestSuccess(ITestResult result) {
	    System.out.println("sucessful test");
	  }
	public void onTestFailure(ITestResult result) {
	    System.out.println("failed test");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("skip test");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("finish test");
	}
	
	
	
	
}
