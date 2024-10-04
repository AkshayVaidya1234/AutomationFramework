package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
	
		// explicit wait
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
         
	WebElement txt=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	   txt.sendKeys("Admin");
	
	      
		WebElement pwd=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		   pwd.sendKeys("admin123");
		   
		   WebElement btn=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		  btn.click();
		   
		   
		
	
	}

}
