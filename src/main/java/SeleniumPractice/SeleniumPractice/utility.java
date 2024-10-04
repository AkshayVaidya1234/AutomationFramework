package SeleniumPractice.SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {

	public static void Takingscrrenshots(WebDriver driver, String scrrenshot) throws IOException {
	 File screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshotfile, new File("./Scrreshots/"+scrrenshot+".png"));
}
}