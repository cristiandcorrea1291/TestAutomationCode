package Seccion16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class V142DataProviderAnnotationParteDos {

	//video  142. DataProvider Annotation -Parameterizing Testcases-2
	// I will learn:
	//1. HOW do you integrate whatever data you provided here
		//con e return e integrando la matriz o arreglo multidimensional al metodo ->	public Object[][] getData()
		//
	
	// 2. and HOW do you pass this data to particular test or method
		//Agregando "dataProvider" la anotacion @Test  e indicando cual es el  metodo que tiene los datos
		//@Test(dataProvider = "getData")
	
	//para guardar los datos que se traen debemos pasarlos a un string del metodo, po lo que definomos dos 
		//public void MobilesignoutcarLoan(String username, String password) {
	
	@Test(dataProvider = "getData")
	public void MobilesignoutcarLoan(String username, String password) {
		// Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);

	}


	@DataProvider
	public Object[][] getData() {
		//combinaciones
		// 1st combiantion - username password - good credit history= row
		// 2nd - username password - no crdit history
		// 3rd - fraudelent credit history
		
		Object[][] data = new Object[3][2];
		
		// 1st set - llenar primera 
		data[0][0] = "firstsetusername"; //[fila 1][columna 1]
		data[0][1] = "firstpassword"; //[fila 1 ][columna 2]
		// couloumns in the row are nothing but values for that particualar
		// combination(row)

		// 2nd set
		data[1][0] = "secondsetusername";//[fila 3][columna 1]
		data[1][1] = "secondpassword"; //[fila 2][columna 2]

		// 3rd set
		data[2][0] = "thirdsetusername";//[fila 3][columna 1]
		data[2][1] = "thirdpassword";//[fila 3][columna 2]
		
		
		return data; //estamos retornando o enviando todos los valores de los datos con los valores que el test necesita
		//el return NO VA con metodos void
	}
	
	
	//ejemplo de dependsOnMethods
	@Test(dependsOnMethods = { "MobilesignoutcarLoan" })
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}
	
	
	
	
	
	/*El testng3.xml del ejercicio quedó:
	 
	 <?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">

	<suite name="Suite">
	
		<parameter name="URL" value="www.google.com" />
		<parameter name="APIKey/usrname" value="1234567890" />
	
		<test name="test141">
			<classes>
				<class name="Seccion16.V142DataProviderAnnotationParteDos" />
			</classes>
		</test> 
		
		<test name="TestlevelV">
			<classes>
				<parameter name="ENLACEDOS" value="www.youtube.com" />
				<class name="Seccion16.V139AnnotationsHelpers" />
			</classes>
		</test> 
	</suite> 

	 
	 */
	
	
	
	//pregunta de entrevista
	//How do you achieve parametrization?
	// It can be done in 2 ways using TestNG:
	// way 1: drive the data from testng xml file como en el video 141
	//way 2: or driver the data and I can parameterize it using dataProvider annotation como en el video 142
	
	
	
	//for ach running .. how many values you are parsing?
	//define that many columns and just iniltiaize it
	//once it initialized,  It is stpring in "data"
	//and make sure it is "catching" the test whatever I want
	//And for each run, if I parse two values, make sure you parse these two values as an arguments
	//and catch it 
	//that's all
	
	
	//REMEMBER
	//If there is any dependency from ypur XML file,
	//i just have to run int from XML FILE LEVEL ONLY
	
	
	//Because if I run it from indivudual file level
	//it may NOT identify and as there are dependencies from xml 
	
	//in real .. I have to take it from tesng xml file ONLY
	
	
	
	
}
