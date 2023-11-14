package rahultshettyacademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}
	
	//Titulo de la pagina con el texto THANKYOU FOR THE ORDER.
	@FindBy(css = ".hero-primary")
	WebElement confirmationMessage;
	
	//Obtener el texto y retornar el texto de confimarcion "THANKYOU FOR THE ORDER."
	public String getConfirmationMessage() {
		return confirmationMessage.getText();
	}
	
	/*
	
	public String getConfirmationMessage()
	{
		CheckoutPage cp = new CheckoutPage(driver);	
		System.out.println("el texto que obtengo de la pagina es:" +confirmMessage) ;
		return confirmationMessage.getText();
	}
	*/
}
