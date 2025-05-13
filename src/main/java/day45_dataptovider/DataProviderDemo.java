package day45_dataptovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}


	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();

		if(status) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='My Account']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}

		Reporter.log("Hi success");

	}

	@AfterClass
	void tearDown() {
		driver.close();
	}

	@DataProvider(name="dp", indices= {0,3})  //taking specific row
	Object[][] loginData() {

		Object data[][] = {
				{"abc@gmail.com", "test123"},
				{"xyz@gmail.com", "test012"},
				{"abc@gmail.com", "test1@23"},
				{"rubi.sri@gmail.com", "pwd1"},
				{"abc1@gmail.com", "test1"}
		};
				return data;


	}

}
