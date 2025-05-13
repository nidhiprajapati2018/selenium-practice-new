package day21;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class FirstTestCase
{
	
	//final int sum = 10;
	
    public static void main( String[] args )
    {
    	

       WebDriver driver  = new ChromeDriver();



       driver.manage().window().maximize();
       driver.get("https://demo.opencart.com/");
       String act_title  = driver.getTitle();
       System.out.println(act_title);

       if(act_title.equals("Your Store")) {

    	   System.out.println("Test Passed");
       }
       else {
    	   System.out.println("Test Failed");
       }

       //driver.close();


    }
}
