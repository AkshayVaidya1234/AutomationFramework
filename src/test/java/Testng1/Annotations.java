package Testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeTest
	void login() {
		System.out.println("This is Before test login");
	}
	
	
	@Test
	
	void search() {
		System.out.println("This is search");
	}
	
	@Test
	void advsearch(){
		System.out.println("This is adv search");
	}
	
	@AfterTest
	void logout() {
		System.out.println("this is after test logout");
	}
	
	

}
