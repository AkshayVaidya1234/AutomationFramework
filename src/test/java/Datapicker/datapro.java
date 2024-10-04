package Datapicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ItestList.class)

public class datapro extends ItestList{
	
	//WebDriver driver;

	
	
@DataProvider(name="loginpage")
	
	public Object[][]setup(){
		return new Object[] []{
			{"standard_user","secret_sauce"},
			{"admin","admin123"}
		
		};
}
	
	@Test(dataProvider = "loginpage")
	public void setup1(String username,String pwd) {
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
	}
	
	//@DataProvider(name="loginpage")
	

	
	
	
}
