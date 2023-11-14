package seccion19;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import rahultshettyacademy.pageobjects.LandingPage;

public class V160 {

	//VIDEO 160. Implementing Action methods for Page factory web elements to implement logic
	
	
	//tenemos elpackage ->rahultshettyacademy.pageobjects
	//y alli la clase LandingPage
	
	//action methods 
	//en el package ->rahultshettyacademy
	//se crea la clase SubmitOrderTest
	
	
	//1. Se crea la instancia de la calse landingPage en la clase SubmitOrderTest
	//2. usamos el Action Method "loginApplication para iniciar sesión
	//3. Usamos el Action Method "goTo" para abrir la pagina web
	
	
	//4.Se crea la clase productCatalogue que contiene codigo similar a LandingPage
	//5.para crear un pagefactor element con la lista de productos del selector .mb-3
	
	
	
	
	
	
	/*
	 * en el archivo Landing page se cambió:
	 * ---------------------------------------
	 
	 //video160-> Crear instancia de la clase LandingPage
		LandingPage landingPage = new LandingPage(driver);
		
		//ir a la pagina web, usando Action Methods
		landingPage.goTo();
		System.out.println("Ingresé a la pagina web");
		
		//login usando Action Methods
		landingPage.loginApplication("kmuc@gmail.com", "IamKing@000");
		System.out.println("Inicie sesión el pagina web");
		
	 * */
	
	
	/*
	 en el archivo de ProductCatalogue se cambió
	 --------------------------------------------
	 
	 
	//List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	@FindBy(css = ".mb-3")
	List<WebElement>  products; //lo que ssea que encuentre pongalo en "products"ya que susamos el plural de findElements para entcontrar un set de elementos
	
	Aqui se utiliza una anotación @FindBy en Java, que es parte de la biblioteca
	 * Selenium WebDriver para localizar elementos en una página web. En este caso,
	 * estás buscando elementos en la página web que coincidan con el selector CSS
	 * ".mb-3" y los esoy almacenando en una lista llamada products.

	 
	 * */
	
	
	
	
	
	
}
