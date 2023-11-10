package seccion19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class V162 {
	
	//VIDEO 162. Page object Class implementation for Product catalogue page and update test
	
	
	//Ahora validamos como ajsutar la espera para el selector b
	
	/*
	 //VIDEO 154 //iterar todos y cada uno de los productos
		//products.stream().filter(product->product.getText().equals("ZARA COAT 3"));
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
		
	 * */
	
	
	//. 1. En la clase ProductCatalogue -> Vamos a crear un Action mehtod para VALIDAR EL NOMBRE DEL PRODUCTO
	/*
	 	//Action Method para  Validar el nombre del producto que esta en la lista
			public WebElement getProductByName (String productName) {
				WebElement prod = getProductList().stream().filter(product->
				product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
				
				return prod;
			}
	 */
	
	
	//2.  En la clase ProductCatalogue ->Ahora necsitamos ADD THE PRODUC TO CART
	//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	// se crea el Action Method addProductToCart	
	/*
	 
	 By addToCartBy = By.cssSelector(".card-body button:last-of-type");
	 	//Action Method para ADD THE PRODUCT TO CART o Agregar el producto al carro de compras
	public void addProductToCart(String productName) {
		WebElement prod = getProductByName (productName);
		prod.findElement(addToCartBy).click();
		
	}
	
	




	//3.aplicamos el el methodo para que elmesanje aparezca
	
	//4 se cre el metodo para esperar hasta que desaparezca

	/* en los abstractcomponents
	 	// Action Method para Esperar a que un elemento DESAPAREZCA  (video 162)
		public void waitForElementToDisappear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
		System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
		
	}	
	 */
	
	
	
	/*
	 * 
	 	//Action Method para ADD THE PRODUCT TO CART o Agregar el producto al carro de compras
		public void addProductToCart(String productName) {
			WebElement prod = getProductByName (productName);
			prod.findElement(addToCartBy).click();
			System.out.println("Se agregó el producto al carrito") ;
			waitForElementToAppear(toastMessageBy);///esperamos el mensaje product added aparezca
			System.out.println("Apareció el mensaje del producto agregado al carrito") ;
			waitForElementToDisappear(spinner);//esperamos el mensaje product added DESaparezca
			System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
		}
	 * */
	
	
	
	
	
	
	
	
	//CAN YOU APLY PAGE FACTORY WITHIN WebElement.findElement?
	//NO, it is NOT posible
}
