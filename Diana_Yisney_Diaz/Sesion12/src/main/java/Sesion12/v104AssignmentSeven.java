package Sesion12;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v104AssignmentSeven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Inicio del navegador ");
		driver.get("http://qaclickacademy.com/practice.php"); 
		driver.manage().window().maximize();
		System.out.println("Ingreso a la pagina web");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		
		WebElement tabla= driver.findElement(By.id("product")); 

		System.out.print("\n\nEl número de FILAS de la tabla es: ");
		System.out.println(tabla.findElements(By.tagName("tr")).size()); 
		System.out.print("\n\nEl número de COLUMNAS de la tabla es: ");
		System.out.println(tabla.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()); 

		List<WebElement> filaDos = tabla.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")); 
		
			System.out.print("\n\nEn la lista hay: \n");
			System.out.print("Columna 1: ");
			System.out.println(filaDos.get(0).getText()); 
			System.out.print("\nColumna 2: ");
			System.out.println(filaDos.get(1).getText()); 
			System.out.print("\nColumna 3: ");
			System.out.println(filaDos.get(2).getText());
			
		System.out.println("Cerrar navegador");
		driver.quit();	
		
	}
}
