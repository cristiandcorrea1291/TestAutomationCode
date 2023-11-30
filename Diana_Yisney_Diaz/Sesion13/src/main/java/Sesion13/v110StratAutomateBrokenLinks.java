package Sesion13;

import java.net.HttpURLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v110StratAutomateBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String enlace = driver.findElement(By.cssSelector("a[href*='https://www.soapui.org/']")).getAttribute("href");
		
		System.out.println(enlace);
		
		System.out.println("Cerrar navegador");
		driver.quit();
	}
	
}
