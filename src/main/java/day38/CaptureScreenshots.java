package day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();

		
		/*
		 * //1. full page screenshots TakesScreenshot ts = (TakesScreenshot)driver; File
		 * sourcefile = ts.getScreenshotAs(OutputType.FILE); File targetfile = new
		 * File(System.getProperty("user.dir")+"/screenshorts/fullpage.png");
		 * sourcefile.renameTo(targetfile); //copy sourcefile to target file
		 */		 
		

		
		/*
		 * //2. capture the screenshot of specific section WebElement featureProducts =
		 * driver.findElement(By.
		 * xpath("//div[@class='product-grid home-page-product-grid']")); File
		 * sourcefile = featureProducts.getScreenshotAs(OutputType.FILE); File
		 * targetfile = new
		 * File(System.getProperty("user.dir")+"/screenshorts/featureProduct.png");
		 * sourcefile.renameTo(targetfile); //copy sourcefile to target file
		 */		 

		// capture the screenshot of webelement
		
		  WebElement logo =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")); 
		  File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		  File targetfile  = new File("/Users/nidhiprajapati/eclipse-workspace-QA/Selenium_Step_by_step/screenshorts/logo.png");
		  sourcefile.renameTo(targetfile); // copy sourcefile to target file
		  //FileUtils.copyFile(screenshotFile,new File(System.getProperty("user.dir")+"/ScreenShots/scrn.png"));
		driver.quit();
	}

}
