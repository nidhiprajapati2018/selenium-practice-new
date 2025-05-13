package day43_Annotation_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test(priority=1)
	void testTitle() {

		String exp_title = "opencart";
		String act_title = "openshop";

		/*if(exp_title.equals(act_title)){

			System.out.println("test passed");

		}
		else {
			System.out.println("test failed");
		}
		*/


		//Assert.assertEquals(exp_title, act_title);


		//conditional statement along with assertion
		if(exp_title.equals(act_title)){

		System.out.println("test passed");
		Assert.assertTrue(true);

	}
	else {
		System.out.println("test failed");
		Assert.assertTrue(false);
	}


	}

}
