package Datapicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
		String month=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year=   driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(year.equals("2020")&& month.equals("January")){
			driver.findElement(By.xpath("//a[@data-date='2']")).click();
			break;
		}
		
		else {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
		}
		
		}
	}

}
