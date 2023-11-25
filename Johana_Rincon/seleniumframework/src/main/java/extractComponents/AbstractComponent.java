package extractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sesion18.CartPage;

public class AbstractComponent {

	WebDriver driver;// objeto local
//construtor que recibe el objeto webdrivercomo parametro y lo asigna al atributo driver//para interacturar con elnavegador

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;// objeto que le da vida
		 PageFactory.initElements(driver, this);//Se inicializa los elemntos de la pagigina
	}
	
	
	@FindBy(css="[routerlink*='cart']")
	WebElement CartHeard;

	// metodo reutilizable espera a que el elemento sea visibisible
	public void waitForElementToAppear(By findBy) {// argumento By findby//se utiliza en la clase de agregar los
													// productos
		// usa el objeto WebDriverWait para esperar hasta que el elemento identificado
		// por findBy sea visible en la página.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// una condición esperada que verifica si el elemento identificado por findBy es
		// visible.
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));// argumento

	}
	
	//	Menu del carro objeto comun
	
	public CartPage goToCartPage()
	{
		 CartHeard.click();
		//driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		CartPage CartPage =new CartPage(driver);
		return CartPage ;
	}

//clase hija extende a clase padre 
	// parte de tiempo maximo 4 secundos
	public void waitElementToDisapear(WebElement ele) throws InterruptedException // corta
	{
		Thread.sleep(1000);
		//espera que aparezcan y desaparezcan
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

}

//llama a los que son comunes con wait, disapear, aperto
