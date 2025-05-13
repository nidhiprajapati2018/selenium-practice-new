package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerFromNotes {

	public static void main(String[] args) {

		String month = "April";
		String year = "2021";
		String date = "13";

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Dimension size = driver.findElement(By.xpath("//iframe[@class='demo-frame']")).getSize();


		System.out.println("totalFrames --" + size);
		driver.switchTo().frame(0);// Switching to Frame

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(4));
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='datepicker']")));

		while (true) {
			String getMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String getYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			System.out.println(getMonth +" "+getYear);
			if (getMonth.equals(month) && getYear.equals(year) ) {
				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}

		driver.findElement(By.xpath("//a[normalize-space()='13']")).click();

	}

}
