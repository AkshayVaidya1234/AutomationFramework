package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	
	
	@DataProvider(name="data_provider")
	
	public Object[][]setup(){
		return new Object[] []{
			{"standard_user","secret_sauce"},
			{"admin","admin123"}
		};
	
		
	}
	@Test(dataProvider = "data_provider")		
	public void login(String uname,String pwd) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		
		
		
		
	}

}
