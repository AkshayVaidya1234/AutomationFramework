package Javascrpit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldowbvisibilityelements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
	//WebElement ele=	driver.findElement(By.xpath("//input[@type='reset']"));
		//js.executeScript("arguments[0].scrollIntoView()",ele);
		
	//scroll end of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
