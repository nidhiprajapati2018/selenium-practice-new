package day43_Annotation_Assertion;

import org.testng.annotations.*;

/* 1) Login ==@BeforeMethod
 * 2) Search = @Test
 * 3) Logout -- @Aftermethod
 * 4) Login
 * 5) Advanced search --@Test
 * 6?logout
 * */

public class AnnotationDemo1 {
	
	@BeforeMethod
	void login() {
		System.out.println("This is login..");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("This is search..");
	}
	@Test(priority=2)
	void advancedSearch() {
		System.out.println("This is advancedSearch..");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("This is login..");
	}

}
