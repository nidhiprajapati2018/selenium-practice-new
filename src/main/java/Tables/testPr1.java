package Tables;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test()
public class testPr1 {
	
	public void testTable() {
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://practice.expandtesting.com/dynamic-table");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 List<WebElement> header = driver.findElements(By.xpath("//table[@class =\"table table-striped\"]//tr//th"));
	 System.out.println(header.size());
	 boolean status = false;
	 for(WebElement hr: header) {
		 System.out.println(hr.getText());
		 
		
		 if(hr.getText().equals("Disk")); 
		 status = true;
		 break;
		 
	 }
	 
	Assert.assertTrue(status);
	 
	 
	driver.quit();
	 }

	
		 
	

}
