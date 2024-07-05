package Day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlerts1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alert with OK button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();	
		
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		myalert.accept();
		
		driver.switchTo().alert().accept(); */
		
		
		/*// 2) confirmation Alert -OK & Cancel
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click(); //open Alert
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		System.out.println("text message  " + myalert.getText());
		//driver.switchTo().alert().accept();  //close alert window using OK button
		driver.switchTo().alert().dismiss(); //close alert window using cancel button*/
		
		 /*//3) Prompt Alert - Input box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click(); //open Alert window
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		
		System.out.println("text message  " + myalert.getText());
		myalert.sendKeys("john");
		myalert.accept();
		
		//validate for the message 
		String res = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if(res.contains("john")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}*/
		
		
		
		

	}

}
