package Windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closebrowsers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String>windows=driver.getWindowHandles();
		
       for( String windowid:windows) {
    	   String title= driver.switchTo().window(windowid).getTitle();
    	   System.out.println(title);
    	   if(title.equals("Human Resources Management Software ")) {
    		   driver.close();
    		   
    	   }
       }
	}

}
