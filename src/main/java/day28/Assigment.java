package day28;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * https://testautomationpractice.blogspot.com/

1) provide some string search for it
2) count number of links
3) click on each link using for loop
4) get window ID's for every browser window
5) close specific browser window
 */

public class Assigment {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
		System.out.println(links.size());
		
		for(WebElement li:links) {
			li.click();
			
		}
		
		Set<String>ids =driver.getWindowHandles();
		
		for(String i:ids) {
			System.out.println(i);
			String title = driver.switchTo().window(i).getTitle();
			System.out.println(title);
			if(driver.getTitle().equals("Java - Wikipedia")) {
			driver.close();
			}
			
		}
		
		}

}
