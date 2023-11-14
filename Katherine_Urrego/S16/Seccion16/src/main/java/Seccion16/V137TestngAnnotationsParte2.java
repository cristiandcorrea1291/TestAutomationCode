package Seccion16;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class V137TestngAnnotationsParte2 {
	
	//video 137. TestNG Annotations part - 2
	
	
	/*SUITE is something which have whole test in XML
	 * So all these folders come under SUITE
	 * 
	 * @BeforeSuite that will execute before it executes any test in this xml file
	 
	 So when you say AfterSuite, it only will execute ONCE all the test completed in all the test folders
	 Because Suite is a parent to the test folders
	 
	 So when you use BeforeSuite and AfterSuite that means so execute no matter how many test folders, class files you have,
	that wil be atjen as a priority and then AfterSuite will be the end after all your automation suite is done execution
	
	@BeforeSuite if you wanrt diferen URLS in QA environment to run test cases
	For every releade you will get one new enviromnet
	So that evironment details you will set in your BeforeSuite
	
	*/
	@Test
	public void pruebabf() { //method
	
		System.out.println("\nen el video 137");//automationc code insede a method ===test
		
	}
	
	//BeforeSUite it for an SPECIFIC FOLDER
	@BeforeSuite
	public void BfSuite() {
		System.out.println("V137. I am number 1 using BeforeSuite annotations\n");
	}
	
	//@AfterSuite
	@AfterSuite
	public void UsandoAftersuite() {
		System.out.println("V137. Using AFTERSuite annotations\n");
	}
	
	
	
	//BeforeMethod  y AfterMethod
	//It specific for CLASS FILE
	//IT is NOT specifir dor xml
    
	//Despues de cada metodo de cada clase en particular el codigo del BeforeMehtod se ejecutara para cada seccion de codigo, es decir ANTES/Before de cada methodo
	@BeforeMethod
    public void setUp() {
		System.out.println("\nV137. codigo de prueba con el BeforeMethod");
    }

    @Test
    public void prueba1() {
    	System.out.println("V137. codigo de prueba 1");
    }

    @Test
    public void prueba2() {
    	System.out.println("V137. codigo de prueba 2");
    }
    
	@BeforeMethod
    public void beforeevery() {
		System.out.println("\nV137. codigo con anotacion BeforeMethod en medio de los metodos de prueba 2 y 3, I will execute BEFORE EVERY test method in the class V137 ");
    }
    
	@AfterMethod
    public void aftereevery() {
		System.out.println("\nV137. codigo con anotacion AfterMethod en medio de los metodos de prueba 2 y 3, I will execute AFTER EVERY test method in the class V137 ");
    }
    
    @Test
    public void prueba3() {
    	System.out.println("V137. codigo de prueba 3");
    }

    @AfterMethod
    public void tearDown() {
    	System.out.println("V137. codigo de prueba con e AfterMethod");
    }
	
	
    
    /*Archivo XML 
     
     <?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	
	<suite name="Suite">
		
		<test thread-count="5" name="Personal Loan">
			<classes>
	
				<class name="Seccion16.V131RunningTestcasesInTestNG" />
				
				<class name="Seccion16.V132ImportanceXmlFileInTestingConfig" />
				<methods>
					<include name="Demo" />
				</methods>
				<class name="Seccion16.V133PrioritizingTestCasesWithTestNg" />
				<class name="Seccion16.V136TestngAnnotationsParte1" />
				<class name="Seccion16.V137TestngAnnotationsParte2" />
			</classes>
		</test> <!--
		Test -->
	
	
		<test name="Car loan">
			<classes>
				<class name="Seccion16.V135ExecutingTestCasesAtPackageLevelWregex" />
				<methods>
					<exclude name="Mobile.*" />
				</methods>
			</classes>
		</test> <!--
		Test -->
	
	</suite> <!--
	Suite --> 
     * */
    
    
    
    
    
    
    
    
    
    
    
	/*
	 * What is the difference between BeforeMethod and BeforeTest?
	 * 
	 * BeforeTest annotation depends upon the testing the XML file, based upon the test ==FOLDER scope

	 * BeforeMethod annotation is nothing but SPECIFIC to CLASS FILE and it executes before each and every method
	 **/
	
	
	
	/*
	 * En TestNG, @BeforeSuite y @AfterSuite son anotaciones que se utilizan para
	 * definir métodos que se ejecutan antes y después de la ejecución de todas las
	 * pruebas en una suite de pruebas. Estos métodos son útiles para realizar
	 * configuraciones globales o tareas de limpieza que son aplicables a un
	 * conjunto completo de pruebas.
	 * 
	 * @BeforeSuite: 
	 * Este método se ejecuta una vez antes de que se ejecuten todas
	 * las pruebas en la suite de pruebas. 
	 * Puedes usarlo para realizar configuraciones globales, como la inicialización de recursos compartidos, la
	 * carga de datos iniciales o la configuración de variables de entorno comunes necesarias para todas las pruebas en la suite.
	 * 
	 * @AfterSuite: 
	 * Este método se ejecuta una vez después de que todas las pruebas
	 * en la suite de pruebas se hayan ejecutado. 
	 * Se utiliza para tareas de limpieza o para liberar recursos compartidos utilizados en las pruebas, como cerrar
	 * conexiones de bases de datos, detener servidores, generar informes finales,
	 * entre otros.
	 * 
	 * Aquí hay un ejemplo de cómo se pueden usar @BeforeSuite y @AfterSuite en un
	 * archivo XML de prueba de TestNG:
	 * 
	 
			@BeforeSuite 
			public void setUpSuite() {
				 // Configuración global antes de que se ejecuten las pruebas en la suite 
				  // Ejemplo: Inicialización de recursos comunes, configuración de variables globales, etc. 
			}
				 
				 
			@AfterSuite 
			public void tearDownSuite() { 
				 // Tareas de limpieza o finalización después de que se ejecuten todas las pruebas en la suite 
				 // Ejemplo: Cierre de recursos compartidos, generación de informes finales, etc.
			} 
		 
	 

	 En resumen,
	 @BeforeSuite y @AfterSuite son útiles cuando necesitas realizar acciones específicas antes y después de la ejecución de todas las
	 pruebas en una suite de pruebas, lo que te permite tener un control más amplio sobre la configuración y la limpieza de tu entorno de pruebas.
	 
	 */
	
	
	/*
	 * Las anotaciones @BeforeMethod y @AfterMethod en TestNG se utilizan para
	 * definir métodos que se ejecutan antes y después de cada método de prueba
	 * (test method) en una clase de prueba. Esto te permite realizar
	 * configuraciones específicas antes de cada prueba y tareas de limpieza después
	 * de cada prueba. Estas anotaciones son útiles cuando necesitas configurar un
	 * estado específico para cada prueba o realizar tareas de limpieza que son
	 * relevantes solo para una prueba individual.
	 
	 
	 * @BeforeMethod: 
	 * El método anotado con @BeforeMethod se ejecuta antes de cada
	 * método de prueba en la clase de prueba. Puedes utilizarlo para realizar
	 * configuraciones específicas que sean necesarias para cada prueba, como la
	 * inicialización de datos o la configuración del entorno.
	 
	 
	 * @AfterMethod: 
	 * El método anotado con @AfterMethod se ejecuta después de cada
	 * método de prueba en la clase de prueba. Puedes usarlo para realizar tareas de
	 * limpieza después de que se haya ejecutado cada prueba, como restaurar el
	 * estado original, liberar recursos o cerrar conexiones.
	
			public class EjemploPruebas {
			
			    @BeforeMethod
			    public void setUp() {
			        // Configuración específica antes de cada prueba
			        // Ejemplo: Inicialización de datos, configuración del entorno, etc.
			    }
			
			    @Test
			    public void prueba1() {
			        // Código de la primera prueba
			    }
			
			    @Test
			    public void prueba2() {
			        // Código de la segunda prueba
			    }
			
			    @AfterMethod
			    public void tearDown() {
			        // Tareas de limpieza después de cada prueba
			        // Ejemplo: Restaurar el estado original, liberar recursos, etc.
			    }
			}

	 
	 * En resumen,
	 *  @BeforeMethod y @AfterMethod son útiles para realizar
	 * configuraciones específicas y tareas de limpieza antes y después de cada
	 * prueba individual en una clase de prueba, lo que permite un mayor control
	 * sobre el entorno y el estado de las pruebas.
	 * 
	 */
	
	
}
