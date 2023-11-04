package Seccion16;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class V136TestngAnnotationsParte1 {

//VIDEO 136. TestNg Annotations part - 1
	
/*
 Al onservar el carchivo testng.xml
 tiene las  siguientes partes
  
  1. <?xml version="1.0" encoding="UTF-8"?>
	2. <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		3. <suite name="Suite">
		  
		    4.<test name="Car loan">
				
			   5. <classes>
				      6.<class name="Seccion16.V135ExecutingTestCasesAtPackageLevelWregex"/>
				      	<methods>
							 <exclude name="Mobile.*" /> 
						</methods>
				    </classes>
			  </test> <!-- Test -->
	  		</suite> <!-- Suite -->
	  		
	  
	  		veremos las partes 3,4,5
	  In the SUITE are all the test folders
	  En la etiqueta TEST se conforma cada folder
	  
	  
	  
	  EJERCICIO 1
	  //When you automate you should delete the data which you submitted
	   * 
	  //Becacause when you run your automation test, you will fill all
	   * the data and you submit.
	   * So, again you will use the same data for your next subsequent automation run
	   * In that time , as data is already present in the system,
	   * it will throw an error saying that "error data exists"
	   * 
	   * To overcome and resolve this issue, you want to delete all the data from the database BEFORE
	   * you begin your automation oying n applyning the test "personal loan"
	  
	  
	  //1. Tell to trstng that first cean everuthing by executing one particular block
	   * 2.and then start executing all the test cases which are present in the test named "Personal Loan"
	   * We can residrect the execution to one block
	  
 * */
	
	@Test
	public void ploan() { //method
	
		System.out.println("\nv136 ... clean data before execute test");//automationc code insede a method ===test
		
	}
	
	
	
	//the @BeforeTest annotatione means whatever method you define here, will be execute first, Before/ANTES of any test beloging to that folder
	//when we use @BeforeTest, it will treat this entire SUITE as ONE TEST FOLDER
	//Es como si el test folder entero (<test>xxxx</test> fuese una prueba o test 
	//@Test
	@BeforeTest
	public void prerequisite() { //method
		
		System.out.println("I will execute first");//automationc code insede a method ===test
		
	}
	
	
	
	//si en lugar del @BeforeTest, deramos la annotación @Test, se ejecutarian los test and el orden que están declarados

	
	//USO DEL 	@AfterTest annotation
	//AfterTest if you are using selenium or Appiam
	//AfterTest annotations will generally use to delete the cookies,(like one execution is done to stop the process/delete the cookies/ to read the reports)
	//Whatever reason you xan use that
	//in API's 	@AfterTest is used to close the connections that you made to service calls and all
	@AfterTest
	public void ultimaejecucion() { //method
	
		System.out.println("archivo c136 ...ejemplo de la anotacion @AfterTest\n\n");//automationc code insede a method ===test
		
	}
	
	
	
	
	
	//RESUMEN DE COMO QUEDÓ EL TESTNG.XML al final del video 
	/*
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
	
}
