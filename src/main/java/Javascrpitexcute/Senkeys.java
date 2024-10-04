package Javascrpitexcute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	WebElement ele=	driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	// sendkeys method using javascrpit

	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','john')", ele);
	
	
	// click actions using javascrpit
	WebElement btn=driver.findElement(By.xpath("//input[@value='Male']"));
	
	js.executeScript("arguments[0].click()",btn );
	
	
	
	
	
	}

}
