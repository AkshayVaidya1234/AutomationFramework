package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		// excepted data
		
		String month="May";
		String year="2025";
		String data="12";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
	String current_month=		driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	String curerent_year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
	if(current_month.equals(month) && (curerent_year.equals(year))){
	List<WebElement>dates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	
	for(WebElement date:dates ) {
		if(date.getText().equals(data)) {
			
		}
	}
	
		break;
	}
	
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
		
 List<WebElement>options=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
 
 for(WebElement date:options) {
	 if(date.getText().equals(data)) {
		 break;
	 }
 }
 
 
		
		
		
		
		
		
	}

}
