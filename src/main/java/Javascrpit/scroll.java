package Javascrpit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		
	//	js.executeScript("window.scrollBy(1000,0)");

	}

}