package Seccion16;

import org.testng.annotations.Test;

public class V133PrioritizingTestCasesWithTestNg {

	//133. Prioritizing the Testcases with TestNG
	
	//How to run test with TestNG
	//1. You need to have @Test Annotation followeb by method (video 131)
	//2. You can define multiple testfrom single class (video 132)
	//3. You can modularize the test cases based up on functionalities and trigger them accordingly (video 133)
	
	//Using the TESTNG.XML file you can know:
	//1. how can you actually put some folders 
	//2. and how push your test cases into that specific module
	//3. and you should generalizae your test cases like this
	//as Switch ON and Switch OFF something
	
	
	@Test
	public void WebLoginCarLoan () {
		//selenium
		System.out.println("\nweblogincar");
	}
	
	@Test
	public void MobileLoginCarLoan() {
		//appium
		System.out.println("Mobilelogincar");
	}
	
	@Test
	public void LoginAPIcarLoan() {
		//Rest API
		System.out.println("APIlogincar\n");
	}
	//Segregate and have control about each module
	//use a kind of switch mechanism--- sed modifica e xml agregando
	
	
	//just changinf this"trstng.xml"  XML file , 
	//you are able to chanfge whole execution pattern
	
	
	/*El xml lo modificamos así... pero lo iremos ajustando de acuerdo a las clases que vayamos a ejecutar
	lo usamos para omitir folders enteros
	
		
			 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Suite">
		  <test thread-count="5" name="Test">
		    <classes>
		      <class name="Seccion16.V131RunningTestcasesInTestNG"/>
		      <class name="Seccion16.V132ImportanceXmlFileInTestingConfig"/>
		     
		    </classes>
		  </test> <!-- Test -->
		  
		  
		  <!--
		  	Video 133
		  	//Segregate and have control about each module
			//use a kind of switch mechanism > sed modifica e xml agregando
		  -->
		   <test name="Car loan">
		    <classes>
		      <class name="Seccion16.V133PrioritizingTestCasesWithTestNg"/>
		    </classes>
		  </test> <!-- Test -->
		  
		</suite> <!-- Suite -->

	  
	 * */
	
	
	
}
