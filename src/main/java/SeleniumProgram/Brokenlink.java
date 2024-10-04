package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.xpath("//div[@style='float:left;']"));
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int noofinks=links.size();
		
		System.out.println(noofinks);
		
	}

}
