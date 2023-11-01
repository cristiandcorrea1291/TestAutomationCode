package seccion13;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V105HandlingHttpsCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video 105: Handling HTTPS certifications in Automated browsers
		//handle SSL en diferent browsers
		
		
		//bypass the cert manually
		//1.expired.badssl.com
		//2 clic en advance
		//3clic en Proceed to expired.badssl.com (unsafe)
		
		//how overcome?
		
		WebDriverManager.chromedriver().setup();

		//metodo para observar el comportamiento de la pagina
		//acepta es certificado
		
		//ver el comportamiento en Firefox
		// FirefoxOptions options1 = new FirefoxOptions(); 
		// options1.setAcceptInsecureCerts(true); 
		
		//ver el comportamiento en Edge
		EdgeOptions options2 = new EdgeOptions();
		options2.setAcceptInsecureCerts(true); 
		
		//ver el comportamiento en Chrome
		ChromeOptions options = new ChromeOptions(); //pasar las opciones como un argumento a la clase driver 
		options.setAcceptInsecureCerts(true);

		
		//WebDriver driver1 = new FirefoxDriver(options1);
		//WebDriver driver = new EdgeDriver(options2);
		WebDriver driver = new ChromeDriver(options);
		
		//Obtener el titulo del sitio web
		driver.get("https://expired.badssl.com/"); 
		//Imprimir el titulo del sitio web
		System.out.println(driver.getTitle()); 
		
		
	}

}
