package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
		
	WebElement hold=	driver.findElement(By.id("1"));
	Actions act= new Actions(driver);
	
	act.clickAndHold(hold).build().perform();

	}

}
