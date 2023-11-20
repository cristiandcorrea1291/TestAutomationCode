package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v64UPdateDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(1000);
		
		//Seleccion de Checknox
		//Bug al aplicar  Assert.assertTrue
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Thread.sleep(2000L);
		//id = ctl00_mainContent_chk_SeniorCitizenDiscount
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
	    // id =Div1  Atributte = style
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//name=" ctl00_mainContent_rbtnl_Trip_1"
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 
			 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			 {
				 System.out.println("it enabled");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 Assert.assertTrue(false);	 
			 }
				 
		 
	      
	    ///count numero de checkboxes
			//name="ctl00$mainContent$view_date2"
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			//name=" ctl00_mainContent_rbtnl_Trip_1"
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			//name="ctl00$mainContent$view_date2"
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
			Thread.sleep(5000L);
			
			System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(5000);
			
		
	    
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
