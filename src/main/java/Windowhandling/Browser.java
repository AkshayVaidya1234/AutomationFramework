package Windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String mainpage= driver.getWindowHandle();

		System.out.println("manipage"+ mainpage);

		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Purple, 128 GB)']")).click();

         Set<String> allpages= driver.getWindowHandles();
         
         for(String page:allpages) {
        	 if(!page.equals(mainpage)) {
        		 driver.switchTo().window(page);
        	 break;
        	 }
        		 
         }
         System.out.println(driver.getTitle());
         
         
         
         
         

	}

}
