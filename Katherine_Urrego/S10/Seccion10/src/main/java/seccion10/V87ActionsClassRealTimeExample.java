package seccion10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V87ActionsClassRealTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VIDEO 87:Actions class-real time example
		//MOUSE anf KEYBOARD interactions
		
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//IR A LA PAGINA
		driver.get("https://www.amazon.com/");
	
		//Maximizar la ventana
		driver.manage().window().maximize();
		
		//CREAR UNA ACCION
		Actions a = new Actions(driver); //Crear una instancia de la clase ACTIONS //Pasamos el "driver" al argumento de la clase Actions
		
		
		//Moves to Specific element - COMO MOVERNOS A UN ELEMENTO EN ESPECIFICO	
		
		//MOUSE INTERACTIONS
		//localizar un elemento web de la pag con un selector CSS y asignarlo a la variable llamada "move".
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//Ir al elemento "Hola, Identificate.Cuentas y Listas"
		//ir a un elemento especifico ->.contextClick
		//completar o compilar las acciones -> build()
		//Ejecutar acciones -> perform()
		a.moveToElement(move).contextClick().build().perform(); 	//moveToElement= nos movemos  el mouse a un web element especifico //build= completa secuencia	//perform=para ejecutar la accion
		
		
		//KEYBOARD INTERACTIONS - TECLADO
		//movernos al input de busqueda ALL o general
		//clicken el y luego ingresar información -> .click()
		//en mayusculas ->.keyDown(Keys.SHIFT) al presionar la tecla "Shift"(mayúscula) y la mantiene presionada. Esto se utiliza para realizar una entrada en mayúscula.
		//Ingresar HELLO ->.sendKeys("Hello")
		//para sombrear y/o seleccionar el texto que agremanos en la barra de busque ALL
		//Despues de enviar el hello al input al agregar .doubleClick().
		//completar o compilar las acciones -> build()
		//Ejecutar acciones -> perform()
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		.keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		

		//DRAG AND DROP AN ITEM
		//using an Actions Class
		a.moveToElement(move).clickAndHold();
		
		
		
	}

}
