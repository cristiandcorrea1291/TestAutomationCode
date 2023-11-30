package Sesion12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v103HandleTableGridsInWP {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	System.out.println("Inicio del navegador ");
	driver.get("http://qaclickacademy.com/practice.php");
	System.out.println("Ingreso a la pagina web");		
		
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,800)"); //window.ScrollBy(0,500)
	Thread.sleep(2000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	
	List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	
		int sum = 0; 
			for (int i=0; i<values.size(); i++)
			{
				System.out.print("\nEl valor que itero/sumaré y viene de la tabla es: ");
				System.out.println(Integer.parseInt(values.get(i).getText()));
				
				sum = sum + Integer.parseInt(values.get(i).getText());
				System.out.print("En la suma llevamos :  "+ sum);
			}
		
	System.out.println("\n\nLa suma total es: " +sum);
	
	System.out.println("Cerrar navegador");
	driver.quit();	
	
}
}
