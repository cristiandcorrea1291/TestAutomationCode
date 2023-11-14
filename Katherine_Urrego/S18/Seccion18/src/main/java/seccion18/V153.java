package seccion18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VIDEO 153. Selenium Program on WebDriverManager - Login- Get Products List

		/*
		 * Main Java we will use to store all reusable utilities,
		 * 
		 * page object files later in this section.
		 */

		// creo la clase StandAloneTest
		
	////enlace https://rahulshettyacademy.com/client
		//EMAIL:katherine-melissa.urrego@capgemini.com
		//CONTRASEÑA:Katherine2023*
		
		//EJERCICIO
		/*
		 First login the plage with our user and password
		 
		 I want to click on this Add to Cart button, that is a first step, right?
		
		So there are a lot of products displayed on the screen.
		
		So how we will exactly click on this?
		
		So for that, first you need to get all these products list
		
		and then you iterate through each and every item in the list
		
		and verify for which product this title is displayed
		
		and then capture that product and click on Add to Cart.
		 */
		
		//codigo del ejercicio
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ir a la pagina
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println("Ingresé a la pagina web");
		
	////enlace https://rahulshettyacademy.com/client
		//EMAIL:katherine-melissa.urrego@capgemini.com
		//CONTRASEÑA:Katherine2023*
		
		//login
		driver.findElement(By.id("userEmail")).sendKeys("katherine-melissa.urrego@capgemini.com");
		driver.findElement(By.id("userPassword")).sendKeys("Katherine2023*");
		driver.findElement(By.id("login")).click();
		System.out.println("Inicie sesión el pagina web");
		
		
		//Obtenr todos los articulos y guardarlos en una lista
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		//en el proximo video...veremos como:
		//iterar todos y cada uno de los productos
		//y validar/y verifique para qué producto se muestra el titulo del producto respectivamente
		
		
		
	}

}
