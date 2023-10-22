package seccion7;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V68HandlingJavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//VIDEO 68:Handling Java Alerts using Selenium Webdrive
		
		
		//switch the existing driver to alert and you can accept it
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//texto que quiero ingresar a la caja de texto lo guardo en la variable tipo string llamada "text"
		String text="Katherine Melissa";

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(5000);
		//locator que usare para enviar el texto al edit box del elemento "ENTER YOUR NAME" html en la pagina
		driver.findElement(By.id("name")).sendKeys(text);

		
		//Botón ALERT
		//Encontrar el boton alert y hacer clic en él
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		//Manipular la ventana POP up
		//usar el metodo Swicht.to para pasar del modo selenium 
		//es decir del driver browser al contexto de la alerta
		//cuando hago el switch del browser a la alerta, selenium podra acceder a las alertas presentes en la pagina web
		//antes de aceptar la alerta, con el get.Text traigo/grabo u obtengo el texto de la alerta
		System.out.println(driver.switchTo().alert().getText());
		//aceptar la ventana o aleta haciendo clic en el botón ACCEPT u OK de la alerta pop up
		driver.switchTo().alert().accept();

		
		
		//BOTON CONFIRM
		//encuentro y hago clic en el boton CONFIRM
		driver.findElement(By.id("confirmbtn")).click();
		//traigo e imprimo el mensaje de la alerta
		System.out.println(driver.switchTo().alert().getText());
		//Marcar el boton CANCEL de la ventana modal o alerta
		driver.switchTo().alert().dismiss();
		
		
		
		//Cerrar
		driver.quit();
		
	}

}
