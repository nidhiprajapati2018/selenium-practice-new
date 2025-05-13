package day43_pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void XYZ() {
		System.out.println("This is XYZ from C2");
	}

	@AfterTest
	void at(){
		System.out.println("This is After Test Method");
	}
}
