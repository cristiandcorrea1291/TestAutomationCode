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

public class V85PracticeExampleUsingFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VIDEO 85: Practise example on Fluent wait
	
		
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
			
			// esperar hasta que apply devuelva el WebElement
			// este metodo también tiene el input del objeto "driver"
			// espera hasta que el elemento que contine el HELLO WORLD sea mostrado
			public WebElement apply(WebDriver driver) {

				// SI el elemento se muestra en la pag web, retorne el elemento. Si no, retorne
				// "null"
				//En la condicion del  IF, el metodo "isDisplayed]" es boolean, entonces será TRUE o FALSE si el elemento es visible 
				if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) { //condición
					return driver.findElement(By.cssSelector("[id='finish'] h4")); //Cuando el parametro SI es TRUE
				} 
				else {
					return null;	//Sino el parametro es FALSE
				}
	
			} 
			
			});
		
		
		//encuentra al elemento pero está en NO visible mode...
		//tendremos que esperar hasta que el elemneto se torne visible
		//por eso se usara el metodo
		//System.out.println(driver.findElement(By.cssSelector("[id='finish']h4")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());

		driver.quit();
		
	}

}
