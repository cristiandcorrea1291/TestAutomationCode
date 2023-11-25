package rahultshettyacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{


	WebDriver driver; // local class  variable

	public LandingPage(WebDriver driver) {	//Constructor para inicializar el driver
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="userEmail")
	WebElement userEmail;

	//create another set, finding the "id" that is "userPassword" and call the webelement "password"
	@FindBy(id = "userPassword")
	WebElement passwordEle;
	


	//create another set, finding the "id" that is "login" and call it "submit"
	@FindBy(id = "login")
	WebElement submit;
	
	
	//selector del mensaje de error al ingresar las credenciales INCORRECTAS en el login
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	
	
	//ACTION METHOD para Iniciar sesión
	public ProductCatalogue loginApplication (String email,String password){
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		return productCatalogue; 
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
