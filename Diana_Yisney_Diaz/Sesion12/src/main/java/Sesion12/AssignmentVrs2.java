package Sesion12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentVrs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		System.out.println("Inicio del navegador ");
        driver.get("http://qaclickacademy.com/practice.php");

        WebElement searchInput = driver.findElement(By.id("autocomplete"));
        searchInput.sendKeys("col");
        searchInput.sendKeys(Keys.ARROW_DOWN);
        searchInput.sendKeys(Keys.ENTER); 
       
        String valorSeleccionado = searchInput.getAttribute("value");
        System.out.println("Opción seleccionada: " + valorSeleccionado);

        // Realizar otras acciones necesarias
		System.out.println("Imprimir el valor de la opción marcada es:");
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		System.out.println("Cerrar navegador");
    	driver.quit();	
        
	}
}
