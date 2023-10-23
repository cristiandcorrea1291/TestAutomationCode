package AdvancLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator3 {
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "//Users/Diana(/OneDrive/Documentos/ProyectoAutomatizacion/chromedriver");
		// Reemplaza el llamado a System.setpropertiy

		String name = "raul";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Ingreso a la URL correcta");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		System.out.println("Validacion de Inicio de Sesion");
		Thread.sleep(5000);
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		System.out.println("Validacion de Mensaje de usuario registrado");
		
		Thread.sleep(5000);
		System.out.println("Ejecuta temporizador ");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		System.out.println("Reenvio a Loogin de Usuario ");
		Thread.sleep(5000);
		
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.close();
		System.out.println("Cierra el navegador ");
	}
}

