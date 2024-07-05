package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://testautomationpractice.blogspot.com/");
    WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='country']"));
    Select drocountry = new Select(dropdownEle);
    
    //Select option from the drop down
    //drocountry.selectByVisibleText("Japan");
    drocountry.selectByValue("uk");
   // drocountry.selectByIndex(9);
    
    //capture the option from the dropdown
    
    List<WebElement>option = drocountry.getOptions();
    System.out.println("Number of option in a dropdown "+ option.size());
    
    
    //Printing the option
    
   /* for(int i=0; i<option.size();i++) {
    	 System.out.println(option.get(i).getText());
    }*/
    
    //enhanced for loop
    
    for(WebElement op: option) {
    	System.out.println(op.getText());
    }
    
    
    }

}
