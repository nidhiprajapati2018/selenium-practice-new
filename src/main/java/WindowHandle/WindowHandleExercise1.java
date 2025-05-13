package WindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExercise1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parenthandale = driver.getWindowHandle();
		System.out.println("parenthandale" + parenthandale);
		driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
	    Set<String> Windowhandles = driver.getWindowHandles();
	    driver.getTitle().equals("jhone");
	   
	      
//	       driver.switchTo().window("1");
//	       String title =driver.getTitle();
//	       System.out.println(title);
	   
		for(String handle :Windowhandles ) {
			System.out.print(handle);
			if(!handle.equals(parenthandale)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@id ='Form_submitForm_EmailHomePage']")).sendKeys("nidhi@");
		        Thread.sleep(5000); 
		        
		        driver.close();
			
			}
		}
		driver.switchTo().window(parenthandale);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("prajapati");

			
	  

	}

}
