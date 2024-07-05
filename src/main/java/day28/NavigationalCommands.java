package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.nopcommerce.com/"); //accepts URL only in the string format
		
		
		
		/*URL myUrl = new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myUrl);
		driver.close();*/
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		

	}

}
