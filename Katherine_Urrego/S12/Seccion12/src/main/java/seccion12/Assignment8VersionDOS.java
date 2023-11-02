package seccion12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8VersionDOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Configurar WebDriverManager para el controlador de Chrome
        WebDriverManager.chromedriver().setup();

        // Crear una instancia de ChromeDriver
		WebDriver driver = new ChromeDriver();

        // Navegar a la página web que contiene el fragmento HTML
        driver.get("http://qaclickacademy.com/practice.php");


        // Encontrar el campo de búsqueda por su ID o cualquier otro selector
        WebElement searchInput = driver.findElement(By.id("autocomplete"));

        // Ingresar tres letras en el campo de búsqueda
        searchInput.sendKeys("col");

        // Esperar un momento para que aparezcan las sugerencias (puede variar según la página web)

        // Seleccionar una opción de la lista (por ejemplo, la primera opción)
        searchInput.sendKeys(Keys.ARROW_DOWN); // Mover hacia abajo en la lista
        searchInput.sendKeys(Keys.ENTER); // Seleccionar la opción

        // Obtener el valor de la opción seleccionada (suponiendo que la opción tenga un valor de texto)
        String valorSeleccionado = searchInput.getAttribute("value");
        System.out.println("Opción seleccionada: " + valorSeleccionado);

        // Realizar otras acciones necesarias
		System.out.println("Imprimir el valor de la opción marcada es:");
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
        // Cerrar el navegador
        driver.quit();
        
	}

}
