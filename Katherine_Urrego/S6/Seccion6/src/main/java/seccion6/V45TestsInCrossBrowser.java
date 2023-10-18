package seccion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class V45TestsInCrossBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Video 45: Running the tests in cross browser and how to inspect objects in Edge & Firefox
		//How to run this validation in differents browsers
		
		String name = "KATHERINE MELISSA";
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		//"driver" es un objeto en la clase ChromeDriver
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//Implicit WAIT ---se DEBE declarar despues del browserDriver //IMPLICIT WAIT: It waits for objects to show on the page..It's use for something TO SHOW
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//si declaro el metodo STATIC No es necesario crear un objeto de la clase, llamo al metodo directamente
		//si el metodo NO ES STATIC, entonces creo un objeto para esta clase y luego llamo al metodo.
		String password = getPassword(driver);
		//llamo al método de la clase
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); ///*utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		//Imprimir el mensaje que aparece despues de iniciar sesión, traermos el texto que hay en la etiqueta p del html
		System.out.println(driver.findElement(By.tagName("p ")).getText());		
		//Assert.assertEquals(one expected , with what you want to compare);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		// de padre a hijo con sintaxis CSS
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); 
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException 
	{ 
	driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
	driver.findElement(By.linkText("Forgot your password?")).click(); 
	Thread.sleep(1000); 
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
	String passwordText = driver.findElement(By.cssSelector("form p")).getText(); 

	//Please use temporary password 'rahulshettyacademy' to Login. 
	String[] passwordArray = passwordText.split("'"); 

	
	// String[] passwordArray2 = passwordArray[1].split("'"); 
	// passwordArray2[0] 
	String password = passwordArray[1].split("'")[0];
	
	
	return password; //send back the password whoever that call this method
	
	//El metodo split divide las palabras, en este ccaso se creo un array que retorna los valores
	//deichi arreglo tiene 2 indexes:
	//0th index - Please use temporary password 
	//1st index - rahulshettyacademy' to Login. 

	//0th index - rahulshettyacademy 
	//1st index - to Login.  

	} 

}
