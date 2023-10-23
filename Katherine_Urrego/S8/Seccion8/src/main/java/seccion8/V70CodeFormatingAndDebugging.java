package seccion8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V70CodeFormatingAndDebugging {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Video 70:Code formatting and Debugging
		
		//Formating a d allig the code in Eclipse
		//ctrl shift  F
		
		
		
		//Naming conventions in defining class, variable, and method names
		//Camell Case
		//La clase: Cada palabra comienza por Capital Letter
		//nokmbre de variable la primera palabra comienza con minuscula y la segunda con mayusucla : mouseName 
		
		
		
		
		//How to debug the code in eclipse
		//se puede ejecuta paso a paso y revisar los resultados
		//crear un break point en una linea de código
		//STEP OVER OPTION ir executes this spren and your controll pass again to the next step
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("ir a facebook");
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("id('email')")).sendKeys("Katherine Melissa");
		System.out.println("Enombre ingresado");
		driver.manage().window().maximize();
		System.out.println("ventana maximizada");
		driver.manage().deleteAllCookies();
		System.out.println("cookies borradas");
		
		int a=5;
		System.out.println("variable a ");
		
		getScreenshot(driver);
		System.out.println("Ejecutado el metodo Get Screenshot");
	}

	
	public static void getScreenshot(WebDriver driver) throws IOException {
		System.out.println("Ir a google");
		driver.get("http://google.com");
		System.out.println("tomar captura de pantalla");
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("guardar imagen en la ruta elegida");
		FileUtils.copyFile(src,new File("C:\\Users\\KURREGO\\OneDrive - Capgemini\\Documents\\Repositorio_QA_Curso\\KMUCTestAutomationCode\\Katherine_Urrego\\S8\\imgseccion8.jpg"));
	}
	
}
