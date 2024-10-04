package Windowhandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	
	Set<String>windows=driver.getWindowHandles();
	
	  Iterator<String>id=  windows.iterator();
	
	  String parentwindowid=id.next();
		String childwindowid=id.next();
	//	System.out.println("parent window id is:"+ parentwindowid);
	//	System.out.println("child window id is:"+ childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println("child window title:"+driver.getTitle());
		
		if(childwindowid.equals("Human Resources Management Software")) {
			driver.close();
		}
		else {
			System.out.println("failed close window");
		}

	}

}
