package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//XPath with Single attribute
		//driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("TShirts");
		
		//XPath with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirt");
		
		//Xpath with and operator
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirt");
		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-shirt");
		
		//Xpath with inner text -text()
		/*driver.findElement(By.xpath("//*[text() = 'MacBook']")).click();
		String value = driver.findElement(By.xpath("//h3[text() = 'Featured']")).getText();
		System.out.println(value);*/
		
		
		//Xpath with inner contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys();
	    
	    
		//Xpath with start-with()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys();
				
	   //Xpath with chained xpath
		
		boolean imageStatus = driver.findElement(By.xpath("//div[@id= 'logo']/a/img")).isDisplayed();
		System.out.println(imageStatus);

	}

}
