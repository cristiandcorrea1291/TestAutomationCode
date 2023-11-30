package Sesion11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v97CodeForEjercicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		driver.get("http://www.ebay.com/");
		
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		
		String Beforeclicking = null;
		String Afterclicking;
		
			for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++)
			{
				if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
				{
					Beforeclicking = driver.getTitle();
					col.findElements(By.tagName("a")).get(i).click();
					break;
				}
			}
			
		Afterclicking = driver.getTitle();
		
		if (Beforeclicking != Afterclicking)
		{
			if (driver.getPageSource().contains("sitemap"))
				System.out.println("PASS");
			}
		else
			{
				System.out.println("FAIL");
			}
		
		System.out.println("Cerrar navegador");
    	driver.quit();	
	}
}
