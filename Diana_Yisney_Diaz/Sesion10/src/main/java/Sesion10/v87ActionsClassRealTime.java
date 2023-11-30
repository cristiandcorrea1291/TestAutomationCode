package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;

public class v87ActionsClassRealTime {
	public static void main(String[] args) {
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del Navegador");
		driver.get("https://www.amazon.com/");
	   //Maximiza navegador
		driver.manage().window().maximize();
		
		//CREAR UNA ACCION
		Actions a = new Actions(driver); 
		

		//Path del elemento
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//ir a un elemento especifico ->.contextClick
		a.moveToElement(move).contextClick().build().perform(); 	
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		.keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
     	//using an Actions Class
		a.moveToElement(move).clickAndHold();
		
		System.out.println("salida del Navegador");
		// Cierra el navegador  y todas las ventanas asociadas al final del script.
		driver.quit();
		
		
	}
}
