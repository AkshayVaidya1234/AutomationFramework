package Testng2;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Parameters({"broswer","url","userId","passwords"})
	
	
	@Test()
	
	public void setup(@Optional("chrome")String browsername,String Url,String uids,String pwd) {
		
		System.out.println("browser name is"+browsername);
		System.out.println("url is"+Url);
		System.out.println("userid is "+uids);
		System.out.println("password is"+pwd);
		
		
		
	}

}
