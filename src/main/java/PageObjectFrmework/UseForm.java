package PageObjectFrmework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UseForm {
	
	public WebDriver driver=null;
	
	
	By userform=By.xpath("//p[text()='Time at Work']");
	
	public UseForm (WebDriver driver3) {
		driver=driver3;
	}
	
	
	public  WebElement getuserform() {
		return driver.findElement(userform);
	}

}
