package Testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
	
	@Parameters({"URL"})
	@Test
	void getparameter(String url) {
		System.out.println(url);
	}
	
	@Test
	
	void getadd() {
		int a=5;
		int b=6;
		System.out.println(a+b);
		if(a+b==10) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
