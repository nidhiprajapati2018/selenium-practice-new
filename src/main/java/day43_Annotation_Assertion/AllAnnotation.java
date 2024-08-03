package day43_Annotation_Assertion;

import org.testng.annotations.*;

public class AllAnnotation {
	
	@BeforeSuite
	void bs() {
		System.out.print("This is before suite..");
	}
	
	@AfterSuite
	void as() {
		System.out.print("This is After suite..");
	}
	
	@BeforeTest
	void bt() {
		System.out.print("This is before Test..");
	}
	
	@AfterTest
	void at() {
		System.out.print("This is After Test..");
		
	}
	
	@Test(priority=1)
	void tM() {
		System.out.print("This is Test Method1..");
		
	}
	
	@Test(priority=2)
	void tMM() {
		System.out.print("This is Test Method2..");
		
	}
	
	
	@BeforeClass
	void bc() {
		System.out.print("This is before Class..");
	}
	
	@AfterClass
	void ac() {
		System.out.print("This is After Class..");
	}
	
	
	@BeforeMethod
	void bm() {
		System.out.print("This is before Method..");
	}
	
	@AfterMethod
	void am() {
		System.out.print("This is After Method..");
	}

}
