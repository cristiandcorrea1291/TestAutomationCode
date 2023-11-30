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

public class v114Codes {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {
			// Obtener la URL de un enlace
			String url = link.getAttribute("href");
			// Crear una conexión HTTP a la URL
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			// Establecer el método de solicitud a HEAD para obtener solo la información del encabezado
			conn.setRequestMethod("HEAD");
			// Conectar y obtener el código de respuesta HTTP
			conn.connect();
			int respCode = conn.getResponseCode();

			// Imprimir el código de respuesta en la consola
			System.out.println(respCode);

			a.assertTrue(respCode < 400,
					"El enlace con texto '" + link.getText() + "' está roto con código " + respCode);
		}

		// Realizar todas las aserciones
		a.assertAll();
		
		System.out.println("Cerrar navegador");
		driver.quit();
	}

	private static Object getReturnCode(WebElement link) {

		// TODO Auto-generated method stub

		return null;

	}
	
}
