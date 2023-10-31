package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V86Amazon {	

		    public static void main(String[] args) {
		        WebDriverManager.chromedriver().setup();

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.amazon.com");

		        // Creación de un objeto Actions
		        Actions a  = new Actions(driver);
		        WebElement move=driver.findElement(By.cssSelector("a#nav-link-accountList"));
		        //concatenar todas las acciones y luego raderizando
		     // Realiza una acción de mover el mouse al cuadro de búsqueda, hacer clic y escribir "HOLA" en mayúsculas
		        
		        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HOLA").doubleClick().build().perform();   
		        // Realiza una acción de mover el mouse a un elemento
		        a.moveToElement(move).contextClick().build().perform();    
		   // a.moveToElement(move).
		    }
		    
		

	}


