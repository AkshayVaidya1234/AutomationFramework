package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clanderhandle {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//input[@type='text' and @class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		while(true) {
String month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();


     if(year.equals("2024")&& month.equals("April")) {
    	WebElement date= driver.findElement(By.xpath("//td[@class='ng-tns-c58-10 ng-star-inserted'][6]"));
    	date.click();
    	System.out.println("selected date is :"+date);
    	break;
    	
     }
     else
    	 driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();

		}
	}

}
