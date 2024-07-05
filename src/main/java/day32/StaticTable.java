package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. find total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7 //multiple table in web page
		
		//int rows = driver.findElements(By.tagName("tr")).size();  //single table  //14
		System.out.println("number od rows "+rows);
		
		//find total no of columns in a table
		int cols  = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //multiple table in web page
		System.out.println("number od columns "+cols);  
		
		int cols1  = driver.findElements(By.tagName("th")).size();
		System.out.println("number od columns "+cols1); ////single table 
		
		//3 Read data from specific row and columns
		String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookName);  //Master In Selenium
		
		String bookName1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		System.out.println(bookName1);  //Javascript 
		
		//4 read data from all the row and columns
		
		/*System.out.println("BookName" + "\t"+"Author"+ "\t"+ "Subject"+"\t"+"Price"+"\t");
		for(int r=2; r<=rows; r++) {
			for(int c=1; c<=cols; c++ ) {
				 String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.print(value+ "\t");
				}
			System.out.println();
		}*/
		
		//print book names whose author is Mukesh
		
		/*for(int r=2; r<=rows;r++) {
			
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
            if(authorName.equals("Mukesh")) {
            	String bookNa = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
               System.out.println(bookNa+"\t"+authorName);
            }
		}*/
		
		//6 find total price of all the books
		int total = 0;
		for(int r=2; r<=rows;r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[4]")).getText();
			total = total = Integer.parseInt(price);
		}
		
		 System.out.println("Tatal price of the book "+total); //7100
		
		
		
		
		
		
		
		

	}

}
