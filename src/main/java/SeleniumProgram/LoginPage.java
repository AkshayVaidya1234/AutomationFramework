package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement username=	driver.findElement(By.name("username"));
	username.sendKeys("Admin");
	
	WebElement password=	driver.findElement(By.name("password"));
	password.sendKeys("admin123");
	
	WebElement loginbrn= driver.findElement(By.xpath("//button[@type='submit']"));
	loginbrn.click();
	
	WebElement homepage=driver.findElement(By.xpath("//p[text()='ebkgfdtgv Collings']"));
	
	String actualname=homepage.getText();
	String exceptedname= "ebkgfdtgv Collings";
	
	if(actualname.equals(exceptedname)) {
		System.out.println("sucessful login");
	}
	else {
		System.out.println("error message");
	}
	

	}

}
