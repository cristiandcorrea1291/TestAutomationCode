package challenge3.pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginaTime extends PrincipalPage {
	
	public PaginaTime(WebDriver driver) {
		super(driver);
	}


	public static void main(String[] args) {

		// Configurar el controlador del navegador y crear una instancia del navegador
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

	    // implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	    // maximizar la ventana del navegador
	    driver.manage().window().maximize();

	    // LOGIN PAGE
	    // Crear instancia de la clase login
	    LogIn loginPage = new LogIn(driver);
	    // ir a la pagina web
	    loginPage.goTo();
	    System.out.println("Ingresé a la pagina web");

	    // login usando Action Methods del LogIn
	    PrincipalPage principalPage = loginPage.loginApplication("Admin", "admin123");
	    System.out.println("Inicie sesión en la pagina web");

	    
	    // TIME PAGE
	    principalPage.hacerClicEnEnlaceTime();

	    // Esperar a que aparezca el elemento
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    //EJERCICIOS
	    //1.BUSCAR
	   // BuscarHorasTrabajo();
	    
	    //2. INGRESAR HORAS
	    //BuscarHorasTrabajo();
	    //IngresarHorasTrabajadas();
	    
	    //3.ELIMINAR HORAS
	    EliminarRegistroHorasProyecto();

	    }//fin main
	    
	
	//--------------------------------------------------------------------------------------------------
		public static void BuscarHorasTrabajo() {
			// INPUT EMPLOYEE NAME
			WebElement nombreInput = driver.findElement(By.cssSelector(".oxd-autocomplete-text-input input"));
			nombreInput.sendKeys("l");

			nombreInput.click();

			// Esperar explícitamente para las sugerencias
			WebElement firstOption = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
			System.out.println("encontró UNA OPCION en la lista");
			firstOption.click();
			System.out.println("Se seleccionó una opción de la búsqueda en EMPLOYEE NAME");

			// Realiza el scroll hacia abajo usando JavaScript
			JavascriptExecutor jscroll = (JavascriptExecutor) driver;
			jscroll.executeScript("window.scrollBy(0, 400);"); // Ajusta el valor de 1000 según sea necesario

			// BOTON VIEW
			WebElement BotonView =driver.findElement(By.xpath(("(//button[@type='button'])[4]")));
			System.out.println("encontró el botón VIEW");
			BotonView.click();
			System.out.println("Hizo clic en el botón VIEW");
			
			System.out.println("Fin del BuscarHorasTrabajo() para buscar horas de Trabajo");

		}
		
	public static void IngresarHorasTrabajadas() {
		
		// Localiza el elemento por su XPath
		WebElement elemento = driver.findElement(By.xpath(("//div/button[@class='oxd-button oxd-button--medium oxd-button--ghost']")));
		// Realiza scroll hasta el elemento
		scrollToElement(driver, elemento);
		 System.out.println("Hizo scroll hasta el boton EDITAR");
	      //Boton editar
	      WebElement BotonEditar =driver.findElement(By.xpath(("//div/button[@class='oxd-button oxd-button--medium oxd-button--ghost']")));
	      BotonEditar.click();
	      System.out.println("Hizo clic en el botón EDITAR para INGRESAR nuevas horas");
	      
	    /*  
	   // Localizar el elemento utilizando XPath
	      WebElement inputHora = driver.findElement(By.xpath("(//td[@class='orangehrm-timesheet-table-body-cell --center --duration-input'])[1]"));

	      // Hacer clic en la caja para activarla (puede ser necesario en algunos casos)
	      inputHora.click();
	      
	      // Utilizar Actions para seleccionar y borrar el contenido existente
	      Actions acciones = new Actions(driver);
	      acciones.moveToElement(inputHora)
	              .click()  // Hacer clic para asegurar que la caja está activa
	              .keyDown(Keys.CONTROL)
	              .sendKeys("a")
	              .keyUp(Keys.CONTROL)
	              .sendKeys(Keys.BACK_SPACE)
	              .perform();
	              */
	      
	      
	      //LIMPIAR todas las cajas o casilla donde HAY o TIENEN horas definidas
	   // Asegúrate de ajustar el XPath según tu caso específico
          List<WebElement> inputHorasList = driver.findElements(By.xpath("//td[@class='orangehrm-timesheet-table-body-cell --center --duration-input']"));

          // Iterar sobre la lista de elementos
          for (WebElement inputHora : inputHorasList) {
              // Hacer clic en la caja para activarla
              inputHora.click();

              // Utilizar Actions para seleccionar y borrar el contenido existente
              Actions acciones = new Actions(driver);
              acciones.moveToElement(inputHora)
                      .click()  // Hacer clic para asegurar que la caja está activa
                      .keyDown(Keys.CONTROL)
                      .sendKeys("a")
                      .keyUp(Keys.CONTROL)
                      .sendKeys(Keys.BACK_SPACE)
                      .perform();

              // Aquí puedes realizar más acciones según sea necesario para cada elemento
          }
          System.out.println("Fin del FOR que me LIMPIA los campos de las horas");
          
          
          
          //INGRESAR HORAS en todas las cajas
          List<WebElement> inputIngresarHorasList = driver.findElements(By.xpath("//td[@class='orangehrm-timesheet-table-body-cell --center --duration-input']"));

          // Iterar sobre la lista de elementos
          for (WebElement inputHora : inputHorasList) {
              // Hacer clic en la caja para activarla
              inputHora.click();

              // Asignar un valor aleatorio entre 0 y 8
              int valorAleatorioHoras = new Random().nextInt(9);

              // Utilizar Actions para enviar el valor aleatorio
              Actions acciones = new Actions(driver);
              acciones.moveToElement(inputHora)
                      .sendKeys(Integer.toString(valorAleatorioHoras))
                      .perform();
          }
          System.out.println("Fin del FOR que me ingresa las horas");
          
          
          //BOTON GUARDAR 
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
		    System.out.println("Fin del IngresarHorasTrabajadas() para INGRESAR horas de Trabajo");
		}
	
	//--------------------------------------------------------------------------------------------------

		public static void EliminarRegistroHorasProyecto() {

			// PRIMERO VA EL MET BUSCAR
			// LUEGO LLAMAMOS ESTE METODO

			// 1. Ir al boton VIEW de la tabla principal
			// Realiza el scroll hacia abajo usando JavaScript
			JavascriptExecutor jscroll = (JavascriptExecutor) driver;
			jscroll.executeScript("window.scrollBy(0, 400);"); // Ajusta el valor de 1000 según sea necesario

			// BOTON VIEW
			WebElement BotonView = driver.findElement(By.xpath(("(//button[@type='button'])[4]")));
			System.out.println("encontró el botón VIEW");
			BotonView.click();
			System.out.println("Hizo clic en el botón VIEW");

			// 2. Ir al botón Editar
			// Localiza el elemento por su XPath
			WebElement elemento = driver
					.findElement(By.xpath(("//div/button[@class='oxd-button oxd-button--medium oxd-button--ghost']")));
			// Realiza scroll hasta el elemento
			scrollToElement(driver, elemento);
			System.out.println("Hizo scroll hasta el boton EDITAR");
			// Boton editar
			WebElement BotonEditar = driver
					.findElement(By.xpath(("//div/button[@class='oxd-button oxd-button--medium oxd-button--ghost']")));
			BotonEditar.click();
			System.out.println("Hizo clic en el botón EDITAR para VER el registro de horas");

			// 3.Eliminar con el BOTON TRASH el registro sobre las horas de proyecto
			// Luego damos click en eliminar
			WebElement BotonEliminar = driver.findElement(By.xpath("(//button[contains(@class, 'oxd-icon-button')]/i[contains(@class, 'oxd-icon bi-trash')])[1]"));
			System.out.println("Ubicó el botón TRASH");
			BotonEliminar.click();
			System.out.println("Hizo clic en el botón TRASH");
			

			// 4. Guardar cambios con el botón SAVE
			// BOTON GUARDAR
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("Hizo clic al botón guardar");
			
		    
			 // IMPRIMIR MENSAJE DE BORRRADO
			 	WebElement userBorrado2 = driver.findElement(By.className("oxd-text--toast-message"));
			 	System.out.println("El mensaje de Guardado es :");
			 	System.out.println(userBorrado2.getText());   

			 	System.out.println("Fin del EliminarRegistroHorasProyecto()");
		}
	
	// -------------------------------------------------------------------------------------------
	// Scroll down function using JavaScript Executor
	public static void scrollToElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	// -------------------------------------------------------------------------------------------
	

	    
	
}
