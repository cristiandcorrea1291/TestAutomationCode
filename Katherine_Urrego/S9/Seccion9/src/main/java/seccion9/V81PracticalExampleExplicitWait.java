package seccion9;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

public class V81PracticalExampleExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// VIDEO 81: Practical examples on explicit waits
		//Una Explicit Wait viene en 2 timepos : WebDriver Wait  y Fluent Wait
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//IMPLECIT WAIT en USO VIDEO 80
		//maximum time it will wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 

		
		//Si se considra que algo se demora mucho en cargar se puede usar EXPLICIT WAIT
		//Explicit wait to target that specific element, it does not have effect in any other element	
		//enlos argumentos se indica a que DRIVER va a aplicar y el tiempo
	
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		//Expected Array of strings, that has multiple names //estos nombres osn lo que se van a comprobar si estan presentens en los indexes o no
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		//a code tha support multiple data sets//Ir a la pagina web
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		//llamar al metodo  y sus respectivos parametros (driver , itemsNeeded)
		addItems(driver , itemsNeeded);

		//Abrir el carro - Icono del caroo
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		//boton PROCEED TO CHECKOUT
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		//caja de ENTER PROMOTE CODE
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		//Botón APPLY
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));//espere hasta que este elemnto html sea visible en el DOM de la pagina web
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		//Botón mensaje abajo de promo
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));//espere hasta que este elemnto html sea visible en el DOM de la pagina web
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

	//statc porque se llama al metodo sin crear un objeto de la clase
	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		int j = 0;

		//como va a retornar o necesitamos una LISTA DE ELEMENTOS List<WebElement> llamada productos
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		//vamos a iterar los prodcuts de la lista List<WebElement> productos por el index
		//identificar que producto seleccionar por medio del index
		//iterarlo hasta el size de los products
		for (int i = 0; i < products.size(); i++) {
			// variable name // get(i) will pull one particular value de el size (30 elemtos , etc) de la
			// lista // traer el texto presente del producto del carrto con el item i

			// Brocolli - 1 Kg <- nombre del producto en la pagina
			// Brocolli, 1 kg <- despues del metodo SPLIT para el guon(-), se divide el
			// string en dos partrs
			// entonces brocoli quedaria en el index 0 y 1 kg en el index 1
			// name[0] - Brocolli
			// name [1] - 1 Kg
			String[] name = products.get(i).getText().split("-"); // traer el texto de "producto" por el selector
																	// "h4.product-name"
			String formattedName = name[0].trim();

			
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);
			System.out.println("La lista de productos es: " + itemsNeededList);

			if (itemsNeededList.contains(formattedName)) { // Sí la lista continene el formatedName del arreglo de
															// elementos name lo agregamos al carrito
				j++;
				// click en el botón "Add to cart" que hay en cada producto
				// get(i) para scanear los productos
				// una vez se comara el arreglo con el valor -> name.contains("Cucumber"))
				// se hace clic en el producto o se selecciona .click()
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("Se agregó al carrito el producto del index " + i + " igual a: " + formattedName);

				if (j == itemsNeeded.length) {// get the size of the array
					System.out.println("El size del arreglo es: " + j);
					break;
				}
			}

		}
	}
}
