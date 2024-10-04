package SeleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadiobtn {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://seleniumpractise.blogspot.com/search?q=radio+button");
	
	// print all the radio btn
	List<WebElement>radiobtn=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	
	for(int i=0;i<radiobtn.size();i++) {
		WebElement btn=radiobtn.get(i);
		
		String button=btn.getAttribute("value");
		System.out.println(button);
		
		// click on the Radio btn
		
		if(button.equalsIgnoreCase("RUBY")) {
			btn.click();
		}
	}
	
	// click and print checkboxes
	
List<WebElement>checkbox=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<checkbox.size();i++) {
		WebElement checkbtn=checkbox.get(i);
		
		String check=checkbtn.getAttribute("id");
		
		if(check.equalsIgnoreCase("code")) {
			checkbtn.click();
			break;
		}
	}
	}

}
