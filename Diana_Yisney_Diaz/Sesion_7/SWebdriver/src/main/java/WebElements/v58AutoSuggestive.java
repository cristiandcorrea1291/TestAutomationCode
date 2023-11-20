package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v58AutoSuggestive {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Consulta en el buscador IND");
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); 
		Thread.sleep(2500);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item]a"));
		
			for(WebElement option :options)
			{
				Thread.sleep(300);
				if(option.getText().equalsIgnoreCase("India"))	
					 {
					Thread.sleep(500);
					option.click();
				 break;
					 }
				
				
			}
			
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Cierre del Navegador");
	}
}
