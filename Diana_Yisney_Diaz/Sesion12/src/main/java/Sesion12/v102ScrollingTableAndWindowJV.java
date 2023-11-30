package Sesion12;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v102ScrollingTableAndWindowJV {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Inicio del navegador ");
		driver.get("http://qaclickacademy.com/practice.php");
	
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		js.executeScript("window.scrollBy(0,800)"); 
			Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); 
				
		System.out.println("Cerrar navegador");
    	driver.quit();	
		
	}
	
}
