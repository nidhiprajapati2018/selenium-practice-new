package day43_Annotation_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test(){

	//these are all hard assertion
	//Assert.assertEquals("xyz", "xyz");

	//Assert.assertEquals(123, "342");

	//Assert.assertEquals("abc", 123);
	//Assert.assertEquals("123", 123);

	Assert.assertNotEquals("xyz", "xyz");  //failed

	Assert.assertNotEquals(123, 456);   //passed

	Assert.assertTrue(true);  //passed

	Assert.assertTrue(false); //failed

	Assert.assertTrue(1==2);  //failed

	Assert.assertTrue(1==1); //passed

	Assert.assertFalse(1==2); //passed
	Assert.assertFalse(1==1); //failed

	Assert.fail();  // directly fail the test



	}

}
