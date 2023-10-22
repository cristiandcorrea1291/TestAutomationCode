package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V56ParentChildRelationshipLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 56. Parent-Child relationship locator to Identify the objects Uniquely
		
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
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		
		//Video 56
		
		//Parent child Xpath: codificamos sin usar INDEXES para identificar UNIQUELY  
		//usamos xpath para ir del div padre con todas la opciones de la lista desplegable TO/Destination a la opcion MAA 
		//the whole parent area is the destination station, I choose CHEENNAI = MAA
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println("Se ha seleccionado la opcion MAA en la lista desplegable TO");
		//Busca un elemento en la página web que tenga las clases CSS especificadas y luego hace clic en ese elemento.
		// tenga las tres clases CSS mencionadas (.ui-state-default, .ui-state-highlight y .ui-state-active).
		//Esto significa que el elemento debe tener todas estas clases para ser seleccionado.
		
		//SELECTOR DINAMICO: 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Elemento seleccionado con el locator css");
		

		
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
		
	}

}
