package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class V64 {

	public static void main(String[] args) {
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

		// VIDEO 64
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);
			driver.close();
		}

	}

}
