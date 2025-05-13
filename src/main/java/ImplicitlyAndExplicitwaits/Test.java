package ImplicitlyAndExplicitwaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Test {
	

	public static void main(String[] args) {
		
		test1();

	}
	
	public static void test1() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		/*//driver.findElement(By.linkText("ABCD cats & vets Europe")).click();
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(60))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		      WebElement linkElement =  driver.findElement((By.linkText("ABCD cats & vets Europe")));
		      if(linkElement.isDisplayed()) {
		    	  System.out.println("Element found");
		      }
		      return linkElement;
		      
		     }
		     
		    });
		   
		   element.click();*/
		   
		   
		
		
	}



}
