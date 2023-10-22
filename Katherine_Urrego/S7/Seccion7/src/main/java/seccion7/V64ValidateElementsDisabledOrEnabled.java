package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V64ValidateElementsDisabledOrEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 63.Handling Calendar UI in travel websites using Selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//VIDEO 64
		//seleccionar otra fecha en el campo DEPART DATE
		//si marco algun radio button
		//how prve and confirm that whe i slect "one-day" in RETURN DATE is getting disableded??? 
		//how did do you confirm that something is enabled or disabled with your actions on your web browser?
		
		//Validar si la caja de RETURN DATE está habilitada o deshabilitada
		//ENABLE returns TRUE just lke you selected
		//if it is DISABLE, it will return FALSE
		
		System.out.println("\n\n ¿El RETURN DATE CALENDAR está DEShabilitado y ? True or False: (En este caso debería ser Falso, porque en ROUND TRIP no está marcado)");
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());//aqui sera Verdadero
		
		//habilitara o seleccionara el radio button para ROUND TRIP
		System.out.println("\n\n Ahora si se marca o selecciona el radiobutton de ROUND TRIP");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println("\n\n ¿El RETURN DATE CALENDAR está habilitado? True or False: ");
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // aqui retorna TRUE porque el RETURN DATE CALENDAR ya fue habilitado

		//set some attribute to that HTML to make it look like 
		//what is the attribute to get that change disabled/enabled in HTML?-> .getAttribute
		//Y el nombre del atributo de htnl es "style"
		//MIN 8
		//apariencia de RETURN DATE antes del dar clic al radio buton ROUNF TRIP
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//Marco la opcion ROUND TRIP
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //Marca el RADIOBUTTTON de ROUND TRIP
		//apariencia de RETURN DATEd DESPUES del dar clic al radio buton ROUNF TRIP
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); //elemento DIV donde ocurre la activacion del campo RETURN DATE con el atributo STYLE

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
		
	}

}
