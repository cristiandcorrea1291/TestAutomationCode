package seccion11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V99HandleCalendarWithMonthAndDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// video 99:

		// configurar el controlador del driver y crear una instancia
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// ir al sitio web
		driver.get("https://www.path2usa.com/travel-companions");

		// How do you click a specific Day and Month->buscar una clase comun para todo
		// Seleccionar el espacio donde se consigna la fecha "DATE ON TRAVEL"
		driver.findElement(By.xpath("(//label[@class='elementor-field-label'])[3]")).click();
		
		// Esperar a que el calendario se cargue (puedes usar WebDriverWait)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flatpickr-calendar")));


		// Mientras el mes actual NO sea "December," avanzar al mes siguiente
		// la negacion se hace en el while con el simbolo !
		//grab the text  conn get.Text y valida si contiene "December" TRUE o FALSE
		while (!driver.findElement(By.cssSelector(".flatpickr-month .cur-month")).getText().contains("December")) {
			//flatpickr-next-month
			//.flatpickr-month .flatpickr-next-month
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();//boton next para cambiar el mes
		}

		// How to write a genereric function to identify the day
		// Seleccionar el día
		// Ierate througth each and every item into the list and compare if that item is
		// equals to 23rd
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));

		// how many times the items is compare
		// Grab common attribute//Put into list and iterate
		// flatpickr-month
		// class="flatpickr-day"
		int count = driver.findElements(By.className("flatpickr-day")).size();
		// Hacer clic en una pecha que pasamos como input
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("31")) // texto en la fecha que esperamos
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click(); // dar clic en el item 23 que comparo
				break; // salir del ciclo/loop
			}

		}
		driver.quit();

	}

}
