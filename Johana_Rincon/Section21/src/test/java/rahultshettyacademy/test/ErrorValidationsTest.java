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

		//ponemos las credenciales incorrectas
		landingPage.loginApplication("abcdef123","Johana2023@");// video 164
		System.out.println("Inicie sesión el pagina web");
		Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());
		System.out.println("la comparación/assertion del mensaje del error y e texto fue satisfactoria");
	}

	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException {	
		String productName = "ZARA COAT 3"; 
		ProductCatalogue productCatalogue = landingPage.loginApplication("anshika@gmail.com","Iamking@000");
		System.out.println("Inicie sesión el pagina web");
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
		System.out.println("Vamos al carrito a ver los productos");
		CartPage cartPage = productCatalogue.goToCartPage();// video 164
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		System.out.println("Pasamos la comparación del assertion");




	}
	
	
	
}
