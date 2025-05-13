package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActionFromSeleniumNotes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		Thread.sleep(2000);

		WebElement txtUserName=driver.findElement(By.id("email"));

		txtUserName.sendKeys("hi");

		Actions builder = new Actions(driver);

		Action seriesofActions=builder.moveToElement(txtUserName).click()
										.keyDown(txtUserName,Keys.SHIFT)
										.sendKeys(txtUserName,"hello")
										.keyUp(txtUserName,Keys.SHIFT)
										.doubleClick(txtUserName)
										.contextClick().build();

		seriesofActions.perform();


	}

}
