package Sesion13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v {

	
	public static void main(String[] args) throws MalformedURLException, IOException  {
		WebDriverManager.chromedriver().setup();
	//WebDriverManager.chromedriver().setup();
	
		  WebDriver driver = new ChromeDriver();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	

    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    //List<WebElement> links = driver.findElements(By.tagName("a"));
    List<WebElement>links= driver.findElements(By.cssSelector("li[class='gf-li']a"));
    
  
    

		
			for (WebElement link : links)
			{
				String url =link.getAttribute("href");
				
				//String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

				conn.setRequestMethod("HEAD");
				conn.connect();
				int respCode=conn.getResponseCode();
				System.out.println(respCode);
				if(respCode>400)//mayores a 400 error de conexion 
				{
					System.out.println("el link con el texto" +link.getText()+"es broken con el codigo "+ respCode);
					
					Assert.assertTrue(false);
				}
				}
				
	}}
				
				
				
	



