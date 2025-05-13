package day46_Listeneclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(day46_Listeneclass.MyListener.class)
public class OrangeHRM {

	WebDriver driver;

	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority=1)
	void testLogo() {

		boolean logoStatus = driver.findElement(By.xpath("//img[@alt='company-']")).isDisplayed();
		Assert.assertEquals(logoStatus, true);

	}

	@Test(priority=2)
	void testURL(){

		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority=3)
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "HRM");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}


}
