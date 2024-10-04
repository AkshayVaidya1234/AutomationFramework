package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
	WebElement radiobutton=	driver.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
		radiobutton.click();
	System.out.println(radiobutton.isSelected());
	System.out.println(radiobutton.getText());

	}

}
