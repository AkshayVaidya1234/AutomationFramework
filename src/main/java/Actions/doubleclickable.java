package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/buttons");
		
		
		
		WebElement btn=driver.findElement(By.id("doubleClickBtn"));
		Actions act =new Actions(driver);
		act.doubleClick(btn).build().perform();
		
		
		

	}

}
