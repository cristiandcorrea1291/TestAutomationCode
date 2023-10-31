package Sesion11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Ejejercio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  


		//inicio de la prueba 27 de octubre 2023
		WebDriver driver = new ChromeDriver();
		// abre la pagina
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Parte 1 selector del Checkbox Example
		WebElement checkbox = driver.findElement(By.xpath("(//fieldset)[4]"));
		driver.findElement(By.id("checkBoxOption2")).click();
		//parte 2 dropdown.xpath("(//fieldset)[3]"));
		driver.findElement(By.xpath("(//option[@value='option2'])[1]")).click();
		
		//WebElement  dropdown = driver.findElement(null);
		
		//parte 3 creacion de varible 
		
		// Ingresar el texto en el campo de entrada
		String name = "Option2";
		//envie el nombre 
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		//acepta todas las alertas
		//driver.switchTo().alert().dismiss();
		
		  String text=  driver.switchTo().alert().getText();

		     if(text.contains(name))

		     {

		    System.out.println("El contenido del mensaje de alerta son iguales ");

		     }

		     else

		    System.out.println("el contenido  no son iguales");
	

		
		System.out.println("fin de la prueba");
		
		//Johana Rincon
		
		driver.quit();
	}

}
