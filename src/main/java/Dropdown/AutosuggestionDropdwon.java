package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionDropdwon {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		
	List<WebElement>element=	driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
    System.out.println(element.size());
    
    for(WebElement option:element) {
    	String autosuggest=option.getText();
    	
    	System.out.println(autosuggest);
    	
    	if(autosuggest.equalsIgnoreCase("selenium webdriver")) {
    		option.click();
    		break;
    	}
    	
    	
    	
    	
    }
	
	
	
	
	}

}
