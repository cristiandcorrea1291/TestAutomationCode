package seccion5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V37CustomXPathYCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 37, sección 5
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
		
		//CSS Selector-
		//Usando SELECTOR HUB , ingresar en el text box el tagname.classname para validar si es un locator unico
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //captura el msj de error del browser y lo muestra en la consola de java
		
		System.out.println("\n\nIngresar al enlace de Forgot your password, e ingresar infor en el formulario correspondiente");
		//Locator Link Text-> solo pasa el texto del link pero el elemento DEBE contar con una etiqueta <a href=""><a/>
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		/*Xpath propiedad HTML Siempre se escribe con "//" 
		 //Tagname[@attribute=’value’]	
		 En HTML ->  <input type="text" placeholder="Name"> 
		 En Xpath -> //input[@placeholder=’ Name’]
		 
		para usar el SelectorHub la sintaxis Xpath es:
		$x('codigo')
		$x('//input[@placeholder="Name"]') <- cambio las comillas sencillas del Name por comillas dobles ""
		 */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Katherine"); 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kmuc@gmail.com"); 
		//driver.findElement(By.cssSelector("//input[@placeholder='Email']")).clear();
		
		
		
		
		//COMO IDENTIFICAR ELEMENTOS QUE NO SON UNICOS
		// Metodo Indexado para Xpath-> Tagname[@attribute=’value’][index] 
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //Limpia la caja de texto para Email
		
		//enter another email id
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("winx@rainbow.com");
		
		
		// Metodo Indexado para CSS -> Tagname[@attribute=’value’][index]
		//Con Selectorhub para CSS  -> input[type="text"]:nth-child(2)
		//en consola para CSS       -> $('input[type="text"]:nth-child(2)')
		
		 
	}

}
