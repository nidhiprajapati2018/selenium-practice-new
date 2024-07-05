package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleRadioButtons {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female_r = driver.findElement(By.xpath("//input[@id='female']"));
		
		System.out.println("Before Selection...");
		System.out.println("Select statuse of the male radio button: " + male_rd.isSelected());
		System.out.println("Select statuse of the male radio button: " + female_r.isSelected());
		
		male_rd.click();
		
		System.out.println("After Selection...");
		System.out.println("Select statuse of the male radio button: " + male_rd.isSelected());
		System.out.println("Select statuse of the male radio button: " + female_r.isSelected());
		
		

	}

}
