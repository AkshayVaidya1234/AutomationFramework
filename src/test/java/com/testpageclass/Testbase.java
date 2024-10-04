package com.testpageclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties pr;
	public static ExtentReports reports;
	public static ExtentSparkReporter sprk;
	public static ExtentTest test;
	
	
	
	@BeforeSuite
	public void loadfiles() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Automation\\SeleniumPractice\\configuration\\confif.properties");
		pr= new Properties();
		pr.load(fis);
		
		
		String timesstmp= new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		reports= new ExtentReports();
		sprk= new ExtentSparkReporter("C:\\Automation\\SeleniumPractice\\Reports\\report_"+timesstmp+".html");
		reports.attachReporter(sprk);
		
		
		
	}
	@BeforeClass
	
	public void setup() {
		test = reports.createTest("Test Execution");
		driver= new EdgeDriver();
		test.info("lauch browser");
		driver.get(pr.getProperty("url"));
		test.info("lauch url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void terdown() {
		driver.close();
	}
	
	@AfterSuite
	public void reportgeneration() {
		reports.flush();
	}

}
