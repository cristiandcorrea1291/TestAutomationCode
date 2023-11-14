package Seccion16;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class V131RunningTestcasesInTestNG {

	
	//parte del video 136, minuto 8:38
	@AfterTest
	public void lastexecution() { //method
	
		System.out.println("en el archivo 131 , ejemplo de la anotacion @AfterTest");//automationc code insede a method ===test
		
	}
	
	
	//parte del video 136, minuto 4:40
	@AfterSuite
	public void afSuite() {
		System.out.println("En el archivo 131, I am the no number 1 from LAST using @AfterSuite annotations");
	}
	
	
	//video 138
	@Test(groups={"Grupitos"})
	public void plangrupospruebauno()
	{
		System.out.println("lalalalaal");
	}
	
	
	@Test(groups={"Smoke"})
	public void plangrupospruebados()
	{
		System.out.println("black white");
	}
	
	
	//public static void main(String[] args) {}
	
		//video 131. Running testcases in TestNG with out Java compiler
		//1. How to run test with TestNG
		//You need to have @Test Annotation followeb by method
	
		//TestNG Librries includes in the pom.xml son las liberias de Selenium
		//Mientras que el plugging TESTNG itselft acts as a Java Compiler and executes all your test cases
		
		
		//execute fromtest ng
		//1 create one method a kinfd ogf fucntion
		
	//Escoger la opcion para impoerta la libreria "add testNGlibrary"
	// e importe el testng anotation
	@Test				//Test annotation
	public void DemoUno() { //method
		
		System.out.println(" v131 Prueba uno test");//automationc code insede a method ===test
		
	}
	
	//lo que se aque el metodo siga despues de la anotación @Test sera teraado como un test case por TestNG
	
	//Nota cuando ejecutamos el codigo va a figurar la opcion RUN AS->>TestNg test
	//se ejecutara el test case con un testng library
	
	
	//cuando se ejecuta una aplicacion java, 
	//tiene unas ibrerias personalizadas dentro de su framework 
	//which will neatly provude information like "PASSED"
	//y "Demo" is the case Name
	/*
	 * [RemoteTestNG] detected TestNG version 7.4.0
		Hola
		
		PASSED: Demo
		
		===============================================
		    Default test
		    Tests run: 1, Failures: 0, Skips: 0
		===============================================
		
		
		===============================================
		Default suite
		Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
		========
	*/
	
	
	
	

	
}
