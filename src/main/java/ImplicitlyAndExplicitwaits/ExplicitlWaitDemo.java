package ImplicitlyAndExplicitwaits;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ExplicitlWaitDemo {
	
	// created reference variable for WebDriver
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

	// initializing driver variable using FirefoxDriver
	driver=new ChromeDriver();
	// launching gmail.com on the browser
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	// maximized the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//@Test
	public void test() throws InterruptedException {
	// saving the GUI element reference into a "element" variable of WebElement type
	WebElement element = driver.findElement(By.id("email"));
	// entering username
	element.sendKeys("dummy@gmail.com");
	element.sendKeys(Keys.RETURN);
	// entering password
	driver.findElement(By.id("pass")).sendKeys("password");
	// clicking signin button
	driver.findElement(By.name("login")).click();
	// explicit wait - to wait for the compose button to be click-able
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}
	
	@Test
	public void verifyAlert(){
		
		  WebElement t = driver.findElement(By.name("submit"));
	      t.click();
	      // Explicit wait condition for alert
	      WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	      //alertIsPresent() condition applied
	      if(w.until(ExpectedConditions.alertIsPresent())==null)
	      System.out.println("Alert not exists");
	      else
	      System.out.println("Alert exists");
		
	}

	@AfterMethod
	public void teardown() {
	// closes all the browser windows opened by web driver
	driver.quit();
	}
   //alertIsPresent, frameToBeClicable(), visibilityOfElementLocated()
	

}
