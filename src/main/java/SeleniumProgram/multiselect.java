package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	WebElement options=	driver.findElement(By.xpath("//select[@id='second']"));
	
	Select se= new Select(options);
	
	se.selectByIndex(0);
	se.selectByIndex(1);
	se.selectByIndex(2);
	
	List<WebElement>list=se.getAllSelectedOptions();
	for(WebElement tabs:list) {
		System.out.println(tabs.getText());
	}
	
	
	}

}
