package seccion5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V36XpathYLinktextLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 36, sección 5
		
		//Ejercicio
		//como mostrar/validar que un elemento de una pagina tiene un enlace o link
		//]*****¨*******************************
		
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		//"driver" es un objeto en la clase ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		
		//Implicit WAIT ---se DEBE declarar despues del browserDriver
		//It will tell to WAIT at least 10 seconds based of the  number of seconds TIMEOUT I provide here
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		findElement es un metodo del obj "driver" que a su vez pertence a la clase ChromeDriver
		entonces la interfaz WebDriver muestra/expone ese elemento "findElement"
		La clase ChromeDriver esta implementado esta interfaz e implementando el body del finElement expesto por la interfaz WebDriver
		*/
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("kmuc");
		driver.findElement(By.name("inputPassword")).sendKeys("123456kmuc");
		
		//Css Selector-
		//Usando SELECTOR HUB , ingresar en el text box el tagname.classname para validar si es un locator unico
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //captura el msj de error del browser y lo muestra en la consola de java
		
		
		
		
		//Locator Link Text-> solo pasa el texto del link pero 
		//el elemento DEBE contar con una etiqueta <a href=""><a/>
		
		//inpeccionar LINK del form "forgot you password?
		//Validar que el enlace de la pagina está linkeado o no?
		// se pasa el texo del link hy Selenium valida ese texto en la  pagina web
		//Si encuentra alguna coincidencia, va a ejecutar un control sobre este
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//¿que pasa al hacer click en el link?
		/*
		 * Xpath It's a generic locator, where yuc can construct these with any element
		 * on the page Esta es la esructura para construit un Xpath para cualquier
		 * propiedad HTML Siempre se escribe con "//" 
		 • //Tagname[@attribute=’value’]
		 //input[@placeholder=’ Username’’]
		 
		 *En HTML ->  <input type="text" placeholder="Name"> 
		 *En Xpath -> //input[@placeholder=’ Name’]
		 */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Katherine"); 
		
		//para usar el SelectorHub la sintaxis Xpath es:
		//$x('codigo')
		//$x('//input[@placeholder="Name"]') <- cambio las comillas sencillas del Name por comillas dobles ""
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kmuc@gmail.com"); 
		
	}

}
