package SeleniumPractice.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locartors_Xpathmethods {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	WebElement ele=	driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));

	System.out.println(ele.getText());
	
	// text present in space //span[normalize-space()='Cart']
	
	driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
	
	
	
	
	}

}
