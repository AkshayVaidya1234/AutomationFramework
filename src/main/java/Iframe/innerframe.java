package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class innerframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://demo.automationtesting.in/Frames.html");
	      
	      driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	      
	  WebElement outerframe=    driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	  driver.switchTo().frame(outerframe);
	  
	  WebElement innerframe =driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
	  
	  driver.switchTo().frame(innerframe);
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	
	
	
	      

	}

}
