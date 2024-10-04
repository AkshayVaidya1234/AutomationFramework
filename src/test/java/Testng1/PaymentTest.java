package Testng1;

import org.testng.annotations.Test;

public class PaymentTest {

	
	@Test(priority = 1,groups = {"sainty","regression","functional"})
	void paymentrupees() {
		System.out.println("payment in rupees");
	}
	
	@Test(priority = 2,groups = {"sainty","regression","functional"})
	void payementindollres() {
		System.out.println("payment in dollers");
	}
}
