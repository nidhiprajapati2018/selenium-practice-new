package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction4 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
	      // WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //expicit wait declation

			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().window().maximize();

			Actions act = new Actions(driver);

			//drag and drop
			WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
			WebElement italy = driver.findElement(By.xpath("(//div[@id='box106'])[1]"));

			act.dragAndDrop(rome, italy).perform();


	}

}
