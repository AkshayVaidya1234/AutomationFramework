package SeleniumPractice.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzonautosuggestion {

	public static void main(String[] args) throws InterruptedException{
	
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=610644605475&hvpos=&hvnetw=g&hvrand=415500311627726012&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-327061083&hydadcr=14455_2316418");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T shirt");
		
		Thread.sleep(5000);
		
	List<WebElement>amzonsearch=	driver.findElements(By.xpath("s-suggestion-container"));
	
	System.out.println(amzonsearch.size());

	}

}
