package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alllist {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		// select on option
		
		//driver.findElement(By.id("first")).click();
	
		WebElement button= driver.findElement(By.xpath("//select[@id='first']"));
		Select se= new Select(button);
		se.selectByIndex(1);
		
		// select one option
		
		List<WebElement>alloptions=se.getAllSelectedOptions();
		for(WebElement tabs:alloptions) {
			System.out.println(tabs.getText());
			
			// get all option
			
		 List<WebElement>selectoptions=se.getOptions();
		 for(WebElement options:selectoptions) {
			 System.out.println(options.getText());
		 }
		}
		
		

	}

}
