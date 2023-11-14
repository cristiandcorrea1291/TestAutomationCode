package Seccion16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class V138GroupsFuncionalityInTestNg {

	
	//VIDEO 138 Usage of Groups functionality in TestNG
	
	//usamos el TESTNG3.XML para los Varchivos
	//usamos el Testng4.xml para los archivos Days
	
	
	//La anotacion	@BeforeClass
	@BeforeClass
	public void beforeclas() {
		System.out.println("v138 usando @BeforeClass ....Antes de la clase BeforeClass executing any methods in the class");
		
	}

	
	//groups
	//Esta anotación indica que el método ploan() es un método de prueba y pertenece al grupo de pruebas "Smoke
	//en el testcase se ejecutaran todas lis test que tenga la etiqueta "smoke"
	//escanea todos los test cases, y cuando encuentre la etiqueta "smoke" la va a ejecutar
	
	/*
	 * en el XML se usa:
	 *				<groups>
						<run>
							<include name="Smoke"></include>
						</run>
					</groups>
					
	 * */
	
	//Mostrara en consola los test cases ejecutados
	
	
	@Test(groups={"Grupitos"})
	public void ploanV()
	{
		System.out.println("bien prueba usando Grupos");
	}
	

	@Test(groups = { "Grupitos" })
	public void MobileLogincarLoanEnGrupov() {
		// Appium
		System.out.println("\ngroups-grupitos:  Mobilelogincar");
		
	}


	@BeforeTest
	public void prerequisteV()
	{
		System.out.println("\nPrerequisite....I will execute first");
	}
	
	@BeforeSuite
	public void BfsuiteV()
	{
		System.out.println("\nv138 usando @BeforeSuite.... I am no 1");
	}
	

	
	//Before executing al classes, we give clear indication to our XML file that
	//go and identify the groups
	//go and run those groups which have tag name called "Smoke" o "Grupitos"
	
	
	/*para los archivos segun video use el XML ->testng3.xml
	 
	<suite name="Suite">
		<test name="RegressionV">
			<groups>
				<run>
					<include name="Grupitos"></include>
				</run>
			</groups>
			<classes>
				<class name="Seccion16.V132ImportanceXmlFileInTestingConfig" />
				<methods>
					<include name="Demito" />
				</methods>
	
				<class name="Seccion16.V138GroupsFuncionalityInTestNg" />
			</classes>
		</test> <!--
		Test -->
	</suite> 
		
	 * 
	
	
	
	/*###########################################################
	 * para los archivos DAYS use el XML ->testng4.xml
			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
			
			<suite name="Suite">
			
			
				<test name="Regreday">
					<groups>
						<run>
							<include name="Smoke"></include>
						</run>
					</groups>
					<classes>
						<class name="Seccion16.day1" />
						<methods>
							<include name="DemoDay" />
						</methods>
			
						<class name="Seccion16.day2" />
						<class name="Seccion16.day3" />
						<class name="Seccion16.day4" />
			
					</classes>
				</test> <!--
				Test -->
			</suite> 
		
	 * 
	 * */
	
	
	/*
	 * There are 100 test cases and I want to run only 40, what should I do?
	 * The answer is to use groups, en group
	 * We put some tags on them and you can trigger them from your testng,xml file
	 */
	
	
	/*
	 * En este contexto, "Smoke" se refiere a un tipo de prueba que generalmente se
	 * utiliza para verificar las funciones críticas y básicas de una aplicación
	 * para asegurarse de que funcionen correctamente. 
	 * Cuando se ejecutan pruebas con TestNG, puedes agrupar tus pruebas en diferentes categorías (grupos) para
	 * ejecutarlas en conjunto o por separado.
	 * 
	 * 1. @Test(groups={"Smoke"}):
	 * Esta anotación indica que el método ploan() es un método de prueba y pertenece al grupo de pruebas "Smoke". En este contexto,
	 * "Smoke" se refiere a un tipo de prueba que generalmente se utiliza para verificar las funciones críticas y básicas de una aplicación para asegurarse
	 * de que funcionen correctamente. Cuando se ejecutan pruebas con TestNG, puede agrupar sus pruebas en diferentes categorías (grupos) para ejecutarlas en
	 * conjunto o por separado.
	 * 
	 * 2. public void ploan(): 
	 * Este es el método de prueba que se ejecutará cuando se ejecute la suite de pruebas. En este caso, simplemente imprime "good" en la
	 * consola.
	 * 
	 * 3@BeforeTest: 
	 * Esta anotación se utiliza para marcar un método que se ejecutará antes de que se ejecuten todas las pruebas de la suite de pruebas. En este
	 * caso, el método prerequiste() se ejecutará antes de la ejecución de cualquier
	 * prueba en la suite.
	 * 
	 * 4. public void prerequiste(): 
	 * Este es el método anotado con @BeforeTest. Cuando se ejecute la suite de pruebas, este método imprimirá "I will execute first"
	 * en la consola antes de que se ejecute cualquier otra prueba.
	 * 
	 * Este código define una prueba llamada ploan() que pertenece al grupo "Smoke",
	 * y antes de ejecutar cualquier prueba, se ejecutará el método prerequiste()
	 * que imprime un mensaje en la consola. Luego, cuando se ejecute la suite de
	 * pruebas, primero se verá el mensaje "I will execute first" y luego se
	 * ejecutará la prueba ploan(), que imprimirá "good".
	 * 
	 */

}
