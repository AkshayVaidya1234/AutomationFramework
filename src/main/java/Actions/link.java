package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();
		
	List<WebElement>options=	driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li"));
	
	for(WebElement ele:options) {
		WebElement buttons=ele;
		System.out.println(buttons.getText());
	}
	
	
	
	
	
	
	
	}

}
