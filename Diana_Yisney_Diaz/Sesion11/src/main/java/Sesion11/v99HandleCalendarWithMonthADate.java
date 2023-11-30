package Sesion11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v99HandleCalendarWithMonthADate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Inicio del navegador ");
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("(//label[@class='elementor-field-label'])[3]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".flatpickr-calendar")));

			while (!driver.findElement(By.cssSelector(".flatpickr-month .cur-month")).getText().contains("December"))
			{
				driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
			}

		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));

		int count = driver.findElements(By.className("flatpickr-day")).size();
			for (int i = 0; i < count; i++) {
				String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
				if (text.equalsIgnoreCase("31")) 
				{
					driver.findElements(By.className("flatpickr-day")).get(i).click();
					break;
				}
	
			}
		System.out.println("Cerrar navegador");
    	driver.quit();	

	}
}
