package seccion10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V90Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EJERCICIO:Ingresar al Iframe y traer el texto de la caja MIDDLE
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Ir a la pagina web - pagina padre
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		
		//url del cuadro verde "Free Access to InterviewQues/ResumeAssistance/Material"
		driver.findElement(By.cssSelector(".blinkingText")).click(); 
		
		
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId] 

		Iterator<String>it = windows.iterator(); 

		String parentId = it.next(); 

		String childId = it.next(); 

		driver.switchTo().window(childId); //Entrar al contexto de la pagina hijo o Child
		
		
		//Imprimir el parrafo del que se va a extraer el email
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		
		//Extraer el texto del párrafo
		driver.findElement(By.cssSelector(".im-para.red")).getText(); 
		//Extaer EMAIL
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]; 

		driver.switchTo().window(parentId); //Entrar al contexto de la pagina padre 
		
		
		//Enviar Email
		driver.findElement(By.id("username")).sendKeys(emailId); 
		
		
		//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
		System.out.println("Cerrando ventana");
		driver.quit();
		
	}

}
