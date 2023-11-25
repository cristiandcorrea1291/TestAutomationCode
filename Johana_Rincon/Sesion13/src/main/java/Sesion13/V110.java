package Sesion13;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class V110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome
				WebDriverManager.chromedriver().setup();

				// Se crea una instancia de ChromeDriver, que representa una instancia del navegador Google Chrome.
				WebDriver driver = new ChromeDriver();
				
			
				driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
				//ENLACES ROTOS
				
				//SCaner todos los enlacesBroken link
				//java metods will rls and gets you status code
				//a[href*='SoapUI'] Consola $("a[href*='SoapUI']")
				//utilizo acceso personalizado con etiqueta nombreatributo 
				//String url=driver.findElement(By.cssSelector("a[href*='SoapUI']")).getAttribute("href");
				String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
				//se crea una conexión HTTP a la URL que se obtuvo en el paso anterior utilizando la clase HttpURLConnection.
				//Esto se hace para poder realizar una solicitud HTTP a esa URL y obtener el código de respuesta.
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

				conn.setRequestMethod("HEAD");
				conn.connect();
				int respCode=conn.getResponseCode();
				System.out.println(respCode);//obtiene la respuesta 
				
			}

		}