package seccion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class V43ParseTheString {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Video 43 Parse the String with Java methods to get the password dynamically from the page
		//enviar dinamicamente una contraseña por extraerla y parsing su forgot your password string
		//*******************************************
		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver"); 

		WebDriver driver = new ChromeDriver(); 

		// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver"); 

		// WebDriver driver = new EdgeDriver(); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		String name = "KATHERINE MELISSA";
		//si declaro el metodo STATIC No es necesario crear un objeto de la clase, llamo al metodo directamente
		//si el metodo NO ES STATIC, entonces creo un objeto para esta clase y luego llamo al metodo
		String password = getPassword(driver); 

		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 

		driver.findElement(By.id("inputUsername")).sendKeys(name); 

		driver.findElement(By.name("inputPassword")).sendKeys(password); 

		driver.findElement(By.className("submit signInBtn")).click(); 

		Thread.sleep(2000); 
		//Imprimir el mensaje que aparece despues de iniciar sesión, traermos el texto que hay en la etiqueta p del html
		System.out.println(driver.findElement(By.tagName("p")).getText()); 
		//Assert.assertEquals(one expected , with what you want to compare);
		//si se parecen, el test will pass. If any of them mismatch the test will fail
		//COMO HACER UNA ASSERTION EN EL MENSAJE DEL LOGIN
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); 

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+","); 

		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); 

		driver.close(); 

		
	}
	
	//crear un método para pasar la contraseña
	//Se envía el WebDriver como un input para el método que estamos creando
	//Retorna un string
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{ 
	driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
	driver.findElement(By.linkText("Forgot your password?")).click(); 
	Thread.sleep(1000); 
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
	String passwordText =driver.findElement(By.cssSelector("form p")).getText(); 

	//Please use temporary password 'rahulshettyacademy' to Login. 
	String[] passwordArray = passwordText.split("'"); 

	
	// String[] passwordArray2 = passwordArray[1].split("'"); 
	// passwordArray2[0] 
	String password = passwordArray[1].split("'")[0];
	
	System.out.println("Esto es lo que recoge el arreglo y el split: " + password);
	return password; //send back the password whoever that call this method
	
	//El metodo split divide las palabras, en este ccaso se creo un array que retorna los valores
	//deichi arreglo tiene 2 indexes:
	//0th index - Please use temporary password 
	//1st index - rahulshettyacademy' to Login. 

	//0th index - rahulshettyacademy 
	//1st index - to Login.  

	} 
	

}
