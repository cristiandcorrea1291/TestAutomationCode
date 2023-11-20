package seccion20;

import org.testng.annotations.AfterMethod;

public class V168 {
	
	//video 168. Create new Error Validation Test as per framework Standards developed until now
	
	
	// agregamos la anotación @BeforeMethod
	/*
	 * a anotación @BeforeMethod en un método te permite ejecutar cierto código
	 * antes de cada uno de los métodos de prueba que tengas en tu clase de pruebas.
	 * Esto es útil para preparar el estado inicial o realizar acciones comunes
	 * antes de cada prueba, como inicializar el driver, configurar propiedades,
	 * iniciar sesión, entre otros.
	 * 
	
	// con la anotación @BeforeMethod,estoy organizando el código de manera que 
	//la configuración necesaria se realice automáticamente antes de cada prueba
		 @BeforeMethod
		public LandingPage launchApplication() throws IOException {
			driver = initializeDriver();
			LandingPage landingPage = new LandingPage(driver);
			landingPage.goTo();
			System.out.println("Ingresé a la página web");
			return landingPage;
		}
	 */
	
	/*
	 * Esto significa que cada vez que se ejecute un método de prueba en tu clase,
	 * launchApplication() se ejecutará automáticamente antes de ese método de
	 * prueba. Este enfoque asegura que el estado inicial necesario se configure
	 * antes de cada prueba
	 
	 * en este caso, el método launchApplication() inicializa el driver,
	 * accede a la página web y luego devuelve una instancia de LandingPage.
	 */
	
	
	//Tambien se crea el metodo
	/*
	 	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	 */
	
	
	//se crea una copia de submitirdertest que llamaremos ErrorValidation
	//donde validaremos que pasa si se envia las credenciales (usuario y contraseña) equivocado
	//y se compara el mesnaje de error del login del cual obtengo el texto, con el del selector de la landing page
	/*
	 package rahultshettyacademy.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rahultshettyacademy.TestComponents.BaseTest;

public class ErrorValidations extends BaseTest{
	
	
	//convertimos el poyecto de java a TestNG con la anotación @Test
	@Test
	public void submitOrder() throws IOException, InterruptedException {
				
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

}
	 * */
	
	
	
	
	
	
}
