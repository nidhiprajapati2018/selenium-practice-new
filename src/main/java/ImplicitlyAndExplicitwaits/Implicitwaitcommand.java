package ImplicitlyAndExplicitwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwaitcommand {

	public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //this is for implicitwait

        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		//Thread.sleep(5000);
		//usage of explicit wait
		WebElement textusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		textusername.sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		WebElement textpwd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		textpwd.sendKeys("admin123");

		WebElement loginButton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));
		loginButton.click();
		


	}

}
