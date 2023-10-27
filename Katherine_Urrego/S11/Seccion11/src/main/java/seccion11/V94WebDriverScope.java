package seccion11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V94WebDriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 94
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//1. Give me the count of the links on the page
		// a link is a "a" tag in HTML, entonces buscaremos con el metodo 	//.findElements(By.tagName("a")).size();
		System.out.println("El número de enlaces en la página es:" );
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.Get me the count of links present in the footer section
		//I need to limit the driver scope only to the footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));	//LIMITING WEB DRIVER SCOPE 	//Throw into this footerDriver the element html Footer""
		System.out.println("El número de enlaces presentes en el FOOTER son:" );
		System.out.println(footerDriver.findElements(By.tagName("a")).size()); 	//Acceder a los enlaces del footer que esta en footerDriver	
		
		
		//3.Count the number of links of the 1st Column " Discount Coupons" in the footer section
		//the fisrt column use ul tag
		WebElement columndriver =footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("El número de enlaces presentes la columna Discount Coupons del FOOTER son:" );
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		//4. CLICK on EACH link in the column and CHECK if the pages are opening
		//how many links are presen and click each link
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size() ; i++) {
			columndriver.findElements(By.tagName("a")).get(i).click();
			System.out.println("se entro en el index "+ i);
		}
			
		//La parte 4 falla, ya que debemos abrir cada enlace en una ventana nueva cada uno
		//y se solucionará en el siguiente video -> Video 95	
			
			
			
			
			
	}

}
