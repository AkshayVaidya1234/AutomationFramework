package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
	WebElement element=	driver.findElement(By.xpath("//span[text()='Two Wheelers']"));
	
	Actions act= new Actions(driver);
	
	act.moveToElement(element).click().build().perform();
	
	
	
	
	
	
	}

}
