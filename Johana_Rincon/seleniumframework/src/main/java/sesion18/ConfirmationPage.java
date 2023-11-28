package sesion18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent {

	WebDriver driver;//Un atributo que almacena el objeto WebDriver que se pasa al constructor.
//Inicializa la clase llamando al constructor de la clase padre AbstractComponent (super(driver)), 
//asigna el objeto WebDriver al atributo driver y luego inicializa los elementos de la página utilizando 
//PageFactory.initElements(driver, this).
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// confirmacion del mesaje
	//Identifica el elemento de la página que contiene el mensaje de confirmación utilizando un selector CSS.
	@FindBy(css = ".hero-primary")
	WebElement ConfirmationMenssage;

	//Retorna el texto del elemento que contiene el mensaje de confirmación Metodo
	public String getConfirmationMessage() {

		return ConfirmationMenssage.getText();
	}

}
