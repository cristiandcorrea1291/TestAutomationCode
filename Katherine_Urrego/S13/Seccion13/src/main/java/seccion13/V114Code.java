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

public class V114Code {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// 104: Codigo de la seccion 110 a 113
		/*
		 * Con este código se abre una página web, 
		 * encuentra todos los enlaces en esa página,
		 * * verifica el estado de cada enlace 
		 * y muestra el código de respuesta HTTP para cada enlace. 
		 * Luego, utiliza aserciones suaves para afirmar si los enlaces están rotos (código de respuesta >= 400) o no.
		 */

		// Configurar el controlador de Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Abrir la página web
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Encontrar todos los enlaces dentro de elementos "li" con clase "gf-li"
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		// Inicializar un objeto SoftAssert para realizar aserciones suaves
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {
			// Obtener la URL del enlace
			String url = link.getAttribute("href");

			// Crear una conexión HTTP a la URL
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			// Establecer el método de solicitud a HEAD para obtener solo la información de
			// encabezado
			conn.setRequestMethod("HEAD");

			// Conectar y obtener el código de respuesta HTTP
			conn.connect();
			int respCode = conn.getResponseCode();

			// Imprimir el código de respuesta en la consola
			System.out.println(respCode);

			// Comprobar si el código de respuesta es menor que 400 (lo que significa que el
			// enlace está activo)
			// Si el código de respuesta es mayor o igual a 400, se considera que el enlace
			// está roto
			a.assertTrue(respCode < 400,
					"El enlace con texto '" + link.getText() + "' está roto con código " + respCode);
		}

		// Realizar todas las aserciones suaves o SOFT ASSERTIONS y registrar los resultados
		a.assertAll();
	}

	private static Object getReturnCode(WebElement link) {

		// TODO Auto-generated method stub

		return null;

	}

}
