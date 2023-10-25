package seccion9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V84BuildingCustomizedMethodsWithFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VIDEO 84: Building Customized methods using FLuent wai
		
		/*Unlike WebDriver, we need to build customized wait methods based on condition
		 * Both WbeDriverWait and FluenWait classes implement WAIT interface
		 * 
		 * 
		 * pagina con infor https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html 
		 * 
		 * Sample usage:
		 * // Waiting 30 seconds for an element to be present on the page, checking //
		 * for its presence once every 5 seconds. Wait<WebDriver> wait = new
		 * 
		 * FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(30L))
		 * .pollingEvery(Duration.ofSeconds(5L))
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
		 * } });
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//clic en el boton START
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		
		//FLUENT WAIT
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)) //cada 3 segundos monitorea/tratará de traer el elemento de la pagina web
				.ignoring(NoSuchElementException.class);
		
		
		//dar informacipn sobre a que objeto se efectuara fluenwait, polling and ignore
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){ 
			
			//esperar hasta que apply devuelva el WebElement
			//este metodo también tiene el input del objeto "driver"
			//espera hasta que el elemento que contine el HELLO WORLD sea mostrado
			public WebElement apply(WebDriver driver) {
				//EJ: Esperar hasta que el elemento con el HELLO WORLD se muestre/be displayed
				return driver.findElement(By.cssSelector("[id='finish']h4")); //se indica que retone el webelement
				} 
			});
		
		System.out.println(driver.findElement(By.cssSelector("[id='finish']h4")).isDisplayed());
		//No muestra nada en consola y hay errores, estos se arreglaran en el siguiente video V85
	}

}
