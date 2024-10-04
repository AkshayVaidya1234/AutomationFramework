package Testng1;

import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority = 1,groups = {"sainty"})
	void loginByEmail() {
		System.out.println("this login mail");
	}
	
	@Test(priority = 2,groups = {"sainty"})
	void loginByFacebook() {
		System.out.println("this login By facebook");
	}
	
	@Test(priority = 3,groups = {"sainty"})
	void loginByTwiiter() {
		System.out.println("this login By Twitter");
	}
	

}
