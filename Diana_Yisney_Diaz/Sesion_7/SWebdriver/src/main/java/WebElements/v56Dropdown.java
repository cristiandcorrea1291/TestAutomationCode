package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v56Dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Campo From path id  id="ctl00_mainContent_ddl_originStation1_CTXT"
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    //Validacion de Xpath  //a[@value='BLR']
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		//Campo From path xpath  div _ id glsctl00_mainContent_ddl_destinationStation1_CTNR 
		//  (//a[@value='MAA'][normalize-space()='Chennai (MAA)'])[2]
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();      
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		//Fecha de calendario XPATH class="ui-state-default ui-state-highlight ui-state-active"  *** .ui-state-default.ui-state-highlight.ui-state-active
		Thread.sleep(1200);                 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();		
		Thread.sleep(500);
		driver.quit();
		System.out.println("Cierre del Navegador");
    }
}