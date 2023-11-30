package Sesion10;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v90Code {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		System.out.println("Inicio del Navegador");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		//Path del objeto Material"
		driver.findElement(By.cssSelector(".blinkingText")).click(); 
		
		//[parentid,childid,subchildId] 
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String>it = windows.iterator(); 
		String parentId = it.next(); 
		String childId = it.next(); 
		driver.switchTo().window(childId); 
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
				
		//Extraer el texto del párrafo
		driver.findElement(By.cssSelector(".im-para.red")).getText(); 
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]; 
		driver.switchTo().window(parentId); 
		
		//Enviar Email
		driver.findElement(By.id("username")).sendKeys(emailId); 
				
		System.out.println("salida del Navegador");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
		
	}
}
