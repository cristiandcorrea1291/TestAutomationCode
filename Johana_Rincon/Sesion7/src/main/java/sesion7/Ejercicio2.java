package sesion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();//crea una clase
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");//Ingreso a la pagina
	//	registro de nombre, correo,contraseña
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("johana");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rincon@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("MiContraseña");
		Thread.sleep(2000);
		
		//check Check me out if you Love IceCreams check
		//busca elemento de la casilla de verificacion checbox que es un objeto de webelement.
		//accion el click
	
		WebElement checkbox = driver.findElement(By.id("exampleCheck1"));
        checkbox.click();
        
        //busca elemento select en la pagina su atibuto es id
        WebElement selectElement = driver.findElement(By.id("exampleFormControlSelect1"));
        //crea un objeto que permite interacturar con el elemento
        Select select = new Select(selectElement);
        //usa el metodo visibletext para selecionar female de la lista desplegable
        select.selectByVisibleText("Female");
		//el elemento encontrado se guarda en la variable datafield/ se usa para fechas por su id name
        WebElement dateField = driver.findElement(By.name("bday"));
        // Opcional: También puedes usar By.id("ID_del_Campo")
        
        //boton de radio
        //se crea la clase con una varibale 
       // WebElement checkestudiante = driver.findElement(By.cssSelector("label.form-check-label[for='inlineRadio1']"));
      //  checkestudiante.click();
        WebElement CheckEstudiante=driver.findElement(By.cssSelector("#inlineRadio1"));
        CheckEstudiante.click();
        // Ingresa una fecha en el campo de fecha (reemplaza con la fecha que desees)
        dateField.sendKeys("2023-10-19"); // Formato AAAA-MM-DD
        
        
        //div[class='alert alert-success alert-dismissible']
        //boton submit verde el ultimo
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();
    	Thread.sleep(2000);
    	//confirmacion de mensaje
    	//	System.out.println(driver.findElement(By.xpath("div[class='alert alert-success alert-dismissible']").getText());
    	System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
    	
       driver.quit();
       /*
       	driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("rahul");
		driver.findElement(By.name("email")).sendKeys("hello@abc.com");
	 	driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
	 	driver.findElement(By.id("exampleCheck1")).click();
	 	WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	 	Select abc = new Select(dropdown);
	 	abc.selectByVisibleText("Female");
	 	driver.findElement(By.id("inlineRadio1")).click();
	 	driver.findElement(By.name("bday")).sendKeys("02/02/1992");
	 	driver.findElement(By.cssSelector(".btn-success")).click();
	 	System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
       */
      
		
	}

}
