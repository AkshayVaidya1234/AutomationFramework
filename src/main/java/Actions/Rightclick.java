package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement element=	driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act= new Actions(driver);
		
		act.contextClick(element).build().perform();
		
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
