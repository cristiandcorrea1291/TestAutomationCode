package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V63HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 63.Handling Calendar UI in travel websites using Selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Lista desplegable FROM
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Seleccionar una opcion de la lista desplegable FROM
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		System.out.println("Se ha seleccionado la opcion BLR en la lista desplegable FROM");
		Thread.sleep(2000);//para solucionar los problemas de sincronización
		//Lista Desplegable TO
		//Seleccionar la ciudad CHENNAI(MAA) de la lista desplegable TO
		//Se indica por medio del index, ya que en la lista From tambien existe esa opcion
		//"(//a[@value='MAA'])[2]"
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println("Se ha seleccionado la opcion MAA en la lista desplegable TO");
						
		
		//VIDEO 63
		//select CURRENT DAY in DEPART DAY that is highlighted in the calendar
		//ui-state-default ui-state-highlight ui-state-active
		//Los espacios se rellenan con punto tener la linealidad en las clases y al cumplir contodo el criterio ejecute la accion
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println("Se ha seleccionado THE CURRENT DAY o día actual");
		
		
		//seleccionar otra fecha en el campo DEPART DATE
		//si marco algun radio button
		//how prve and confirm that whe i slect "one-day" in RETURN DATE is getting disableded??? 
		//how did do you confirm that something is enabled or disabled with your actions on your web browser?
		
		
		
		
		
	}

}
