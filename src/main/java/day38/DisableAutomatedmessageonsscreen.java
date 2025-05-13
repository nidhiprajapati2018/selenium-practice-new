package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedmessageonsscreen {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});


		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");

		String act_title = driver.getTitle();
		if(act_title.equals("your Store")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test failed");
		}

		//driver.quit();

	}

}
