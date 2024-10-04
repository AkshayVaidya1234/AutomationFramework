package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifytitle {
	
	
	@Test
	
	public void show () {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		String actualtitle=driver.getTitle();
		
		String exceptedtitle="Swag Labs";
		
		Assert.assertEquals(actualtitle, exceptedtitle);
		
		System.out.println("Test case passed");
		
		
		
	}

}
