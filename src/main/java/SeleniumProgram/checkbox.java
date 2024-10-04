package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	List<WebElement>btn=	driver.findElements(By.xpath("//input[@type='checkbox' ]"));
	    
	for(int i=0;i<btn.size();i++) {
		btn.get(i).click();
	}
	
	
	
	
	
	}

}
