package sesion8_;

import java.util.Arrays;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class V72ArrayProduct {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		// codigo que agrega 4 productos
		WebDriver driver = new ChromeDriver(); // crea una clase
		// crea un array (arreglo) de cadenas en Java llamado itemsNeeded que contiene
		// tres elemento
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Grapes" };
		// ingresa a la pagina
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// tiempo de espera
		Thread.sleep(3000);
		// La función addItems recorre los productos en la página y compara sus nombres
		// con los nombres especificados en itemsNeeded
		// itemsNeeded: Es un array de cadenas que contiene los nombres de productos que
		// se desean agregar al carrito.
		// driver es el objeto de Webdriver
		addItems(driver, itemsNeeded);

	}

//funcion de logica para agregar los productos el arreglo itemsNeeded
	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

//divide el texto en dos partes utilizando el carácter "-" como separador. 
			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
// verifica si se ha cumplido el objetivo de agregar todos los 3  
				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}
