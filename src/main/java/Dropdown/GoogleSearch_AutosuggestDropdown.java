package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		List<WebElement> option = driver.findElements(By.xpath("//ul[@ role='listbox']//li//div[@role='option']"));
		System.out.println("Number of elements is " + option.size());

		for(WebElement op: option) {
			System.out.println(op.getText());

			}
		Thread.sleep(5);

			for(WebElement op: option) {

			  if(op.getText().equals("selenium deficiency")) {
					op.click();
					break;
				}

		}




	}

}
