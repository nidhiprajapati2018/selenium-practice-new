package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement textA = driver.findElement(By.xpath("//*[@id='ta1']"));
		WebElement text = driver.findElement(By.xpath("//h2[text()='Text Area Field Two']/following::textarea"));
		
		//Pressing Key Combination
		Thread.sleep(3000);
		text.sendKeys(Keys.COMMAND +"A");
		
		Thread.sleep(3000);
		text.sendKeys(Keys.COMMAND+"x");
		
		Thread.sleep(3000);
		textA.sendKeys(Keys.COMMAND+"v");
	
		

	}

}
