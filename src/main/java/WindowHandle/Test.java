package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   //driver.window().manage().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[contains( @href, 'orangehrm.com')]")).click();
		  String parentwindow =  driver.getWindowHandle();
		  Set<String> handles = driver.getWindowHandles(); 

		  for(String handle: handles){ 
		     if(handle != parentwindow){
		     driver.switchTo().window(handle);
		}  

		 System.out.println(driver.getTitle());
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
		

	}

}
	
}
