package seccion12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V104ParsingStringAndComparingWsumValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//VIDEO 104: Parsing String and comparing with Generated Sum value -Exercise
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Ir a la pagina web
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println("Ingreso a la pagina web");		
		
		//1. Initialize JavaScriptExecutor Object -> //Which will help to execute JavaScript related things //casting the driver to JavaSriptExecutor , so the driver will be aware that ir can go ahead and execute JavaScript
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		//2. to scroLl down IN THE PAGE
		js.executeScript("window.scrollBy(0,800)"); //window.ScrollBy(0,500) es JS.... con esto se ubica el scroll por coordenadas
		Thread.sleep(2000);
		//3. Scroll down INSIDE THE TABLE
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //window.ScrollBy(0,500) es JS.... con esto se ubica el scroll por coordenadas
		
		
		//VIDEO 103- //Sum up Values
		//1. FInd the locator that highlight all the values in the column (ex: 4th column)
		//.tableFixHead td:nth-child(4)
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0; //inicializo una variable para la suma
		
		//FOR LOOP : to iterate for each and every web element //and sum up them
		for (int i=0; i<values.size(); i++) {
			//values.get(i).getText(); // Asíobtengo el texto}
			//para sumar esos valores debo cambiar de texto a interger con el metodo PARSE
			//TIPODEDATO.ParseXXX();
			System.out.print("\nEl valor que itero/sumaré y viene de la tabla es: ");
			System.out.println(Integer.parseInt(values.get(i).getText()));
			
			sum = sum + Integer.parseInt(values.get(i).getText());
			System.out.print("En la suma llevamos :  "+ sum);
			
		}
		
		System.out.println("\n\nLa suma total es: " +sum);
		
		
		//VIDEO 104	- 
		//How to PARSE an STRING
		//And compare it eith a Generated Sum Value "296"
		//El Generated sum value de la PAGINA WEB  es en el "Total Amount Collected: 296" el 296
		//.totalAmount
		// usar la consola del navegador para chequear css -> $(".totalAmount")
		driver.findElement(By.cssSelector(".totalAmount")).getText();//trae el texto del elemento html como un STRING
		
		////obtener el texto
		// con SPLIT cortar el texto despues de :. 
		// [0] = "Total Amount Collected: " , [1]= ": 296"
		//quedarme con el index 1 que contiene el 296...quitar espacios con trim
		//convertirlo a Entero con el Parse
		//Guardarlo en una variable de tipo entero 
		int Total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

		
		//Comparar usando los ASSERT
		//compare Assert.assertEquals(false, null)
		//compara si sum y total son iguales... si NO son iguales mostratá una exception
		System.out.println("\n Usar un Assert para comparar el valor/contenido en SUM y TOTAL");
		Assert.assertEquals(sum, Total);
		System.out.println("El assert fue TRUE");
		
		System.out.print("\n\nCerrando automatización");
		driver.quit();
			
	}

}
