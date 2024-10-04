package Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Webtable.webtable;

public class Tab {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
	WebElement reglink=	driver.findElement(By.xpath("//a[text()='Register']"));
    
	Actions act= new Actions(driver);
	
	act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
	
	//switching nextpage
	
   List<String> ids= new ArrayList(driver.getWindowHandles());
   
   // registration
   
   driver.switchTo().window(ids.get(1));
   
   driver.findElement(By.id("FirstName")).sendKeys("Akshay");
   
   //HOME PAGE
   driver.switchTo().window(ids.get(0));
   
   driver.findElement(By.id("small-searchterms")).sendKeys("t-shirts");
   
   
   
   
   
   






	
	
	
	
	}

}
