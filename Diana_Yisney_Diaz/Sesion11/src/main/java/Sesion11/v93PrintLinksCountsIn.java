package Sesion11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v93PrintLinksCountsIn {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("El número de enlaces en la página es" );
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//guardar en una variable
		System.out.println("El número de enlaces presentes en el FOOTER son:" );
		//Acceder a los enlaces del footer 
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		Thread.sleep(2000);
		System.out.println("Cierre del Navegador");
		driver.quit();
	
		
	}
}
