package com.testpageclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageclass.Homepage;
import com.pageclass.Sighuppage;
import com.utlity.commonmethods;

public class Sihnuppagetest extends Testbase {

	
	@Test
	public void enteruserdetils() throws IOException {
	
		Homepage hp= new Homepage(driver);
		commonmethods.Verfiytitle("Automation Exercise");
		hp.clickonSighupbtn();
		
		Sighuppage sp= new Sighuppage(driver);
	
		sp.enterusernme(pr.getProperty("username"));
		test.pass("enter username");
	
		sp.entermail(pr.getProperty("email"));
		test.pass("enter mail");
		
		sp.clickonSighupbtn();
		
	    
	
	}
	
}
