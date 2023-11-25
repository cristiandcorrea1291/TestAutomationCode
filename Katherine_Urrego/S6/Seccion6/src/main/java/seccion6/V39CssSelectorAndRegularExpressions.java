package seccion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V39CssSelectorAndRegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 39 , seccion 6
			
		//****************************************************************
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		//"driver" es un objeto en la clase ChromeDriver
		WebDriver driver = new ChromeDriver();
	
		//Implicit WAIT ---se DEBE declarar despues del browserDriver
		//It will tell to WAIT at least 10 seconds based of the  number of seconds TIMEOUT I provide here
		//IMPLICIT WAIT: It waits for objects to show on the page..It's use for something TO SHOW
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); ///*utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		driver.findElement(By.id("inputUsername")).sendKeys("kmuc");
		driver.findElement(By.name("inputPassword")).sendKeys("123456kmuc");
		//CSS Selector-
		//Usando SELECTOR HUB , ingresar en el text box el tagname.classname para validar si es un locator unico
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //captura el msj de error del browser y lo muestra en la consola de java
		System.out.println("\n\nIngresar al enlace de Forgot your password, e ingresar infor en el formulario correspondiente");
		
		
		//EXPLICIT WAIT: it's used to get in a stable state
		//helps to sincronization
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //Locator Link Text-> solo pasa el texto del link pero el elemento DEBE contar con una etiqueta <a href=""><a/>
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Katherine"); 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kmuc@gmail.com"); 
		//COMO IDENTIFICAR ELEMENTOS QUE NO SON UNICOS
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //Limpia la caja de texto para Email  Metodo Indexado para Xpath-> Tagname[@attribute=’value’][index] 
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("winx@rainbow.com"); //para child items
		
		
		
		//En el caja o input de Phone Number
		System.out.println("\n\nSobre el campo Phone Number:");
		//la sintaxis es -> //parentTagname/childTagname[index]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
		//minuto 8.15 seleccionar el boton "Reset login"
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//minuto 9.18 Grabar el texto e imprimirlo en el output o consola.
		/*podemos generamos el locator de varias formas
		 * finElement(By.Classname) -> p.infoMsg
		 * o puede ser .classname -> .infoMsg
		 * En CSS para ir from parent to child -> parentTagname childTagname =parenttagESPACIOchildtag
		 * No se usan slashe //
		 * en este caso y ejemplo ->form p
		*/
		System.out.println("\n\nImprimir mensaje al hacer clic en el boton Reset Login");
		//traemos el texto del elemento del cssSelector con el metodo getText() y lo imprimimos en consola con Println()
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	
		
		//VIDEO 39
		//use in the CSS Syntax, a regular expression *, scan all type atributes which have a 'pass? string inside it
		
		//boton de Go to Login
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); 
		
		//espera explicita
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//use in the CSS Syntax, a regular expression *, scan all type atributes which have a 'pass? string inside it	
		//Ingresar USERNAME
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); 
		//Ingresar PASSWORD
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); 
		//Seleccionar la casilla de seleccion 1  ""
		driver.findElement(By.id("chkboxOne")).click(); 
		//Clic en el boton SIGN IN
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); 

		
	}

}
