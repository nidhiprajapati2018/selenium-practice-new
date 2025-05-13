package WindowHandle;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindowEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        //driver.findElement(By.xpath("//a[@href='www.google.com']"));
		driver.findElement(By.xpath("//a[@href=\"//www.google.com\"]")).click();
		
	  
	   Set<String> windows = driver.getWindowHandles();
	   System.out.println(windows);
	   
	   String parentWindow = driver.getWindowHandle();
	   System.out.println(parentWindow);
	   
	  for(String win : windows) {
		  if(!win.equals(parentWindow)) {
			  driver.switchTo().window(win);
			  System.out.println(driver.getTitle());
			  driver.close();
		  }
	  }
	  
	  driver.switchTo().window(parentWindow);
	  System.out.println(driver.getTitle());
	   
	   
	}

}
