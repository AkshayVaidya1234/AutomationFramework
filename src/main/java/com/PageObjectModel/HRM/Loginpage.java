package com.PageObjectModel.HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	
	
	
	By username= By.name("username");
	By password= By.name("username");
	By clickbtn= By.xpath("//button[@type='submit']");
	By logo= By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1689053487449']");
	 
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean logo() {
		driver.findElement(logo).isDisplayed();
		
		return true;
	}
     public HomePage login() {
    	 driver.findElement(username).sendKeys("Admin");
    	 driver.findElement(password).sendKeys("admin123");
    	 driver.findElement(clickbtn).click();
    	 return new HomePage();
     }
}
