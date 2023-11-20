package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tarea1 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		
		//Marcar checkbox de la primera casilla
		System.out.println("Validacion Marcacion de check box");
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		//validar que  checkbox de la primera casilla se marco correctamente
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		Thread.sleep(2000L);
		
		//Des Marcar checkbox de la primera casilla
		System.out.println("Validacion Desmarcacion de check box");
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(2000L);
		System.out.println("Validacion exitosa");
		
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Cierre del Navegador");
	}
	
	
}
