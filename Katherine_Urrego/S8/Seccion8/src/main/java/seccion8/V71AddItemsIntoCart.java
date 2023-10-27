package seccion8;

import java.time.Duration;
import java.util.Arrays;
import java.util.List; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V71AddItemsIntoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Video 71:Problem - Adding Items into Cart for Ecommerce App
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Ir a la pagina web
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		
	}


}
