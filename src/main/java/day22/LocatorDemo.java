package day22;

import java.util.List;

import org.openqa.selenium.By;
//command + shift + o for import hte packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		//name
		//WebElement searchBox = driver.findElement(By.name("search"));		
		//searchBox.sendKeys("MacBook");
		//driver.findElement(By.name("search")).sendKeys("MacBook");
		
		//id
		//WebElement logo = driver.findElement(By.id("logo"));
		//boolean status = logo.isDisplayed();
		//System.out.println("Dispaly status "+status);
		
		//likeText
		
		//driver.findElement(By.partialLinkText("Tab")).click();// Partial Link text
		//driver.findElement(By.linkText("Contact Us")).click(); //Preferable
		//List<WebElement> headerList = driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerList.size()); //7
		
		//List<WebElement> headerList = driver.findElements(By.tagName("a"));
		//System.out.println(headerList.size()); //76
		
		List<WebElement> headerList = driver.findElements(By.tagName("img"));
		System.out.println(headerList.size()); //18
		
		
		
		
	

	}

}
