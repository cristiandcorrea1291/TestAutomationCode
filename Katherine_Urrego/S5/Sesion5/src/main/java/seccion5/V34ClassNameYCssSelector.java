package seccion5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V34ClassNameYCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 34, sección 5
		
		//Ejercicio
		//Captutar el mesaje de usuario o password incorrecto del login form
		//imprimir el mensaje en la consola
		
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		WebDriver driver = new ChromeDriver();
		//utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("kmuc");
		driver.findElement(By.name("inputPassword")).sendKeys("123456kmuc");
		
		
		
		//Css Selector-
		//Class name -> tagname.classname ->  Button.signInBtn -> p.error
		//Id ->			tagname#id     	  ->   input#inputUsername
		//ejemplo de HTML en la web       -> <input type="text" placeholder="Username” value=" ">
		//Tagname[attribute=’value’]
		//Si no hay los otros selectores  ->Input [placeholder=’ Username’]
		
		
		//¿Cómo validar si el Locator escrito es unico?
		//Usando unos plugins o extensiones -> Selector Hub, ChroPath
		//Usando SELECTOR HUB , ingresar en el text box el tagname.classname para validar si es un locator unico
		driver.findElement(By.className("signInBtn")).click();
		
		//Despues de Validar, continuamos con el código
		//usaremos cssSelector((nombretiqueta.claseCSS));
		//El metodo getText() nos ayudará a extraer el texto de ese elemento desde el browser
		//imprimir mensaje en consola con el println
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		//NOTA: con esta version del codigo, se geenra un erro dado que la pagina tiene un timeout  que ocurre muy rápido, y no da
		//tiempo para que carguen loselementos y se pueda imprimir el mensaje dell browser a la consola
		//en el sig video, hablaran de como solucionar el problema
		
		
		
		

		
	}

}
