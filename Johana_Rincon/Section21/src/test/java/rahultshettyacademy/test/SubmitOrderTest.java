package rahultshettyacademy.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
	
	
	@Test (dataProvider="getData", groups= {"Purchase"}) //video 172
	public void submitOrder(HashMap <String , String> input) throws IOException, InterruptedException { //173

		// login usando Action Methods
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password")); //173
		System.out.println("Inicie sesión el pagina web");

		List<WebElement> products = productCatalogue.getProductList();	/// Obtener todos los articulos y guardarlos en una lista
		productCatalogue.addProductToCart(input.get("product")); //173
		System.out.println("Vamos al carrito a ver los productos");

		CartPage cartPage = productCatalogue.goToCartPage();// video 164
		Boolean match = cartPage.VerifyProductDisplay(input.get("product"));// 173
		System.out.println("Si hubo coincidencia y pasamos la comparación del assertion");

	
		// Ir al botón CHECKOUT
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		System.out.println("Vamos a hacer checkout");

		//campo country
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
	

	//To verify ZARA COAT 3 is displayed in Orders Page
	@Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest(){
		//"ZARA COAT 3";
		ProductCatalogue productCatalogue = landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
		OrderPage ordersPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
	}
	
	
	//video 175

	public String getScreenShot(String testCaseName) throws IOException {
	    // Convertir el controlador (driver) a TakesScreenshot
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    // Obtener la captura de pantalla como un archivo (File)
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    // Especificar la ubicación y el nombre del archivo de destino
	    File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
	    FileUtils.copyFile(source, file);
	    // Devolver la ruta completa del archivo de captura de pantalla
	    return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}

	
	// video 172
/*
	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "anshika@gmail.com", "Iamking@000", "ZARA COAT 3" },
				{ "anshika@gmail.com", "Iamking@000", "ADIDAS ORIGINAL" } };
	}
	
}
*/
	
	
	// video 173
	@DataProvider
	public Object[][] getData() throws IOException {
		 
		List <HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\rahultshettyacademy\\data\\PurchaseOrder.json");
		return new Object[][] { {data.get(0) }, {data.get(1)} };
		
		
		//HashMap<String, String> map = new HashMap<String, String>();//173
		//map.put("email", "anshika@gmail.com");
		//map.put("password", "Iamking@000");
		//map.put("product", "ZARA COAT 3");
		
		//HashMap<String, String> map1 = new HashMap<String, String>();
		//map1.put("email", "anshika@gmail.com");
		//map1.put("password", "Iamking@000");
		//map1.put("product", "ADIDAS ORIGINAL");

	}


}
