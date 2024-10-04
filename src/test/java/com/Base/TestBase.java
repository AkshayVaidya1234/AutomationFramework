package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

	WebDriver driver;
	
	public TestBase(WebDriver driver) {
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	
	}
	
}
	
	
	

