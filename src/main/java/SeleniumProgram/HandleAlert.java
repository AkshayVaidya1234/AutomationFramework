package SeleniumProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		Thread.sleep(2000);
		
	Alert btn=	driver.switchTo().alert();
		System.out.println(btn.getText());
		
		btn.accept();
	}

}
