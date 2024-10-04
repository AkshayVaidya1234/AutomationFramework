package Testng2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser"})
	
	void setup(String br) throws InterruptedException {
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
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);
	}

	
	@Test
	void verfiytitle() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	
	@Test
	void verfiyurl() {
		Assert.assertEquals(driver.getTitle(), "https://www.saucedemo.com/");
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
	
}
