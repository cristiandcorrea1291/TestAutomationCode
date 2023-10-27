package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class V61Asert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();// clase new chormeDriver
		// Manejo de Asert

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// el resultado es falso
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		// camino verdadero usando system y assert para comprobar que sea correcto.
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());

		// cuentas las cajas de checkbox de la pagina web, como resultado 6
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// muestra el numero de adultos seleccionados, para este caso 1
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		// System.out.print("\n\nCerrando automatización");

		// ciclo for
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(10000);
		int i = 1;
		while (i < 7) {

			driver.findElement(By.id("hrefIncAdt")).click();
			// <span id="spanAudlt">8</span>
			i++;
			// System.out.println("Agrega 6 adultos" + i);
		}
		// Assert valida que la inf sea excata en este caso 7 de pasajeros, si es otro
		// numero genera error.
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "7 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.close();
	}

}
