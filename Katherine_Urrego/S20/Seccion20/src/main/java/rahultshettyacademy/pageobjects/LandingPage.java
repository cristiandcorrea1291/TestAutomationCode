package rahultshettyacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{


	WebDriver driver; // local class  variable

	public LandingPage(WebDriver driver) {	//Constructor para inicializar el driver
		
		super(driver); //pone el driver del test del argumeto del metodo, dentro de la clase abstract usando el super(driver);
		//initialization
		this.driver=driver;// se refiere a la local class variable ...se refiere a la variable local a traves de una instancia
		PageFactory.initElements(driver, this); //PageFactory.initElements(lo que quiero enviar , la driver class actual);
	}

	
	//PageFactory
	//@FindBy(que atributo quiero encontrar)
	//@FindBy(uso el atributo id")
	//@FindBy(id="cual es el locator value") -> userEmail
	@FindBy(id="userEmail")
	WebElement userEmail;
	/*
	 Here we are sending locator or attribute in this argument @FindBy(id="userEmail"), and also we are sending a Value.
	 At run time, this will be constructed like this ->driver.findElement(By.id("userEmail"));
	 with that WE NOT NEED to declare the "WebElement userEmails = driver.findElement(By.id("userEmail"));"
	 Because it will assign it to the declare the variable WebElement type called "userEmail;"
	 Esta construccion sera activada o triggered  cuando llamemos al metodo "initElements" de aquí PageFactory.initElements(driver, this) (linea 17)
	 
	 Esta construccion sera activada o triggered  cuando llamemos al metodo "initElements" de aquí PageFactory.initElements(driver, this) (linea 17)
		 Ese metodo "initElements" espera dos argumentos :
		 * Lo que quiero enviar -> driver
		 * coma , 
		 * this -> que se refiere a la driver class actual
		 		PageFactory.initElements(driver, this);
		
		SUMMARY:->	go and initialize all elements. When initializaing tajes the driver argument and then uses this driver to initializae
	 */
	
	//create another set, finding the "id" that is "userPassword" and call the webelement "password"
	@FindBy(id = "userPassword")
	WebElement passwordEle;
	


	//create another set, finding the "id" that is "login" and call it "submit"
	@FindBy(id = "login")
	WebElement submit;
	
	
	//	//video 168
	//selector del mensaje de error al ingresar las credenciales INCORRECTAS en el login
	//.ng-tns-c4-25.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	
	
	//ACTION METHOD para Iniciar sesión
	public ProductCatalogue loginApplication (String email,String password){
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();//Este clic nos lleva a una nueva pagina, pasamos de la pagina de login a la de la tienda, por eso creamos otra clase para continusr con el flujo en la tienda y etc
		ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		return productCatalogue; //cambia la palabra void por "ProductCatalogue"
		//con eso ahora estamos enviando el productCatalogue Object
	}
	
	
	//
	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage); //esperar a que aparezca el elemento web
		return errorMessage.getText();
		
	}
	
	
	//ir a la url de la pag
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
