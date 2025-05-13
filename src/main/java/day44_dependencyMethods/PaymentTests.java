package day44_dependencyMethods;

import org.testng.annotations.Test;

public class PaymentTests {


	@Test(priority =1,groups= {"regression", "sanity", "functional"})
	void paymentinRupees() {
		System.out.println("Payment in repees..");
		}



	@Test(priority =2,groups= {"regression", "sanity", "functional"})
	void paymentindollar() {
		System.out.println("Payment in dollers..");
		}
}
