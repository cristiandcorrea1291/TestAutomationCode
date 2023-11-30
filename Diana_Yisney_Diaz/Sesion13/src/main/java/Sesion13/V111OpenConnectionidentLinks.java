package Sesion13;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.net.URL; 

import java.net.URLConnection; 

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class V111OpenConnectionidentLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
     	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     	
		String enlace = driver.findElement(By.cssSelector("a[href*='https://rahulshettyacademy.com/brokenlink']")).getAttribute("href");
		
		System.out.println("la url que vamos  de la que vamos a validar su conexión es:");
		System.out.println(enlace);

			HttpURLConnection conn = (HttpURLConnection) new URL(enlace).openConnection();
			
			//hacer el request
			conn.setRequestMethod("HEAD");
			conn.connect();

			//get the response
			int respCode = conn.getResponseCode();
			System.out.println("La conexion es:");
			System.out.println(respCode);
			


	}
	
}
