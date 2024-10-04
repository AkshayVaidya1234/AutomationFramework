package SeleniumProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		TakesScreenshot ss= (TakesScreenshot)driver;
		File source= ss.getScreenshotAs(OutputType.FILE);
		File folder=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\New folder\\Akshay.png");
		FileUtils.copyFile(source, folder);
		//driver.close();
	}

}
