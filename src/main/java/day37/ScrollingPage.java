package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0,1500)", "" );
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll the page till element is visible
		
		/*WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();", ele );
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
		//scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    System.out.println(js.executeScript("return window.pageYOffset;"));
	    
	    
	     Thread.sleep(5000);
	    //scrolling up to intial position
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		

	}

}
