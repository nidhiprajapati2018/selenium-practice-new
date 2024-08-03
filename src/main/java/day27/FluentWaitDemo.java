package day27;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
        
        //declaration
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(10))   //maximum time waiting 10 second
        		.pollingEvery(Duration.ofSeconds(2))   
        		// pooling time means every 2 second of interval keep try to find element until the time reached 10 second
        		.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txtusername = mywait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder= 'Username']"));
			}
		});
		
		txtusername.sendKeys("admin");
		
		
		
		
		//driver.findElement(By.xpath("input[@placeholder= 'username']")).sendKeys("Admin");
		

	}

}
