package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	           
	      WebElement date=driver.findElement(By.id("day"));
	      Select se= new Select(date);
	      
	      se.selectByIndex(2);
	      
	      WebElement month=driver.findElement(By.id("month"));
	      Select se1= new Select(month);
	      se1.selectByIndex(3);
	      
	      WebElement year=driver.findElement(By.id("year"));
	      
	      Select se2=new Select(year);
	      se2.selectByVisibleText("2021");
	      
	      
	      
	}

}
