package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);

		Action myaction = act.contextClick(button).build(); //building creating an action and storing into a variable

		myaction.perform(); //we are performing/completing action


		//Actions -- class, will be used to perform mouse actions.
		//Action --- interface, will be used to store created actions.
	}

	//https://jqueryscript.net/demo/Price-Range-slider-jQuery-UI/

}
