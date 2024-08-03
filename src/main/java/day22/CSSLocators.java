package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
	  
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    //tag id
	    //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	    //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
	    
	    //tag class
	    //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
	    
	    //tag attribute
	    //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
	    //driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
	    //driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]"));
	    
	    //tag class attribute
	    driver.findElement(By.cssSelector("input.search-box-text[name= 'q']")).sendKeys("T-shirts") ;
	    WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
	    System.out.println(submit.getAttribute("name"));

	}

}
