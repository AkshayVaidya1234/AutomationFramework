package DataaDrivenExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataGet {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String filepath="C:\\Automation\\SeleniumPractice\\TestData\\Login Data.xlsx";
		
		int rows=ExcelUtlity.rowcount(filepath, "Data");
		
		for(int i=1;i<=rows;i++) {
			// read data from excel
			String pric=ExcelUtlity.getcelldata(filepath, "Sheet2", i, 0);
			String pric1=ExcelUtlity.getcelldata(filepath, "Sheet2", i, 1);
			String pric2=ExcelUtlity.getcelldata(filepath, "Sheet2", i, 2);
			String pric3=ExcelUtlity.getcelldata(filepath, "Sheet2", i, 3);
			
			// passed above data
			
			driver.findElement(By.name("username")).sendKeys(pric);
			driver.findElement(By.name("password")).sendKeys(pric2);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
		}
		

	}

}
