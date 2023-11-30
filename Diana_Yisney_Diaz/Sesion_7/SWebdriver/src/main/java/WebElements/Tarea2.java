package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tarea2 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(1000);
		
		 //Formulario de Registro
		System.out.println("Diligenciar formulario");
		driver.findElement(By.name("name")).sendKeys("Diana ");
		driver.findElement(By.name("email")).sendKeys("Colombia");
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Bogota");
	    // Seleccion de Checkbox
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='exampleCheck1']")).isSelected());
	    System.out.println("Seleccionar Checkbox");
	    driver.findElement(By.cssSelector("input[id*='exampleCheck1']")).click();
		//Seleccion de gender Female
	    System.out.println("Seleccionar Genero Femenino");
	    driver.findElement(By.id("exampleFormControlSelect1")).click();
	    driver.findElement(By.xpath("(//option[normalize-space()='Female'])[1]")).click();
		
	    System.out.println("Seleccion button student");
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='inlineRadio1']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='inlineRadio1']")).click();
		
		System.out.println("Seleccion de Fecha");
		System.out.println(driver.findElement(By.name("bday")).isEnabled());
		driver.findElement(By.name("bday")).sendKeys("05/01/1986 ");
		Thread.sleep(2000);
		//Submit formulario
		System.out.println("Envio de Formulario");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
	
		//class="alert alert-success alert-dismissible" ** Success! The Form has been submitted successfully!.
		System.out.println("Validacion de Mensaje de confirmación");
		System.out.println(driver.findElement(By.tagName("strong")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("strong")).getText(), "Success!");
	
		System.out.println("Validacion de Mensaje de usuario registrado");
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Cierre del Navegador");
		
	}
}
