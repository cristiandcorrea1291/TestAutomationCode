package sesion18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extractComponents.AbstractComponent;

import java.util.List;

public class CartPage extends  AbstractComponent  {
    
    private WebDriver driver;//
    
    @FindBy(css = ".cartSection h3")//nombre del producto adidas original
    List<WebElement> productTitles;

    @FindBy(css = ".totalRow button")//boton donde se agregan todos los productos Checkout
   WebElement checkoutEle;

  

    public CartPage(WebDriver driver) {//constructor 
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));Assert.assertTrue(match)
    public Boolean verifyProductDisplay(String productName) {
        Boolean match = productTitles.stream()
                .anyMatch(product -> product.getText().equals(productName));
        return match;
    }
    
    public  CheckOutPage goToCheckout() 

    {
    	checkoutEle.click();
    	return new CheckOutPage(driver);
    }
}


/*  iterar atraves de los productos
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		// ANYMATCH cualquier coincidencia
		boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		System.out.println("itera a traves de todos los productos selecionados y busca el nombre y compara si es verdadero");
		// boton de pago
		driver.findElement(By.cssSelector(".totalRow button")).click();
		System.out.println("click en el boton del chechout");
*/
