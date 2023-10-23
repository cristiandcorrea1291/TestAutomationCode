package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V63RadioBotton {

	public static void main(String[] args) throws InterruptedException {
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
		// DOS MANERA DE HACER DINAMCIO
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// Padre al hijo espacio
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(3000);

		// video 63

		// Selecciona la fecha del calendario actual
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		// para la clase quitar los espacios se reemplaza por .
		// .ui-state-default.ui-state-highlight.ui-state-active
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		// <a
		// class=".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover"
		// href="#" xpath="1">20</a>
		driver.quit();
	}

}
