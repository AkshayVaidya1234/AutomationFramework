package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		Thread.sleep(5000);
		
		// count rows
		
	int rows=	driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//tr")).size();
       System.out.println(rows);
       
       // count columns
       
       int cols= driver.findElements(By.xpath("//table[@class='table table-striped mt-3']//th")).size();
       
       
       System.out.println("count no of :"+cols);
       
       // Read data for spacific row and column
       
 //    String data=  driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr[4]//td[1]")).getText();
     
   //  System.out.println(data);
     
     // Read all the data
     
     for(int r=2;r<=rows;r++) {
    	 for(int c=1;c<=cols;c++) {
    	String value=   driver.findElement(By.xpath("//table[@class='table table-striped mt-3']//tr["+r+"]//td["+c+"]")).getText();	 
    	 System.out.print(value);
    	 
    	 
    	 }
     }
     
     
     
     
     
     
     
     
     
       
       
       
       
       
       
	}

}
