package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	      
	  WebElement element=    driver.findElement(By.id("multi-select"));
	  
	  Select se=new Select(element);
	  
	  se.selectByVisibleText("California");
	  se.selectByVisibleText("Florida");
	  se.selectByVisibleText("New York");
	  se.selectByVisibleText("Ohio");
	  se.selectByVisibleText("Texas");
	  
	  List<WebElement> alloptions=se.getAllSelectedOptions();
	  
	  for(WebElement options:alloptions) {
		System.out.println(  options.getText());
		
		se.deselectByVisibleText("Texas");
		
		
	  }

	}

}
