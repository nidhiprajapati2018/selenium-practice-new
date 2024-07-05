package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
		driver.manage().window().maximize();
		
		
		//sinle file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/Users/nidhiprajapati/Desktop/UdemyResourceSelenium/Xpath.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Xpath.txt")) {
			System.out.println("File is sucessfully uploaded");
		}else {
			System.out.println("Upload failed");
		}*/
		
		
		//multiple files uploaded
		
		String file1 = "/Users/nidhiprajapati/Desktop/UdemyResourceSelenium/Xpath.txt";
		String file2 = "/Users/nidhiprajapati/Desktop/UdemyResourceSelenium/Day-31.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOffileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(noOffileUploaded ==2) {
			System.out.println("All file are uploaded");
		}else {
			System.out.println("file are not uploaded or incorrect file uploaded");
		}
		
		//validate file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Xpath.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("DAt-31.txt")){
			System.out.println("File names matching..");
		}else {
			System.out.println("Files are not matching.  ");
		}
		}
		
	}


