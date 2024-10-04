package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstraplogin {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		
		driver.getWindowHandle();
		driver.findElement(By.xpath("//p[text()='LOGIN / SIGNUP']")).sendKeys("9850363719");
	}

}
