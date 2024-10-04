package SeleniumProgram;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@role='button']")).click();
	WebElement tab=	driver.findElement(By.xpath("//a[@title='Dropdown with more help links']"));
		
		Thread.sleep(5000);
		Actions act =new Actions(driver);
		act.moveToElement(tab).build().perform();
		
		List<WebElement> alllinks =driver.findElements(By.xpath("//ul[@class='_3YjYK7']//li"));

for(WebElement links:alllinks ) {

System.out.println(links.getText());
}
		
		
		
		
		
		
		
		
		
	}

}
