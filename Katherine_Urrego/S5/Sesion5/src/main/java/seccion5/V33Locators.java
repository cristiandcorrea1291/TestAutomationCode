package seccion5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V33Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		WebDriver driver = new ChromeDriver();
		
		
		//EJERCICIO:para probar la funcionalidad de inicio de sesión en el sitio web y verificar si funciona como se espera.
		// automatiza una secuencia de acciones en un sitio web de prueba, que incluye la apertura de la página, 
		//la introducción de un nombre de usuario y una contraseña,el clic en un botón de inicio de sesión 
		//y la captura de mensajes de error, si los hubiera
		//********************************************
		
		//utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//busca un elemento en la página web que tiene el atributo "id" igual a "inputUsername".
		//Una vez encontrado, utiliza el método sendKeys para enviar el texto a la pagina HTML, 
		//e ingresar el texto "kmuc" en ese campo de entrada.
		driver.findElement(By.id("inputUsername")).sendKeys("kmuc");
		
		//busca un elemento en la página web que tiene el atributo "name" igual a "inputPassword" y luego ingresa el texto "123456kmuc" en ese campo de entrada
		driver.findElement(By.name("inputPassword")).sendKeys("123456kmuc");
		
		//usca un elemento en la página web, esta vez utilizando la clase CSS "signInBtn". 
		//Una vez encontrado, se hace clic en ese elemento. 
		//Esto simula hacer clic en un botón para enviar el formulario de inicio de sesión.
		driver.findElement(By.className("signInBtn")).click();
		
		//Busca un elemento <p> con la clase CSS "error" en la página y obtiene el texto dentro de ese elemento. 
		//Luego, imprime ese texto en la consola. 
		//Esto se utiliza para capturar y mostrar mensajes de error en caso de que el inicio de sesión no sea exitoso.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		
		//Submit a login form, and got a error message if the information is wrong
		//locators used: id, name, class name
		
	}

}
