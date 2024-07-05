package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethos {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getTitle() =returns title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() =return URLof the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - return source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandal() -Return the ID of the single browse window
		String windowId = driver.getWindowHandle();
		System.out.println("windowId "+ windowId);  //2A8EF3BACCF4BA38DBF8834CE89172A1
		
		//getWindowHandales()- return ID's of multiple browser windows
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows); //[2A8EF3BACCF4BA38DBF8834CE89172A1, 91CEB96D5FE6DEF9E52BCDBB87608664]
		
	}

}
