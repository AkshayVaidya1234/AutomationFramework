package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentframe {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://demo.automationtesting.in/Frames.html");
	      
	      driver.switchTo().frame("SingleFrame");
	      
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	      
	     

	}

}
