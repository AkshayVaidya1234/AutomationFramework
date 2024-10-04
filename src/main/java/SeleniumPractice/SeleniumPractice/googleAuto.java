package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleAuto {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
      List<WebElement>googlesuggestion=   driver.findElements(By.xpath("//ul/li[@class='sbct']"));
      System.out.println(googlesuggestion.size());
      
      Thread.sleep(3000);
      
      for(WebElement autovalue: googlesuggestion) {
    	  String autostring= autovalue.getText();
    	  System.out.println(autostring);
    	  if(autostring.equalsIgnoreCase("selenium webdriver")) {
    		  autovalue.click();
    		  break;
    	  }
    	  
      }
	}

}
