package day43_pack;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class C3 {
	
	@Test
	void pqr() {
		System.out.println("This is pqr from C3");
	}
	
	@BeforeSuite
	void bs(){
		System.out.println("This is before suit Method");
		
	}
	
	@AfterSuite
	void as(){
		System.out.println("This is @AfterSuite suit Method");
	}

}
