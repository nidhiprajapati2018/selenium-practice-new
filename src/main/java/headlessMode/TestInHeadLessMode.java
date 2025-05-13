package headlessMode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestInHeadLessMode {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		//opt.setHeadless(true)
		opt.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://demo.nopcommerce.com");
		System.out.println(driver.getTitle());
		

	}
}


