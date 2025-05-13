package ImplicitlyAndExplicitwaits;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitlyWaitExample {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement createAcc = driver.findElement(By.partialLinkText("Create"));
		createAcc.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		
		sendKey(firstname, driver, 5, "Merry");
		sendKey(lastname, driver, 5, "Rose");
		sendKey(mobileNumber, driver, 3, "321456789");
		sendKey(password, driver, 4, "hiface");
		
		WebElement acc =  driver.findElement(By.partialLinkText("account"));
		clickOn(acc, driver, 10);
		
		WebElement forgotAccount =  driver.findElement(By.partialLinkText("Forgot"));
		clickOn(forgotAccount, driver, 20);
		
		
		
	}
	
	public static void sendKey(WebElement element, WebDriver driver, int timeout, String value  ) {
		
		new WebDriverWait(driver, Duration.ofSeconds(timeout))
		   .until(ExpectedConditions.visibilityOf(element))
		   .sendKeys(value);
		
	}
	
	public static void clickOn(WebElement element, WebDriver driver,int timeout) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout))
		 .until(ExpectedConditions.elementToBeClickable(element)).click();
        
	}

}
