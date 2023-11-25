package Sesion13;

import java.lang.reflect.Proxy;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V105CertificadosSeguridad {

	public static void main(String[] args) {
		
		//EJEMPLOS DE CODIGO PARA DESCARGAR, PROXY,POP
		// TODO Auto-generated method stub
		// crea objeto options de la clase ChromeOptions.
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);// acepta los certificados inseguros
		// para firefox
		// FirefoxOptionsoptions=NewFirefoxOptions();
		// options.setAcceptInsecureCerts(true);//acepta los certificados inseguros
		// Configura el sistema de propiedades de Selenium y el controlador de Chrome

	// Add the WebDriver proxy capability.

	//	Proxy proxy = new Proxy();

	//	proxy.setHttpProxy("myhttpproxy:3337");

	//	options.setCapability("proxy", proxy);

	//	options.setCapability("proxy", value);

		// DESCARGAR ARHIVOS

	// options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);

		// pop-up windows.
	//	ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches",

		Arrays.asList("disable-popup-blocking"));

		WebDriverManager.chromedriver().setup();

		// Se crea una instancia de ChromeDriver, que representa una instancia del
		// navegador Google Chrome.
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("	https://expiered.badssl.com/");
		System.out.print(driver.getTitle());

	}

}
