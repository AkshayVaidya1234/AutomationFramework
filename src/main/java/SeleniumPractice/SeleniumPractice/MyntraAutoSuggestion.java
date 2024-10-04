package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/?gclid=Cj0KCQjwi7GnBhDXARIsAFLvH4kduVcuCelewtwY-OeOqKHFTSxGkaSRSA_qyHogB1I29iXmAdB6rrIaAuAMEALw_wcB");
        driver.findElement(By.id("autocomplete-0-input")).sendKeys("top");
        Thread.sleep(5000);
        
   List<WebElement>fromsuggestion=     driver.findElements(By.xpath("//li[@class='aa-Item search-result-list-item']"));
   
   for(int i=0; i<fromsuggestion.size()-1;i++) {
	   System.out.println(fromsuggestion.get(i).getText());
   }
   
   for(int i=0;i<fromsuggestion.size()-1;i++) {
	   if(fromsuggestion.get(i).getText().contains("top for women")) {
		   fromsuggestion.get(i).click();
		   
		   break;
	   }
   }
	}

}
