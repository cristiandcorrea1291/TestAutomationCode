package seccion11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V93PrintLinksCountsInThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 93: Practise Exercise- print the links count in the Page
		//Obtener todos los enlaces de una página web
		//Obtener todos los enlaces de una sección en específico
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//1. Give me the count of the links on the page
		// a link is a "a" tag in HTML, entonces buscaremos con el metodo 
		//.findElements(By.tagName("a")).size();
		System.out.println("El número de enlaces en la página es:" );
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//2. Get me the count of links present in the footer section
		//I need to limit the driver scope only to the footer section
		//Throw into this footerDriver the element html Footer""
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//guardar el footer en una variable
		System.out.println("El número de enlaces presentes en el FOOTER son:" );
		//Acceder a los enlaces del footer que esta en footerDriver		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		
	}

}
