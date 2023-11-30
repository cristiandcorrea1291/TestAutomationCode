package Sesion11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v95OpenLinksInSeparate {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("El número de enlaces en la página es:" );
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));	
		System.out.println("El número de enlaces presentes en el FOOTER son:" );
		System.out.println(footerDriver.findElements(By.tagName("a")).size()); 	

		WebElement columndriver =footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("El número de enlaces presentes la columna Discount Coupons del FOOTER son:" );
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
			for(int i=1; i<columndriver.findElements(By.tagName("a")).size() ; i++) 
			{
				
				String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //para abrir TAB
				columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
				System.out.println("Se abrieron el enlace en unan PESTAÑA SEPARADA");
								
				System.out.println("se entro en el index "+ i + " en el enlace: "+clickonlinkTab);
			}
		Thread.sleep(2000);
		System.out.println("Cierre del Navegador");
		driver.quit();
			
		}
}
