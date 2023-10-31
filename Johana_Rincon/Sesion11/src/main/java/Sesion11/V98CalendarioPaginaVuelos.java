package Sesion11;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class V98CalendarioPaginaVuelos {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Seleccionar la fecha del calendario actual
        driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();

        List<WebElement> dateElements = driver.findElements(By.className("ui-state-default"));
        int count = dateElements.size();

        for (int i = 0; i < count; i++) {
            String text = dateElements.get(i).getText();
            if (text.equals("30")) {
                dateElements.get(i).click();
                break; // Salir del bucle una vez que se haya hecho clic en la fecha
            }
        }

       // driver.quit();
    }
}
