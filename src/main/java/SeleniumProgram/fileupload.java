package SeleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
	WebElement file=	driver.findElement(By.id("file-upload"));
	file.sendKeys("C:\\Users\\ASUS\\OneDrive\\Desktop\\Resume.txt");
	
	driver.findElement(By.id("file-submit")).click();
	
	
	}

}
