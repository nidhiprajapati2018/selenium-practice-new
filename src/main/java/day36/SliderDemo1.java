package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryscript.net/demo/Price-Range-slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//minslider
		WebElement minSlider = driver.findElement(By.xpath(null));
		
		System.out.println("Defualt loction of the min slier: "+ minSlider.getLocation());  //(58,249)  (x,y)
		act.dragAndDropBy(minSlider, 100, 249).perform();
		System.out.println(" loction of the min slier after moving: "+ minSlider.getLocation());  //(157,249)  (x,y)
	
        //maxSlider
		WebElement maxSlider = driver.findElement(By.xpath(null));
		
		System.out.println("Defualt loction of the min slier: "+ maxSlider.getLocation());  //(876,249)  (x,y)
		act.dragAndDropBy(minSlider, -100, 249).perform();
		System.out.println(" loction of the min slier after moving: "+ maxSlider.getLocation());  //(778,249)
	}

}
