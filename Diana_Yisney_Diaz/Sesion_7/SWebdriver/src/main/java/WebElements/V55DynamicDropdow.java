package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V55DynamicDropdow {

	public static void main(String[] args) throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			System.out.println("Inicio del navegador ");
			//driver.get("https://spicejet.com");
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			System.out.println("Temporizador del navegador");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
										  
		Thread.sleep(500);
		System.out.println("Seleccion de ciudad Salida");
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(500);
		System.out.println("Seleccion de ciudad Destino");
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
			Thread.sleep(1000);
			driver.quit();
			System.out.println("Cierre del Navegador");
	}
}
