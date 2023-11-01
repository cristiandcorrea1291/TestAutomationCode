package seccion13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V113SoftAssertionInSelenium {
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		// Video 111.Open Connection method to identify status codes of the links

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Broken link : measn that page should basically throw any error
		// how to check that links are working properly and navigating to the right
		// pages

		// BROKEN URL
		// Step 1 - IS to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets you the status code
		// if status code >400 then that url is not working-> link which tied to url is
		// broken
		// a[href*='https://www.soapui.org/']
		// browser-->inspect->Network ->XHR
		// we can see the STATUS = 200,
		// 200 = successful navigation to that url
		// 400, 401, 402, 403, 404,... 500 means that link is broken

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// String enlace =
		// driver.findElement(By.cssSelector("a[href*='https://www.soapui.org/']")).getAttribute("href");

		// link con la etiqurta broken link
		String enlace = driver.findElement(By.cssSelector("a[href*='https://rahulshettyacademy.com/brokenlink']"))
				.getAttribute("href");

		System.out.println("la url que vamos  de la que vamos a validar su conexión es:");
		System.out.println(enlace);

		// video 1112
		// scan EVERY and ALL link on the footer section
		//Extrate los elementos de los enlaces y los pone en una lista
		List<WebElement> linksEnlaces = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert a = new SoftAssert();
		
		
		//usamos un ENHANCED LOOP para iterar los elementos que estan guardaso en la variable "linksEnlaces" y los guarde en la variable "link"
		//terara sobre cada item
		//in every iteration we are useing one link, and that written type is webelement
		//validar cada enlace o link y decir cual está roto
		for (WebElement link : linksEnlaces) {
			String url = link.getAttribute("href");

			
			HttpURLConnection conn = (HttpURLConnection) new URL(enlace).openConnection();// opent conection and send url to the internet // network
									
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respCode = conn.getResponseCode();
			System.out.println(respCode);

			
			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

	
		}//cerrando for
		
		a.assertAll();//esto pasara o dentendra la ejecucion
	}

	private static Object getReturnCode(WebElement link) {

		// TODO Auto-generated method stub

		return null;

	}

	
}
