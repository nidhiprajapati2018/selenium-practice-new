package Dropdown;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class test {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/ ");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("country"));

		Select select =  new Select(dropdown);

		select.selectByVisibleText("Japan");
		
	
		//select.selectBytext();

	}

}
