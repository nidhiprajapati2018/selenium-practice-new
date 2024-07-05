package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act =  new Actions(driver);
		
		//Control+reglink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration page
		
		Set<String>idss = driver.getWindowHandles();
		
		List<String> ids = new ArrayList(idss);
		
		//Registraction page
		driver.switchTo().window(ids.get(1)); //switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENEDY");
		
		//Home Page
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("")).sendKeys("TShirts");
		
		//Control+Reglink
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();

	}

}
