package challenge3.pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginaLeave extends PrincipalPage {

	public PaginaLeave(WebDriver driver) {
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

		// LEAVE PAGE u pagina de permisos
		principalPage.hacerClicEnEnlaceLeave();

		// 1. Configurar LEAVE PERIODS

		 leavePeriodsMenu();
		 CreateLeavePeriod();

		// 2. ENTITLEMENTS -> ADD ENTITLEMENTS
		// AddMenu(); //(debe ir para cualquiera de los dos ADD)
		// 2.1 ADD
		// AddEntitlementIndivual(); //FORMA 1 + AddMenu();

		// AddMenu();
		// AddEntitlementMultiple(); //FORMA 2 + AddMenu();

		// 3. LEAVE LIST (MENU)
		// 3.1 SEARCH
		// buscarVac();

		// 3.2 APPROVE
		// AprobarVac(); //desde la tabla principal

		// 3.3 REJECT
		// RejectVac();//desde la tabla principal

	} // fin del MAIN

	// -------------------------------------------------------------------------------------------
	public static void leavePeriodsMenu() {

		// Encontrar el elemento del menú "Configure " y hacer clic
		WebElement entitlementsMenu = driver.findElement(By.xpath("//span[contains(text(), 'Configure ')]"));
		entitlementsMenu.click();
		System.out.println("Ingresamos al menú CONFIGURE del NAVBAR ");
		// Ahora, puedes seleccionar una opción específica del menú "Entitlements", por
		// ejemplo,'Leave Period'
		WebElement addEntitlementsOption = driver.findElement(By.xpath("//a[contains(text(), 'Leave Period')]"));
		addEntitlementsOption.click();
		System.out.println("Ingresamos al submenú LEAVE PERIOD");

	}

	public static void CreateLeavePeriod() {
		System.out.println("Ingresamos un NUEVO LEAVE PERIOD");

		// INPUT START MONTH
		// Encontrar el elemento del mes
		// WebElement monthDropdown =
		// driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
		// monthDropdown.click();
		// List<WebElement> monthOptions =
		// driver.findElements(By.cssSelector("div.oxd-select-wrapper
		// div.oxd-select-text"));

		// Encontrar el elemento del mes
		WebElement monthDropdown = driver
				.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]//div[@class='oxd-select-text-input']"));
		// Hacer clic para abrir la lista desplegable de meses
		monthDropdown.click();
		// Encontrar todos los elementos de la lista desplegable de meses
		List<WebElement> monthOptions = driver
				.findElements(By.xpath("(//div[@class='oxd-select-wrapper'])[1]//div[@class='oxd-select-text-input']"));
		// Seleccionar un mes al azar
		Random random = new Random();
		int randomIndex = random.nextInt(monthOptions.size());
		WebElement selectedMonth = monthOptions.get(randomIndex);
		selectedMonth.click();
		// Obtener el texto del mes seleccionado
		String monthText = selectedMonth.getText();
		// Imprimir el texto del mes seleccionado
		System.out.println("Para el Input START MONTH seleccionamos el mes: " + monthText);

		/*
		 * //INPUT START DATE // Encontrar el elemento del día WebElement dayDropdown =
		 * driver.findElement(By.
		 * xpath("//div[@class='oxd-select-text-input'][contains(text(), '01')]"));
		 * //WebElement dayDropdown = driver.findElement(By.
		 * xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"
		 * ));// Hacer clic para abrir la lista desplegable de días dayDropdown.click();
		 * // Encontrar todos los elementos de la lista desplegable de días
		 * List<WebElement> dayOptions = driver.findElements(By.
		 * cssSelector("div.oxd-select-wrapper div.oxd-select-text")); // Seleccionar un
		 * día al azar Random randomDay = new Random(); int randomIndexDay =
		 * randomDay.nextInt(dayOptions.size()); WebElement selectedDay =
		 * dayOptions.get(randomIndexDay); selectedDay.click(); // Obtener el texto del
		 * día seleccionado String dayText = selectedDay.getText(); // Imprimir el texto
		 * del día seleccionado
		 * System.out.println("Para el Input START DAY seleccionamos el día: " +
		 * dayText);
		 */

		// INPUT START DATE
		// Encontrar el elemento del día
		// WebElement dayDropdown =
		// driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		WebElement dayDropdown = driver
				.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]//div[@class='oxd-select-text-input']"));
		dayDropdown.click();
		// Encontrar todos los elementos de la lista desplegable de días
		List<WebElement> dayOptions = driver.findElements(By.cssSelector("div.oxd-select-wrapper div.oxd-select-text"));
		// Seleccionar un índice aleatorio
		Random randomDay = new Random();
		int randomIndexDay = randomDay.nextInt(dayOptions.size());
		// Obtener el día seleccionado
		WebElement selectedDay = dayOptions.get(randomIndexDay);
		String dayText = selectedDay.getText();
		// Hacer clic en el día seleccionado
		selectedDay.click();
		// Imprimir el texto del día seleccionado
		System.out.println("Para el Input START DAY seleccionamos el día: " + dayText);

		// BOTON SAVE
		// Encontrar el botón Save por su clase
		WebElement saveButton = driver
				.findElement(By.cssSelector("button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
		// Hacer clic en el botón Save
		saveButton.click();
		System.out.println("Hicimos clic en el botón SAVE");

		// IMPRIMIR MENSAJE DE GUARDADO
		WebElement msjGuardado = driver.findElement(By.className("oxd-text--toast-message"));
		System.out.println(msjGuardado.getText());

		System.out.println("Fin del CreateLeavePeriod() o el crear un Leave Period");

	}

	// -------------------------------------------------------------------------------------------
	public static void AddMenu() {
		// Encontrar el elemento del menú "Entitlements" y hacer clic
		WebElement entitlementsMenu = driver.findElement(By.xpath("//span[contains(text(), 'Entitlements')]"));
		entitlementsMenu.click();
		System.out.println("Ingresamos al menú ENTITLEMENTS del NAVBAR ");
		// Ahora, puedes seleccionar una opción específica del menú "Entitlements", por
		// ejemplo, "Add Entitlements"
		WebElement addEntitlementsOption = driver.findElement(By.xpath("//a[contains(text(), 'Add Entitlements')]"));
		addEntitlementsOption.click();
		System.out.println("Ingresamos al submenú ADD ENTITLEMENTS ");
		System.out.println("Fin del  AddMenu() o el ir al Menú Entiltements -> Add Entitlements");

	}

	// -------------------------------------------------------------------------------------------
	public static void AddEntitlementIndivual() {
		// Radio button INDIVIDUAL EMPLOYEE
		// driver.findElement(By.className("oxd-switch-wrapper")).click();

		// INPUT EMPLOYEE NAME
		// Encontrar el input para el nombre
		WebElement nombreInput = driver.findElement(By.cssSelector(".oxd-autocomplete-text-input input"));
		nombreInput.sendKeys("n"); // Ingresar texto en el input
		nombreInput.click();
		WebElement firstOption = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		firstOption.click();
		System.out.println("Ya seleccione una opcion de la busqueda en EMPLOYEE NAME");

		// INPUT LEAVE TYPE ARROW 1
		WebElement permitType = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		permitType.click();
		// Click on vacation element
		WebElement vacationElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[5]"));
		vacationElement.click();
		System.out.println("Seleccionamos la opc VACATION para el LEAVE TYPE ");

		// INPUT LEAVE PERIOD ARROW 2
		WebElement permitPeriod = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		permitPeriod.click();
		// Click on vacation element
		WebElement periodElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		periodElement.click();
		System.out.println("Seleccionamos la una opc de la lista para el LEAVE PERIOD ");

		// INPUT ENTITLEMENT
		// Genera un número aleatorio entre 1 y 15
		int numeroRandom = new Random().nextInt(15) + 1;
		// Convierte el número a cadena (String)
		String numeroComoTexto = Integer.toString(numeroRandom);
		// Localiza el elemento por su XPath
		WebElement inputElement = driver.findElement(By.xpath(
				"//div[@class=''][@data-v-957b4417='']//input[@class='oxd-input oxd-input--active'][@data-v-1f99f73c='']"));
		// Ingresa el número aleatorio en el campo de entrada
		inputElement.sendKeys(numeroComoTexto);
		System.out.println("Enviamos un número al input ENTITLEMENT");

		// BOTON SAVE
		// Encontrar el botón Save por su clase
		WebElement saveButton = driver
				.findElement(By.cssSelector("button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
		// Hacer clic en el botón Save
		saveButton.click();
		System.out.println("Hicimos clic en el botón SAVE");

		// MODAL BOTON CONFIRM
		WebElement buttonConfirm = driver.findElement(
				By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-button-margin"));
		buttonConfirm.click();
		System.out.println("Se hizo clic en el botón Confirm.");

		// IMPRIMIR MENSAJE DE GUARDADO
		WebElement msjGuardado = driver.findElement(By.className("oxd-text--toast-message"));
		System.out.println(msjGuardado.getText());

		System.out.println("Fin del  AddEntitlementIndivual()para ingresar un Entiltement INDIVIDUAL");

		// TOGGLE CREATE USER AND PASSWORD
		// driver.findElement(By.className("oxd-switch-wrapper")).click();

		// Input FROM DATE
		// FromDate("2023-11-29");
		/*
		 * WebElement fromDateFecha = driver.findElement(By.
		 * cssSelector("div.oxd-date-wrapper input.oxd-input:nth-child(1)"));
		 * fromDateFecha.sendKeys("2023-11-26"); // Ingresa la fecha deseada
		 */

		// Input TO DATE
		// ToDate("2023-12-05");
		/*
		 * WebElement ToDateFecha = driver.findElement(By.
		 * cssSelector("div.oxd-date-wrapper input.oxd-input:nth-child(2)"));
		 * ToDateFecha.sendKeys("2023-11-26"); // Ingresa la fecha deseada
		 */

	}

	// -------------------------------------------------------------------------------------------
	public static void AddEntitlementMultiple() {

		// Marcar el radio button "Multiple Employees"
		// Encuentra el radio button por su valor dentro del label
		WebElement radioButton2 = driver.findElement(By.xpath("//label[input[@type='radio' and @value='1']]"));
		radioButton2.click();
		System.out.println("Se hizo clic en el radio button MULTIPLE EMPLOYEES.");

		// INPUT LOCATION - ARROW 1
		WebElement locationArrow = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		locationArrow.click();
		// Click on vacation element
		WebElement locationOpcElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		locationOpcElement.click();
		System.out.println("Seleccionamos la opc 3 DE LA LISTA LOCATION ");

		// INPUT SUB UNIT - ARROW 2
		WebElement subunitArrow = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		subunitArrow.click();
		// Click on vacation element
		WebElement subunitOpcElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		subunitOpcElement.click();
		System.out.println("Seleccionamos la opc 2 DE LA LISTA SUBUNIT ");

		// INPUT LEAVE TYPE - ARROW 3
		WebElement permitType = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
		permitType.click();
		// Click on vacation element
		WebElement vacationElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[6]"));
		vacationElement.click();
		System.out.println("Seleccionamos la opc VACATION para el LEAVE TYPE ");

		// INPUT LEAVE PERIOD - ARROW 4
		WebElement permitPeriod = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]"));
		permitPeriod.click();
		// Click on vacation element
		WebElement periodElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[3]"));
		periodElement.click();
		System.out.println("Seleccionamos la una opc de la lista para el LEAVE PERIOD ");

		// INPUT ENTITLEMENT
		// Genera un número aleatorio entre 1 y 15
		int numeroRandom = new Random().nextInt(15) + 1;
		// Convierte el número a cadena (String)
		String numeroComoTexto = Integer.toString(numeroRandom);
		// Localiza el elemento por su XPath
		WebElement inputElement = driver.findElement(By.xpath(
				"//div[@class=''][@data-v-957b4417='']//input[@class='oxd-input oxd-input--active'][@data-v-1f99f73c='']"));
		// Ingresa el número aleatorio en el campo de entrada
		inputElement.sendKeys(numeroComoTexto);
		System.out.println("Enviamos un número al input ENTITLEMENT");

		// Verificar si se muestra el mensaje "Matches no employee"
		if (isMatchesNoEmployeeDisplayed()) {

			// BOTON SAVE
			// Encontrar el botón Save por su clase
			WebElement saveButton = driver.findElement(
					By.cssSelector("button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
			// Hacer clic en el botón Save
			saveButton.click();
			System.out.println("Hicimos clic en el botón SAVE");

			// MODAL BOTON "OK"
			// Ejecutar código para el botón "OK" del modal
			WebElement okButtonConfirm = driver.findElement(By.xpath("//button[contains(text(), 'Ok')]"));
			okButtonConfirm.click();
			System.out.println("Se hizo clic en el botón OK porque no encontró coincidencias.");
		} else {

			// BOTON SAVE
			// Encontrar el botón Save por su clase
			WebElement saveButton = driver.findElement(
					By.cssSelector("button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
			// Hacer clic en el botón Save
			saveButton.click();
			System.out.println("Hicimos clic en el botón SAVE");

			// MODAL BOTON CONFIRM
			/*
			 * // Encuentra el botón por su clase y realiza clic en él // Encuentra el botón
			 * por su XPath y realiza clic en él //WebElement buttonC =
			 * driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
			 * WebElement buttonC = driver.findElement(By.cssSelector(
			 * "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-button-margin"
			 * )); buttonC.click(); System.out.println("Se hizo clic en el botón Confirm.");
			 */

			// SI HAY coincidencias - BOTON CONFIRM DEL MODAL
			// Espera a que el botón "Confirm" sea cliclable
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement confirmButton = wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector(".oxd-overlay .oxd-button--secondary.orangehrm-left-space")));
			WebElement buttonElement = driver
					.findElement(By.cssSelector(".oxd-overlay .oxd-button--secondary.orangehrm-left-space"));
			// Realiza alguna acción con el elemento, por ejemplo, hacer clic en él
			buttonElement.click();
			System.out.println("Se hizo clic en el botón Confirm.");

			// ... más código ...
		}

		// IMPRIMIR MENSAJE DE GUARDADO
		WebElement pElement = driver.findElement(By.className("oxd-text--toast-message"));
		// Imprime el texto del elemento <p>
		System.out.println("Texto del elemento <p>: " + pElement.getText());
		System.out.println("Fin del AddEntitlementIndivual() para ingresar un Entitlement MULTIPLE");

	}

	// Método para verificar si se muestra el mensaje "Matches no employee"
	private static boolean isMatchesNoEmployeeDisplayed() {
		try {
			WebElement matchesNoEmployee = driver.findElement(By.xpath("//p[contains(text(), 'Matches no employee')]"));
			return matchesNoEmployee.isDisplayed();
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			// Manejar la excepción si el elemento no está presente o ha cambiado
			return false;
		}
	}

	// -------------------------------------------------------------------------------------------
	public static void FromDate(String fecha) {
		// Localiza el elemento del campo de fecha por su clase
		WebElement campoFecha = driver.findElement(By.cssSelector("div.oxd-date-wrapper input.oxd-input:nth-child(1)"));

		// Ingresa la fecha en el campo de entrada
		campoFecha.sendKeys(fecha);
	}

	public static void ToDate(String fecha) {
		// Localiza el elemento del campo de fecha por su clase
		WebElement campoFecha = driver.findElement(By.cssSelector("div.oxd-date-wrapper input.oxd-input:nth-child(2)"));
		// Ingresa la fecha en el campo de entrada
		campoFecha.sendKeys(fecha);
	}

	// -------------------------------------------------------------------------------------------
	public static void buscarVac() {
		// Input FROM DATE
		// FromDate("2023-11-26");
		// Input TO DATE
		// ToDate("2023-12-25");
		// Input STATUS -> [3]PENDIENTE DE APROBACION - PENDING APPROVAL
		WebElement dropdownStatus = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
		dropdownStatus.click();
		// Click onTIPO DE PERMISO element, child::div)[6] -> CAN-Vacation
		WebElement statusEnabledElement = driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[6]"));
		statusEnabledElement.click();
		// Click on DISABLED element
		// WebElement statusDisabledElement =
		// driver.findElement(By.xpath("(//div[@role='listbox']//child::div)[2]"));
		// statusDisabledElement.click();
		System.out.println("Ya seleccione una opcion de la lista STATUS");

		// Boton SEARCH
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println("Se hizo clic en el botón SEARCH");

		// Realiza el scroll hacia abajo usando JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);"); // Ajusta el valor de 1000 según sea necesario

		System.out.println("Fin del buscarVac() para BUSCAR VACACIONES");

	}

	// -------------------------------------------------------------------------------------------
	public static void AprobarVac() {
		System.out.println("\nVamos a ubicar la tabla para  APROBAR las Vacaciones usuario desde la tabla principal");
		// Localiza el elemento por su XPath
		// WebElement elemento =
		// driver.findElement(By.xpath("//div[@class='oxd-table-row
		// oxd-table-row--with-border']"));
		// WebElement elemento =
		// driver.findElement(By.xpath("//div/div[@class='oxd-table-header-cell
		// oxd-padding-cell oxd-table-th']"));
		WebElement elemento = driver
				.findElement(By.xpath("(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]"));
		// Realiza scroll hasta el elemento
		scrollToElement(driver, elemento);

		WebElement cellActionsElement = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
		// WebElement approveButton =
		// driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--label-success.oxd-table-cell-action-space"));
		WebElement approveButton = driver.findElement(By.xpath(
				"(//div/button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])[3]"));
		System.out.println("Localiza el boton APROBAR");
		approveButton.click();
		System.out.println("\nHizo clic al botón APROBAR");

		// IMPRIMIR MENSAJE DE BORRRADO
		WebElement userBorrado2 = driver.findElement(By.className("oxd-text--toast-message"));
		System.out.println("El mensaje de APROBADO O CAMBIO DE ESTADO es :");
		System.out.println(userBorrado2.getText());

		System.out.println("Fin del AprobarVac() para APROBAR VACACIONES");
	}

	// -------------------------------------------------------------------------------------------
	public static void RejectVac() {
		System.out.println("\nVamos a ubicar la tabla para RECHAZAR las Vacaciones usuario desde la tabla principal");

		// Localiza el elemento por su XPath
		// WebElement elemento =
		// driver.findElement(By.xpath("//div[@class='oxd-table-row
		// oxd-table-row--with-border']"));
		WebElement elemento = driver
				.findElement(By.xpath("//div/div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th']"));
		// Realiza scroll hasta el elemento
		scrollToElement(driver, elemento);

		WebElement cellActionsElement = driver.findElement(By.xpath("//div[@class='oxd-table-cell-actions']"));
		// Localiza el elemento del botón "Rechazar" por su XPath
		// WebElement rejectButton =
		// driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--label-danger.oxd-table-cell-action-space"));
		WebElement rejectButton = driver.findElement(By.xpath(
				"(//div/button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space'])[3]"));
		System.out.println("Localiza el boton APROBAR");
		rejectButton.click();
		System.out.println("\nHizo clic al botón RECHAZAR");

		// IMPRIMIR MENSAJE DE BORRRADO
		WebElement userBorrado2 = driver.findElement(By.className("oxd-text--toast-message"));
		System.out.println("El mensaje de RECHAZADO O CAMBIO DE ESTADO es :");
		System.out.println(userBorrado2.getText());

		System.out.println("Fin del RejectVac() para RECHAZAR VACACIONES");
	}
	// -------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------
	// Scroll down function using JavaScript Executor
	public static void scrollToElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	// -------------------------------------------------------------------------------------------

}
