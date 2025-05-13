package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverAction1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement computers = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
		WebElement notebooks = driver.findElement(By.xpath("//ul[@class = 'sublist first-level']/li[2]"));

		Actions act = new Actions(driver);

		//mouse hover
		//act.moveToElement(computers).moveToElement(notebooks).build().perform();
		act.moveToElement(computers).moveToElement(notebooks).click().build().perform();

		//act.moveToElement(computers).moveToElement(notebooks).perform();


	}

}
