package day44_dependencyMethods;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority =1, groups= {"sanity"})
	void loginByEmail() {
		System.out.println("This is login by email..");
		}


	@Test(priority =2, groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("This is login by facebook..");
		}


	@Test(priority =3, groups= {"sanity"})
	void loginBytwitter() {
		System.out.println("This is login by twittter..");
		}



}
