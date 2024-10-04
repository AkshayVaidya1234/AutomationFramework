package Javascrpitexcute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/#google_vignette");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
	//	js.executeAsyncScript("window.scrollBy(0,1500)", "");
		// By element
		
	//	WebElement ele=driver.findElement(By.xpath("//div[@class='feed-links']"));
		
	//	js.executeScript("arguments[0].scrollIntoView();", ele);
		
	//	System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
	}

}
