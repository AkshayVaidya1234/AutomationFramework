package com.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.TestBase;
import com.utlity.commonmethods;

public class Sighuppage extends TestBase {

	public Sighuppage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//input[@data-qa='signup-name']")
	WebElement usernme;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement email;
	
	@FindBy(xpath="//button[text()='Signup']")
	WebElement btn;
	
	
	public void enterusernme(String name) {
		usernme.sendKeys(name);
		
	}
	
	public void entermail(String mail) {
		email.sendKeys(mail);
	}
	
	public void clickonSighupbtn() {
		btn.click();
		
	}
	
	
	

}
