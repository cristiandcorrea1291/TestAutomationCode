package seccion11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V100CalendarMethodsOnSolveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video 100
		//Uso de codigo de seccion 7, V63. Ya que cambiaron el html y automatizacón del del video 98 - 100
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//VIDEO 63
		//select and open the calendar		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		System.out.println("Se activó el calendario en CURRENT DAY");
		
		//todo el calendario.ui-datepicker
		//titulo del calendario->.ui-datepicker-header
		//siguiente mes ->.ui-datepicker-next ui-corner-all
		
		
		while (!driver.findElement(By.cssSelector(".ui-datepicker-header")).getText().contains("January")) {
		    driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
		    System.out.println("En ciclo WHILE: ");
		}
		
		
		/*
		  // Identificar el día específico que deseas seleccionar (en este caso, el día 27)
        for (int i = 0; i < 7; i++) {
            driver.findElement(By.cssSelector(".ui-datepicker-next")).click(); // Avanzar un mes
        }
        
        // Hacer clic en el día deseado (en este caso, el día 27)
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='31']")).click();

			*/
		
		
		List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
		
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("ui-state-default")).size();
		System.out.println("\nLa cantidad de elementos puestos en la lista son: " +count);
		//hacer clic en el día específico que deseas seleccionar. En tu código original, el día se estableció 
		for (int i = 0; i < count; i++) {
		    String texto = driver.findElements(By.className("ui-state-default")).get(i).getText();
		    if (texto.equalsIgnoreCase("27")) { // Cambia "31" al día que deseas seleccionar
		        driver.findElements(By.className("ui-state-default")).get(i).click();
		       
		        System.out.println("En el ciclo for en el indice " +i+ " va el texto para hacer click que es el dia : " + texto ); 
		        		
		        break;
		    }
		}
		
	


        // Cerrar el navegador al final de la prueba
        //driver.quit();
		
	}

}
