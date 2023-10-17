package test1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Selintroduction {
public static void main(String[] args)
{
	//Ejecutar navegador
	//WebDriverManger.firefoxDriver();
	//WebDriver driver = new FirefoxDriver();
	
	//Ejecutar navegador
	//Chrome - ChromeDriver --> Methods Close get
	//firefox- FirefoxDriver --> Methods Close get
	//safari - SafariDriver --> Methods Close get
	//WebDriver close get
	//WebDriver methodos +  class methodos
	//WebDriverManger.firefoxDriver();
    //ChromeDriver = new ChromeDriver();


	//Paso reemplasado con el web manager  ** System.setProperty("webdriver.chrome.driver","\Users\Diana\OneDrive\Documentos\ProyectoAutomatizacion\chromedriver")
	//Opcion de los controladores gecko System.setProperty("webdriver.gecko.driver","\Users\Diana\OneDrive\Documentos\ProyectoAutomatizacion\chromedriver")
	
	//Chrome Launch
	WebDriverManager.chromedriver().setup();
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://pinbus.com/");

	//Firefox Launch
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver2 = new FirefoxDriver();
	driver2.get("https://google.com");
	
	//Edge Launch
	WebDriverManager.edgedriver().setup();
	WebDriver driver3 = new EdgeDriver();
	driver3.get("https://rahulshettyacademy.com");
	
    System.out.println(driver1.getTitle());
    System.out.println(driver1.getCurrentUrl());// permite registras la salida en java
    
    System.out.println(driver2.getTitle());
    System.out.println(driver2.getCurrentUrl());// permite registras la salida en java
    
    System.out.println(driver3.getTitle());
    System.out.println(driver3.getCurrentUrl());// permite registras la salida en java
    
    driver1.close();// realiza el cierre del navegador
    driver1.quit();// realiza el cierre de todas las clases asociadas al evento anterior
    
    driver2.close();// realiza el cierre del navegador
    driver2.quit();// realiza el cierre de todas las clases asociadas al evento anterior
    
    driver3.close();// realiza el cierre del navegador
    driver3.quit();// realiza el cierre de todas las clases asociadas al evento anterior
}

}
