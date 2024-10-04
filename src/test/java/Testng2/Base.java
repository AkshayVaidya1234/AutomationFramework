package Testng2;

import org.testng.annotations.DataProvider;

public class Base {
	
	@DataProvider(name="data_setup")

	public Object [][]setup(){
		return new Object[][] {
			{"admin121","@1234","Akshay"},
			{"admin","admin123","Vaidya"}
		};

	}
	
	

}
