package Sesion9;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class V85FluentWait {

	
		 public static void main(String[] args) {
		        // Configura el controlador de Chrome
		        WebDriver driver = new ChromeDriver();

		        // Abre la página web
		        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		        // Haz clic en el botón
		        driver.findElement(By.cssSelector("button")).click();

		        // Configura el FluentWait//La espera explícita y la espera fluyente son más flexibles y precisas, y se utilizan comúnmente en pruebas más avanzadas
		        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofSeconds(3))
		            .ignoring(NoSuchElementException.class);

		        // Espera hasta que aparezca el elemento con ID 'finish'
		        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		            public WebElement apply(WebDriver driver) {
		                return driver.findElement(By.cssSelector("#finish h4")); // Corrección del selector CSS
		            }
		        });

		        // Imprime el texto del elemento encontrado
		        System.out.println(foo.getText());

		        // Cierra el navegador
		        driver.quit();
		    }
		}

