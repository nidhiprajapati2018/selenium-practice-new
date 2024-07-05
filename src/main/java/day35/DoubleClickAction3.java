package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//Switch to frame
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		
		box1.clear();  //clear the box1
		box1.sendKeys("welcome");
	 
		//double click action on the button
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
		
		//validation : box2 should contains "welcome"
		
		/*if(box2.getText.equals("welcome")) {   // getText only capture the inner text. this line of code not working fine
			System.out.println("Text copied..");
			
		}else {
			System.out.println("Text not copied..");
		}*/
		
		if(box2.getAttribute("value").equals("welcome")) {
			System.out.println("Text copied..");
			
		}else {
			System.out.println("Text not copied..");
		}

		
		
		
	}

}
