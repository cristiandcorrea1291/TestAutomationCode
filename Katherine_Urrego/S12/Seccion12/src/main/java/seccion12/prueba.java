package seccion12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prueba {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Ir a la pagina web
		driver.get("http://qaclickacademy.com/practice.php"); 
		driver.manage().window().maximize();
		System.out.println("Ingreso a la pagina web");
		


		driver.findElement(By.id("autocomplete")).sendKeys("Col");

		Thread.sleep(2000);
		//marca la 1ra opcion de la lista para el campo autosugestiv0
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//marca la primera opcion del la lista sugestiva
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
