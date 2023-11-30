package Sesion10;

import java.security.DrbgParameters.NextBytes;
import java.util.Set;

import java.util.Iterator; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v88WindowHandleConceptsRealTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del Navegador");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click(); 

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId] 
		
		//Iteretor -> it's a method to pull the id from this set data structure
		Iterator<String>it = windows.iterator(); 
		
		// .next()->help to get the next index of your set
		String parentId = it.next(); 
		String childId = it.next(); 
		
		// Paso del ID de la ventana en el argumento
		driver.switchTo().window(childId); 
				
		//Extraer un párrafo de la child web page
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); 

		System.out.println("salida del Navegador");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
		
	}
}
