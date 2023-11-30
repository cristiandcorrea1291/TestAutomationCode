package Sesion11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class v100CalendarMethodsOnSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		System.out.println("Se activó el calendario en CURRENT DAY");
		
			while (!driver.findElement(By.cssSelector(".ui-datepicker-header")).getText().contains("January")) 
			{
			    driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			    System.out.println("En ciclo WHILE: ");
			}
		
		List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
	
		int count=driver.findElements(By.className("ui-state-default")).size();
		System.out.println("\nLa cantidad de elementos puestos en la lista son: " +count);
		
			for (int i = 0; i < count; i++) {
			    String texto = driver.findElements(By.className("ui-state-default")).get(i).getText();
			    if (texto.equalsIgnoreCase("27")) { 
			        driver.findElements(By.className("ui-state-default")).get(i).click();
			       
			        System.out.println("En el ciclo for en el indice " +i+ " va el texto para hacer click que es el dia : " + texto ); 
			        		
			        break;
			    }
			}
			
		System.out.println("Cerrar navegador");
    	driver.quit();	

	}
	
}
