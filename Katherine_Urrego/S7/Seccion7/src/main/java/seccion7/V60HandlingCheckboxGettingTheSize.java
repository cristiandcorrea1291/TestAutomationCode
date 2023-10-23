package seccion7;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V60HandlingCheckboxGettingTheSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 60. Handling Checkbox and getting the size of them with Selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//VIDEO 60
		//Cómo Manipular CHECKBOXES
		//hacer clic en el check box Senior Citizen
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//para ver si el checkbox esta seleccionado o no
		//si retorna TRUE === checkbox seleccionado, False en caso contrario/casilla NO seleccionada
		System.out.println("\n¿El checkbox fue seleccionado T o F? ");
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Imprimir el numero de checkboxes que existen/presentes en la pagina
		//locator comun tipo css para los checkboxes--> input[type='checkbox']
		//OJO---- Usamos el plural de findElements
		System.out.println("\n\n El número de checkboxes presentes en la pagina es: ");
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		System.out.println("\n\n ");
		//VIDEO 58
		//En la lista desplegable PASSENGERS
		//Caja o campo de la lista desplegable
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);//con esto no tendre fallas por sincronización
				
		//CICLO WHILE
		//Crear un loop o bucle que se repita n veces
		//el ciclo se repite continuamente hasta que la condicion se torne falsa
		/*
				 * Declarar variable e inicializarla 
				 * i=0;
		 While (true){
			 codigo
			 i++    el incremento o decremento del contador			
			}
		*/
				
		/*
			int i = 1;
			while(i<5){ //para que el +icon sume hasta 5 personas
			//Boton de Incremento o + plus icon
					driver.findElement(By.id("hrefIncAdt")).click();
					System.out.println("La cantidad de personas incluidas es: " + i);
					i++;
				}
				
		*/
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
		for(int i=1; i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println("Ejecución del ciclo for");
		}
				
		//boton DONE
		driver.findElement(By.id("btnclosepaxoption")).click();
				
				
		//
		System.out.println("\n Usar un Assert para comparar el valor/contenido seleccionado en la lista desplegable con otro que yo eliga");
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				
				
		System.out.println("\n\n Imprimo la opción marcada en el dropdrown despues del ciclo for, al final de todo el programa");
		//Imprimir el texto de la casilla de la lista desplegable con el valor indicado al final del ciclo for
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
		System.out.print("\n\nCerrando automatización");
		driver.quit();
		
					

	}

}
