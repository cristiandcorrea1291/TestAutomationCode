package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V52HandlingStaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 52:Handling Static dropdowns with Select webdriver AP
		//Import UI Components and see how to automate them using Selenium WebDriver
		//Understanding automation with static and dynamic dropdowns
		//https://rahulshettyacademy.com/dropdownsPractise/
		
		//dropdown == lista desplegable
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		
		//STATIC DROPDOWN - LISTA DESPLEGABLE ESTATICA
		//Porque las opciones de la lista desplegable están fijas
		//Una dropdown tiene la etiqueta SELECT en html
		
		//dropdown with SELECT tag
		//traemos el la lista desplegable a traves del webelement y lo guardamos en la variable staticDropdowm
		//y esa variable la paso dentro del argumento de la clase Select(argumento);
		//los valores de la lista estan ordenados por medio de INDICES o INDEX

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown); //Así se crea un objeto de la clase SELECT
		System.out.println("\nEl valor que tiene la lista es INR ");
		dropdown.selectByIndex(3);//usar el merodo selectByIndex para Seleccionar algun valor de la lista por medio del index
		
		//extraemos el texto del webelement
		System.out.println("\nEl valor seleccionado de la lista es: ");
		System.out.println(dropdown.getFirstSelectedOption().getText());//Muestra y trae el texto de la opcion que marcamos en la lista
		
		System.out.println("\n\n\nVeremos cambiar el valor de la lista de USD por AED ");
		//otra forma de marcar una opcion es , Seleccionarla por TEXTO
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());//Muestra y trae el texto de la opcion  seleccionada de la lista 
		
		System.out.println("\n Selecciono una opcion de la lista por su VALUE");
		dropdown.selectByValue("INR");//seleccionar un valor en relacion a su VALUE attribute
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		System.out.println("\n");
		
		
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
		
		
	}

}
