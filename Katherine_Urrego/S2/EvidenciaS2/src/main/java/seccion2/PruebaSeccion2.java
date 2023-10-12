// Declaración del paquete en el que se encuentra la clase.
package seccion2;

//Importación de la interfaz WebDriver.
import org.openqa.selenium.WebDriver;
// Importación de la clase ChromeDriver.
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//Importación de WebDriverManager, que se usa para configurar el controlador del navegador.
import io.github.bonigarcia.wdm.WebDriverManager;

public class PruebaSeccion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");// Imprime "Hola mundo" en la consola.
		
		//Invoking Browser 
		//Chrome - ChromeDriver exten->Methods close get 
		//Firefox- FirefoxDriver ->methods close get 
		// WebDriver  close  get 
		//WebDriver methods + class methods 
		
		
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		// Crea una instancia del WebDriver para controlar el navegador Chrome.
		//Declara la variable driver, con la que voy a llamar al navegador ...sec2 vid 10
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		WebDriver driver = new ChromeDriver();
		
		//Microsoft Firefox
		//WebDriver driver = new FirefoxDriver();
				
		//Microsoft Edge
		//System.setProperty("webdriver.edge.driver", "C:\Users\KURREGO\Downloads\msedgedriver");
		//WebDriver driver = new EdgeDriver();
		
		//Gracias a las librerías se reconocen los métodos de las librerias 
		// Abre la página de Rahul usando el navegador chrome.
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle()); 

		System.out.println(driver.getCurrentUrl()); 
		// Cierra solo la venta de navegador al final de la ejecución
		driver.close(); 
		
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		//driver.quit();

	}

}
