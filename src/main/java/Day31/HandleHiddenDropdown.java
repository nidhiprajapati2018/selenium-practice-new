package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//Login Steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//clicking on PM tab
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();  //PIM
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();  //Click on dropdown
		
		//Select single option
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		Thread.sleep(5000);
		//count the no of option
		List <WebElement>option = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of option "+ option.size());
		
		//printing options
		for(WebElement op: option) {
			System.out.println(op.getText());
		}
		
	} 

}
