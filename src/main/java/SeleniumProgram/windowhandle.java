package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		// handle single window
	String tab=	driver.getWindowHandle();
System.out.println(tab);

    // open a new tab
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.google.com/");
    
    System.out.println(driver.getWindowHandles());
    
    driver.switchTo().window(tab);
    
    System.out.println(driver.getTitle());
    
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.saucedemo.com/");
    
//driver.switchTo().window(tab);
    
  //  System.out.println(driver.getTitle());
    
    
    

	
	}

}
