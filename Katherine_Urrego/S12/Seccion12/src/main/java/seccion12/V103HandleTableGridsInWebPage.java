package seccion12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V103HandleTableGridsInWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//VIDEO 103:How to handle table Grids in webpage
		
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
		
		
		//VIDEO 103
		//Sum up Values
		//1. FInd the locator that highlight all the values in the column (ex: 4th column)
		//.tableFixHead td:nth-child(4)
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0; //inicializo una variable para la suma
		
		//iterate for each and every web element
		//and sum up them
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
		
		
		
		
		
	}

}
