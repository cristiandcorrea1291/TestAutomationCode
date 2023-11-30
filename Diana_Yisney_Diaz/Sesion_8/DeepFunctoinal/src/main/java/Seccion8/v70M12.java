package Seccion8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v70M12 {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Apertura del Navegador");
		driver.get("https://www.path2usa.com/travel-compamions");
		//March 31 2018
		System.out.println("Inicio del Navegador");
		driver.findElement(By.xpath(".//input[@id='travel_date']")).click();
		
			while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).contains("March"))
			{
				driver.findElement(By.className("[class='datepicker-days'] th[class='next']")).click();
			}
			
				List<WebElement> dates = driver.findElements(By.className("day"));
				int count = driver.findElements(By.className("day")).size();
					
				for(int i = 0; i < count; i++)
						{
							String text = driver.findElement(By.className("day")).get(i).getText();
								if(text.equalsIgnoreCase("31"))
								{
								driver.findElement(By.className("day")).get(i).click();
								break;
								}
						}
				
				
		//driver.findElement(By.xpath("id('email')")).sendKeys("dysney05@hotmail.com");
		Thread.sleep(2000);
	}
}
