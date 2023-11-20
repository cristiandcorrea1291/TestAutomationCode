package WebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedlecturenDropdownlooping {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Temporizador del navegador");
		Thread.sleep(10000L);
		//Agregar Button Alert
		//	driver.switchTo().alert().accept();
		//System.out.println("Cierre Ventana Notificaciones");
		//Assert.assertTrue(true);
		//Thread.sleep(2000);	
		//driver.findElement(By.id("dixpaxinfo")).click();
		
		/*int i=1;
		
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		
		i++;
		Assert.assertTrue(true);
		}*/
			
  // System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
  		
   for(int i=1;i<5;i++)

	{
			driver.findElement(By.id("hrefIncAdt")).click();
	}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Se agrega Assert para dar clic en el boton de notificacion
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
	
		//driver.switchTo().alert().accept();
		
			
			System.out.println("Cierra el navegador ");
			// Cierra el navegador  y todas las ventanas asociadas al final del script.
			driver.quit();
			
	}
	
}
