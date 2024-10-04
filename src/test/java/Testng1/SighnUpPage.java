package Testng1;

import org.testng.annotations.Test;

public class SighnUpPage {
	
	@Test(priority = 1,groups = {"regression"})
	void SignupByemail() {
		System.out.println("sighnup By Email");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void SignupByFacebook() {
		System.out.println("sighnup By Facebook");
	}
	@Test(priority = 3,groups = {"regression"})
	void SignupByTwitter() {
		System.out.println("sighnup By Twitter");
	}
	

}
