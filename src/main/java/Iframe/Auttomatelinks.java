package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auttomatelinks {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	List<WebElement>links=	driver.findElements(By.tagName("a"));
	
	// count total no of links
	System.out.println(links.size());
	
	// get the url present in webpage
	
	for(int i=0; i<links.size();i++) {
		System.out.println(links.get(i).getAttribute("href"));
		
		// get the text of particular url
		
		System.out.println(links.get(i).getText());
	}

	}

}
