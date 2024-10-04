package ListnersTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(ListnersTestng.Mylist.class)
public class OrangeHrm {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void setup() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	 void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://ensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority = 2,dependsOnMethods = {"testurl"})
	void title() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 1)
	void verfiylogo() {
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}

}
