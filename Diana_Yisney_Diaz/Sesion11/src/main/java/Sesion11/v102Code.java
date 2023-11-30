package Sesion11;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v102Code {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del navegador ");
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.name("form_fields[travel_comp_date]"));
	
			while (!driver.findElement(By.cssSelector(".flatpickr-month .cur-month")).getText().contains("December"))
			{
			    driver.findElement(By.cssSelector(".flatpickr-month .flatpickr-next-month")).click();
			}
	
		List<WebElement> dates= driver.findElements(By.className("day"));
			
			int count=driver.findElements(By.className("day")).size();
	
				for (int i = 0; i < count; i++) {
				    String text = driver.findElements(By.className("day")).get(i).getText();
				    if (text.equalsIgnoreCase("31")) { 
				        driver.findElements(By.className("day")).get(i).click();
				        break;
				    }
				}
			
				System.out.println("Cerrar navegador");
		    	driver.quit();	
	}
}
