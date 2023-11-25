package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;

public class V53DropdownLoopingUi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 53:Updated lecture on latest Dropdown looping UI
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

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
		
		driver.quit();
		
		
		
		
	}

}
