package checkboxAndRadioButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		boolean status = driver.findElement(By.xpath("//input[@id='sunday']")).isSelected();

		if(!status) {
			driver.findElement(By.xpath("//input[@id='sunday']")).click();
		}




	}

}
