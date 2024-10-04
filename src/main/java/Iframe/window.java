package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
         
	
	driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
	
	Set<String>parent= driver.getWindowHandles();
	
	System.out.println(parent);
	
	
	}

}
