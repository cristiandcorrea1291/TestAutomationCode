package seccion9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V85VersionDos {

	public static void main(String[] args) {
		//VIDEO 85: Practice example on Fluent wait
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//clic en el boton START
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		
		//FLUENT WAIT
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
	
		WebElement ejemploFluent = wait.until(new Function<WebDriver, WebElement>(){ 
		    public WebElement apply(WebDriver driver) {
		        if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) { 
		            return driver.findElement(By.cssSelector("[id='finish'] h4")); 
		        } 
		        else {
		            return null;
		        }
		    } 
		});

		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());


		driver.quit();		
		
	}

}
