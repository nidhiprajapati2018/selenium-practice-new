package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conditional methods - access these commands through webElement
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed() = We can check display status of the element
		boolean logo = driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status "+ logo);
		
		//isEnable() = we can check enable/disable status of the element/operational element
		boolean status = driver.findElement(By.xpath(" //input[@id='FirstName']")).isEnabled();
		System.out.println("Enable status: "+ status);
		
		//isSelected = we can use to check the element is selected or not
		WebElement male_rd = driver.findElement(By.id("gender-male"));
		WebElement female_rd  = driver.findElement((By.xpath("//input[@id='gender-female']")));
		
		System.out.println(male_rd.isSelected());//false
		male_rd.click();
		System.out.println(male_rd.isSelected());//True
		
		System.out.println(female_rd.isSelected()); //false
		female_rd.click();
		System.out.println(female_rd.isSelected());//true
		
		boolean newsLatter  = driver.findElement((By.xpath("//input[@id='Newsletter']"))).isSelected(); //true
		System.out.println("NewsLaller  "+newsLatter);//true
		
		
		
		
	}

}
