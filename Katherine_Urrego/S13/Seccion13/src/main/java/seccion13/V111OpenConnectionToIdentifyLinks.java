package seccion13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.net.URL; 

import java.net.URLConnection; 

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V111OpenConnectionToIdentifyLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Broken link : measn that page should basically throw any error
		//how to check that links are working properly and navigating to the right pages
			// browser-->inspect->Network ->XHR
			// we can see the STATUS = 200,
			// 200 = successful navigation to that url
			// 400, 401, 402, 403, 404,... 500 means that link is broken
		 
		 
		// BROKEN URL
		// Step 1 - IS to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets you the status code
		// if status code >400 then that url is not working-> link which tied to url is
		// broken
		// a[href*='https://www.soapui.org/']

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//String enlace = driver.findElement(By.cssSelector("a[href*='https://www.soapui.org/']")).getAttribute("href");
		
		//link con la etiqurta broken link
		String enlace = driver.findElement(By.cssSelector("a[href*='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		
		System.out.println("la url que vamos  de la que vamos a validar su conexión es:");
		System.out.println(enlace);


		
		//video 111
		//scan ONE  link on the footer section

			HttpURLConnection conn = (HttpURLConnection) new URL(enlace).openConnection();//opent conection and send url to the internet network
			
			//hacer el request
			conn.setRequestMethod("HEAD");
			conn.connect();

			//get the response
			int respCode = conn.getResponseCode();
			System.out.println("La conexion es:");
			System.out.println(respCode);
			


	}


}