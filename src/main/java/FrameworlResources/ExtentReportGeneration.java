package FrameworlResources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGeneration {
	
	 static ExtentReports extent;
	
	
	public static ExtentReports getObject() {
		String path=System.getProperty("user.dir")+ "\\extent_reportindex.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Project Reporter");
		reporter.config().setDocumentTitle("Test Case Result");
		
		 extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Akshay Vaidya");
		
		return extent;
		
	}

}
