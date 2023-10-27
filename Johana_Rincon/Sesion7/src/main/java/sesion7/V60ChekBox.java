package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V60ChekBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// testing one
		WebDriver driver = new ChromeDriver();
		// Manejo de chebox
		// ingresa a la pagina
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// estoy selecionado la caja en triangulo
		// Si el elemento está seleccionado, la función isSelected() devolverá true.
		// resultado falso
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		// camino verdadero
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());

		// cuentas las cajas de checkbox de la pagina web.usamos elementes en prural
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// muestra el numero de adultos seleccionados
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.print("\n\nCerrando automatización");
		driver.quit();

		driver.close();

	}

}
