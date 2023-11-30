package Sesion11;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v96GettingTitlesOfChildTabsWLoop {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("El n�mero de enlaces en la p�gina es:" );
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("El n�mero de enlaces presentes en el FOOTER son:" );
		System.out.println(footerDriver.findElements(By.tagName("a")).size()); 	//Acceder a los enlaces del footer
				
		WebElement columndriver =footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("El n�mero de enlaces presentes la columna Discount Coupons del FOOTER son:" );
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
				for(int i=1; i<columndriver.findElements(By.tagName("a")).size() ; i++)
				{				
					String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //para abrir otra TAB
					columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
					System.out.println("Se abrieron el enlace en unan PESTA�A SEPARADA");	
			
				}
			
		System.out.println("\n\nMostrar los titulos de las ventanas al ir a los enlaces o links");
		Thread.sleep(5);
		
		Set<String> abc = driver.getWindowHandles(); //manejo de ventanas
		Iterator<String> it =  abc.iterator();
		
		while(it.hasNext()){ 
			
			driver.switchTo().window(it.next()); 
			System.out.println(driver.getTitle());
		}
		System.out.println("\n\nSe ha enviado el titulo de todas las ventanas");
		
		Thread.sleep(2000);
		System.out.println("Cierre del Navegador");
		driver.quit();
				
	}
	
}
