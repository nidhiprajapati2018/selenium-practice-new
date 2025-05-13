package ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	 WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) {
		driver = new ChromeDriver();

		switch(br){
		case "chrome": driver= new ChromeDriver(); break;
		case "edge": driver= new EdgeDriver(); break;
		default: System.out.println("Invalid browser"); return;
		
                           }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

	}

	@Test(priority=1)
	void testLogo() {
	boolean logoStatus	= driver.findElement(By.xpath("//div[@id=\"logo\"]")).isDisplayed();
	 Assert.assertEquals(logoStatus, true);

	}

	@Test(priority=2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(),"Account Login" );
	}


	@Test(priority=3)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
	}


	@AfterClass
	void tearDown() {
		driver.close();
	}








}
