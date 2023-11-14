package Seccion16;

import org.testng.annotations.Test;

public class V135ExecutingTestCasesAtPackageLevelWregex {
	
	//Video 135:Executing the Testcases at Package level with regex
	//How to deal with regular expression in these methods
	
	@Test
	public void MobileSigninCarLoan() {
		//appium
		System.out.println("\nMobilelo sign in");
	}
	
	@Test
	public void MobileLoginCarLoanHome() {
		//appium
		System.out.println("Mobile log in");
	}
	
	@Test
	public void MobileLogoutCarLoan() {
		//appium
		System.out.println("Mobile log out");
	}
	
	@Test
	public void MobileLoadingCarLoan() {
		//appium
		System.out.println("Mobile loading");
	}
	
	@Test
	public void MobileSingoutCarLoan() {
		//appium
		System.out.println("Mobile sing out\n");
	}
	
	
	//EJERCICIO 1:
	//Excluir TODOS los metodos en un solo shot que contengan: "xxxx.*"
	//si integramos un punto y un asterisco (regular expression) al nombre o la palabra de un metodo
	// "Mobile.*" stands for anything after Mobile, para eso es el asterisco
	//en el ejemplo excluiriamos cualqueir metodos que comenzara con un nombre igaul a Mobile
	/*
	 
		   <test name="Car loan">
		    <classes>
		      <class name="Seccion16.V135ExecutingTestCasesAtPackageLevelWregex"/>
		      	<methods>
					 <exclude name="Mobile.*" /> 
				</methods>
		    </classes>
		  </test> <!-- Test -->
	 
	 * */
	
	
	
	//EJERCICIO 2
	//Testcases from PACKAGE LEVEL
	//Se pasa el nombre del paquete y todas las clase que pertenezcan a ese paquete seran disparadas/triggered automaticamente
	//1. Copio y pego el testng.xm ->> usaré testng2.xml
	//2. En el archivo testng2.xml
	// 3. dentro del case uso la etiqueta packages
	//dentro de packages , uso la etiquea packages e indico el name del paquete
	// ya que en un projecto pueden existir muchos paquetes
	/*
	  <packages> <package name = "Seccion16"/> </packages>
	 */
	
	
	
	//this is how you will trigger the whole test cases of your packages
	//to throw all the test cases in a single shot
	//El testng2.xml quedó así
	/*EN EL TESTNG2.XML
	 
		 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Suite">
		  
		    <test name="Car loan">
				
				<packages>
					<package name = "Seccion16" />
				</packages>
				
		
		  </test> <!-- Test -->
		  
		</suite> <!-- Suite -->
	 */
	
	
	
	
	
	
}
