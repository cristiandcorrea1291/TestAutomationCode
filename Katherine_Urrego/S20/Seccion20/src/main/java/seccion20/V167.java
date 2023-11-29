package seccion20;

public class V167 {

	//VIDEO:167. Initialize Driver and create utility to launch App with BeforeMethod annotation
	
	/*
	 * sugiere que se está configurando el WebDriver y se está creando una utilidad
	 * para iniciar la aplicación antes de cada método de prueba utilizando la
	 * anotación @BeforeMethod de TestNG.
	 * 
	 * Lo que generalmente se hace en este contexto es:
	 * 
	 * Inicializar el WebDriver (por ejemplo, ChromeDriver, FirefoxDriver, etc.) en
	 * un método de configuración, que a menudo se anota con @BeforeMethod. Esto
	 * garantiza que se inicie antes de la ejecución de cada método de prueba.
	 * 
	 * Configurar el navegador, como definir opciones y configuraciones específicas.
	 * 
	 * Crear una UTILIDAD o una CLASE DE CONFIGURACIÓN n para cargar la aplicación o
	 * la página web que se va a probar. Esto puede implicar navegar a una URL
	 * específica o realizar acciones adicionales de configuración.
	 * 
	 * Utilizar la instancia del WebDriver y la utilidad de configuración en los
	 * métodos de prueba para realizar pruebas en la aplicación web.
	 * 
	 */
	
	
	//min 5:12
	//Se ha modificado el código de SubmitOrderTest de Public static void main a TestNG (al incorporar la anotacion @Test)
	// tambien se ha removió e BOILERPLATE CODE  de crear el driver,
	//ya que en el metodo "LaunchApplication" en el BaseTest se configura el driver, se inicia la aplicacion y podemos ingresar/comenzar directamente en el login
	
	
	/*
	 * Que es Boiler Plate Code , "boilerplate code" puede incluir la inicialización
	 * de variables, la configuración de entornos, la gestión de recursos, la
	 * importación de bibliotecas, la definición de estructuras de datos básicas y
	 * otras tareas que deben realizarse antes de que comience la lógica principal
	 * del programa. En muchos casos, el "boilerplate code" se puede encapsular en
	 * funciones, clases o métodos para simplificar el código principal y mejorar la
	 * legibilidad y la reutilización del código.
	 * 
	 */
	
	
	//EJERCICIO DEL VIDEO
	/*
	 
	package rahultshettyacademy.TestComponents;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeMethod;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	import rahultshettyacademy.pageobjects.LandingPage;
	
	public class BaseTest {
		
		public WebDriver driver;
		
		public WebDriver initializeDriver() throws IOException {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//rahulshettyacademy//resources//Global//Data.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			return driver;
		}
		
	
		public LandingPage launchApplication() throws IOException {
			driver = initializeDriver();
			LandingPage landingPage = new LandingPage(driver);
			landingPage.goTo();
			System.out.println("Ingresé a la página web");
			return landingPage;
		}
	}
		 
	 */
	
}
