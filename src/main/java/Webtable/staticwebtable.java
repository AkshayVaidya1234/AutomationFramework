package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/table");
		// get the no of rows
	int rows=	driver.findElements(By.xpath("//table[@id='webtable']//tr")).size();
     
    System.out.println("no of rows :"+ rows);
	
	// get the no of columns 
	int columns=	driver.findElements(By.xpath("//table[@id='webtable']//tr/th")).size();
	System.out.println("no of Columns are"+ columns);
	
	//get particular data
	
String text=	driver.findElement(By.xpath("//table[@id='webtable']//tr[4]/td[3]")).getText();
System.out.println(text);

      // get the all data

     for(int r=2; r<=rows ;r++) {
    	 for(int c=2;c<=columns; c++) {
    		 String data=driver.findElement(By.xpath("//table[@id='webtable']//tr["+r+"]/td["+c+"]")).getText();
    		 System.out.println(data+ "    ");
    	 }
    	 System.out.println(""); 
     }
	
	}

}
