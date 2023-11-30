package Sesion13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class v109TakeScreenShots {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println("Inicio del navegador ");
		driver.get("http://google.com");
		System.out.println("Ir a la pagina web");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Se hizo el screenshot o captura de pantalla");
		
		FileUtils.copyFile(src, new File("C://screenshot.png"));
		FileUtils.copyFile(src, new File("C:\\Users\\Diana\\OneDrive\\Documentos\\Automatizacion_Curso\\Sesion8"));
		System.out.println("La captura de pantalla guardado  \" ");

		System.out.println("Cerrar navegador");
		driver.quit();
		
		
	}
}
