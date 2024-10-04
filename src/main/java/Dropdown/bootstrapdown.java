package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/search?q=dropdown");
		
		driver.findElement(By.id("menu1")).click();
		
	List<WebElement>buttons=	driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
	
	for(WebElement element:buttons) {
		String options=element.getText();
		System.out.println(options);
		
		if(options.equalsIgnoreCase("javascript")) {
			element.click();
			break;
		}
		
		
		
	}
		}
		
	}


