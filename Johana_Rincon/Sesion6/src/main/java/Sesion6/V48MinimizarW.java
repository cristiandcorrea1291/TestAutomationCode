package Sesion6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V48MinimizarW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();//crea una clase	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//Maximiza la pagina
		driver.get("https://google.com");//ingresa a la pagina
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//abre la  misma pestaña
		driver.navigate().back();//regresa a la principal de google
		driver.navigate().forward();//para navegar hacia adelante en la historia de navegación de un navegador web controlado por Selenium
	}
	//https://rahulshettyacademy.com/dropdownsPractise/para practicar

}
