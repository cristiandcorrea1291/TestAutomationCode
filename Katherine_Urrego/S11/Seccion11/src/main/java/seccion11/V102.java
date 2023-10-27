package seccion11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		
		// Hacer clic en el campo de entrada de fecha para abrir el calendario
		//driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
		//driver.findElement(By.id("form-field-travel_comp_date")).click();	
		driver.findElement(By.name("form_fields[travel_comp_date]"));
	
		
		/*while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("December")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}*/
		
		
		// Mientras el mes actual NO sea "December," avanzar al mes siguiente
		//la negacion se hace en el while con el simbolo !
		while (!driver.findElement(By.cssSelector(".flatpickr-month .cur-month")).getText().contains("December")) {
		    driver.findElement(By.cssSelector(".flatpickr-month .flatpickr-next-month")).click();
		}

		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		//hacer clic en el día específico que deseas seleccionar. En tu código original, el día se estableció 
		for (int i = 0; i < count; i++) {
		    String text = driver.findElements(By.className("day")).get(i).getText();
		    if (text.equalsIgnoreCase("31")) { // Cambia "31" al día que deseas seleccionar
		        driver.findElements(By.className("day")).get(i).click();
		        break;
		    }
		}
		
		
	}

}
