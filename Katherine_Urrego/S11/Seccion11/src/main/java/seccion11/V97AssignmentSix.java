package seccion11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V97AssignmentSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Ir a la pagina web
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println("Ingreso a la pagina web");
		
		//CHECKBOX
		//Opciones del checkbox
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
        //traer el texto del checkbox marcado a una variable
        String opciones=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
        System.out.println("Se marco una casilla o checkbox y se obtuvo el texto de la casilla");
        
        
        //Dropdown o lista deplegable
        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
        Select opcionselect = new Select(dropdown);
        opcionselect.selectByVisibleText(opciones);
        System.out.println("Seleccionar la opcion que corresponde de la lista deplegable");
        
        
        //ingresar ENTER NAME
        //driver.findElement(By.xpath("//input[@id='name']")).sendKeys(opciones);
        driver.findElement(By.name("enter-name")).sendKeys(opciones);
        System.out.println("Se ingreso el texto de la opcion al campo ENTER NAME");
        
        
        //Clic en el boton ALERT
        driver.findElement(By.id("alertbtn")).click();
        System.out.println("clic en el boton ALERT");
        
        
        //Cambiar al contexto de la alerta y traer el texto
        String texto =  driver.switchTo().alert().getText();
        System.out.println("Cambiar al contexto de la alerta y traer el texto");
        
       //validar si el texto coincide con las opciones de la lista desplegable
        if(texto.contains(opciones)){
    	 System.out.println("El mensaje de la alerta o pop up es correcto");
        }

        else
        	//Si NO coincide con las opciones la lista deplegable
        	System.out.println("Algo falló en la ejecución");

        
        
    	//Cerrando automatización
    	System.out.println("Cerrando navegador");
    	driver.quit();
    	
    	
	}
	
       
}
