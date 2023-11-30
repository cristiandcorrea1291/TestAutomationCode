package Sesion13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v108MaxWindYDeletingCookiess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximizar la ventana
		driver.manage().window().maximize();
		//como borrar el cookie name
		//driver.manage().deleteCookieNamed("sessionKey");
		
		// borrar cookies
		driver.manage().deleteAllCookies();
			
		System.out.println("Inicio del navegador ");
		driver.get("http://google.com");
		
		System.out.println("Cerrar navegador");
		driver.quit();

		
	}
}
