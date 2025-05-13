package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//this will open the new browser window

		Thread.sleep(5000);
		//driver.close(); //close single browser window where ever the driver is focused
		driver.quit();  //close all the browse windows



	}

}
