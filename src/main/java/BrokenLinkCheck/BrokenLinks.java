package BrokenLinkCheck;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1) link href ="https://xyz.com"
 2) https://xyz.com ---> server ----> status code
 3) status code >= 400 broken link
  status code <400 not a broken link
  https://validator.w3.org/checklink
 * */


public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://validator.w3.org/checklink");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		int noOfBrokenLinks = 0;

		for(WebElement linkElement:links) {
			String hrefattValue = linkElement.getAttribute("href");
			

			if(hrefattValue ==null || hrefattValue.isEmpty()) {
				System.out.println("href attribute value is null or empty. so Not possible to check");
				continue;
			}

			//hit url to the server

			try {
			URL linkUrl =  new URL(hrefattValue); //converted href value from string to URL format
			 URLConnection connlnkURL = linkUrl.openConnection(); //open the connection to the server
			connlnkURL.connect(); //conect to server and send request the server

			if(((HttpURLConnection) connlnkURL).getResponseCode()>=400) {
				
				System.out.println(hrefattValue +"====Broken Link");
				noOfBrokenLinks++;

			}else {
				System.out.println(hrefattValue+ " Not a Broken Link");

			}
			}
		catch(Exception e){
			}
		}

		System.out.println("Number of broken links: "+ noOfBrokenLinks);


	}
}


