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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahultshettyacademy.pageobjects.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	
	//VIDEO 168 //al  ser publico otras clases puede acceder al
	public LandingPage landingPage;
	
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
	
	// con la anotación @BeforeMethod,estoy organizando el código de manera que 
	//la configuración necesaria se realice automáticamente antes de cada prueba
	//se ejecutará primero, y nos llevará a la landingpage (donde se inciializa e driver)
	@BeforeMethod (alwaysRun=true) //v171 usamos el always=run para asegurarnos que ejecute el metodo, porque hicimos un grupo para probar las agrupaciones y ejecucion de un solo metodo con el tesng.xml
	public LandingPage launchApplication() throws IOException {
		driver = initializeDriver();
		landingPage = new LandingPage(driver); //una vez se inicalice el obhjeto se activará la varibale que inicializará el driver
		landingPage.goTo();
		System.out.println("Ingresé a la página web");
		return landingPage;
	}
	
	//v171 usamos el always=run para asegurarnos que ejecute el metodo, porque hicimos un grupo para probar las agrupaciones y ejecucion de un solo metodo con el tesng.xml
	@AfterMethod (alwaysRun=true)
	public void tearDown() {
		// Cerrar navegador
		System.out.println("Cerrando el browser");
		//driver.quit();
		driver.close();
	}
	
}


/*

public class BaseTest {
	
	//donde sea que el driver sea creado (chrome, edge, firefox) le estamos asignando diectamete a la variable global
	//esta variable global tiene acceso a todo DENTRO DE ESTA CLASE "BaseTest "
	public WebDriver driver; 
	
	
	public WebDriver initializeDriver() throws IOException {
		
		//V166 
		//properties classs
		Properties prop = new Properties();
		//convertir el archivo GLobal/FATA.PROPERTIES  a un objeto InputStream
		////conver the properties file into input stram object
		//FileInputStream fis = new FileInputStream("C:/Users/KURREGO/eclipse-workspace/Seccion20/src/main/java/rahulshettyacademy/resources/Global/Data.properties");
		
		//como encontrar el location op path del proyecto Local DINAMICAMENTE
		//System.getProperty("user.dir")+"/src.........." -> para NO generar error y encontrar el path o ruta del projecto con el metodo 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//rahulshettyacademy//resources//Global//Data.properties");
		//aqui se esta esperando enviar un objeto tipo InputStream
		prop.load(fis);
		
		
		//Vamos a extraer una propiedad del archivo o file "Global/Data.properties" al BASE TEST
		//así se obtien el valor presete en blobal properties de forma inteligente del FILE al BASE TEST
		//y lo guardamos en la variable browserName
		String browserName = prop.getProperty("browser");
		
		
		//SÍ el browser que tenemos aquí (en la variable browserName" es igual a "chrome"
		//entonces continuemos y usemos la logica deChrome para invocar el browser
		if(browserName.equalsIgnoreCase("browser")) {
			//Configurar el controlador del navegador y crear una instancia del navegador
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();//donde sea que el driver sea creado (chrome, edge, firefox) le estamos asignando diectamete a la variable global

		}
		else if(browserName.equalsIgnoreCase("edge")) {// si el browser es igual a "Edge"
			//Edge Browser
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();//donde sea que el driver sea creado (chrome, edge, firefox) le estamos asignando directamete a la variable global
		}
		else if(browserName.equalsIgnoreCase("firefox")) {// si el browser es igual a "Edge"
			//Firefox Browser
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();//donde sea que el driver sea creado (chrome, edge, firefox) le estamos asignando directamete a la variable global
		}
		
		//implicit wait y maximize window browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	
	//video 167
	//metodo de tipo landing page
	public LandingPage launchApplication() throws IOException {
		
		driver = initializeDriver();
		
		//ir a la pagina 
		LandingPage landingPage = new LandingPage(driver);//crea el objeto landigPage
		landingPage.goTo();	//ingresa a la pagina segun la url del metodo goTo
		System.out.println("Ingresé a la pagina web");
		return landingPage;//retorna un objeto landingpage
		
	}
	
	

}
*/

