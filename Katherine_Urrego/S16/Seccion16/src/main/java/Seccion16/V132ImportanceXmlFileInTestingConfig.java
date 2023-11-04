package Seccion16;

import org.testng.annotations.Test;

public class V132ImportanceXmlFileInTestingConfig {
	//Video 132. Importance of xml file in Testng configuration
	//How to run test with TestNG
	//1. You need to have @Test Annotation followeb by method
	//2. You can define multiple testfrom single class

	
	@Test				//Test annotation
	public void Demito() { //method
		System.out.println("Hello 132");//automationc code insede a method ===test
		
	}
	
	//COMO DIFERENCIAR entre un TestCase y otro TestCase?
	//cuando se escribe una segunda u otra anotacin @Test
	//Then TestNG inmediately rerad this as a second or n TestCase
	
	@Test
	public void SecondTest() {
		System.out.println("Bye 132");
	}
	
	
	//you can trigger all these test from xml. file
	//al these configurations, triggers happens from that xml file
	//If you want to creatr a TESTNG XML FILE for your proyect simply:
	//1. right click on your proyect
	//2. hover on TestNG option
	//3. Chose and clic on "Convert to TestNG" option
	//4. You will se a pre-viwe of the xml
	//5. Clic in "Next"
	//6  Clic in "Finish"
	//7. The testng.xml file wil be ready
	
	
	
	//Then in the testng.xml you will have:
	//a tag about Test suite -> Test Folder (Module) -> test cases
	// Test Suite can have multiple modules
	
	//HOW DO YOU RUN ALL TEST CASES? min 10
	//Desde el archivo testng.xml se pueden ejecutar todos los casos de prueba
	//para ejectuar todos los casos al mismo tiempo / in one shot:
	//clic derecho en e archivo testng.xml -> run as ->TestNg Suite
	
}
