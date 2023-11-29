
package challenge3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import challenge3.componentes.AbstractComponents;

//LOGIN PAGE o INICIO DE SESION
public class LogIn extends AbstractComponents{

	WebDriver driver; // local class variable

	public LogIn(WebDriver driver) { // Constructor para inicializar el driver
		// super(driver); //pone el driver del test del argumeto del metodo, dentro de
		// la clase abstract usando el super(driver);
		this.driver = driver;// se refiere a la local class variable ...se refiere a la variable local a
								// traves de una instancia
		PageFactory.initElements(driver, this); // PageFactory.initElements(lo que quiero enviar , la driver class
												// actual);
	}

	// Ir a la pagina web
	public void goTo() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	// PageFactory
	@FindBy(name = "username") // Reemplaza con el atributo correcto
	WebElement usernameInput;

	@FindBy(name = "password") // Reemplaza con el atributo correcto
	WebElement passwordInput;

	@FindBy(className = "orangehrm-login-button")
	WebElement loginButton;
	
	//<p class="oxd-text oxd-text--p oxd-alert-content-text" data-v-7b563373="" data-v-87fcf455="">Invalid credentials</p>
	//xpath //p[@class='oxd-text oxd-text--p oxd-alert-content-text']
	//tagName = "p"
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement userPassIncorrect;

	
	//Ir a la pagina principal o home page
	public PrincipalPage loginApplication(String username, String password) {
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginButton.click();

		PrincipalPage  principal = new PrincipalPage (driver);// se crea instancia la clase PrincipalPage
		return principal; // se retorna el objeto o instancia "principal "de la clase PrincipalPage
	}
	
    public String doLoginWithInvalidCreds(String username, String password){
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginButton.click();
        return  userPassIncorrect.getText();
    }
	
	
	

}