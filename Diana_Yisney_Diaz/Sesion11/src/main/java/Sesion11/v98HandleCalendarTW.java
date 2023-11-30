package Sesion11;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class v98HandleCalendarTW {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Inicio del navegador ");
		driver.get("https://www.path2usa.com/travel-companions");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='elementor-field-label'])[3]")).click();
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		
		int count = driver.findElements(By.className("flatpickr-day")).size();
		// Hacer clic en una fecha
			for (int i = 0; i < count; i++) {
				String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
				if (text.equalsIgnoreCase("31")) {
					driver.findElements(By.className("flatpickr-day")).get(i).click();
					break;
				}
			}

			System.out.println("Cerrar navegador");
	    	driver.quit();	
	}

}
