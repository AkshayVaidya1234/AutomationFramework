package PageObjectFrmework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageClass {
	public WebDriver driver;
	
	By casesno=By.xpath("(//div[@class='maincounter-number']/span)[1]");
	
	public HomePageClass(WebDriver driver2) {
		driver=driver2;
	}

	public WebElement getcases() {
		return driver.findElement(casesno);
	}

}
