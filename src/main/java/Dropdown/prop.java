package Dropdown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prop {

	public static void main(String[] args) throws IOException {
		
		Properties prop= new Properties();
		
		FileInputStream fis= new FileInputStream("C:\\Automation\\SeleniumPractice\\configuration\\confif.properties");
	     
		prop.load(fis);
		
		String ure=prop.getProperty("url");
		String use=prop.getProperty("username");
		String pwd=prop.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(ure);
		driver.findElement(By.id("user-name")).sendKeys(use);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		
		
	
	}

}
