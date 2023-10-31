package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class V92Marcopoderoso {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://api.jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0); // Cambia al primer iframe
        
        // No es necesario cambiar al iframe nuevamente con driver.switchTo().frame(driver.findElement(By.id("iframe")));

        // Corrige el identificador del elemento "draggable" a "draggable" en lugar de "dragable"
        driver.findElement(By.id("draggable")).click();
        
        // Acciones de arrastrar y soltar
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        
        // Si es necesario, puedes regresar al contexto predeterminado (fuera del iframe) con:
       // driver.switchTo().defaultContent();
    



		
	}

}
