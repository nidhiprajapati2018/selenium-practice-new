package TableHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='table1']/child::thead/child::tr/th"));
		//List<String>tableHeadingTexts = new ArrayList<String>();
		int hadingSize = table.size();
		//all header
		for(WebElement heading : table ) {
			System.out.println(heading.getText());
		}
		
		//specific column data
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr"));
		int totalRow  = rows.size();
		for(WebElement heading : table ) {
			if(heading.getText()== "place") {
				for(int i=0; i<totalRow; i++) {
				List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr"+i+"td"+i));
				System.out.println(columnData.get(i).getText());
				};
		}
		}
		

	}

}
