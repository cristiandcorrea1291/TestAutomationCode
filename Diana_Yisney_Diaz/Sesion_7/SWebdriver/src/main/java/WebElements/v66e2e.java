package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v66e2e {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		
		//Campo From path id  id="ctl00_mainContent_ddl_originStation1_CTXT"
		System.out.println("Selecion check One way ");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println("Seleccion Check Box Senior Citizen");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    //Validacion de Xpath  //a[@value='DEL']
		System.out.println("Selecion From ");
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		System.out.println("Selecion To ");
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println("Selecion Fecha");		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(4) > td:nth-child(4) > a:nth-child(1)")).click();
		//driver.findElement(By.cssSelector("input[class*='ui-state-default ui-state-active']").click();
		     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			 {
				 System.out.println("Seleccion de Numero de pasajes");
				 Assert.assertTrue(true);
			 }
			 else
			 {
				 Assert.assertTrue(false); 
			 }
			
			 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			 driver.findElement(By.id("divpaxinfo")).click();
			 Thread.sleep(2000L);
			
			 	for(int i=1;i<5; i++)
					{
						driver.findElement(By.id("hrefIncAdt")).click();
					}
						driver.findElement(By.id("btnclosepaxoption")).click();
						Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
						
						System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
			//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights']")).click();
			driver.findElement(By.cssSelector("input[value='Search']")).click();
			//driver.findElement(By.xpath("//input[@value='Search']")).click();
			//driver.findElement(By.name("ctl00$mainContent$btn_FindFlight")).click();
			
			System.out.println("Cierre del Navegador");
			Thread.sleep(2000);
			driver.quit();
			
	}

	
}
