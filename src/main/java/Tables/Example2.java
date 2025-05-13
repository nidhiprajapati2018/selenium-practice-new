package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		 
		//3 ways to find row size
		int totalrow = driver.findElements(By.xpath("//div[@class='table-responsive']/child::table//tr")).size();
		   System.out.println(totalrow);
		 
		   int rows = driver.findElements(By.tagName("tr")).size();   
		 System.out.println(rows);
		 
		 List<WebElement>rowCount = driver.findElements(By.xpath("//div[@class='table-responsive']/child::table//tr"));
		 System.out.println(rowCount.size());
		 
		 Assert.assertEquals(totalrow, 5);
		 
		 // find total no of columns in a table. here is also 3 ways just row
		 int totalcolumn = driver.findElements(By.xpath("//div[@class='table-responsive']/child::table//tr//th")).size();
		 System.out.println(totalcolumn);
		 
		 //specific data from row and column
		String val = driver.findElement(By.xpath("//div[@class='table-responsive']/child::table//tr[4]/td[2]")).getText();
		 System.out.println(val);
		 
		 
		 //read the all data
		 
		 for(int r=2; r<totalrow; r++) {
			 for(int c =1; c<totalcolumn; c++ ) {
			String v= driver.findElement(By.xpath("//div[@class='table-responsive']/child::table//tr["+r+"]/td["+c+"]")).getText(); 
			 System.out.println(v);
			 }
		 }
	}

}
