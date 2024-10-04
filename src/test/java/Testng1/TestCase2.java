package Testng1;

import org.testng.annotations.Test;

public class TestCase2 {
	
	
@Test(groups= {"Module 1 Search_Product","Module 3 product_cart"})
	
	public void m4() {
		System.out.println("Test Module 4");
	}


@Test

public void m5() {
	System.out.println("Test Module 5");
}


@Test(groups = "Module 3 product_cart")

public void m6() {
	System.out.println("Test Module 6");
}

}
