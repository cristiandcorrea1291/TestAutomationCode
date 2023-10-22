package seccion7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V51SeleniumManagerBeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		//WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		
		//Selenium Manager 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
				
	}

}
