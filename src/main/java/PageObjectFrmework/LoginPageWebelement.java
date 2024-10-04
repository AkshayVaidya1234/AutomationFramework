package PageObjectFrmework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageWebelement {
	
	public WebDriver driver= null;
	
	By username= By.name("username");
	By password= By.name("password");
	By clickbtn= By.xpath("//button[@type='submit']");
	
	
	public LoginPageWebelement(WebDriver driver2) {
		driver =driver2;
	}
	
	public WebElement GetUserName() {
	return	driver.findElement(username);
	}
	
	public WebElement GetPassword() {
	return	driver.findElement(password);
	}
	
	public WebElement Getclick() {
	return	driver.findElement(clickbtn);
	}
	

}
