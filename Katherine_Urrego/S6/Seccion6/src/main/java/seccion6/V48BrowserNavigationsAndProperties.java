package seccion6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V48BrowserNavigationsAndProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Video 48. Automate Browser navigations and window properties with Selenium Webdriver
		//how to run tests in maximized browser mode and how to use navigations

		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia //"driver" es un objeto en la clase ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Driver Settings
		//managing the window
		//you can set some specific position,size, etc
		driver.manage().window().maximize();
		
		//min 4
		driver.get("http://google.com");//con esta linea Selenium will pause until this page is fully loaded...selenium will wait.
		
		driver.navigate().to("https://rahulshettyacademy.com");//once the pages is loaded, it will continue...with this line selenium will not wait
		
		driver.navigate().back();  //regresar a la pagina anterior, en este ejemplo de rahult academy a google

		driver.navigate().forward(); // ir a la siguiente página
		
		// así se navega en chrome, y/o a través del browser
		

	}

}
