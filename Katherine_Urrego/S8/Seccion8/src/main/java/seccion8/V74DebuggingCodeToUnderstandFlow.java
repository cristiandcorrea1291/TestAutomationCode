package seccion8;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V74DebuggingCodeToUnderstandFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Video 74: Debugging the code to understand how flow is being built
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		int j=0;
		//como declarar un arreglo tipo String con los valores de los productos
		//Expected Array of strings, that has multiple names
		//estos nombres osn lo que se van a comprobar si estan presentens en los indexes o no
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"}; 
		
		
		//a code tha support multiple data sets
		//Ir a la pagina web
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		//crear una lista de productos donde se referencia por el nombre del producto  h4.product-name
		//Usamos el metodo con PLURAL , findElements
		//orque quiero traer o retrieve toso los elementos por medio del selector, entonces traera tosos lo.s matching results para este CSS en particular
		//como va a retornar o necesitamos una LISTA DE ELEMENTOS List<WebElement> llamada productos
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name")); 

		//vamos a iterar los prodcuts de la lista List<WebElement> productos por el index
		//identificar que producto seleccionar por medio del index
		//iterarlo hasta el size de los products
		for(int i=0;i<products.size();i++) { 
			//variable name
			//get(i) will pull one particular value de el size (30 elemtos , etc)  de la lista
			//traer el texto presente del producto del carrto con el item i
			
			//Brocolli - 1 Kg <- nombre del producto en la pagina
			//Brocolli,    1 kg  <- despues del metodo SPLIT para el guon(-), se divide el string en dos partrs 
			//entonces brocoli quedaria en el index 0 y 1 kg en el index 1
			//name[0] - Brocolli
			//name [1] - 1 Kg
			String[] name=products.get(i).getText().split("-"); // traer el texto de "producto" por el selector "h4.product-name"
			String formattedName=name[0].trim(); 
	
			//format it to get actual vegetable name 
			//convert array into array list for easy search 
			//  check whether name you extracted is present in arrayList or not- 
			//Convertir un array a un arrayList
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
		
			if (itemsNeededList.contains(formattedName)){ // Sí la lista continene el formatedName del arreglo de elementos name
				j++;
			// click en el botón "Add to cart" que hay en cada producto
			//get(i) para scanear los productos
			// una vez se comara el arreglo con el valor -> name.contains("Cucumber"))
			// se hace clic en el producto o se selecciona .click()
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==3) {
				break;
			}
			
			
			
			//en el siguiente ideo se harán mas ajustes, ya que agrega al carrio Brocolli, Cucumber y TOMATO (que no está en el array String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"}; 
			}
		}

	}

}
