package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v92FramesTechniquesRT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del Navegador");
		driver.get("https://jqueryui.com/droppable/");
		
		Actions a = new Actions(driver); 
		
		//Cuenta el # iframes de la aplicacion
		System.out.println("El total de iframes presentes es:");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("draggable")).click();
		WebElement source = driver.findElement(By.id("draggable")); 
		WebElement tarjet = driver.findElement(By.id("droppable")); 
		
		a.dragAndDrop(source, tarjet).build().perform();
		
		driver.switchTo().defaultContent();
		
		
				//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
				System.out.println("Cerrando ventana");
				driver.quit();
		
		
		
	}
}
