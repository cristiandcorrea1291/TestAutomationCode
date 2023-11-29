package rahultshettyacademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent {

	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;// se refiere a la local class variable ...se refiere a la variable local a traves de una instancia
		PageFactory.initElements(driver, this); //PageFactory.initElements(lo que quiero enviar , la driver class actual);
	
	}
	
	//By.cssSelector("[placeholder='Select Country'])
	@FindBy(css = "[placeholder='Select Country']")
	WebElement country;
	
	////clic en el pais de la lista
	//By.xpath("(//button[contains(@class,'ta-item')])[2]")
	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;

	//Lista con TODAS las opciones sugeridas
	//By.cssSelector(".ta-results")
	By results = By.cssSelector(".ta-results");
	
	//By.cssSelector(".action__submit") - boton PLACE ORDER
	@FindBy(css = ".action__submit")
	 WebElement submit;
	

	//Ingresar y seleccionar una opcion en SELECT COUNTRY input
	public void selectCountry(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(country, countryName).build().perform();
		waitForElementToAppear(By.cssSelector(".ta-results"));
		selectCountry.click();
	}
	
	
	//clic en e boton PLACE TO ORDER
	/*
		 public ConfirmationPage submitOrder()
		{
			submit.click();//to land in the Confimartion page
			return new ConfirmationPage(driver);//crear una nueva clase llamada "ConfirmationPage" 
			
		}
	*/
	
	public ConfirmationPage submitOrder() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("document.querySelector('.action__submit').click();");
	    System.out.println("Hice clic en el boton Place Order para CONFIRMAR EL PEDIDO/ORDEN") ;
	    return new ConfirmationPage(driver);//crear una nueva clase llamada "ConfirmationPage" 
	    
	}
	
	
	

}
