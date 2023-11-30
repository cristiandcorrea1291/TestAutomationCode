package Seccion8;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v70qw {
	public static void main(String[] args)
	{
	DesiredCapabilities dc = DesiredCapabilities.chrome();
	dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);//validar es ssl x insecure
	//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  no lo trae la funcion
	
	ChromeOptions ch = new ChromeOptions();
	ch.merge(dc);
	//System.setProperty("webdriver.chrome.driver", "F//SELENIUM//SOFTWARES//chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(ch);
	
	}
}
