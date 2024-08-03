package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
       WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10)); //expicit wait declation
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//fram1
		WebElement fram1 =  driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
		driver.switchTo().frame(fram1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		//driver.switchTo().defaultContent();
		
		//Frame2
		//WebElement fram2 =  driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		//driver.switchTo().frame(fram2);
		//driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
		
		driver.switchTo().defaultContent();
		
		/*//frame3
		WebElement fram3 =  driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fram3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("manual");
		
        //switch to inner frame(part of frame3)
		driver.switchTo().frame(0); //switch to inner frame
		
		driver.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();*/
	}

}
