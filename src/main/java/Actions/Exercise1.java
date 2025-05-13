package Actions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise1 {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://omayo.blogspot.com/");
	   WebElement blogs  = driver.findElement(By.xpath("//*[@id='blogsmenu']"));
	   //WebElement bl = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[3]/a/span"));
	   WebElement bl = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
	   
	   Actions act = new Actions(driver);
	   
	   //act.moveToElement(blogs).moveToElement(bl).perform();
	   
	   //open the links in other tab
	   
	   WebElement link1 = driver.findElement(By.linkText("compendiumdev"));
	   WebElement link2 = driver.findElement(By.linkText("onlytestingblog"));
	   WebElement link3 = driver.findElement(By.linkText("testwisely"));
	   
	   act.moveToElement(link1).keyDown(Keys.COMMAND).click()
	   .keyUp(Keys.CONTROL).perform();
	   
	   
	   
	   
	   

	   

	}

}
