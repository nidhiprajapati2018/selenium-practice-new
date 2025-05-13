package day43_Annotation_Assertion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/* 1) Login ==@BeforeMethod
 * 2) Search = @Test
 * 3) Logout -- @Aftermethod
 * 4) Login
 * 5) Advanced search --@Test
 * 6?logout
 * */

public class AnnotationDemo2 {

	@BeforeClass
	void login() {
		System.out.println("This is login..");
	}



	@AfterClass
	void logout() {
		System.out.println("This is logout..");
	}

	@Test(priority=1)
	void search() {
		System.out.println("This is search..");
	}
	@Test(priority=2)
	void advancedSearch() {
		System.out.println("This is advancedSearch..");
	}


}
