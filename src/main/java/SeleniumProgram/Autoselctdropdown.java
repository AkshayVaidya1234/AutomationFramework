package SeleniumProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoselctdropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	  String actul="Mumbai";
	  int count=0;
	
	  driver.findElement(By.id("fromCity")).sendKeys("mum");
	
	  Thread.sleep(3000);
	
     List<WebElement>option=	driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
	
	for(WebElement element:option) {
		String currentoption=element.getText();
		if(currentoption.contains(actul)) {
			element.click();
			count++;
			break;
		}
	}
	if(count!=0) {
		System.out.println(actul+ " option has select");
	}
	else {
		System.out.println("you want to select");
	}
	}		
}
