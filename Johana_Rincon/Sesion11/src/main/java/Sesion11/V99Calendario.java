package Sesion11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V99Calendario {

	public static void main(String[] args) {
		// configura y descarga el controlador de Chrome para Selenium utilizando
		// WebDriverManager.
		WebDriverManager.chromedriver().setup();
		// crea una instancia de WebDriver para controlar el navegador Chrome.
		WebDriver driver = new ChromeDriver();
		// espera implícita, lo que significa que el WebDriver esperará hasta 10
		// segundos
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// ingreso a la pagina
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Selecciona el cuadro del calendario ui-state-default apertura del calendario.
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		// bucle while verifica si el encabezado del calendario contiene la palabra "January". Si no la contiene, hace clic en el botón de siguiente mes ("Next") en el calendario. Esto se repite hasta que el encabezado del calendario sea "January
		while (!driver.findElement(By.cssSelector(".ui-datepicker-header")).getText().contains("January")) {
			driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			System.out.println("ciclo bucle busca la fecha que seleccionamos: ");
		}

		// calendario listar todas lasfechas ui-state-default
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		// obtiene el número de elementos en la lista dates, que es la cantidad de
		// fechas en el calendario.
		int count = driver.findElements(By.className("ui-state-default")).size();
		// count la cantidad de itedateElements.sizeraciones se deben realizar en el
		// bucle size el numero de elementos de las lista
		// para iterar a través de las fechas en el calendario
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
//verifica si el texto de la fecha actual es igual a "31". Puedes cambiar "31" por el día que deseas seleccionar.
			if (text.equalsIgnoreCase("11")) { // Cambia "31" al día que deseas seleccionar
				// Si se encuentra la fecha deseada, se hace clic en ella.
				driver.findElements(By.className("ui-state-default")).get(i).click();
				// System.out.println("En el ciclo for en el indice " +i+ " va el texto para
				// hacer click que es el dia : " + texto );
				break;// salir del bucle apenas encuentre la fecha indicada
			}
		}

		// driver.quit();

	}
}
