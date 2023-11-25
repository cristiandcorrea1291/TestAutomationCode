package seccion5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V35ValidateElementsPlugins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 35, sección 5
		
		//Ejercicio
		//Captutar el mesaje de usuario o password incorrecto del login form
		//imprimir el mensaje en la consola
		//]*****¨*******************************
		
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		WebDriver driver = new ChromeDriver();
		
		
		//Implicit WAIT ---se DEBE declarar despues del browserDriver
		//It will tell to WAIT at least 10 seconds based of the  number of seconds TIMEOUT I provide here
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("kmuc");
		driver.findElement(By.name("inputPassword")).sendKeys("123456kmuc");
		
		
		
		//Css Selector-
		//Class name -> tagname.classname ->  Button.signInBtn -> p.error
		//Id ->			tagname#id     	  ->   input#inputUsername
		//ejemplo de HTML en la web       -> <input type="text" placeholder="Username” value=" ">
		//Tagname[attribute=’value’]      ->Input [placeholder=’ Username’]	
		//¿Cómo validar si el Locator escrito es unico?
		//Usando unos plugins o extensiones -> Selector Hub, ChroPath
		//Usando SELECTOR HUB , ingresar en el text box el tagname.classname para validar si es un locator unico
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Se integra un IMPLICIT WAIT para sincronizar los posibles problemas y que elemento
		// con el mensaje que quiero traer del browser cargue
		
		
		
		//en la consola con las herramientas del desarrollador se puede escribir
		//$(´nombreetiqueta.classname´) <- fomra de traer CSS desde la consola del navegador
		//mostrara la etiqueta html completa y resaltara a ubicacion del elemnto en la pag web
		
		
		//RESUMEN: vi como validar CSS y exportarlo desde el navegador con las browser pluggins
		
		
		
		
	}

}
