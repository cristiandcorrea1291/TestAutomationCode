package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V66EndToEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//VIDEO 66:  End to End Automation using all UI Elements with selenium
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();//hacer clic en "ONE WAY" option radiobutton
		
		//Lista desplegable FROM
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Seleccionar una opcion de la lista desplegable FROM
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		System.out.println("Se ha seleccionado la opcion DELHI en la lista desplegable FROM");
		Thread.sleep(2000);//para solucionar los problemas de sincronización
		
		//Video 56//Lista Desplegable TO
		//Seleccionar la ciudad CHENNAI(MAA) de la lista desplegable TO
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println("Se ha seleccionado la opcion CHENAI en la lista desplegable TO");
		
		
		//VIDEO 63
		//select CURRENT DAY in DEPART DAY that is highlighted in the calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println("Se ha seleccionado THE CURRENT DAY o día actual");
			
		
		System.out.println("Se valida ¿RETURN DAY está desabilitado?");
		//VIDEO 64 //validar que RETUND DAY este DESABILITADO
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); 
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//MANIPULAR CHECKBOX
		System.out.println("\nSe va a seleccionar el CHECKBOX SENIOR CITIZEN");
		//seleccionar el checkbox SENIOR CITIZEN
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		
		//VIDEO 53// Lista Desplegable de PASSENGERS
		//Caja o campo de la lista desplegable PASSENGERS
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);//con esto no tendre fallas por sincronización
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1; i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println("Ejecución del ciclo for" + i+ " veces");
			}
		//boton DONE
		driver.findElement(By.id("btnclosepaxoption")).click();
		//
		System.out.println("\n Usar un Assert para comparar el valor/contenido seleccionado en la lista desplegable con otro que yo eliga");
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println("\n Imprimo la opción marcada en el dropdrown despues del ciclo for, al final de todo el programa");
		//Imprimir el texto de la casilla de la lista desplegable con el valor indicado al final del ciclo for
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
		
		
		
		//VIDEO 66
		//Click en el botón SEARCH o el AVION
		//puede ser fORMA 1: ->  By.id("ctl00_mainContent_btn_FindFlights");
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//puede ser FORMA 2: -> By.cssSelector("#ctl00_mainContent_btn_FindFlights")
		//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		//Tambien puede ser forma 3: -> By.cssSelector("input[value='Search']") o By.cssSelector("input[type='Submit']")
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		//Tambien puede hacerse así forma 4: -> By.xpath("//input[@value='Search']")
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		//Tambien puede hacerse así forma 5: -> By.name("ctl00$mainContent$btn_FindFlights")
		//driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
				
		System.out.println("\nSe hizo clic en el botón SEARCH");
		
		
		
		
		//cerrando ventana del navegador
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
	}

}
