package rahultshettyacademy.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahultshettyacademy.TestComponents.BaseTest;
import rahultshettyacademy.pageobjects.CartPage;
import rahultshettyacademy.pageobjects.CheckoutPage;
import rahultshettyacademy.pageobjects.ConfirmationPage;
import rahultshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest{
	
	
	//convertimos el poyecto de java a TestNG con la anotación @Test
	@Test(groups= {"ErrorHandling"})//video 171
	public void LoginErrorValidation() throws IOException, InterruptedException {
				
		String productName = "ZARA COAT 3";
		
		//video 168
		//ponemos las credenciales incorrectas
		landingPage.loginApplication("k-melissa.urrego@capgemini.com","Katherine2000*");// video 164
		System.out.println("Inicie sesión el pagina web");

		//donde aparece el mensaje del error
		//div[aria-label='Incorrect email or password.']	//.ng-tns-c4-25.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error
		//Assert.assertEquals("Incorrect email or pa@sswordssss.",landingPage.getErrorMessage()); //Con el mensaje incorrecto deberia mostrar en la consola el "java.lang.AssertionError: expected [Incorrect email or password.] but found [Incorrect email or pa@sswordssss.]"
		Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());
		System.out.println("la comparación/assertion del mensaje del error y e texto fue satisfactoria");
	}

	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {
				
		String productName = "ZARA COAT 3"; //video 156

		// login usando Action Methods
		ProductCatalogue productCatalogue = landingPage.loginApplication("katherine-melissa.urrego@capgemini.com",
				"Katherine2023*");// video 164
		System.out.println("Inicie sesión el pagina web");

		// VIDEO 161 Action Method/// Obtener todos los articulos y guardarlos en una lista
		List<WebElement> products = productCatalogue.getProductList();
		// VIDEO 162 //iterar todos y cada uno de los productos//Add to cart button
		productCatalogue.addProductToCart(productName);
		// video 164 Action Method para hacer clic en el icono del carrito/menu carrito // clic en el icono del carrito en el Cart //[routerlink*='cart']
		System.out.println("Vamos al carrito a ver los productos");
		// Video 156 y 164 // Verificar los items o productos an el carrito usando "STREAM" y encontrar el
		CartPage cartPage = productCatalogue.goToCartPage();// video 164
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");// retornar el true or false de acuerdo al match de
																	// titulo producto y stringque necesito
		Assert.assertFalse(match);// este metodo solo aceptará FALSE, si el match es true al estar el producto en
									// el carrito por su coindidencia en nombres
		System.out.println("Si hubo coincidencia y pasamos la comparación del assertion");




	}
	
	
	
}
