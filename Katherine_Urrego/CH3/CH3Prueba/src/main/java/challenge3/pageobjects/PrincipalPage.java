package challenge3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import challenge3.componentes.AbstractComponents;

public class PrincipalPage extends AbstractComponents{

	static WebDriver driver;
	public PrincipalPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		// super(driver);
		this.driver = driver;// Asigna el driver a la variable de instancia
		PageFactory.initElements(driver, this);
	}
	
	
	//MENU ADMIN
    //Ir al enlace Admin
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
    WebElement enlaceAdmin;
    // Método para hacer clic en el enlace de Admin
    public void hacerClicEnEnlaceAdmin() {
        enlaceAdmin.click();
        System.out.println("Ingresamos al menú ADMIN");
    }
    
    
	//MENU PIM
    //Ir al enlace PIM
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
    WebElement enlacePIM;
    // Método para hacer clic en el enlace de PIM
    public void hacerClicEnEnlacePIM() {
        enlacePIM.click();
        System.out.println("Ingresamos al menú PIM");
    }
    
    
	//MENU LEAVE
    //Ir al enlace LEAVE
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
    WebElement enlaceLeave;
    // Método para hacer clic en el enlace de LEAVE
    public void hacerClicEnEnlaceLeave() {
        enlaceLeave.click();
        System.out.println("Ingresamos al menú LEAVE");
    }
    
	//MENU TIME
    //Ir al enlace TIME
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]")
    WebElement enlaceTime;
    // Método para hacer clic en el enlace de TIME
    public void hacerClicEnEnlaceTime() {
        enlaceTime.click();
        System.out.println("Ingresamos al menú TIME");
    }


	

}
