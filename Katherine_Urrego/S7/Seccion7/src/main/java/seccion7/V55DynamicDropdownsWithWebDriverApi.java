package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V55DynamicDropdownsWithWebDriverApi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 55. Handle Dynamic dropdowns with Webdriver API
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("http://spicejet.com"); //URL in the browser
		
		//LIstas desplegabls dinamicas con campos dependientes/relacionados
		//Selenium scans from Top left to down right
		//  //a[@value='MAA']  - Xpath for chennai
		//  //a[@value='BLR']

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
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.println("Se ha seleccionado la opcion MAA en la lista desplegable TO");
		//Asi se seleccionan o marcan las opciones de las listas desplegables de forma dinámica.

		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
		
	}

}
