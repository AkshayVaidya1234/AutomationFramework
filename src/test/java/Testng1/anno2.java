
package Testng1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anno2 {

	
	@BeforeSuite
	
	void login() {
		System.out.println("This is before suite login");
	}
	
	
	@Test
	
	void search() {
		System.out.println("This is search");
	}
	
	@Test
	void advsearch(){
		System.out.println("This is adv search");
	}
	
	@AfterSuite
	void logout() {
		System.out.println("this is after suite logout");
	}
	
}
