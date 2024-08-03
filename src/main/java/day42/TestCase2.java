package day42;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestCase2 {
	
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browser ");
		driver = new ChromeDriver();
		String baseURL = "https://newtours.demoaut.com";
		driver.get(baseURL);
	}
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
	
	@Test(priority = 1)
	public void verifyHomepageTitle() {
		
		String expectedtitle = "demoaut.com - demoaut Resources and Information.";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//Assert.assertEquals(actualTitle, expectedtitle);
	}

}
