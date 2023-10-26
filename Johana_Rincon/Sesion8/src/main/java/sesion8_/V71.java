package sesion8_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Codigo Que agrega un producto 

		WebDriver driver = new ChromeDriver();// crea una clase
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");// Ingreso a la pagina
		// buscamos el selector que enmarca todas las cajas de los prodcutos
		// List<WebElement> en Java. Esta lista contiene elementos web que coinciden con
		// el criterio de selección que has especificado
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));// h4.product-name
		// para agregar el productor al carrito usamos un for
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains("cucumber")) {
				// clic para adicionar el producto al carro.
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
				// h4[class='product-name'][Tomato - 1 Kg]
				//// button[text()='ADD TO CART']
				// driver.close();
			}
		}

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains("Beetroot")) {
				// clic para adicionar el producto al carro.
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
