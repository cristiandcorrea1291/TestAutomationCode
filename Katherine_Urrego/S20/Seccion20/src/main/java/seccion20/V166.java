package seccion20;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V166 {

	//VIDEO 166. Creating Base Test which holds Common Test configuration methods
	
	
	//videos anteriores al 166 , en esos vimos como crear un objeto desde la clase de de un page object , encapsulandolo desde un test
	
	
	//ahora vamos a crear un Base Test que configurara los detalles y propiedades globales del browser
	
	//el archivo AbstractCompoment es el qiue contiene todo el contenido que es reusable
	//como confiurar el driver,invocar el browser,  esperas, ,maximizar el navegador, cerrar el navegador etc
	//las coass que son comunes en un test
	
	//Tambien tenemos los Pages Objects en el MAIN DE JAVA, porque no está relacionado a un test
	//Los pages objectd solo nos proporcionan los locators y action methos que necesitamos para llevar a cabo la automatización
	
	
	//Pero aun NO tenemos el test dentro de ello
	//por eso esos  packages esta en el main java
	
	
	
	//BASE TEST 
	//BEST TEST RELATED FILES
	//vamos a crrar los Tets components (asi como lo hicmos con los componenten en el main java)
	
	//1.sobre el src/test/java .>> creamos un nuevo package que llamare "rahultshettyacademy.TestComponents
	//el punto significa que se crea un sub folder del folder padre -> folderpadre.subfolder
	
	//2. Creamos una clase dentro del subfolder con el nombre BaseTest
	//3. creamos el metodo initializeDriver
	
	//ypu can maintain gloabal properties file where you store which browser you want to execute (because ypu can use firefox, edege,)
	
	
	//4. vamos a configurar las propiedades globales, Setup global properties
	//how to sert properties class can read the properties
	//and decide the runtime
	//on which browser your framework hast to execute test cases
	
	//en MAIN JAVA vamos a crear otro package "rahulshettyacademy.resources"
	//dentro de ese archivo vamos a crea un FILE así: ir a -> new -> file ->Global/Data.properties
	//En el archivo Global/Data properties vamos a configurar las prouedadee
	//browser=chrome .... the entitre framework will run in chrome
	/*
	 browser=chrome
	 */
	
	//en la clase BaseTest en el metodo se va aleer el file GlobalData.properties con el siguiente codigo
	/*
	 		//properties classs
		Properties prop = new Properties();
		//convertir el archivo GLobal/FATA.PROPERTIES  a un objeto InputStream
		////conver the properties file into input stram object
		FileInputStream fis = new FileInputStream("C:/Users/KURREGO/eclipse-workspace/Seccion20/src/main/java/rahulshettyacademy/resources/Global/Data.properties");
		//aqui se esta esperando enviar un objeto tipo InputStream
		prop.load(fis);
	 * */
	
	//con eso seramas facil extrraer calquie valor desde esa propieda global
	
	
	
	
	
	
	
	
	
	//ASI INICIALIZAMOS EL DRIVER (codigo del BaseTest"
	/*
	 
	//donde sea que el driver sea creado (chrome, edge, firefox) le estamos asignando diectamete a la variable global
	//esta variable global tiene acceso a todo DENTRO DE ESTA CLASE "BaseTest "
	public WebDriver driver; 
	
	
	public void initializeDriver() throws IOException {
		
		//V166 
		//properties classs
		Properties prop = new Properties();
		//convertir el archivo GLobal/FATA.PROPERTIES  a un objeto InputStream
		////conver the properties file into input stram object
		//FileInputStream fis = new FileInputStream("C:/Users/KURREGO/eclipse-workspace/Seccion20/src/main/java/rahulshettyacademy/resources/Global/Data.properties");
		
		//como encontrar el location op path del proyecto Local DINAMICAMENTE
		//System.getProperty("user.dir")+"/src.........." -> para NO generar error y encontrar el path o ruta del projecto con el metodo 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/rahulshettyacademy/resources/Global/Data.properties");
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
		
	}
	 */
	
	
	
	
	
}
