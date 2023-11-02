package seccion12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V104Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Assignment 7
		//1. Number of Rows - Indicar el numero de filas  presentes en la tabla
		//2. Number of columns - Numero columnas de la tabla
		//3. Print 2nd row content - Imprimir la segunda fila de datos
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Ir a la pagina web
		driver.get("http://qaclickacademy.com/practice.php"); 
		driver.manage().window().maximize();
		System.out.println("Ingreso a la pagina web");
		
		
		//A. Initialize JavaScriptExecutor Object -> //Which will help to execute JavaScript related things //casting the driver to JavaSriptExecutor , so the driver will be aware that ir can go ahead and execute JavaScript
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		//B. to scroll down IN THE PAGE
		js.executeScript("window.scrollBy(0,700)"); //window.ScrollBy(0,500) es JS.... con esto se ubica el scroll por coordenadas
		Thread.sleep(2000);
		 
		//Encontrar la tabla en la página web usando el método findElement y el identificador "product".
		WebElement tabla= driver.findElement(By.id("product")); 

		//1. Imprimir el número de FILAS en la tabla utilizando el método findElements y el nombre de etiqueta "tr". 
		System.out.print("\n\nEl número de FILAS de la tabla es: ");
		System.out.println(tabla.findElements(By.tagName("tr")).size()); 

		//2. Imprimir el número de columnas en la primera fila de la tabla PORQUE es la que tiene los encabezados) 
		//utilizando el método findElements y el nombre de etiqueta "th". 
		System.out.print("\n\nEl número de COLUMNAS de la tabla es: ");
		System.out.println(tabla.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()); 

		//3.Guarda en una lista la información de la segunda fila de la tabla 
		List<WebElement> filaDos = tabla.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")); 
		
		//// Imprimir el contenido de las celdas en la segunda fila
		//Imprime la información en cada elemento de la lista ubicada por su index
		//en este caso son 3 columnas -> index 0, index 1, index 2
		System.out.print("\n\nEn la lista hay: \n");
		System.out.print("Columna 1: ");
		System.out.println(filaDos.get(0).getText()); 
		System.out.print("\nColumna 2: ");
		System.out.println(filaDos.get(1).getText()); 
		System.out.print("\nColumna 3: ");
		System.out.println(filaDos.get(2).getText());
		
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
	}

}
