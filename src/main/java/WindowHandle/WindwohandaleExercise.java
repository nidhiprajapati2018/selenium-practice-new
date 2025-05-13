package WindowHandle;

import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwohandaleExercise {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@target='_blank']")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String handle: allwindow ) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.name("UserFirstName")).sendKeys("Nidhi");
			    driver.findElement(By.name("UserLastName")).sendKeys("Prajapati");	
			    driver.findElement(By.name("UserTitle")).sendKeys("Pra");
				
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}
