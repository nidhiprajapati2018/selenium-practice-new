package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://textcompare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='frm_compare_1']")).sendKeys("welcome");
		
		Actions act =  new Actions(driver);
		
		//ctrl+A  --Select the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		
		//ctrl+c   Copy the text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		
		//Tab = Shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		
		//ctrl+V  - past the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		//Enter
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	

	}

}
