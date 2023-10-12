package Sesion2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sesion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Prueba");// Imprime "el texto en la consola" en la consola.
				
				// Browser 
				//Chrome - ChromeDriver exten->Methods close get 
				//Firefox- FirefoxDriver ->methods close get 
				// WebDriver  close  get 
				//WebDriver methods + class methods 
				
				
				// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
				WebDriverManager.chromedriver().setup();
				// Crea una instancia del WebDriver para controlar el navegador Chrome.
				//Declara la variable driver, con la que voy a llamar al navegador 
				//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
				WebDriver driver = new ChromeDriver();
				
				//Microsoft Firefox
				//WebDriver driver = new FirefoxDriver();
						
				//Microsoft Edge
				//WebDriver driver = new EdgeDriver();
				
				
				// Abre la página usando el navegador chrome.
				driver.get("https://rahulshettyacademy.com/");
				
				System.out.println(driver.getTitle()); 
				try {
				    Thread.sleep(5000);
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
				System.out.println(driver.getCurrentUrl()); 
				// Cierra solo la venta de navegador al final de la ejecución
				driver.close(); 
				// Cierra el navegador  y todas las ventanas asociadas al final del script.
				driver.quit();
	}

}
