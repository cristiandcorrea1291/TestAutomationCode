package seccion7;

import java.time.Duration;
import java.util.List; 
import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V58HandlingAutosugestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 58. Handling AutoSuggestive dropdowns using Selenium
		
		/* Una AUTOSUGGESTIVE DROPDOWN O LISTA DESPLEGABLE AUTOCOMPLETADA es un componente de interfaz de usuario común en 
		 * aplicaciones web y aplicaciones que proporciona sugerencias o resultados coincidentes mientras el usuario 
		 * escribe en un campo de entrada  o selección
		 *  Este tipo de componente es ayudar al usuario a encontrar la opción correcta de una lista larga de posibles 
		 selecciones de manera más eficiente
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Autosuggestive dropdown COUNTRY
		//Encontrar la lista COUNTRY y enviarle un texto "india"
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); 

		Thread.sleep(3000); 

		//traverse parent to child using CSS
		//This selector help to extract the locator of all the options displayed in the COUNTRY box or autoggesdtive dropdown box
		//"li[class='ui-menu-item'] a"
		//traemos esos valores y lo guardamos en la variable "options"
		//ahora la variable options de tipo lista tiene todas las opciones qque se presenten al agregar un input en el autosuggestive dropdrow o Lista Country
		//lista de tipo web element llamada options
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 

		
		
		//Se iteraran las opciones encontradas al buscar con la lista country
		//y se validara  sí esta concuerda con nuestro requerimiento "ind"
		//Se usa un Enhanced For o For Mejorado
		// Se marca o pick una opcion y esa opcion se guardará en la variable "option"
		//el return type de option es un WebElement
		for(WebElement option :options) { 
			//extraer el texto de la opcion marcada con option.getText()
			//y se verifica si es igual a "India" (ignorando mayúsculas y minúsculas con equalsIgnoreCase).
			//Si la opción actual tiene el texto "India", se hace clic en esa opción con option.click() 
			//y luego se sale del bucle usando break.
			if (option.getText().equalsIgnoreCase("India")) {

				option.click(); //. Esto significa que una vez que se encuentra y hace clic en la opción "India", 
								//el bucle se detendrá y no continuará iterando a través de las opciones restantes.
				System.out.println("La opción seleccionada es: " +option );
				break;
				} 
			System.out.println("Salimos del bucle for, ya que hay coincidencia en la opcion buscada y seleccionada");
		}
		
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
		
		
		
	}

}
