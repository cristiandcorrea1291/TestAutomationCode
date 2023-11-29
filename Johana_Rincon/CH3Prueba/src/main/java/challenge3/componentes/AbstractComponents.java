package challenge3.componentes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {


	//para habilitar el "driver"
	
	WebDriver driver; //aqui viene el driver que se invoca con el super(); desde el cosntructor del landingpAGE

	public void AbstractComponent(WebDriver driver) {
		this.driver = driver; //A la instancia local asignele este driver. Estanos asignandolo aquí  al tomarlo de la pageobject
		PageFactory.initElements(driver, this); //PageFactory.initElements(lo que quiero enviar , la driver class actual);
		
	}
	
	
	//1. Esperar a que un elemento aparezca
	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		//System.out.println("Apareció el mensaje del producto agregado al carrito") ;
		

	}	
	
	
	
	//2. Esperar a que un elemento DESAPAREZCA  (video 162)
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException {
		//para que ejecute mas rapido se ´puede usar solo el thread sleep, en ligar del wait
		Thread.sleep(1000);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.invisibilityOf(ele));
		//System.out.println("Desapareció el mensaje del producto agregado al carrito") ;
		
	}	
	
}
