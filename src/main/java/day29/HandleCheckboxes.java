package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		 
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Select checkbox
     	/*WebElement checkbox = driver.findElement(By.xpath("//input[@id ='sunday']"));
		System.out.println("Before Selection  "+checkbox.isSelected());
	    driver.findElement(By.xpath("//input[@id ='sunday']")).click();
		System.out.println("After Selection  "+checkbox.isSelected());*/
		
		//2) capturing all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class ='form-check-input' and @ type ='checkbox']"));
		System.out.println("Number of checkboxes  "+checkboxes.size());
		checkboxes.get(3).click();
		
		//3) selecting all the checkboxes
//		for(int i=0; i<checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		}
		
		/*for(WebElement chkbox:checkboxes ) {
			chkbox.click();
		}*/
		
		//4) select last 3 checkboxes
		//total number of check boxes - how many check boxes do you want to select = starting index
		// 7-3 = 4 staring index
		
		/*for(int i=4; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}*/
		
		/*for(int i=0; i<=2; i++) {
			checkboxes.get(i).click();
		}*/
		
		//6 select/unselect checkboxes
		
		/*for(WebElement chkbox: checkboxes) {
			if(chkbox.isSelected()) {
			chkbox.click();  //inselect
		}else {
			chkbox.click(); //select
		}
			
			}*/
		
		//7select specific check boxes randomly 
//		
//		for(int i=0; i<checkboxes.size(); i++) 
//		{
//			if(i==1 || i ==3|| i==6){
//			checkboxes.get(i).click();
//			}
//		}
		
		
		//select checkbox bassed on the value
		/*String weekname = "Sunday";
		
		switch (weekname)
		{
		case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
		   break;
		   
		case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
		   break;
		   
		case "Tusday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		   break;
		   
		case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		   break;
		   
		case "Thursday" : driver.findElement(By.xpath("//input[@id='thurday']")).click();
		   break;
		   
		case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
		   break;
		   
		case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
		   break;
		 default    : System.out.println("Invalid week day");
		   
		}
		*/
		
		
		
		
	}

}
