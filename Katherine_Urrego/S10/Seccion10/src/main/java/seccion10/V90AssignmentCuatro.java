package seccion10;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V90AssignmentCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Configurar el navegador
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		//Ir a la pagina web
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println("se ingresó al sitio web");
		//Ir a al opcion "MULTIPLE WINDOWS" y dar clic
		driver.findElement(By.linkText("Multiple Windows")).click();


		//Clic en el enlace "Click Here"
		driver.findElement(By.cssSelector("a[href*='windows']")).click();


		//se utiliza para obtener un conjunto (Set) de identificadores (strings) de ventanas o pestañas abiertas 
		//Cada ventana o pestaña abierta tiene un identificador único.
		//Obtiene un conjunto de identificadores de ventanas o pestañas abiertas.
		Set<String> ventana=driver.getWindowHandles();
		//Crea un iterador para recorrer los identificadores de ventanas.
		Iterator<String> it=ventana.iterator();
		//Almacena el identificador de la ventana padre en la variable parentWindow
		String parentWindow=it.next();//parent window
		//Cambiar el enfoque del controlador a la ventana secundaria, de modo que las acciones posteriores se realicen en esa ventana.
		driver.switchTo().window(it.next()); //Switch to child wiindow


		//Se obtiene y se imprime el texto del elemento h3 en la página secundaria
		//System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());//Traer el texto del h3 de la pagina hijo "New Window"
		// Se cambia nuevamente el enfoque del controlador a la ventana principal.
		driver.switchTo().window(parentWindow);//Regresar a la parent page
		System.out.println("En la pagina principal mostrar:");

		
		//se obtiene y se imprime el texto del elemento h3 en la página principal-parent
		//System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText()); //"Opening a new window"

		
		//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
		System.out.println("Cerrando ventana");
		driver.quit();
		
		
	}

}
