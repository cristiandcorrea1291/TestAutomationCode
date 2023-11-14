package seccion19;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class V159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VIDEO 159 .Creating Page object Classes for Login Screen and migrate the tes
		
		//Se crea el package -> PageObjects
		//Se crea la clase LandingPage
		//se crea un constructor
		//se crea una instanica en el ejercicio standoalone
		
		
		/*PageFactory -> to reduce the syntax of creating ypur web eleement
		//PageFactory
		//@FindBy(que atributo quiero encontrar)
		//@FindBy(uso el atributo id")
		//@FindBy(id="cual es el locator value") -> userEmail
		
				@FindBy(id="userEmail")
				WebElement userEmail;
				
		 Here we are sending locator or attribute in this argument @FindBy(id="userEmail"), and also we are sending a Value.
		 At run time, this will be constructed like this ->driver.findElement(By.id("userEmail"));
		 with that WE NOT NEED to declare the "WebElement userEmails = driver.findElement(By.id("userEmail"));"
		 Because it will assign it to the declare the variable WebElement type called "userEmail;"
		 
		 Esta construccion sera activada o triggered  cuando llamemos al metodo "initElements" de aquí PageFactory.initElements(driver, this) (linea 17)
		 
		 
		 Ese metodo "initElements" espera dos argumentos :
		 * Lo que quiero enviar -> driver
		 * coma , 
		 * this -> que se refiere a la driver class actual

		 		PageFactory.initElements(driver, this);
		 
		 SUMMARY:->	go and initialize all elements. When initializaing tajes the driver argument and then uses this driver to initializae
			
			//create another set, finding the "id" that is "userPassword" and call the webelement "password"
			@FindBy(id = "userPassword")
			WebElement password;
			
			//create another set, finding the "id" that is "login" and call it "submit"
			@FindBy(id = "login")
			WebElement submit;
	
		si hacemos clic en la anotacion @FindBy encontraremos los javafiles con l sintaxis de otros selectores como css, tagName, xpath, etc....
		
		
		
		
		https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/
		
		 */
		
		
	}

}
