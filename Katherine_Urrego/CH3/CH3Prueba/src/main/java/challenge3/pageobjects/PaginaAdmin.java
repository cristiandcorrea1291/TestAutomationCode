package challenge3.pageobjects;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import challenge3.componentes.AbstractComponents;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginaAdmin extends PrincipalPage {

	public PaginaAdmin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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

    
    // ADMIN PAGE
    principalPage.hacerClicEnEnlaceAdmin();

    // Esperar a que aparezca el elemento
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    
	// 1 CREAR ROL DE USUARIO
	//hacerClicEnBotonAgregar(); //está fallando
    //botonAdd();
	//llenarFormulariosAdmin();
	
	
	// 2. EDITAR USUARIO (ROL)
	//EditarUsuario();
	//LlenarformEditar();
	

	// 3. BUSCAR USUARIO
	//buscarAdm();


	// 4. ELIMINAR USUARIO
	//EliminarUsuarioIconoBarril(); //PRIMERA VERSION elimina el 1er registro
	//EliminarUsuarioCheckbox(); //va solo y funciona desde la pag principal Admin

	
	//EliminaDesdeBotonIconoTrash(); // a la pagina principal y busca el sdo icono trash
    
	} //fin del MAIN

	
	//================================================================================================
	//================================================================================================
    //Ir al botón Agregar - ADD
    //botón Add
    @FindBy(css = "button.oxd-button--medium.oxd-button--secondary:nth-child(1)")
	static
    WebElement botonAdd;
    public static void hacerClicEnBotonAgregar() {
        botonAdd.click();
        System.out.println("Ingresamos a la interfaz para CREAR UN USUARIO - ADMIN");

    }
    
    public static  void botonAdd(){
    	WebElement btnAdd = driver
				.findElement(By.cssSelector("button.oxd-button--medium.oxd-button--secondary:nth-child(1)"));
    	btnAdd.click();
    }
	
    public static void llenarFormulariosAdmin() {

        //INPUT USER ROLE
		// Click on dropdown downarrow element
		WebElement dropdownArrow = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		dropdownArrow.click();
		// Click on ESS element
		WebElement essElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		essElement.click();
		// Click on ADMIN element
		// WebElement addElement
		// =driver.findElement(By.xpath("//div[@role='listbox']//*[contains(text(),'Admin')]"));
		// addElement.click();
		System.out.println("Ya seleccione una opcion de la lista USER ROLE");

		// INPUT EMPLOYEE NAME
		// Encontrar el input para el nombre
		WebElement nombreInput = driver.findElement(By.cssSelector(".oxd-autocomplete-text-input input"));

		nombreInput.sendKeys("l"); // Ingresar texto en el input
		// Hacer clic en el input para mostrar las sugerencias
		nombreInput.click();
		// Esperar explícitamente para las sugerencias
		WebElement firstOption = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		//este sirvió hasta el 20 de noviembre WebElement firstOption = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		// WebElement firstOption =
		// driver.findElement(By.cssSelector(".oxd-autocomplete-suggestion"));
		firstOption.click();
		System.out.println("Ya seleccione una opcion de la busqueda en EMPLOYEE NAME");  
		
		
		//Input STATUS
		WebElement dropdownStatus = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		dropdownStatus.click();
		// Click on ENABLED element
		WebElement statusEnabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		statusEnabledElement.click();
		// Click on DISABLED element
		//WebElement statusDisabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		//statusDisabledElement.click();
		System.out.println("Ya seleccione una opcion de la lista STATUS");
		
        
		/*
		 * // INPUT UserName // Localizar el campo de entrada WebElement inputCampo =
		 * driver.findElement(By.
		 * cssSelector("div[data-v-957b4417] input[data-v-1f99f73c]")); String
		 * datosAIngresar = "kamei"; inputCampo.sendKeys(datosAIngresar);
		 * System.out.println("Se ingresó info al campo USERNAME");
		 * 
		 */
		
		//INPUR USERNAME aleatorio
		// Genera un nombre de usuario aleatorio de 5 caracteres
		String nombreUsuarioAleatorio = RandomStringUtils.randomAlphabetic(5).toLowerCase();
		// Localiza el campo de entrada
		WebElement inputCampo = driver.findElement(By.cssSelector("div[data-v-957b4417] input[data-v-1f99f73c]"));
		// Ingresa el nombre de usuario aleatorio
		inputCampo.sendKeys(nombreUsuarioAleatorio);
		System.out.println("Se ingresó info al campo USERNAME: " + nombreUsuarioAleatorio);
        
        
		// Llenar el campo Password
		WebElement passwordInput = driver.findElement(By.cssSelector("div[data-v-957b4417] input[type='password'][data-v-1f99f73c]"));
		String passwordValue = "Katherine1@"; // Cambiar por la contraseña deseada
		passwordInput.sendKeys(passwordValue);
		System.out.println("Se ingresó info al input PASSWORD");


		// INPUT CONFIRM PASSWORD
		// Localizar el campo Confirm Password
		WebElement confirmarPasswordInput = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		//xpath -> //body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]
		confirmarPasswordInput.sendKeys("Katherine1@");
		System.out.println("Se ingresó Confirm Password: ");


		// Boton SAVE
		// selector css ->button[type='submit']
		// selector xpath //button[contains(@class, 'oxd-button--secondary')]
		WebElement botonSave = driver.findElement(By.xpath("//button[contains(@class, 'oxd-button--secondary')]"));
		botonSave.click();
		System.out.println("Se hizo clic en el botón SAVE");
    }
    
   
  //-------------------------------------------------------------------------------------------
	public static void buscarAdm() {
        /*
		//INPUT USER ROLE
		// Click on dropdown downarrow element
		WebElement dropdownArrow = driver
				.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		dropdownArrow.click();
		// Click on ESS element
		//WebElement essElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		//essElement.click();
		//Click on ADMIN element
		WebElement addElement=driver.findElement(By.xpath("//div[@role='listbox']//*[contains(text(),'Admin')]"));
		addElement.click();
		System.out.println("Ya seleccione una opcion de la lista USER ROLE");
		
		WebElement botonSearch = driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
		botonSearch.click();
		System.out.println("Clic en el boton SUBMIT");
		*/
		
		
		// INPUT EMPLOYEE NAME
		// Encontrar el input para el nombre
		WebElement nombreInput = driver.findElement(By.cssSelector(".oxd-autocomplete-text-input input"));
		nombreInput.sendKeys("l"); // Ingresar texto en el input
		// Hacer clic en el input para mostrar las sugerencias
		nombreInput.click();
		// Esperar explícitamente para las sugerencias
		WebElement firstOption = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		//este sirvió hasta el 20 de noviembre WebElement firstOption = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		// WebElement firstOption =
		// driver.findElement(By.cssSelector(".oxd-autocomplete-suggestion"));
		firstOption.click();
		System.out.println("Ya seleccione una opcion de la busqueda en EMPLOYEE NAME");
		
		
		//Input STATUS
		WebElement dropdownStatus = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		dropdownStatus.click();
		// Click on ENABLED element
		WebElement statusEnabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		statusEnabledElement.click();
		// Click on DISABLED element
		//WebElement statusDisabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		//statusDisabledElement.click();
		System.out.println("Ya seleccione una opcion de la lista STATUS");
		
		// Boton SEARCH
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println("Se hizo clic en el botón SEARCH para buscar");
	
		// Realiza el scroll hacia abajo usando JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);"); // Ajusta el valor de 1000 según sea necesario

	}

	//-------------------------------------------------------------------------------------------
	public static void EditarUsuario() {
		System.out.println("\nVamos a ubicar la tabla para EDITAR la información del usuario");
		//WebElement botonesAcciones = driver.findElement(By.cssSelector(".oxd-table-cell-actions button[data-v-f5c763eb][data-v-c423d1fa]"));
        // Localiza el elemento por su XPath
       WebElement elemento = driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']"));
       //WebElement elemento = driver.findElement(By.cssSelector(".oxd-table-row oxd-table-row--with-border"));
        //oxd-table-row oxd-table-row--with-border
        // Realiza scroll hasta el elemento
        scrollToElement(driver, elemento);
        
        // Localiza el elemento por su XPath
        WebElement cellActionsElement = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
        // Dentro del elemento 'oxd-table-cell-actions', localiza el botón con el icono de lápiz
        WebElement pencilButton = cellActionsElement.findElement(By.xpath(".//button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-pencil-fill']"));
        // Haz clic en el botón de lápiz
        pencilButton.click();
	}
	
	public static void LlenarformEditar() throws InterruptedException {

		// Editar INPUT USER ROLE
		// Click on dropdown downarrow element
		WebElement dropdownArrow = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		dropdownArrow.click();
		// Click on ESS element
		// WebElement essElement =
		// driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		// essElement.click();
		// Click on ADMIN element
		WebElement addElement = driver.findElement(By.xpath("//div[@role='listbox']//*[contains(text(),'Admin')]"));
		addElement.click();
		System.out.println("Editamos lista USER ROLE");
		
		//Editar Input STATUS
		WebElement dropdownStatus = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		dropdownStatus.click();
		// Click on ENABLED element
		WebElement statusEnabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		statusEnabledElement.click();
		// Click on DISABLED element
		//WebElement statusDisabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		//statusDisabledElement.click();
		System.out.println("Editamos STATUS");
		
		
		//CHECKBOX para "Change Password?"
		 // Encuentra el checkbox y hace clic en el
        WebElement checkbox = driver.findElement(By.cssSelector("span.oxd-checkbox-input"));
        checkbox.click();
        System.out.println("Hice clic en el checkbox CHANGE PASSWORD?");
        
		// Llenar el campo Password
		WebElement passwordInput = driver.findElement(By.cssSelector("div[data-v-957b4417] input[type='password'][data-v-1f99f73c]"));
		String passwordValue = "Textoejemplo1"; // Cambiar por la contraseña deseada
		passwordInput.sendKeys(passwordValue);
		System.out.println("Se ingresó info al input PASSWORD");

		// INPUT CONFIRM PASSWORD
		WebElement confirmarPasswordInput = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		//xpath -> //body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]
		confirmarPasswordInput.sendKeys("Textoejemplo1");
		System.out.println("Se ingresó Confirm Password: ");
		

		 //GUARDAR LOS CAMBIOS
		/*
        //WebElement saveButton = driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
        WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        System.out.println("Clic al btn SAVE para guardar los cambios");
        */
        
        WebElement saveButton = driver.findElement(By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space:nth-child(3)"));
        // Realiza scroll hasta que el botón sea visible
        scrollToElement(driver, saveButton);
        // Espera un breve momento para asegurarse de que el scroll se haya completado
        Thread.sleep(500);
        // Realiza clic en el botón "Save"
        saveButton.click();
        System.out.println("Se hizo scroll y clic en el botón Save.");

        
    	// IMPRIMIR MENSAJE DE EDITADO
    	WebElement editGuardado = driver.findElement(By.className("oxd-text--toast-message"));
    	System.out.println(editGuardado.getText());
	}
	
	//-------------------------------------------------------------------------------------------
	public static void EliminarUsuarioIconoBarril() {
		System.out.println("\nVamos a ubicar la tabla para ELIMINAR desde la tabla principal el primer registro");
		// ELIMINAR USUARIO
		WebElement iconoEliminar = driver.findElement(By
				.xpath("(//button[contains(@class, 'oxd-icon-button')]/i[contains(@class, 'oxd-icon bi-trash')])[2]"));
		iconoEliminar.click();
		System.out.println("Hicimos clic en el botón Eliminar");
		// Puedes agregar una confirmación o manejo adicional aquí si es necesario
		System.out.println("Usuario encontrado y eliminado: ");

		System.out.println("El username ha sido eliminado");

		// Cuadro de dialogo o ventana pop up para aceptar y confirmar la eliminación
		// Espera a que el cuadro de diálogo sea visible
		WebElement dialog = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"//button[contains(@class, 'oxd-icon-button')]/i[contains(@class, 'oxd-icon bi-trash')]")));

		// Hace clic en el botón "Yes, Delete"boton de eliminar final
		WebElement yesDeleteButton = dialog
				.findElement(By.xpath("//div/button/i[@class='oxd-icon bi-trash oxd-button-icon']"));
		yesDeleteButton.click();
	}

	//-------------------------------------------------------------------------------------------
	
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
    
    
    /*
	// Localiza las celda con las acciones
	WebElement cellActionsElement = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
	// Dentro del elemento 'oxd-table-cell-actions', localiza el botón por su XPath
	WebElement trashButton = cellActionsElement.findElement(
			By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-trash']"));
	System.out.println("encontro el boton TRASH");
	// Haz clic en el botón
	trashButton.click();
	System.out.println("Dió clic al boton TRASH");

	// IMPRIMIR MENSAJE DE BORRRADO
	WebElement userBorrado = driver.findElement(By.className("oxd-text--toast-message"));
	System.out.println(userBorrado.getText());
	*/
 	
    
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


//-------------------------------------------------------------------------------------------
	
	public static void EliminarUsuarioCheckbox() {
        // Encuentra el checkbox por su clase y realiza clic en él
        WebElement checkbox = driver.findElement(By.cssSelector("span.oxd-checkbox-input"));
        checkbox.click();
        System.out.println("Hice clic en el checkbox superior");
        
        //Click en el botón DELETE SELECTED
        //driver.findElement(By.cssSelector("button[type='button']")).click();
        driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-horizontal-margin")).click();
        System.out.println("Se hizo clic en el botón DELETE SELECTED");
        
        //ALERT O VENTANA DE DIALOGO
		// Hace clic en el botón "Yes, Delete"
		WebElement yesDeleteButtonn =driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin"));
		yesDeleteButtonn.click();
		System.out.println("Se hizo clic en el botón YES,DELECTED del modal");
		
		//IMPRIMIR MENSAJE DE BORRRADO
		WebElement userBorrado = driver.findElement(By.className("oxd-text--toast-message"));
		System.out.println(userBorrado.getText());   
	}
	
	//-------------------------------------------------------------------------------------------
	// Scroll down function using JavaScript Executor
	public static void scrollToElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	//-------------------------------------------------------------------------------------------

}
