package TableHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='input-username']"));
		userName.clear();
		userName.sendKeys("demo");



		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");

		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		 Thread.sleep(5);
		 driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();//customer main menu
		 driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();


		 String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		int total_pages =  Integer.parseInt((text).substring(text.indexOf("(")+1,text.indexOf("Pages")-1));

		//repeating Pages
		for(int p=1; p<=5;p++) {
			if(p>1) {
			WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			activePage.click();
			Thread.sleep(3000);
			}
		//reading data from the page
			int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();

			for(int r=1;r<=noOfRows;r++) {
			String name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();

			System.out.println(name+"\t"+email+ "\t"+status);
			}
		}

	}

}
