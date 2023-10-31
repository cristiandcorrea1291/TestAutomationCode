package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFramesExample {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // Cambia al frame superior
        driver.switchTo().frame("frame-top");

        // Cambia al frame del medio
        driver.switchTo().frame("frame-middle");

        // Ahora estás en el frame del medio, puedes realizar acciones aquí.
        String middleFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println("Texto en el frame del medio: " + middleFrameText);

        // Regresar al contexto predeterminado (fuera de los frames)
        driver.switchTo().defaultContent();

        // Cambiar al frame izquierdo
      //  driver.switchTo().frame("frame-left");
        driver.switchTo().frame("frame-left");


        // Realiza acciones en el frame izquierdo si es necesario.

        // Regresar al contexto predeterminado
        driver.switchTo().defaultContent();

        // Salir del frame superior para volver al contexto predeterminado
        driver.switchTo().defaultContent();

        // Puedes realizar más acciones en la página principal si es necesario.

        // Cerrar el navegador
        driver.quit();
    }
}
