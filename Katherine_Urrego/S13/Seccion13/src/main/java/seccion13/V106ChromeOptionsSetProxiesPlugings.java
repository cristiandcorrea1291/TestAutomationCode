package seccion13;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V106ChromeOptionsSetProxiesPlugings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//video 106: Explore Chrome options to set proxies,plugins & paths on Chrome browser
		
		
		//Controlador del browser
		WebDriverManager.chromedriver().setup();

		//vide0 105
		//ver el comportamiento en Firefox
		// FirefoxOptions options1 = new FirefoxOptions(); 
		// options1.setAcceptInsecureCerts(true); 
		
		//ver el comportamiento en Edge
		//EdgeOptions options2 = new EdgeOptions();
		//options2.setAcceptInsecureCerts(true); 
		
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
		
		
		
		//VIDEO 106
		//add extensions al navegador min 1:43
		//chrome will invoking
		//options.addExtensions("camino de la extensions");
		
		
		//HOW TO SET PROJECT AT RUNTIME - min 2:00
		//usando options.setCapability("proxy", proxy);
		//donde "proxy" es el capability name
		
		//crear un objeto de la clase Proxy
		//la calse proxy contiene metedos
		//esos metodos ayudaran a configurar el proxy como lo requiera
		Proxy proxy = new Proxy(); 
		proxy.setHttpProxy("ipaddress:4444");//ese será el http del proxy ya que no tengo uno predefinido 
		
		//cuando el browser abra, se aseugrara de que el proxy setting is set in your browser
		//de esa forma puedo acceder a ese sitio web
		options.setCapability("proxy", proxy); 
		
		//Conocer mas sobre el uso de los proxy
		//Enlace para consultar documentación: https://chromedriver.chromium.org/capabilities
		
		
		
		//Set download directory
		//ode can be used to configure Chrome to download files to a specific directory
		Map<String, Object> prefs = new HashMap<String, Object>(); 
		//indico donde descargar los archivos del navegador y lo guardo en la variable "prefs"
		prefs.put("download.default_directory", "/directory/path"); 
		options.setExperimentalOption("prefs", prefs); 

		
		/*
		 * Block pop-up windows
		 * By default, ChromeDriver configures Chrome to allow pop-up windows. If you
		 * want to block pop-ups ChromeOptions options = new ChromeOptions();
		 * 
		 * options.setExperimentalOption("excludeSwitches",
		 * Arrays.asList("disable-popup-blocking"));
		 * 
		 */

		 

		
	}

}