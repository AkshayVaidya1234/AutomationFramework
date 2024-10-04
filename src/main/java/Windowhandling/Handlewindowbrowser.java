package Windowhandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindowbrowser {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getwindowhandle
//	String windowid=	driver.getWindowHandle();  //return Id single browser window
	
//	System.out.println(windowid);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//get WindowHandles
		
  Set<String> windowsid= 	driver.getWindowHandles();// return list of string
  
       Iterator<String>id=  windowsid.iterator();
	
	/*String parentwindowid=id.next();
	String childwindowid=id.next();
	
	System.out.println("parent window id is:"+ parentwindowid);
	System.out.println("child window id is:"+ childwindowid);
	
	//how to use Window Ids for switching
	
	driver.switchTo().window(parentwindowid);
	System.out.println("Title of parent window:" +driver.getTitle() );
	
	driver.switchTo().window(childwindowid);
	System.out.println("Title of child window:" +driver.getTitle() ); */
		
		
		//using for loop
       
       for(String  windowsid1: windowsid) {
    	   
    	   String title= driver.switchTo().window(windowsid1).getTitle();
    	   System.out.println(title);
    	   
    	   if(title.equals("OrangeHRM")) {
    		   driver.close();
    	   }
       }
	}

}
