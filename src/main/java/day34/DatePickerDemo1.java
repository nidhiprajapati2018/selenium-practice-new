package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	static void selectFuturedate(WebDriver driver, String year, String month, String date) {

		// select month $ year

		while (true) {

			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual
																													// month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual
																												// year

			if (currentMonth.equals(month) && currentYear.equals(year)) {

				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // next Button

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();

		}

		// Select the date

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;

			}
		}

	}

	static void selectPastdate(WebDriver driver, String year, String month, String date) {

		// select month $ year

		while (true) {

			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual
																													// month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // actual
																												// year

			if (currentMonth.equals(month) && currentYear.equals(year)) {

				break;
			}
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click(); //next Button

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}

		// Select the date

		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;

			}
		}

	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to the frame
		driver.switchTo().frame(0);

		// Method : using sendKey()
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/10/2024");

		// Mehtod2 : data picker
		// expected data
		String year = "2025";
		String month = "April";
		String date = "10";

		driver.findElement(By.xpath("//input[@id='datepicker' and @type='text']")).click();

		selectFuturedate(driver, year, month, date);
		// selectPastdate(driver,year,month,date);

	}

}
