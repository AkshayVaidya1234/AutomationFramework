package FrameworlResources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	WebDriver driver;
	
	
	public WebDriver initializebrowser() throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Automation\\SeleniumPractice\\src\\main\\java\\FrameworlResources\\data.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		String browsername= prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			
			driver=new ChromeDriver();
			}
		else if(browsername.equals("firefox")) {
			
			driver =new FirefoxDriver();
		}
		else if(browsername.equals("IE")) {
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	
	
	public String getscrrenshot(String testname,WebDriver driver) throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		   File source=ss.getScreenshotAs(OutputType.FILE);

		  String folder=System.getProperty("user.dir")+"./Scrreshots\\resources_test" +testname+ ".png";
		   FileUtils.copyFile(source, new File(folder));
		   
		   return folder;
	}



	
	}

