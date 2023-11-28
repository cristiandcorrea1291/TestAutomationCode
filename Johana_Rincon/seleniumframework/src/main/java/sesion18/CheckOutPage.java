package sesion18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import extractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent {
	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
//agre
	//@FindBy(css = ".action__submit")//boton de place order
//	WebElement submit;
	
	
	@FindBy(css = ".action__submit")
	WebElement submit;
	

	@FindBy(css ="[placeholder='Select Country']")//seleciona el pais india
	WebElement country;

	@FindBy(xpath ="//button[contains(@class,'ta-item')][2]")// seleciona el pais
	WebElement SelectCountry;

	By results = By.cssSelector(".ta-results");//lista de paises

	public  void SelectCountry(String countryName) {
		
		Actions a = new Actions(driver);
		a.sendKeys(country, countryName).build().perform();
		waitForElementToAppear(By.cssSelector(".ta-results"));
		SelectCountry.click();
	}
		
		//aqui me funciono con try 
		/* try {
		        // Envía el nombre del país al elemento 'country'
		        a.sendKeys(country, countryName).build().perform();
		        
		        // Espera a que aparezca el elemento '.ta-results'
		        waitForElementToAppear(By.cssSelector(".ta-results"));
		        
		        // Hace clic en el elemento que esperaste que apareciera
		        driver.findElement(By.cssSelector(".ta-results")).click();
		    } catch (Exception e) {
		        e.printStackTrace();
		        // Puedes agregar más lógica de manejo de excepciones según tus necesidades
		    }
		}
*/
	//boton de submit order

	public ConfirmationPage submitOrder() {

		submit.click();
		return new ConfirmationPage(driver);
		

	}

}
