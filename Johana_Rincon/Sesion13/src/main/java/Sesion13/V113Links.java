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
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V113Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		
		 WebDriverManager.chromedriver().setup();

			// Se crea una instancia de ChromeDriver, que representa una instancia del
			// navegador Google Chrome.
			WebDriver driver = new ChromeDriver();

			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//Esto selecciona todos los elementos <a> dentro de elementos <li> con la clase "gf-li". dejar un espacio
			// List<WebElement> links = driver.findElements(By.tagName("a"));
			List<WebElement> links = driver.findElements(By.cssSelector("li.gf-li a"));
			//crea una clase Assert
			SoftAssert a= new SoftAssert();


			for (WebElement link : links) {

				String url = link.getAttribute("href");

				// String
				// url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();// crear una conexión HTTP a una
																							// URL especificada

				conn.setRequestMethod("HEAD");// método de solicitud HTTP en "HEAD". Cuando se realiza una solicitud HTTP
												// con el método "HEAD", se está solicitando solo la información de
												// encabezado del recurso en la URL,
				conn.connect();// conexión con la URL especificada
				int respCode = conn.getResponseCode();
				System.out.println(respCode);
				
				a.assertTrue(respCode<400, "el link con el texto" + link.getText() + "es broken con el codigo " + respCode);
				
			}
			a.assertAll();//esto hace leea todos los links y al final me muestra los enlaces rotos
		}

	

	}


