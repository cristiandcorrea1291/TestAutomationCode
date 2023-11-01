package seccion12;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V102ScrollingTableAndWindowJavaExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//VIDEO 102: How to Perform Scrolling with in table and Window level using JavaScriptExecuto
		// usar el  JavaScriptExecutor Object
		//hacer scroll en la pagina y dentro de una tabla
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Ir a la pagina web
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println("Ingreso a la pagina web");
		
		//when a window is open, eve if it is headless mode or invisible mode, Selenium will try to identify it
		//the idea is move the focus to the table (where is visible) and perfom the operation
		
		//HOW TO SCROLL in Selenium
		//Selenium DOES NOT perfom scroll, 
		// I SHOULD write a SCRIPT  which help me to make the scroll down in the page
		//and that script you have to execute through Selenium code
		//To do that we ned to follow the next steps
		
		
		//1. Initialize JavaScriptExecutor Object
		//Which will help to execute JavaScript related things
		//casting the driver to JavaSriptExecutor , so the driver will be aware that ir can go ahead and execute JavaScript
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		//2. to scroLl down IN THE PAGE
		js.executeScript("window.scrollBy(0,800)"); //window.ScrollBy(0,500) es JS.... con esto se ubica el scroll por coordenadas
		
		Thread.sleep(2000);
		//3. Scroll down INSIDE THE TABLE
		//document.querySelector("clase html del elemento que quiero ver") metodo JAVASRIPT DOM
		// punto para clase, # para id
		//document.querySelector('.tableFixHead').scrollTop=5000
		//document.querySelector('.tableFixHead').scrollLeft
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); //window.ScrollBy(0,500) es JS.... con esto se ubica el scroll por coordenadas
		
		
		
		
		
		
		
	}

}
