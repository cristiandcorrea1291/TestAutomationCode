package seccion20;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import rahultshettyacademy.pageobjects.LandingPage;

public class V171 {

	//VIDEO171. How to run tests/classes in Parallel & apply Groups using TestNG.xml
	
	//Actualmente y segn el v170 teneos dos test en el archivo testng.xml
	//y cada test toma y/o tiene una clase
	
	
	//1. EJECUTAR TEST EN PARALELO
	//ahora vamos ejecutar estos archivos en PARALELO
	//Entonces en el XML en la etiqueta SUITE vamos a incluir <suite parallel="tests" name="Suite">
	//ya qeu con ese atributo parallel="tests", testNG sabe que NO tiene sentido ejecutar los testcase en secuencia
	//porque se indica que los test se ejecuten EN PARALELO
	
	//CONTINUANDO, al ejecutar el testng.xml ->clic detecho ->Run As -> TestNG Suite
	//se abriran 2 navegadores (para nuestro ejemplo)
	//lo que significa que nuestros test se estan ejecutando en modo PARALELO
	
	/*
	 <?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite parallel="tests" name="Suite">
	  <test thread-count="5" name="Submit Order Test">
	    <classes>
	      <class name="rahultshettyacademy.test.SubmitOrderTest"/>
	    </classes>
	  </test> <!-- Test -->
	  
	    <test thread-count="5" name="Error Validationt">
	    <classes>
	      <class name="rahultshettyacademy.test.ErrorValidationsTest"/>
	    </classes>
	  </test> <!-- Test -->
	  
	</suite> <!-- Suite -->
	 */
	
	
	//Al ejecutar los test en paralelo, nos ayudará a acelerar o ponerle velocidad a las ejecuciones, asi como dar el tiempo rapidamente.
	//------------------------------------------------------------------------------------
	
	
	
	//2. EJECUTAR METODOS EN PARALELO
	//sí queremos ejecutar los metodos del mismo archivo paralelamente, entonces:
	//tengo que seleccionar un parallel = al metodo

	//NOTA
	//por cierto en la etiqueta test hay un thread-count="5", que significa que:
	//5 serpa el maximo de metodos que ejecutara po Java class file
	
	
	//Para hacer esta prueba segun el punto 2 ...
	//tomaremos un metodo de la clase ErrorValidation y un metodo de la clase SubmitOrderTest
	
	
	
	//3. COMO EJECUTAR SELECTIVE TEST
	//Es cuanso NO se quiere ejecutar todos los test, sino uno en particular
	//por ejemplo si quisieramos ejecutar solo el ErrorValidationsTest
	//recordemos el concepto GROUPING asi -> @Test(groups= {"ErrorHandling"})/
	//@Test(groups= {"ErrorHandling"})/
	//LDonde "ErrorHandling" es el nombre del grupo o group name
	//y la declaración en si @Test(groups= {"ErrorHandling"}), significa que todos los tests o pruebas
	//	que estan presentando ErrorValidations los estoy aguando con/en "ErrorHandling"
	
	//Entonces para cada grupo vamos a crear un nuevo archivo TestNG.XML
	//Pero y rimero vamos a crear un nuevo package llamado ->testSuites
	//en testSuites vamos a guardar los archivos testNG.xml (que ya teniamos ) y los nuevos
	//copiamos, pegamos y renombramos  el testng por ErrorValidationTests.xml

	//en el ErrorValidationTests.xml , y dentro de la etiqueta SUITE ponemos lo siguiente
	/*
	   <groups>
		  <run>
			  <include name="ErrorHandling"></include>
		  </run>
	  </groups>
	 */
	//con ello estamos inficando que ejecute el test que este atado al grupo con el nombre "ErrorHandling"
	//y solo ejecutara o activará/trigger el metodo  LoginErrorValidation(), pues es el que está en el grupo ->group=ErrorHandling
	
	/*
	 	@Test(groups= {"ErrorHandling"})//video 171
		public void LoginErrorValidation() throws IOException, InterruptedException {
			//codigo....
		}
 
	 **/
	
	
	//pero al ejecutarlo nos muestra FAILURE, ya que recodemos que en la clase BaseTest tenemos
	//un pre y post requitement con las anotaciones BeforeMethod y AfterMethod
	//entonces en el archivo BaseTest incluimos para los metodos en cada anotacion BeforeMethod y AfterMethod incluimos este atributo (alwaysRun=true)
	
	/*
	 //v171 usamos el always=run para asegurarnos que ejecute el metodo, porque hicimos un grupo para probar las agrupaciones y ejecucion de un solo metodo con el tesng.xml
	@BeforeMethod (alwaysRun=true)
	public LandingPage launchApplication() throws IOException {
		//codigo
	}
	@AfterMethod (alwaysRun=true)
	public void tearDown() {
		// codigoooo
	} 
	*/
	
	//ATRIBUTO alwaysRun=true 
	//alwaysRun=true es un atributo que se puede utilizar con anotaciones como @BeforeMethod y @AfterMethod. 
	//Este atributo asegura que los métodos anotados se ejecuten siempre, independientemente del resultado de los métodos de prueba.
	//Es decir que alwaysRun=true garantiza que los métodos anotados con @BeforeMethod y @AfterMethod se ejecuten incluso si 
	//hay fallos en los métodos de prueba
	
	
	
	//Ejecutamos de nuevo el ErrorValidations.xml como run as-> testng suite
	//y ahora si tenemos EXITO... nuestro test pasó
	
	
	//EN RESUMEN
	//Así es como se puede ejecutar las pruebas del marco (o framework) en paralelo limitando la cantidad de pruebas que debe ejecutar y también cómo establecer grupos en tu proyecto.
	
	
	
}