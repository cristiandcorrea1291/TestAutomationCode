package seccion13;

import java.net.HttpURLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V110StrategyToAutomateBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video 110: strategy to automate the broken Links with Selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Broken link : measn that page should basically throw any error
		//how to check that links are working properly and navigating to the right pages
		
		// BROKEN URL
		// Step 1 - IS to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets you the status code
		// if status code >400 then that url is not working-> link which tied to url is
		// broken
		// a[href*='https://www.soapui.org/']

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String enlace = driver.findElement(By.cssSelector("a[href*='https://www.soapui.org/']")).getAttribute("href");

		// browser-->inspect->Network ->XHR
		// we can see the STATUS = 200,
		// 200 = successful navigation to that url
		// 400, 401, 402, 403, 404,... 500 means that link is broken
		
		System.out.println(enlace);

	}


}
