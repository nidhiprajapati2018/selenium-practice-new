package day36;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectFromSeleniumNotes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

	      driver.manage().window().maximize();
	      
	      driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_I")).click();
	      
	      driver.findElement(By.id("ControlOptionsTopHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
	      
	      Thread.sleep(5000);
	      
	      // Perform Multiple Select
	      Actions builder = new Actions(driver);
	      WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));
	      List<WebElement> options = select.findElements(By.tagName("td"));
	      
	      //int x=options.size();
	      System.out.println(options.size());
	      //Action multipleSelect = builder.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();
	    Action multipleSelect = builder.click(options.get(2)).click(options.get(4)).click(options.get(6)).build();
	      
	     Action multipleSelect1 = builder.keyDown(Keys.SHIFT).click(options.get(0)).click(options.get(5)).build();
	      
	      //driver.close();


	}

}
