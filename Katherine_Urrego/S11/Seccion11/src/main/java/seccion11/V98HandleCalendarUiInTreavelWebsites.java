package seccion11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V98HandleCalendarUiInTreavelWebsites {

	public static void main(String[] args) throws InterruptedException {

		// video 98: Handling calendar UI in Travel websites

		// configurar el controlador del driver y crear una instancia
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// ir al sitio web
		driver.get("https://www.path2usa.com/travel-companions");

		Thread.sleep(3000);
		// How do you click a specific Day and Month->buscar una clase comun para todo
		// Seleccionar el espacio donde se consigna la fecha "DATE ON TRAVEL"
		// driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
		// driver.findElement(By.name("form_fields[travel_comp_date")).click();
		// driver.findElement(By.id("form-field-travel_comp_date")).click();
		driver.findElement(By.xpath("(//label[@class='elementor-field-label'])[3]")).click();

		/*
		 * WebElement dateoftravel =
		 * driver.findElement(By.xpath("(//label[@class='elementor-field-label'])[3]"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView();", dateoftravel);
		 * dateoftravel.click();
		 * //driver.findElement(By.xpath("(//input[@placeholder='Date of travel'])[2]"))
		 * .click();
		 * 
		 */

		// How to write a genereric function to identify the day
		// Seleccionar el día
		// Ierate througth each and every item into the list and compare if that item is
		// equals to 23rd
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));

		// how many times the items is compare
		// Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("flatpickr-day")).size();
		// Hacer clic en una pecha que pasamos como input
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();// asignar a un String una
																								// lista
			if (text.equalsIgnoreCase("31")) { // Cambia "31" al día que deseas seleccionar
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}

		// El código compila, 
		//se debe hacer scroll manual al elemento, si scrolleas manualmente antes de que la
		// instruccion llegue al click de la LINEA 35 SI funciona con este selector
		// (//label[@class='elementor-field-label'])[3]

	}

}
