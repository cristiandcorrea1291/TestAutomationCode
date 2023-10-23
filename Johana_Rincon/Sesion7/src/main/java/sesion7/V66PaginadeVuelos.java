package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class V66PaginadeVuelos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Es el contenedor donde van los paises
		// SELECTORES DINAMICOS
		// SELECIONA UN PAIS CAPITAL
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		// DOS MANERA DE HACER DINAMICO
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// Padre al hijo espacio //Selecciona el pais
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
		.click();
		Thread.sleep(3000);

		// video 63

		// Selecciona la fecha del calendario actual clase
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

		// v53 seleciona los pasajeros
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(10000);
		int i = 0;
		while (i < 7) {

			driver.findElement(By.id("hrefIncAdt")).click();
			// <span id="spanAudlt">8</span>
			i++;
			System.out.println("Agrega  adulto: " + i);

			Assert.assertTrue(true);
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("clic en el boton final para agregar pasajeros ");
		// <input class="buttonN" id="btnclosepaxoption" value="Done" type="button">

		// buscar disponibilidad

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(" No hay vuelos para esa fecha con esa cantidad Pasajeros");

		driver.quit();
		// Johana Rincon

	}

}
