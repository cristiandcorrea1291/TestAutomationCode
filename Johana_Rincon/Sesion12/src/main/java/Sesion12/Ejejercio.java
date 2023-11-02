package Sesion12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ejejercio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome
        WebDriverManager.chromedriver().setup();
        // Se crea una instancia de ChromeDriver, que representa una instancia del
        // navegador Google Chrome.
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Inicializa el objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Realiza un scroll en la página
        js.executeScript("window.scrollBy(0, 500)");//pilexes no es recomendable
        Thread.sleep(2000);
        
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
      
        	//listar los elemetos de la tabla
        	 List<WebElement> values = driver.findElements(By.cssSelector("table#product"));
        	 //table#product td:nth-child(2)
        	 int suma=0;//sumar
             
             for (int i = 0; i < values.size(); i++) {
                 System.out.println(Integer.parseInt(values.get(i).getText()));//muestra los valores de la tabla posicion4
                 suma = suma + Integer.parseInt(values.get(i).getText());// suma 
                 
               //SuMA
             
               System.out.println(suma);// total de la suma es
               
               
               //2 parte 
               
            
               
               
               
             }
             
        }

	}

