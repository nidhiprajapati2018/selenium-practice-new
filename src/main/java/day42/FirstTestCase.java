package day42;

import org.testng.annotations.Test;

/*
 1) open app
 2) Login
 3) Logout
 */

public class FirstTestCase {
	


	@Test(priority = 4)
	void opeapp() {
		System.out.println("opening application...");
		

	}

	@Test(priority = 2)
	void login() {
		System.out.println("login to application...");
	}

	@Test(priority=3)
	void logout() {
		System.out.println("logout from application...");
	}

}
