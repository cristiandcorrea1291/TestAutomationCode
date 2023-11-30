package Sesion10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v91HandleFrames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del Navegador");
		driver.get("https://jqueryui.com/droppable/");
				
		driver.findElement(By.id("draggable")).isDisplayed();
		
		System.out.println("salida del Navegador");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();	
	}
}
