package Testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	
	@Test(dataProvider = "dp")
	void login(String email,String pwd) {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		
	}

	@AfterClass
	void teardown() {
		driver.close();
		}
	
	
	@DataProvider(name = "dp",indices = {0,3})
	Object[][]logindata(){
		Object data[][]= {
				{"abc@gmail.com","test123"},
				{"user@123.com"	,"test123"},
				{"Admin","admin123"},
				{"standard_user","secret_sauce"}
				
				
		
	};
		return data;
}
}