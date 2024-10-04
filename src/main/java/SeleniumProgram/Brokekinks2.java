package SeleniumProgram;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokekinks2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement>links=	driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		int nobrokelink=0;

		for(WebElement linkelements:links) {
			String hreafvalues=linkelements.getAttribute("href");

			if(hreafvalues==null||hreafvalues.isEmpty()) {
				System.out.println("hreaf values is empty");
				continue;
			}
			// hit to url server
			try {
				URL linkurl=new URL(hreafvalues); //converted hreaf value string to url format
				HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection(); //opencoonn to server
				conn.connect();//connect server send to server

				if(conn.getResponseCode()>=400) {
					System.out.println(hreafvalues+ "broken link");
					nobrokelink++;
				}
				else {
					System.out.println(hreafvalues+  "no broken link");
				}
			}
			catch(Exception e){

			}
           System.out.println("no of broken links:"+ nobrokelink);

		}
	}
}
