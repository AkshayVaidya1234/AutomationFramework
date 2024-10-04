package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxis {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		// ancestor xpath
		
	String tab=	driver.findElement(By.xpath("//td[text()='Vega']//ancestor::tr")).getTagName();
	System.out.println(tab);
	
	// all child
	
	 List<WebElement> list1=driver.findElements(By.xpath("//tbody//tr[4]//child::td"));
	 
	 for(WebElement tabs:list1) {
		 System.out.println(tabs.getText());
	 }
	 
	 // following xpath axix
	//td[text()='Gentry']//following::td
	 
	 
	 
	
	
	
	}

}
