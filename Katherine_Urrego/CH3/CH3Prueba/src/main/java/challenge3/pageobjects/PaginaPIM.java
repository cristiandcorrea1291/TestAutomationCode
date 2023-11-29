package challenge3.pageobjects;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginaPIM extends PrincipalPage {

	public PaginaPIM(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {

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

		// TIME PIM
		principalPage.hacerClicEnEnlacePIM();

		// Esperar a que aparezca el elemento
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1 CREAR ROL DE USUARIO
		//botonAddpim();
		//llenarFormularioAddPim();
		
		

		// 2. EDITAR USUARIO (ROL)
		//EditarUsuario();
		//LlenarformEditar();
		


		// 3. BUSCAR USUARIO
		//buscarPIM();

		//4. ELIMINAR USUARIO
		//EliminarUsuarioIconoBarril();
		//EliminaDesdeBotonIconoTrash();
		
	    }//FIN MAIN

		// -------------------------------------------------------------------------------------------
		public static void botonAddpim() {
			WebElement btnAddPIM = driver
					.findElement(By.cssSelector("button.oxd-button--medium.oxd-button--secondary:nth-child(1)"));
			btnAddPIM.click();
			System.out.println("Hizo clic en el boton +Add ");
		}

		// -------------------------------------------------------------------------------------------
		public static void llenarFormularioAddPim() {
			// CREAR EMPLEADO - ADD EMPLOYEE
			driver.findElement(By.xpath("(//li/a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
			//FIRST NAME
			driver.findElement(By.name("firstName")).sendKeys("ANA");
			//MIDDLE NAME 
			driver.findElement(By.name("middleName")).sendKeys("MARIA");
			//LAST NAME
			driver.findElement(By.name("lastName")).sendKeys("RAMOS");

			// Limpia el campo de entrada
			driver.findElement(By.xpath("(//div/div/div/div/div/input[@class='oxd-input oxd-input--active'])[1]"))
					.clear();

			// Input EMPLOYEE ID
			driver.findElement(By.xpath("(//div/div/div/div/div/input[@class='oxd-input oxd-input--active'])[1]"))
					.sendKeys("9");

			// TOGGLE CREATE USER AND PASSWORD
			// Radiobutton ENABLED
			driver.findElement(By.className("oxd-switch-wrapper")).click();


			// INPUT USERNAME aleatorio
			String nombreUsuarioAleatorio = RandomStringUtils.randomAlphabetic(5).toLowerCase();
			WebElement inputCampo = driver.findElement(By.xpath(
					"(//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active'])[2]"));
			inputCampo.sendKeys(nombreUsuarioAleatorio);
			System.out.println("Se ingresó info al campo USERNAME: " + nombreUsuarioAleatorio);

			// INPUT PASSWORD
			WebElement passwordInput = driver
					.findElement(By.cssSelector("div[data-v-957b4417] input[type='password'][data-v-1f99f73c]"));
			String passwordValue = "Tucontraseña1@"; // Cambiar por la contraseña deseada
			passwordInput.sendKeys(passwordValue);
			System.out.println("Se ingresó la contraseña");

			// INPUT CONFIRMAR CONTRASEÑA
			WebElement passwordInput2 = driver.findElement(By.xpath("(//div/input[@type='password'])[2]"));
			passwordInput2.sendKeys("Tucontraseña1@");

			// BOTON SAVE - GUARDAR
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			System.out.println("Hizo clic en el botón SAVE");
		}

		// -------------------------------------------------------------------------------------------
		public static void EditarUsuario() {
			System.out.println("\nVamos a ubicar la tabla para EDITAR la información del usuario");
			// Localiza el elemento por su XPath
			WebElement elemento = driver
					.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']"));
			scrollToElement(driver, elemento);

			// Localiza el elemento por su XPath
			WebElement cellActionsElement = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
			// Dentro del elemento 'oxd-table-cell-actions', localiza el botón con el iconode lápiz
			WebElement pencilButton = cellActionsElement.findElement(By.xpath(
					".//button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-pencil-fill']"));
			// Haz clic en el botón de lápiz
			pencilButton.click();
			System.out.println("Se dió clic al boton con el LAPIZ ");
			System.out.println("Fin del EditarUsuario().");
			
		}

		public static void LlenarformEditar() throws InterruptedException {
			System.out.println("Llenando formulario en edicion para los PIM");
			// CREAR EMPLEADO - ADD EMPLOYEE
			driver.findElement(By.xpath("(//li/a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
			//FIRST NAME
			driver.findElement(By.name("firstName")).sendKeys("MARIA");
			//MIDDLE NAME 
			driver.findElement(By.name("middleName")).sendKeys("JOSE");
			//LAST NAME
			driver.findElement(By.name("lastName")).sendKeys("LOPEZ");
			
			WebElement saveButton = driver.findElement(By.cssSelector(
					"div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space:nth-child(3)"));
			// Realiza scroll hasta que el botón sea visible
			scrollToElement(driver, saveButton);
			// Espera un breve momento para asegurarse de que el scroll se haya completado
			Thread.sleep(500);
			// Realiza clic en el botón "Save"
			saveButton.click();
			System.out.println("Se hizo scroll y clic en el botón Save.");

			// IMPRIMIR MENSAJE DE EDITADO
			WebElement editGuardado = driver.findElement(By.className("oxd-text--toast-message"));
			System.out.println("El mensaje es: ");
			System.out.println(editGuardado.getText());
			
			System.out.println("Fin del LlenarformEditar()");
		}

		// -------------------------------------------------------------------------------------------
		
		
		
		//-------------------------------------------------------------------------------------------
		public static void buscarPIM() {
		
			//Input EMPLOYEE STATUS
			WebElement dropdownStatus = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
			dropdownStatus.click();
			// Click on ENABLED element
			WebElement statusOpcdElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[5]"));
			statusOpcdElement.click();

			System.out.println("Ya seleccione una opcion de la lista EMPLOYEE STATUS");
			
			/*
			//Input INCLUDE
			WebElement dropdownInclude = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
			dropdownInclude.click();
			// Click on ENABLED element
			WebElement includeOpcElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
			includeOpcElement.click();
			// Click on DISABLED element
			//WebElement statusDisabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
			//statusDisabledElement.click();
			System.out.println("Ya seleccione una opcion de la lista INCLUDE input");
			*/
			
			// Boton SEARCH
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			System.out.println("Se hizo clic en el botón SEARCH para buscar");
			
			
			//Hacer scroll para ver la tabla con los datos buscados
			WebElement elemento = driver.findElement(By.xpath("//div/div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th']"));
			// Realiza scroll hasta el elemento
			scrollToElement(driver, elemento);
			System.out.println("Ya vemos la tabla con los resultados de busqueda");
			
			System.out.println("Fin del buscarPIM()");

		}
		

		//-------------------------------------------------------------------------------------------
		public static void EliminarUsuarioIconoBarril() {
			System.out.println("\nVamos a ubicar la tabla para ELIMINAR desde la tabla principal el primer registro");
			// ELIMINAR USUARIO
			WebElement iconoEliminar = driver.findElement(By
					.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-trash'])[1]"));
			iconoEliminar.click();
			System.out.println("Hicimos clic en el botón Eliminar");
			System.out.println("El Registro Eliminado ha sido eliminado");

			// Cuadro de dialogo o ventana pop up para aceptar y confirmar la eliminación
			// Espera a que el cuadro de diálogo sea visible
			WebElement dialog = new WebDriverWait(driver, Duration.ofSeconds(20))
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
							"//button[contains(@class, 'oxd-icon-button')]/i[contains(@class, 'oxd-icon bi-trash')]")));

			// Hace clic en el botón "Yes, Delete"boton de eliminar final
			WebElement yesDeleteButton = dialog
					.findElement(By.xpath("//div/button/i[@class='oxd-icon bi-trash oxd-button-icon']"));
			yesDeleteButton.click();
			
			 // IMPRIMIR MENSAJE DE BORRRADO
		 	WebElement userBorrado2 = driver.findElement(By.className("oxd-text--toast-message"));
		 	System.out.println(userBorrado2.getText());   

		 	System.out.println("Fin del  EliminarUsuarioIconoBarril()");
		}
		
		// Scroll down function using JavaScript Executor
		public static void scrollToElement(WebDriver driver, WebElement element) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		}
		// -------------------------------------------------------------------------------------------
		
		
		
		public static void EliminaDesdeBotonIconoTrash() {
			
			//Este borrar es para cuando ingresamos ENLACE admin, LA TABLA que se ve de primeras en la pag principal del menu ADMIN
			System.out.println("\nVamos a ubicar la tabla para EDITAR la información del usuario");
			//WebElement botonesAcciones = driver.findElement(By.cssSelector(".oxd-table-cell-actions button[data-v-f5c763eb][data-v-c423d1fa]"));
		    // Localiza el elemento por su XPath
		    //WebElement elemento = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']"));
		   //tabla //div[@class='oxd-table']
		    WebElement elemento = driver.findElement(By.xpath("//div[@class='oxd-table']"));
		    // Realiza scroll hasta el elemento
		    scrollToElement(driver, elemento);
		    System.out.println("Vamos hasta la tabla");
		   	
		    
		    //Cuando permite eliminar el USUARIO
		    // Localiza las celda con las acciones
		    WebElement cellActionsElement2 = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
		    // Dentro del elemento 'oxd-table-cell-actions', localiza el segundo botón
		    WebElement trashButton2 = cellActionsElement2.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-trash'])[1]"));
		    System.out.println("encontro el boton TRASH 2");
		    // Haz clic en el botón
		    trashButton2.click();
		    System.out.println("Dió clic al boton TRASH 2");
		    
			// ALERT O VENTANA DE DIALOGO
			// Hace clic en el botón "Yes, Delete"
			WebElement yesDeleteButtonn = driver.findElement(
					By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin"));
			yesDeleteButtonn.click();
			System.out.println("Se hizo clic en el botón YES,DELECTED del modal");
		    
		 // IMPRIMIR MENSAJE DE BORRRADO
		 	WebElement userBorrado2 = driver.findElement(By.className("oxd-text--toast-message"));
		 	System.out.println(userBorrado2.getText());   

		 	System.out.println("Fin del EliminaDesdeBotonIconoTrash()");
		}

	}
