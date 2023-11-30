package Sesion10;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v89WChildWindows {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Inicio del Navegador");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		//Path de opcion Material"
		driver.findElement(By.cssSelector(".blinkingText")).click(); 

		Set<String> windows = driver.getWindowHandles(); 
		
		Iterator<String>it = windows.iterator(); 
		 // .next()->help to get the next index of your set
		String parentId = it.next();
		String childId = it.next(); 
		 // Paso del ID de la ventana en el argumento
		driver.switchTo().window(childId); 
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); 
		driver.findElement(By.cssSelector(".im-para.red")).getText(); 
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]; 
		
		//ir a la pagina padre 
		driver.switchTo().window(parentId); 
		//Paso de inf al campo
		driver.findElement(By.id("username")).sendKeys(emailId); 
		
		
		System.out.println("salida del Navegador");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
		
		
	}
}
