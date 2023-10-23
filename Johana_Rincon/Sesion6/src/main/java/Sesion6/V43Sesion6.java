package Sesion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V43Sesion6 {

	public static void main(String[] args) throws InterruptedException {
		
		//CREACION DE VARIABLE 
		
		//automatizar una pagina web login 
		//WebDriverManager.chromedriver().setup();
		//web driver es la interface
		// new=ChromeDriver() clase
		//driver objeto 
		WebDriver driver = new ChromeDriver();//crea una clase
		String name ="Emely Herrera PARTE 3";
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//tiempo de espera
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//ingresa a la url
		driver.findElement(By.id("inputUsername")).sendKeys("prueba 1 Johana");//correo
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//la clave
		driver.findElement(By.className("signInBtn")).click();//accion de click
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//muestra el error en consola
	

		//el link olvide la contraseña 
	   driver.findElement(By.linkText("Forgot your password?")).click();
	   //paso dos  vuelve a ingresar con otros usuario
	   
	   // tiempo de espera
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//registra el nombre input 1 del nombre 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Johana Cespedes");
		
		//registra el correo electronico
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rinconjoahana2014@gmail.com");
		//limpia la caja de texto
		//driver.findElement(By.xpath("//input[@type=' text'][2]")).clear();
		//registra el correo en  css 
		//telefono del hijo Posicion3 
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("345");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//video 6
		driver.findElement(By.className("go-to-login-btn")).click();
		//<button class="go-to-login-btn">Go to Login</button>
		System.out.println("linea de regreso al link ");
		
		//<input type="text" placeholder="Username" id="inputUsername" value="">
	
		//# ccs a dos formas estilos clase o
		//id 
  
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//<input type="password" placeholder="Password" name="inputPassword" value="">
		Thread.sleep(2000);
		
		//Ingresa a con otro usuario y da clic en el boton de recordar clave. 
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		//COMPARA  mensaje de texto
	//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		String textoReal = driver.findElement(By.tagName("p")).getText();
		System.out.println("Texto real: " + textoReal);
		Assert.assertEquals(textoReal, "* Incorrect username or password");
		
		
		//COMPARA EL VALOR el nombre de Emely Herrera PARTE 3
		

		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		//COMPARA EL VALOR el nombre de Emely Herrera PARTE 3
		//Assert.assertEquals(driver.findElement(By.xpath("h2")).getText(), "Hello" + name + ",");
		
		// video 42
		Thread.sleep(2000);
		//ingresa al boton de salir	Logout Salir a la pagina inicio	
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();
		}
	
	//video 43 
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
		return password;

	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.

	//0th index - rahulshettyacademy

	//1st index - to Login.





		}


	}
	