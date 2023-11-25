package seccion11;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V96GettingTitlesOfChildTabsWithLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Video 95: How to open the links in Separate Tabs - Optimized solution
		
		
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
		//El For abre todas las tabs - OPEN ALL THE TABS
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size() ; i++) {
			
			
			// VIDEO 95 ->//OPEN links in Separate Tabs
			/* ABRIR OTRA TAB EN EL NAVEGADOR
			 * Keys.chord() -> permite enviar múltiples teclas juntas o en secuencia como una acción en una página web. 
			 * En este caso, simularía que el usuario mantiene presionada la tecla "Control" (Ctrl)
			 *  y luego presiona la tecla "Enter" mientras el "Control" sigue presionado.
			 */
			//Los enlaces de la seccion se van a abrir en diferentes pestañas o tabs
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //para abrir otra TAB
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			System.out.println("Se abrieron el enlace en unan PESTAÑA SEPARADA");	
	
		}//Cerrar FOR
		
		
		
		System.out.println("\n\nMostrar los titulos de las ventanas al ir a los enlaces o links");
		//VIDEO 96
		//GET and PRINTt the titles of all those links
		//1. Switch driver to specific window
		//2. Get the title
		Thread.sleep(5);
		/*
		 * getWindowHandles(); -> 
		 * Iterator -> help us to move from one tab to another tab
		 * Despues de moverse a la tab it will switch to that
		 * */
		Set<String> abc = driver.getWindowHandles(); //manipular ventanas
		Iterator<String> it =  abc.iterator();
		
		//ITERATE AND EACH AND EVERY TAB, AND GIVE US THE TITLE
		//it.hasNext() -> tells if there us any window present - Sí hay algun index presente
		//it.hasNext() -> es boleano TRUE and FALSE...
		//it.hasNext() -> nd dice si hay un index presente o no
		while(it.hasNext()){ //hay otra ventana presente en la iteración de acuerdo al INDEX?
			
			driver.switchTo().window(it.next()); //Si la condicon es HASNEXT es TRUE (Hay indice pendiente),  Switch to a la otra siguiente NEXT ventana
			System.out.println(driver.getTitle()); //Traer el titulo de la tab
		}
		System.out.println("\n\nSe ha enviado el titulo de todas las ventanas");
		
		
		driver.quit();
		
		
		
	}

}
