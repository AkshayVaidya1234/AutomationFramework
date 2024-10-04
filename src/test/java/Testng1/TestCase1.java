package Testng1;

import org.testng.annotations.Test;

@Test(groups = "Module 1-Module 4")
public class TestCase1 {
	
	@Test(groups = {"Module 1 Search_Product","Module 3 product_cart"})
	
	public void m1() {
		System.out.println("Test Module 1");
	}
	
@Test(groups = "Module 2 product_pricing")
	
	public void m2() {
		System.out.println("Test Module 2");
	}


@Test(groups = "Module 3 product_cart")

public void m3() {
	System.out.println("Test Module 3");
}

}
