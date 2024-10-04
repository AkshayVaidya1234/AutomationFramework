package Testng2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {


	@DataProvider(name="data_setup")

	public Object [][]setup(){
		return new Object[][] {
			{"admin121","@1234","Akshay"},
			{"admin","admin123","Vaidya"}
		};

	}

@Test(dataProvider = "data_setup")

	public void login(String username,String Password,String userdetail) {
		System.out.println("username is "+username);
		System.out.println("password is "+Password);
		System.out.println("userdetail is"+userdetail);
	}



}
