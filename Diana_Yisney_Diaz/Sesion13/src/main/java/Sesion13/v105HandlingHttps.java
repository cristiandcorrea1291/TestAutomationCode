package Sesion13;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v105HandlingHttps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		WebDriverManager.chromedriver().setup();
		EdgeOptions options2 = new EdgeOptions();
		options2.setAcceptInsecureCerts(true); 
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		
		System.out.println("Inicio del navegador ");
		driver.get("https://expired.badssl.com/"); 
		
		//Imprimir el Nombre del sitio web
		System.out.println(driver.getTitle()); 
		
		System.out.println("Cerrar navegador");
		driver.quit();	
	}
}
