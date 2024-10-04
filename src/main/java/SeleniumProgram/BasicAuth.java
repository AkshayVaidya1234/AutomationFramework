package SeleniumProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String usernmae="admin";
		String password="admin";
		String url="https://"+usernmae+":"+password+"@the-internet.herokuapp.com/basic_auth";
		
		
		driver.get(url);

	}

}
