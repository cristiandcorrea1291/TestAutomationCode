package WebElements;
//Updated WebDriver with java - Basics to Advanced + Frameworks
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v53 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Temporizador del navegador");
		Thread.sleep(100);
		
		driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(100);
	int i = 0;
	while (i < 7) {

		driver.findElement(By.id("hrefIncAdt")).click();
		// <span id="spanAudlt">8</span>
		i++;
		System.out.println("Agrega  adulto: " + i);


.assertTrue(true);
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println("clic en el boton final para agregar pasajeros ");
	// <input class="buttonN" id="btnclosepaxoption" value="Done" type="button">

	// buscar disponibilidad

	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(" No hay vuelos para esa fecha con esa cantidad Pasajeros");

	driver.quit();
}
}