package sesion18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated constructor stub

		// variable del producto a selecionar
		String productName = "ZARA COAT 3";
//crea la instancia del chromdriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// tiempo implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// abre la url
		driver.get("https://rahulshettyacademy.com/client/");
		// pagina del constrcutor
		// LadingPage LadingPage = new LadingPage(driver);//enviamos un argumento de
		// esta
		//	 LandingPag
		// clase
		System.out.println("ingresa a ala url");

		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.id("login")).click();

		System.out.println("ingresa al login ingresar");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// selecionamos todos los elementos de la lista
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		// tiempos explicitos
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		System.out.println("seleciona toda la lista de productos");

		// V153
		// la logica para agregar el producto
		// utiliza para filtrar elementos en una colección llamada products.
		// Los elementos de la colección tienen un método getText() que se utiliza para
		// obtener su texto.
		// La expresión seleccionará solo los elementos cuyo texto sea igual a "ZARA
		// COAT 3".
		// Es importante asegurarse de que la cadena de texto en el método

		// selecciona unicamente el del nombre
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(null);

		System.out.println("valida el filtro y busca el nombre del producto");

		// v154
		// ir al carrito
		// dejar el espacio last-of-type selecciona el último botón dentro de todos los
		// elementos que tienen la clase .cart-body
		// solo para version 1.8 properties
		// busca todos los elemetos del boton añadir al carro
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		System.out.println("ingresa añade al carro el producto selecionado");

		// v155
		// Anadir al carrito
		// Tiempo hasta que se visible elemento
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		// esperar ng-animating
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

		System.out.println("espera el tiempo para que desaperezca las animaciones y da clic en el carro");

		// v156
		// iterar atraves de los productos

		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		// ANYMATCH cualquier coincidencia
		Boolean match = cartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertEquals(true, match);

		System.out.println(
				"itera a traves de todos los productos selecionados y busca el nombre y compara si es verdadero");

		// boton de pago
		driver.findElement(By.cssSelector(".totalRow button")).click();
		System.out.println("click en el boton del chechout");

//pagina seleccion del pais china
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		driver.findElement(By.xpath("//button[contains(@class,'ta-item')][2]")).click();
		// driver.findElement(By.xpath("(//button[@class='btn w-10
		// rounded'])[1]")).click();

		// driver.findElement(By.cssSelector("a.action__submit")).click();
		System.out.println("seleciona china");

		// asociando el ejecutado java

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.action__submit').click();");
		System.out.println("Hice clic en el boton Place Order para CONFIRMAR EL PEDIDO/ORDEN");
		// Traer , comparar e Imprimir el mensaje de THANKSYOU FOR THE ORDER
		// Selector .hero-primary
		// lo que obtengo de la pagina
		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		System.out.println("el texto que obtengo de la pagina es:" + confirmMessage);

		// con el texto que voy a comparar con el
		// confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER");

		// Si ambos son iguales , la assetion pasara= true....en caso contrario veremos
		// un error en la consola
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		System.out.println("La assertion es TRUE...el texto de la pagina es el esperado segun la comparación");

		// Cerrar navegador
		System.out.println("Cerrando el browser");
		// driver.quit();

	}

}
