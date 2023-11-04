package Seccion16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class V140ParameterisingFromTestngXmlFile {

	
		// TODO Auto-generated method stub
		
		//Video 140: Parameterising from TestNG xml file
		
		//there are some values comun in test cases
		//as url to land a pa
		//FORM 1: You can parameterize usign TESNG XML file and avoid hard coding
		//FORM 2:one way is to drive it throught the code using properties class (next section 17)
		
		
		//FORM 1:tesng <parameters> en xml y  @Parameters en java class
		//MAIN RULE OF FRAMEWORK -> It should NOT be hard coding in the test cases
		//thay could be url, username, password, etc
		//Becuase the main detaild SHOULD ALWAYS come from an external or centrilized  file
		//So here, we are using Tesng.xml file
		
		//If those values are common across al test folders,
		//You can define those parameter in the xml file (afther the SUITE tags)
		
		/*
		 <parameter name="URL" value="qaclickacademy.com">
		 <parameter name="ENLACE" value="www.google.com"/>
		 dentro de la etiqueta "parameter"
		 la variables es ENLACE en name
		 y el valor es  www.google.com
		 
		 * Como lo definimos global esto a a aplicar para todos los tesgtcases del packages
		 */
		
		//Entonces y para aplicar ese parameto en xml file y aplicaro a un test method en particular
		//tengo que escribirlo asi;
		// uso la anotación @Parameters()
		//@Parameters({ "URL","APIKey/usrname" }) ->dentro de la anotación indico el NOMBRE del parametro que quiero usar en el metodo 

		//Enotces del valor del tesng para al URL de la notación parameters
		//de la anotación parameter pasa a los argumentos del metodo
		@Parameters({"ENLACE"})
		@Test
		public void mparametro(String urlnombre){
			//selenium 
			System.out.println("\nv140 metodo donde uso parameters");
			System.out.println(urlnombre);
			System.out.println("\nv140 metodo donde uso parameters\n\n");
		}
		
		//EJERCICIO 1
		/*Como la etiqueta parameter esta dentro de suite(package), pero fuera de test(folder) el testcase aplicara para todos los paquetes del proyecto
		 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		
		<suite name="Suite">
			
			<parameter name="ENLACE" value="www.google.com"/>
		
			<test name="RegressionV">
				<classes>
					<class name="Seccion16.V140ParameterisingFromTestngXmlFile" />
				</classes>
			</test> 
			
		</suite> 

		 * */

		
		
		
		//EJERCICIO 2
		//agregue otro parametro solo para el folder o untestcase en espeficico
		//<test name="TestlevelV"> para el <parameter name="ENLACEDOS" value="www.youtube.com" />
		/*
		 * 
		 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		
		<suite name="Suite">
		
			<parameter name="ENLACE" value="www.google.com" />
		
			<test name="RegressionV">
				<classes>
					<class name="Seccion16.V140ParameterisingFromTestngXmlFile" />
				</classes>
			</test>
		
		
			<test name="TestlevelV">
				<classes>
					<parameter name="ENLACEDOS" value="www.youtube.com" />
					<class name="Seccion16.V139AnnotationsHelpers" />
				</classes>
			</test> 
			
		
		</suite> 
		 * */
		
		

		

}
