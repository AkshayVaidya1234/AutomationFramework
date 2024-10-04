package com.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.TestBase;

public class Homepage extends TestBase {

	public Homepage(WebDriver driver) {
		super(driver);
		
	}
	

//	@FindBy(xpath = "//img[@alt='Website for automation practice']")
//	WebElement title;
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement regbtn;
	
	
/*	public  boolean Verfiytitle() {
		try {
			return title.isDisplayed();
			}
			catch(Exception e) {
				return false;
			}
	}
*/	
	public void clickonSighupbtn() {
		regbtn.click();
	}

}
