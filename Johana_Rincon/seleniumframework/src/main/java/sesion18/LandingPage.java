package sesion18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extractComponents.AbstractComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {// extiende la clase ABS Comp
	// Variable para el WebDriver
	WebDriver driver;

	// Constructor
	public LandingPage(WebDriver driver) // metodo para la credinciales de la clase Submitorder
	{
		// creamos el contructor para abstract
		super(driver);// Llama al constructor de la clase AbstractComponent pasando el driver

		this.driver = driver;//// Asigna el driver a la variable de instancia
		PageFactory.initElements(driver, this);// Inicializa los elementos de la página web utilizando PageFactory
		// WebDriver como parámetro, asignarlo a la variable de instancia driver
		// y luego inicializar los elementos de la página web utilizando
		// PageFactory
	}

	// Elemento para el campo de correo electrónico
	@FindBy(id = "userEmail")
	WebElement userEmail;

	// Elemento para el campo de contraseña
	@FindBy(id = "userPassword")
	WebElement passwordElem;

	// Elemento para el botón de inicio de sesión
	@FindBy(id = "login")
	WebElement submit;

	// Métodos para interactuar con los elementos
	public ProductCatalogue loginAplicaction(String email, String password) {
		userEmail.sendKeys(email);
		passwordElem.sendKeys(password);
		submit.click();
		ProductCatalogue ProductCatalogue = new ProductCatalogue(driver);
		return ProductCatalogue;
	}

	// Método para navegar a la URL de la página
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
}
