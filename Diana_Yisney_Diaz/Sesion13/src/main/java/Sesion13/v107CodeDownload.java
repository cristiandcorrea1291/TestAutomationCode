package Sesion13;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class v107CodeDownload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Controlador del browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 

		Proxy proxy = new Proxy(); 
		proxy.setHttpProxy("ipaddress:4444"); 
		options.setCapability("proxy", proxy); 

		Map<String, Object> prefs = new HashMap<String, Object>(); 
		
		prefs.put("download.default_directory", "/directory/path"); 
		options.setExperimentalOption("prefs", prefs); 
		options.setAcceptInsecureCerts(true); 

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver"); 
		 
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Inicio del navegador ");
		driver.get("https://expired.badssl.com/"); 

		System.out.println(driver.getTitle()); 

		System.out.println("Cerrar navegador");
		driver.quit();
			
	}

}
