package Testng2;

import org.testng.annotations.Test;

public class Dataprovid {
	
	
	@Test(dataProvider = "data_setup",dataProviderClass = Base.class)

	public void login(String username,String Password,String userdetail) {
		System.out.println("username is "+username);
		System.out.println("password is "+Password);
		System.out.println("userdetail is"+userdetail);
	}


}
