package com.testpageclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageclass.Homepage;
import com.utlity.commonmethods;

public class Hompepgetest extends Testbase{

	
	@Test
	public void navigtetosignuppge() throws IOException {
		//try {
		
		
		Homepage hp= new Homepage(driver);
	
		hp.clickonSighupbtn();
		test.info("click on sighup btn");
		
		commonmethods.Verfiytitle("Automation Exercise");
		
		test.pass("verfiy title");
		
		
		
		
		
	
	
}
}
	

