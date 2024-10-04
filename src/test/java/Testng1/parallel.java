package Testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	
	void setup(String br,String url) throws InterruptedException {
		
		switch(br) {
		case"chrome":driver=new ChromeDriver();
		break;
		case "firefox":driver=new FirefoxDriver();
		break;
		case "edge": driver=new EdgeDriver();
		break;
		default: System.out.println("invalid browser");
		return;
		}
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	void titleverfiy() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	@Test
	void verfiyurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}

}
