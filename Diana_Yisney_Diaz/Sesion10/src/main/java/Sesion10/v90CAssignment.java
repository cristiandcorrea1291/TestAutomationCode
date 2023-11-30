package Sesion10;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v90CAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configurar el navegador
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Ir a la pagina web
		System.out.println("Inicio del Navegador");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();

		//Clic en el enlace "Click Here"
		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		Set<String> ventana=driver.getWindowHandles();
		Iterator<String> it=ventana.iterator();
		String parentWindow=it.next();
		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentWindow);//Regresar a la page
		System.out.println("En la pagina principal mostrar:");

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

		//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
		System.out.println("Cerrando ventana");
		driver.quit();
		
		
	}
	
}
