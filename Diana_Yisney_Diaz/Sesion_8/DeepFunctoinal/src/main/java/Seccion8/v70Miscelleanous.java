package Seccion8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v70Miscelleanous {
	public static void main(String[] args) throws IOException,InterruptedException {
		// TODO Auto-generated method stub
//String mousePad= 
		   // System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del Navegador");
		driver.get("http://facebook.com");
		//driver.get("https://oferta.senasofiaplus.edu.co/sofia-oferta/registro.html");
		System.out.println("Diligencioamiento del campo email");
		driver.findElement(By.xpath("id('email')")).sendKeys("dysney05@hotmail.com");
		Thread.sleep(2000);
		    //Funcion de Maximizar la ventana
		    System.out.println("Se maximisa la ventana del navegador");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			 //Funcion de Eliminar las cookies
			System.out.println("Limpieza de las cookies del Navegador");
			driver.manage().deleteAllCookies();
			
			//Generacion de ScreenShop
				System.out.println("Generacion de Sceenshot");
				File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("C:\\Users\\Diana\\OneDrive\\Documentos\\Automatizacion_Curso\\Sesion8\\screenshot3.png"));
			//WindowsUtils.killByName("excel.exe");
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		//click on any link
		//login page- verify login url
				System.out.println("Apertura de nueva ventana del Navegador");
				driver.get("http://google.com");
			
				File src2=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src2,new File("C:\\Users\\Diana\\OneDrive\\Documentos\\Automatizacion_Curso\\Sesion8\\screenshot4.png"));
			
			Thread.sleep(2000);
			driver.quit();
			System.out.println("Cierre del Navegador");
		
	}

}
