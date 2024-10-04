package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
	List<WebElement>ab=	driver.findElements(By.tagName("frame"));

	System.out.println(ab.size());
	
	driver.switchTo().frame(1);
	
String top=	driver.findElement(By.tagName("body")).getText();
	
System.out.println(top);

driver.switchTo().defaultContent();

driver.switchTo().frame("frame-top");
driver.switchTo().frame("frame-left");

String lefttop=	driver.findElement(By.tagName("body")).getText();

System.out.println(lefttop);
 
driver.switchTo().defaultContent();
driver.switchTo().frame("frame-top");
driver.switchTo().frame("frame-middle");

String righttop=driver.findElement(By.tagName("body")).getText();
System.out.println(righttop);

// Switch to another window

driver.switchTo().defaultContent();
driver.switchTo().frame("frame-top");
driver.switchTo().frame("frame-right");

String midletop=driver.findElement(By.tagName("body")).getText();

System.out.println(midletop);





	
	
	}

}
