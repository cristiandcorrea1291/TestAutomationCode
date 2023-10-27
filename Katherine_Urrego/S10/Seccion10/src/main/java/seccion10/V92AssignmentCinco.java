package seccion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V92AssignmentCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configurar el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Ir a la pagina Heroku
		driver.get("http://the-internet.herokuapp.com/");


		//encuentra un elemento en la página web con el texto "Nested Frames" y hace clic en él. 
		//Esto parece ser un enlace o link que llevará a una página relacionada con "Nested Frames"
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println("Ir al enlace Nested Frames");

		//cambiar el contexto al marco (frame) con el nombre "frame-top". 
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));//forma1 para selccionar iframe
		//driver.switchTo().frame("frame-top");	//forma 2 para seleccionar iframe
		System.out.println("entrar al frame superion con 3 cajas");
		
		//Luego, se cambia al marco (frame) con el nombre "frame-middle". 
		//Esto indica que el contenido dentro de "frame-middle" es el área con la que deseas interactuar.
		//Hay grame left, middle y Right
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));//forma1 para selccionar iframe
		driver.switchTo().frame("frame-middle");//forma 2 para seleccionar iframe
		System.out.println("entrar al contexto del frame MIDDLE");
		
		//busca un elemento dentro del marco actual con el ID "content" y se imprime su texto en la consola.
		System.out.println("Traer el texto del iframe middle que es: ");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
		System.out.println("Cerrando ventana");
		driver.quit();
		
		
	}

}
