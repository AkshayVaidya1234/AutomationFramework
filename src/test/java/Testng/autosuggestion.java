package Testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class autosuggestion {
 WebDriver driver;
	@Test()
	@Parameters("browser")
	public void laucn(String browser)  {
		
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		
		if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		
		
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000);
		List <WebElement>auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int sigeestion=auto.size();
		System.out.println(sigeestion);
		auto.get(sigeestion-3).click();
		
		
		
		
		
	}
}
