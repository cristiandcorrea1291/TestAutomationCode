package Sesion12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ejercicio8RowTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome
        WebDriverManager.chromedriver().setup();
        // Se crea una instancia de ChromeDriver, que representa una instancia del
        // navegador Google Chrome.
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Inicializa el objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Realiza un scroll en la página
        js.executeScript("window.scrollBy(0, 500)");
        //selecciona un elemento que tiene un atributo id ,500 pixeles
        js.executeScript("document.querySelector('#product').scrollTop = 500;");

        Thread.sleep(2000);
        
     // Localiza la tabla por su ID product
        WebElement table = driver.findElement(By.id("product"));

        // Obtiene todas las filas de la tabla//tr elementos
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Itera a través de las filas y muestra los datos
        // bucle for recorre cada fila de la tabla (excluyendo la primera fila de encabezados), extrae los datos de instructor,
        //curso y precio de cada fila 
        for (int i = 1; i < rows.size(); i++) {//
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));//elemento td
            String instructor = columns.get(0).getText();//obtienen el elemento instructor
            String curso = columns.get(1).getText();//elemento del curso
            String precio = columns.get(2).getText();//obtiene el precio

            System.out.println("Instructor: " + instructor);
            System.out.println("Curso: " + curso);
            System.out.println("Precio: " + precio);
            System.out.println(" Separa cada uno");
         //   int suma=0;
          //  System.out.println("La suma del instructor " + instructor + " y el tamaño de algún objeto: " + columns.size());

        }

        // Cierra el navegador
        driver.quit();
    }
     
        

	}


