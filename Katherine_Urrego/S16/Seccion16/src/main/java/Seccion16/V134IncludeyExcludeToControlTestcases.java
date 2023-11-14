package Seccion16;

import org.testng.annotations.Test;

public class V134IncludeyExcludeToControlTestcases {
	
	//How to run test with TestNG
	//1. You need to have @Test Annotation followeb by method (video 131)
	//2. You can define multiple testfrom single class (video 132)
	//3. You can modularize the test cases based up on functionalities and trigger them accordingly (video 133)
	//4. You can also get a control on running specific methods from test case (video 134)
	
	
	//*************************************************************
	//VIDEO 134
	//el archivo testng.html con la actividad del video 134 queda así
	//Aqui vamos a omitir  el segundo metodo del archivo 133 "MobileLoginCar"
	
	
	//EJERCICIO 1:
	//1. We hace to skip only one test cases in that class file
	/* y lo dejo en el MODULO "Car loan"
	 * dentro de la clase "Seccion16.V133PrioritizingTestCasesWithTestNg"
	 * Ingreso a los metodos de la clase con la etiqueta <methods></methods>
	 * excluya el metodo que indico dentro de a etiqueta usando  <exclude name="MobileLoginCarLoan" /> 
	 clic en el archivo testng,xml -> run as -> testng Suite
	  
	   <test name="Car loan">
	    <classes>
	      <class name="Seccion16.V133PrioritizingTestCasesWithTestNg"/>
	      	<methods>
				 <exclude name="MobileLoginCarLoan" /> 
			</methods>
	    </classes>
	  </test> <!-- Test -->


	Asi es como se pueden remover methods from your test execution
	
	
	Para agregar el metodo de nuevo, solo borro las lineas de la etiqueta "methods" y "exclude"
	 
	  <test name="Car loan">
	    <classes>
	      <class name="Seccion16.V133PrioritizingTestCasesWithTestNg"/>
	    </classes>
	  </test> <!-- Test -->
	 
	 */
	
	
	
	/*
	 *Si tenemos unrequerimiento especifico como ejecutar un solo modulo o 
	 *ejecutar un test case en particular (como el del ejercicio1)
	 *En ese caso podemos crear un archivo xml como parte del requerimiento del cliente y trigger/disparar todos los test cases
	 * */
	
	
	//EJERCICIO 2:
	/*
	 Tambien existe una etiqueta INCLUDE
	 Un ejemplo: Este caso no quiero ejecutar el metodo WEB y el MOBILE del archivo 133, 
	 Solo necesito el metodo API
	 
	 forma 1: usar exclude para web y mobile en el testcase
	 forma 2: usar Include para API en el testcase
	  La forma 2 es mas sencilla e inteligente
	 
	 
	 Para el ejercicio 2, de la clase 132 solo incluyo el methodo Demo
	
	 
	  <test thread-count="5" name="Test">
	    <classes>
	      <class name="Seccion16.V131RunningTestcasesInTestNG"/>
		
	      <class name="Seccion16.V132ImportanceXmlFileInTestingConfig"/>
	         <methods>
				 <include name="Demo" /> 
			</methods>
			
	    </classes>
	  </test> <!-- Test -->
	  
	 */
	
	
	//RESUMEN
	//con el ejercicio 1 y 2, el xml quedó asi
	
	/*
	 
	 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Suite">
		  <test thread-count="5" name="Test">
		    <classes>
				
		      <class name="Seccion16.V131RunningTestcasesInTestNG"/>
			
		      <class name="Seccion16.V132ImportanceXmlFileInTestingConfig"/>
		         <methods>
					 <include name="Demo" /> 
				</methods>
				
		    </classes>
		  </test> <!-- Test -->
		  
		  
		  <!--
		  	Video 134
		  	//to skip only one test cases in that class file
		  -->
		   <test name="Car loan">
		    <classes>
		      <class name="Seccion16.V133PrioritizingTestCasesWithTestNg"/>
		      	<methods>
					 <exclude name="MobileLoginCarLoan" /> 
				</methods>
		    </classes>
		  </test> <!-- Test -->
		  
		</suite> <!-- Suite -->
	 
	 */
	
	
	
	
}
