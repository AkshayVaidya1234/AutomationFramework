package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		Thread.sleep(5000);
	WebElement text=	driver.findElement(By.id("tinymce"));
		text.clear();
		text.sendKeys("Hii guys");
		driver.switchTo().defaultContent();
		
	}

}
