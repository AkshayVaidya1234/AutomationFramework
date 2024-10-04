package SeleniumProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleelementscreenshort {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(5000);
		WebElement element= driver.findElement(By.id("file-upload"));
		
		//TakesScreenshot ss= (TakesScreenshot)driver;
		File source= element.getScreenshotAs(OutputType.FILE);
		File folder=new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\New folder\\Failed.png");
		FileUtils.copyFile(source, folder);

	}

}
