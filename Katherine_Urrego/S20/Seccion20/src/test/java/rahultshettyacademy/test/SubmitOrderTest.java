package rahultshettyacademy.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahultshettyacademy.TestComponents.BaseTest;
import rahultshettyacademy.pageobjects.CartPage;
import rahultshettyacademy.pageobjects.CheckoutPage;
import rahultshettyacademy.pageobjects.ConfirmationPage;
import rahultshettyacademy.pageobjects.LandingPage;
import rahultshettyacademy.pageobjects.OrderPage;
import rahultshettyacademy.pageobjects.ProductCatalogue;

public class SubmitOrderTest extends BaseTest{
	
	//VIDEO 170 ....este dato pertenece a todos los Test Methods presentes en esta clase
	String productName = "ZARA COAT 3"; 
	
	
	//convertimos el poyecto de java a TestNG con la anotación @Test
	@Test
	public void submitOrder() throws IOException, InterruptedException {

		// login usando Action Methods
		ProductCatalogue productCatalogue = landingPage.loginApplication("katherine-melissa.urrego@capgemini.com",
				"Katherine2023*");// video 164
		System.out.println("Inicie sesión el pagina web");

		// VIDEO 161 Action Method
		/// Obtener todos los articulos y guardarlos en una lista
		List<WebElement> products = productCatalogue.getProductList();
		// VIDEO 162 //iterar todos y cada uno de los productos//Add to cart button
		productCatalogue.addProductToCart(productName);
		// video 164 Action Method para hacer clic en el icono del carrito/menu carrito
		// clic en el icono del carrito en el Cart //[routerlink*='cart']
		System.out.println("Vamos al carrito a ver los productos");
		// Video 156 y 164
		// Verificar los items o productos an el carrito usando "STREAM" y encontrar el
		// botón "CHECKOUT"
		// se integra al metodo gotoCartPage -> CartPage cartPage = new
		// CartPage(driver);
		CartPage cartPage = productCatalogue.goToCartPage();// video 164
		Boolean match = cartPage.VerifyProductDisplay(productName);// retornar el true or false de acuerdo al match de
																	// titulo producto y stringque necesito
		Assert.assertTrue(match);// este metodo solo aceptará True, si el match es true al estar el producto en
									// el carrito por su coindidencia en nombres
		System.out.println("Si hubo coincidencia y pasamos la comparación del assertion");

		
		// JavaSriptEXECUTOR en CartPage class
		// Ir al botón CHECKOUT(video 164)
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		System.out.println("Vamos a hacer checkout");

		// Video 157 y 165
		checkoutPage.selectCountry("india");
		// Una vez en el checkout // Ingresar info al campo autosugestivo "Select Country"
		System.out.println("Encuentro el campo Select Country y sugiero un texto");
		// esperar hasta que la seccion con la lista de opciones del campo sugestivo se
		// muestre en la pagina // selector ta-results list-group ng-star-inserted
		System.out.println("espere hasta que mostrara la lista de opciones que contienen mi sugestión");
		// clic en el pais de la lista
		System.out.println("Elegi una opcion de la lista sugerida");

		// JavaSriptEXECUTOR
		// clic en e boton PLACE ORDER - CONFIRMAR EL PEDIDO/ORDEN") ;
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();

		// Traer , comparar e Imprimir el mensaje de THANKSYOU FOR THE ORDER
		String confirmMessage = confirmationPage.getConfirmationMessage();
		System.out.println("el texto que obtengo de la pagina");

		// con el texto que voy a comparar con el
		// confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER");

		// Si ambos son iguales , la assetion pasara= true....en caso contrario veremos
		// un error en la consola
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println("La assertion es TRUE...el texto de la pagina es el esperado segun la comparación");
		
		//video 170
		//Orders
	
	}
	
	
	//video 170
	//To verify ZARA COAT 3 is displayed in Orders Page
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest(){
		//"ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("katherine-melissa.urrego@capgemini.com", "Katherine2023*");
		OrderPage ordersPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	}

	
}
