package Seccion9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class s9Tarea3 {
	public static void main(String[] args)  throws InterruptedException
	{
		// TODO Auto-generated method stub
//String mousePad= 
		   // System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Se adiciona temporizador  implicitlyWait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//relaciona la adicion del v80 uso de implicitlyWait
		//Creacion del objeto para la variable de la funcion Explicit Wait
		//WebDriverWait k = new WebDriverWait (driver,10); 
		WebDriverWait k = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println("Inicio del Navegador");
        //Creacion de una lista de productos a seleccionar en el carrito por medio de su path de cssSelector de H4
		//https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/ ver
		
		//int j=0;   se mueve el contador a la funcion
		
		driver.get("http://rahulshettyacademy.com/loginpagePractise/");
		 System.out.println("Diligenciar usuario y password");
		 driver.findElement(By.id("username")).sendKeys("Diana ");
		 driver.findElement(By.id("password")).sendKeys("Colombia");
		 System.out.println("Seleccionar Check rol de usuario");
		 Assert.assertFalse(driver.findElement(By.className("radiotextsty")).isSelected());
		 System.out.println("Seleccionar Checkbox");
		 driver.findElement(By.className("radiotextsty")).click();
		 System.out.println("Selecion Perfil del usuario ");
		 driver.findElement(By.xpath("//option[@value='stud']")).click();
		 System.out.println("Seleccionar Terminos");
		 
		 Assert.assertFalse(driver.findElement(By.xpath("//input[@id='terms']")).isSelected());
		 System.out.println("Seleccionar Checkbox");
		 driver.findElement(By.xpath("//input[@id='terms']")).click();
		 
		// driver.findElement(By.xpath("//input[@id='terms']")).click();
		 System.out.println("Selecion Rol ");
		 driver.findElement(By.id("signInBtn")).click();;
		 Thread.sleep(5000);
		 System.out.println("salida del Navegador");
			// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
		
	}
}
