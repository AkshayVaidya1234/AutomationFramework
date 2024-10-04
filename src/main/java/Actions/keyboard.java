package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("inputText1")).sendKeys("welcome");
		
		Actions act= new Actions(driver);
		
	   // select the text CTRL+A
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//COPY TEXT control+c
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		// TAB
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
