package screenshots;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listneras.class)
public class Amazon extends Listneras{
	
	
	@Test
	public void setup() {
		driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	WebElement tabs=	driver.findElement(By.id("twotabsearchtextbox"));
		
	     tabs.sendKeys("shoes");
	     tabs.sendKeys(Keys.ENTER);
	     
	     driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]")).click();
	     
	    Set<String>window= driver.getWindowHandles();
	
	    Iterator<String> aa=window.iterator();
	    
	    String parentwindow=aa.next();
	    String childwindow=aa.next();
	    
	    driver.switchTo().window(childwindow);
	    
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    		
		
	}

}
