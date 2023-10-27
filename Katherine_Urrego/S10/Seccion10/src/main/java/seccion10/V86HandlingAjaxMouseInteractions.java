package seccion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V86HandlingAjaxMouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VIDEO 86: Handling Ajax/Mouse Interactions
		
		/*ACTIONS
		 * Hor to MouseOver on object with selenium
		 * perfomring Mous and Keyboard interactions with selenium
		 * Context clic on element
		 * Double click on element
		 * Drag and dropping the element
		 * 
		 * 
		 * 
		 * FRAMES
		 * What are frames?
		 * How to indentify frames in application?
		 * How to handle frames?
		 * Best Practices when working with frames application
		 * 
		 * */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//IR A LA PAGINA
		driver.get("https://www.amazon.com/");
		
		//CREAR UNA ACCION
		//COMO MOVERNOS A UN ELEMENTO EN ESPECIFICO
		//Crear una instancia de la clase ACTIONS
		//Pasamos el "driver" al argumento de la clase Actions
		Actions a = new Actions(driver);
		//moveToElement= nos movemos  el mouse a un web element especifico
		//build= completa secuencia
		//perform=para ejecutar la accion
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")))
		.build().perform();
		
		
		/*
		 * se utiliza para realizar una acción de "mouse hover" (pasar el mouse por
		 * encima) a un elemento web en Selenium WebDriver. En este caso, el código
		 * mueve el puntero del mouse sobre un enlace con el atributo id igual a
		 * "nav-link-accountList" en la página web.
		 * 
		 * a.moveToElement(...): 
		 * a es un objeto de la clase Actions que se utiliza para
		 * realizar acciones de interacción del mouse. moveToElement(...) se utiliza
		 * para mover el mouse a un elemento específico.
		 * 
		 * driver.findElement(By.cssSelector("a[id='nav-link-accountList']")): 
		 * Esto localiza el elemento en la página web utilizando un selector CSS. En este
		 * caso, busca un enlace <a> con el atributo id igual a "nav-link-accountList".
		 * 
		 * .build().perform():
		 *  build() se utiliza para compilar la secuencia de acciones
		 * que se van a realizar, y 
		 * perform() ejecuta realmente esas acciones. En este
		 * caso, después de compilar la acción de mover el mouse al elemento, se
		 * ejecuta.
		 * 
		 * En resumen, con este codigo se simula el movimiento del mouse sobre un
		 * enlace específico en la página web, lo que a menudo desencadenará eventos de
		 * menú desplegable o acciones relacionadas con la cuenta del usuario, como
		 * acceder a un aopcion de menu, a una cuenta o ver opciones adicionales.
		 * 
		 */

	}

}
