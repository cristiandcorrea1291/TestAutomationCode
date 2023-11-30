package Sesion13;

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

public class V112IterateAllLinksThePage {
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		String enlace = driver.findElement(By.cssSelector("a[href*='https://rahulshettyacademy.com/brokenlink']"))
				.getAttribute("href");

		System.out.println("la url que vamos  de la que vamos a validar su conexión es:");
		System.out.println(enlace);

		List<WebElement> linksEnlaces = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert a = new SoftAssert();
		
		for (WebElement link : linksEnlaces) {
			String url = link.getAttribute("href");

			
			HttpURLConnection conn = (HttpURLConnection) new URL(enlace).openConnection();
									
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respCode = conn.getResponseCode();
			System.out.println(respCode);

			if(respCode>400) {
				a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

				a.assertTrue(false);

			}
			
		}
	}

}
