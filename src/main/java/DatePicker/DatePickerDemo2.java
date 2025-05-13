package DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();

		//input DOB
		String requiredYear = "2021";
		String requiredMonth = "April";
		String requiredDate = "10";

		driver.switchTo().frame("frame-one796456169");
		WebElement dr = driver.findElement(By.xpath("//span[@class='icon_calendar']"));
		dr.click();

		//Select year
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByVisibleText(requiredYear);



	}

}
