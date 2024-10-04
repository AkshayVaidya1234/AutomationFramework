package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simpledropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement drop=	driver.findElement(By.id("Skills"));

		Select se= new Select(drop);

		//se.selectByVisibleText("Analytics");

		// all the options

		List<WebElement>options=se.getOptions();
		
		System.out.println(options.size());
		
		// printing all options
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}


	}

}
