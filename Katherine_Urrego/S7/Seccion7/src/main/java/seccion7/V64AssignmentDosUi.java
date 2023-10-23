package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V64AssignmentDosUi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Ingresar a la página Web
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		
		
		//Input  Name
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Katherine Melissa");	
		//Input de Email
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("winx@gmail.com");
		//Input de Password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456789");
		System.out.println("Se ingresaron credenciales name, email y password");
		
		//Manipular el CheckBox "Check me out if you Love IceCreams!"
		WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
		//Marcar la opción 
       checkbox.click();
       System.out.println("Se marcó el checkbox \"Check me out if you Love IceCreams!\" ");
        

       //Seleccionar una opcion de la lista Desplegable GENDER por su valor visible
        WebElement selectElement = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Female");
        System.out.println("Se seleccionó la opción de la lista desplegable GENDER");
        
        
        //Marcar el radiobutton STUDENT en EMPLOYMENT STATUS
        WebElement checkestudiante = driver.findElement(By.cssSelector("label.form-check-label[for='inlineRadio1']"));
        checkestudiante.click();
        System.out.println("Se marcó el radiobutton de EMPLOYMENT STATUS");
        
        //Seleccionar y/o activar el campo DATE
        //WebElement dateField = driver.findElement(By.name("bday"));
        WebElement dateField = driver.findElement(By.cssSelector("input[Type='date']"));
        //Ingresar una fecha al campo DATE OF BIRTH
        //Ingresar una fecha con el formato AAAA-MM-DD
        dateField.sendKeys("1997-04-20"); //
        System.out.println("Se ingresó BIRTH DAY");
       
        
        //Enviar Formulario BOTON SUBMIT
        WebElement submitButton = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitButton.click();
        System.out.println("Se dió click en el botón SUBMIT");

        System.out.println("Apareció el siguiente mensaje:");
        //Imprimir el texto de Successfully login div.alert.alert-success.alert-dismissible
        WebElement messageText = driver.findElement(By.cssSelector("div.alert.alert-success"));
        String textoExito = messageText .getText();
        System.out.println(textoExito);
        
        
       System.out.println("Cerrando ventana del browser");
       driver.quit();

	}

}
