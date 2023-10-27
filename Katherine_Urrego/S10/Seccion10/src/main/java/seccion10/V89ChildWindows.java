package seccion10;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V89ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// video 89. Live Example on working with Child windows
		
		//EXERCISE:
		//Capture the email ID FROM the child window and paste it in your parent window username field
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		//url del cuadro verde "Free Access to InterviewQues/ResumeAssistance/Material"
		driver.findElement(By.cssSelector(".blinkingText")).click(); 

		
		//driver.getWindowHandles(); ->traer el id de las ventasnas abiertas durante la automatización (en este caso las dos ventanas)
		//Set<String> windows -> sitting las dos ventanas en el objeto "windows"
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId] 
		
		//Iteretor -> it's a method to pull the id from this set data structure
		//this variable "it" extract the values present in the set collection
		Iterator<String>it = windows.iterator(); 
		// .next()->help to get the next index of your set

		//whaterver hat the set has, is grabbed by simply calling the iterator method on the set object
		String parentId = it.next(); // .next()->help to get the next index of your set

		String childId = it.next(); // .next()->help to get the next index of your set
		 //Switch to CHILD window 
		//window(childId -> pasamos el string ID de la ventana en el argumento
		driver.switchTo().window(childId); 
		
		
		//Imprimir el párrafo de la child web page
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); 
		
		//Extraer un párrafo de la child web page
		driver.findElement(By.cssSelector(".im-para.red")).getText(); 
		
		//Extraer el email escrito dentro del texto del párrafo

		//.getText()		-> obtiene el texto visible contenido en el elemento encontrado....."Please email us at mentor@rahulshettyacademy.com with below template to receive response"
		//.split("at")[1]	-> se divide el texto en partes usando "at" como delimitador. Esto significa que el texto se dividirá en dos partes: 
							//la parte antes de "at" y la parte después de "at".
		 					//Se accede a la segunda parte (índice 1) después de dividir el texto. Esto es lo que viene después de "at".
		//.trim()			-> para eliminar cualquier espacio en blanco adicional alrededor de la parte extraída.
		//.split(" ")[0]; 	->,el texto se divide nuevamente utilizando un espacio en blanco como delimitador, y se obtiene la primera parte (índice 0) de la nueva división. 
							//Esto es lo que viene antes del primer espacio en blanco después de "at".
							//mentor@rahulshettyacademy.com , with, below ,template, to, receive, response
							//[0] = mentor@rahulshettyacademy.com 
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]; 
		
		//ir a la pagina padre 
		driver.switchTo().window(parentId); 
		//Pegar o ingresar el email guardado en la variable tipo string "emailId" y enviarlo al input
		driver.findElement(By.id("username")).sendKeys(emailId); 
		
		
		//cerrar el navegador y todas las ventanas o pestañas que estén abiertas en ese navegador.
		System.out.println("Cerrando ventana");
		driver.quit();
		
	}

}
