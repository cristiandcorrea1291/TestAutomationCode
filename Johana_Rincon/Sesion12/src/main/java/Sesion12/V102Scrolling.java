package Sesion12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List; // Importa la clase List correcta

public class V102Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome
		WebDriverManager.chromedriver().setup();
		// Se crea una instancia de ChromeDriver, que representa una instancia del
		// navegador Google Chrome.
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Inicializa el objeto JavascriptExecutor
		// para realizar el scrolling:
		// e utiliza para ejecutar una operación de desplazamiento (scroll)
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Realiza un scroll en la página
		js.executeScript("window.scrollBy(0, 500)");

		Thread.sleep(2000);

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		// obtienen los elementos de la tabla (columna 4) y se realiza la suma de sus
		// valores:
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		// sumar
		int sum = 0;// sumar

		for (int i = 0; i < values.size(); i++) {
			System.out.println(Integer.parseInt(values.get(i).getText()));// muestra los valores de la tabla posicion4
			sum = sum + Integer.parseInt(values.get(i).getText());// suma
		}

		// SuMA
		System.out.println(sum);// total de la suma es

		// v 104 total amount 296 pasar a un entero
		int total = Integer.parseInt(driver.findElement(By.cssSelector("totalAmount")).getText().split(":")[1].trim());
		// compracion
		Assert.assertEquals(sum, total);

		// Cierra el navegador
		driver.quit();
	}
}
