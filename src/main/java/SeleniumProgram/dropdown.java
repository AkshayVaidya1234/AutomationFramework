package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Select se= new Select(driver.findElement(By.id("dropdown")));
		
		se.selectByIndex(2);
		
		//count no of option available dropdown
		
		List<WebElement> dropdown= se.getOptions();
		System.out.println(dropdown.size());
		
	}

}
