package seccion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V91HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video 91. How to handle Frames?
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Ir a la pagina web - pagina padre
		driver.get("https://jqueryui.com/droppable/");
		
		/*
		 * WHAT IS FRAME? It s a component which are hosted on webpages Selenium can NOt
		 * identify the frames, so we can NOT handle it in a normal fashiopn Debemos
		 * indicar que se va a trabajar con FRAMES
		 * 
		 * WHAT ARE FRAMES IN WEBDESIGN? In the context of a web browser, a frame is a
		 * part of a web page or browser window which displays content independent of
		 * its container, with the ability to load content independently
		 * 
		 */

		// GO INTO FRAME and HANDLE IT
		/*
		 * La instrucción driver.switchTo().frame("") se utiliza para cambiar el
		 * contexto de Selenium WebDriver al interior de un marco (frame) en una página
		 * web. Sin embargo, es importante proporcionar un identificador válido o una
		 * referencia al marco al que deseas cambiar.
		 *
		 * El método switchTo().frame() espera un argumento que puede ser:
		 * 
		 * 1. Un índice numérico, que representa el índice del marco. Por ejemplo,
		 * driver.switchTo().frame(0) cambiará al primer marco en la página (los índices
		 * suelen comenzar en 0).
		 * 
		 * 2. El nombre o el atributo "name" del marco. Por ejemplo, si un marco tiene el
		 * atributo name="iframe1", puedes cambiar al marco utilizando
		 * driver.switchTo().frame("iframe1").
		 * 
		 * 3. Una referencia al elemento web que representa el marco. Por ejemplo, puedes
		 * localizar el elemento del marco y luego pasar ese elemento como argumento
		 * para cambiar al marco. Esto se vería así
		 * 
		 * 
		 * WebElement frameElement = driver.findElement(By.id("frameId"));
		 * driver.switchTo().frame(frameElement);
		 * 
		 * OJO:Es importante proporcionar un identificador válido al método
		 * switchTo().frame() para que funcione correctamente. Si el marco no se
		 * encuentra o el identificador no es válido, se producirá un error.
		 * 
		 */
	
		// driver.switchTo().frame("");
		//Clic en la caja "Drag me to my target"
		driver.findElement(By.id("draggable")).isDisplayed();
		
		
	
		
		/*
		 * HTML frames allow developers to present documents in multiple views, which
		 * may be independent windows or subwindows. Multiple views offer developers a
		 * way to keep certain information visible, while other views are scrolled or
		 * replaced. For example, within the same window, one frame might display a
		 * static banner, the second a navigation menu, and the third the main document
		 * that can be scrolled through or replaced by navigating in the second frame.
		 
		 *FireBug and FirwPath para el navegador FIREFOX
		 */
		
	}

}
