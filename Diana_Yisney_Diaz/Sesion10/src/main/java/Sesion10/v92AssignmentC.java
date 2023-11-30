package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v92AssignmentC {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configurar el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del Navegador");
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println("Ir al enlace Nested Frames");

		//Cambio el contexto al marco (frame) con el nombre "frame-top". 
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		System.out.println("entrar al frame superion con 3 cajas");
		
		driver.switchTo().frame("frame-middle");
		System.out.println("entrar al contexto del frame MIDDLE");
		
		//busca un elemento dentro del marco actual con el ID "content"la consola.
		System.out.println("Traer el texto del iframe middle que es: ");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
		System.out.println("Cerrando ventana");
		driver.quit();
		
		
	}
}
