package Sesion13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V107MaximizarCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome
		//WebDriverManager.chromedriver().setup();

		// Se crea una instancia de ChromeDriver, que representa una instancia del navegador Google Chrome.
		WebDriver driver = new ChromeDriver();
		
		// 
		driver.manage().window().maximize();
	 
		driver.manage().deleteCookieNamed("asdf"); //  proporcionar el nombre de la cookie entre paréntesis.
	    
	    //login pagin looking url 
		
		driver.get("https://www.google.com/imghp?hl=en&tab=ri&ogbl"); 
		
		//objeto de controloador  a la captura de pantalla
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	  //definimos la captura
		FileUtils.copyFile(src,new File("C:\\Users\\KRINCON\\OneDrive - Capgemini\\Desktop\\screenshot.png"));
		

		
		
	}

}
