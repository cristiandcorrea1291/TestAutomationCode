package seccion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class V41WebElementInUniqueTagNameLocators {

	public static void main(String[] args) {
		//Video 41 , seccion 6
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
		
		//creo variable donde guardo el nombre
		String name = "Katherine Melissa";
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); ///*utiliza el objeto driver para abrir un navegador web y navegar a la URL proporcionada, 
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("123456kmuc");
		driver.findElement(By.className("signInBtn")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//VIDEO 41
		//Imprimir el mensaje que aparece despues de iniciar sesión
		//traermos el texto que hay en la etiqueta p del html
		System.out.println(driver.findElement(By.tagName("p")).getText());		
		//min 4 del video
		//Assertion Equals: this method will actually take 2 parameters
		//(one expected , with what you want to compare)
		//compara el texto de la etiqueta p con " You are succesfuly"
		//Assert.assertEquals(one expected , with what you want to compare);
		//si se parecen, el test will pass. If any of them mismatch the test will fail 
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		// de padre a hijo con sintaxis CSS
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

		
		
		
		//hay un problema y continua en el video 42, 
	
	
	}

}
