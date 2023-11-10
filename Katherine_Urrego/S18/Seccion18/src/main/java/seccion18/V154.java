package seccion18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VIDEO 154: Selenium Program to retrieve product and Add to Cart based on Java Streams
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//ir a la pagina
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println("Ingresé a la pagina web");

		//login
		driver.findElement(By.id("userEmail")).sendKeys("katherine-melissa.urrego@capgemini.com");
		driver.findElement(By.id("userPassword")).sendKeys("Katherine2023*");
		driver.findElement(By.id("login")).click();
		System.out.println("Inicie sesión el pagina web");
		
		//Obtenr todos los articulos y guardarlos en una lista
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		

		
		
		//VIDEO 154
		//iterar todos y cada uno de los productos
		//y validar/y verifique para qué producto se muestra el titulo del producto respectivamente
		
		//Uso de STREAM method

		//products.stream().filter(product->product.getText().equals("ZARA COAT 3"));
		
		//xpath -> //b
		//css -> b
		
		//what does this exactly store?
		//product, this one, we are catching in one variable, okay?
		//At the same time, we have to tell what if it does not return at all.
		//That's why there is another conjunction method,
		// orElse, that means if it returns nothing,
		//then return simply null. So, this null will be stored in this variable.
		//So, this variable now stores the produc
		//which with the text which is having this ZARA COAT 3.
		
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		
		//Add to cart button
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		
		
		
	}

}
