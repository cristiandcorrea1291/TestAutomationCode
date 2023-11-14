package seccion19;

import rahultshettyacademy.pageobjects.CartPage;
import rahultshettyacademy.pageobjects.CheckoutPage;
import rahultshettyacademy.pageobjects.ProductCatalogue;

public class V164 {
	
	
	//Video: 164. Creating common methods to Abstract component and extending it in Page classes
	
	// 1.se crea la clase paara el carro de compras -> CartPage
	
	//2. se crea el metodo para el verificar los productos por nombre y hacer el match
	
	//3. se crea el Action Method para dar clic al boton Checkout
	
	
	//4. se ajusta en el LandingPage el actionmethod para iniciar sesión
	/*
	 	//ACTION METHOD para Iniciar sesión
	 	 
			public ProductCatalogue loginApplication (String email,String password){
				userEmail.sendKeys(email);
				passwordEle.sendKeys(password);
				submit.click();//Este clic nos lleva a una nueva pagina, pasamos de la pagina de login a la de la tienda, por eso creamos otra clase para continusr con el flujo en la tienda y etc
				ProductCatalogue productCatalogue = new ProductCatalogue(driver);
				return productCatalogue; 
				
				//cambia la palabra void por "ProductCatalogue"
				//con eso ahora estamos enviando el productCatalogue Object
			}
	 */
	
	
	//haciendo un refacto orefactorizacion al codigo: se hizo
	//se crea un objeto para LandingPage y CartPage
	//ProductCatalogue productCatalogue = landingPage.loginApplication("katherine-melissa.urrego@capgemini.com", "Katherine2023*");//video 164
	//CartPage cartPage = productCatalogue.goToCartPage();//video 164
	
	
	
	//Tambien se crea una nueva case desde un objeto con la linea return new CheckoutPage();
	/*
	 	//Ir al boton Checkout para validar el pedido
		public CheckoutPage goToCheckout() {
			checkoutEle.click();
			System.out.println("Vamos a hacer checkout") ;
			return new CheckoutPage();//se crea un objeto despues del clic y lo retornamos
		}
	
	 * */
	
	
}
