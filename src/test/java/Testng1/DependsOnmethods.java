package Testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnmethods {
	
	
	@Test(priority = 1)
	
	void openapp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2)
	void login() {
		Assert.assertTrue(false);
	}
	@Test(priority = 3,dependsOnMethods = "login")
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority = 4,dependsOnMethods = "login")
	void logout() {
		Assert.assertTrue(true);
	}
	
	
	
	
	
	
	
	

}
