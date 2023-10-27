package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V55DinamicosPaises {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Es el contenedor donde van los paises
		//SELECTORES DINAMICOS
		//SELECIONA UN PAIS CAPITAL
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		//DOS MANERA DE HACER DINAMCIO
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//Padre al hijo espacio
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.close();
				
	}

}
