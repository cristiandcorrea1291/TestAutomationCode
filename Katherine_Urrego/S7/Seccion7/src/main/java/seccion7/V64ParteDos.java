package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V64ParteDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		System.out.println("\n\n ¿El RETURN DATE CALENDAR está DEShabilitado? True or False: ");
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		//VIDEO 64
		//set some attribute to that HTML to make it look like 
		//what is the attribute to get that change disabled/enabled in HTML?-> .getAttribute
		//Y el nombre del atributo de htnl es "style"
		//MIN 8
		
		//apariencia de RETURN DATE antes del dar clic al radio buton ROUNF TRIP
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//Marco la opcion ROUND TRIP
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //Marca el RADIOBUTTTON de ROUND TRIP
		
		//apariencia de RETURN DATEd DESPUES del dar clic al radio buton ROUNF TRIP
		//elemento DIV donde ocurre la activacion del campo RETURN DATE con el atributo STYLE
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); 

		
		//COMO HACER UNA VALIDACION DE ACUEDO AL NIVEL DE UN ATTRIBUTO
		//PARA VER SI EL ESTADO DEL ELEMENTO ESTÁ CAMBIANDO O NO
		//CONTAINS es un metodo java que escamea el STRING
		//y valida si el elemento propocionado esta presente dentro de este (en este caso el 1 que es la opacidad)
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
		
		
		
		//Se recomienda estudiar PROTRACTOR
		
		
	}

}
