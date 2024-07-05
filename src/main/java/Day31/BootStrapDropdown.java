package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		    driver.manage().window().maximize();
		    
		  
		    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();//open dropdown option
		   
		    //1)select single option
		    //driver.findElement(By.xpath(" //input[@value='Java']")).click();
		    
		    //2 capture all the option and find out the size
		    List<WebElement> option = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		    
		    System.out.println("Number of option: "+ option.size());
		    
		    //3 printing option from dropdown
		    
		    for(WebElement op: option) {
		    	System.out.println(op.getText());
		    }
		    
		    //4 Select multiple options
		    
		    
		    for(WebElement op: option) {
		    	
		    	if(op.getText().equals("java")|| op.getText().equals("Python")|| op.getText().equals("Angular")) {
		    		System.out.print(op);
		    		op.click();		    	}
		    }
		    
		   
		    
		    

	}

}
