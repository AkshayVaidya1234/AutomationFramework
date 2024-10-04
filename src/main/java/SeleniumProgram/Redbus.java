package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		
		// disable chrome option arguments
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		
	WebElement element=	driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
	
	element.click();
	
	
		
		
	}
		
	}


