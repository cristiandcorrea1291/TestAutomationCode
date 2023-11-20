package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

//

public class v61Assertions {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(2000);
		
		//Seleccion de Checknox
		//Bug al aplicar  Assert.assertTrue
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Thread.sleep(2000L);
		//id = ctl00_mainContent_chk_SeniorCitizenDiscount
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		///count numero de checkboxes
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000L);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
			for(int i=1;i<5; i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
			}
				driver.findElement(By.id("btnclosepaxoption")).click();
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				//em.out.println(driver.findElement(By.id("divpaxinfo")).getText()
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Cierre del Navegador");
	}

	private static Object getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
