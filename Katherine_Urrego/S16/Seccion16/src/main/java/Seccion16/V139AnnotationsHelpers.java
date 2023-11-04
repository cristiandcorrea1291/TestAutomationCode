package Seccion16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class V139AnnotationsHelpers {
		
	
	//video 139.Annotations helper attributes with examples
	//@Test(dependsOnMethods={"WebloginBoatLoan","MobilesignoutboatLoan"})
	//@Test(enabled=false)
	//@Test(timeOut=4000)
	
	//it run in alfabetic orden
	//how do you run ttst in order Z to A?
	
	
	
	
	@Test
	public void WebloginBoatLoan()
	{
		//selenium
		System.out.println("Método WebloginBoatLoan ");
		
	}
	
	
	
	//HOW TO USE timeOut
	//@Test(timeOut=4000)
	//When you feel that the test case is taking long time to execute and/or generate response
	//and when tests cases are failing because of that
	//you can set time out to say "dont fail till n miliseconds"
	//SOLO aplica para el metodo y el bloque de codigo donde se use
	
	@Test(timeOut=4000)// it wil NOT fail till 4000 miliseconds of execution or before throw an error
	public void MobilesignoutboatLoan() {
		System.out.println("Metodo MobilesignoutboatLoan ");
	}
	
	
	
	
	//HOW TO USE enabled
	//ENABLED es un TestNG helper atribute
	//with that TestNg will safely skip this test case while executing
	//FALSE: to skip this particular test from execution
	//TRUE: It will on again
	//@Test(enabled=false) can be usen when you know that exists errors in your applicantion and you DONT WANT to trigger those
	
	@Test(enabled=false)
	public void metodoEnabled() {
		System.out.println("La anotación enabled");
	}
	
	
	
	
	//HOW TO USE dependsOnMethods
	/*
	 You use next to the @Test the dependsOnMethods
	 It means that Before executing the code inside APIboatLoan Method 
	 ir depends of the WebloginBoatLoan method (line 14) and 
	 * */
	@Test(dependsOnMethods={"WebloginBoatLoan","MobilesignoutboatLoan"})
	public void APIboatLoan()
	{
		//Rest API automation
		System.out.println("APIloginboat depende del methodo WebloginBoatLoan y MobilesignoutboatLoan  ");
	}
	
	/*
	 * APIboatLoan: Este método de prueba está marcado con la anotación @Test(dependsOnMethods={"WebloginBoatLoan","MobilesignoutboatLoan"}
	 * ). Esto significa que este método depende de la ejecución exitosa de los
	 * métodos WebloginBoatLoan y MobilesignoutboatLoan. Esto asegura que estos dos
	 * métodos se ejecuten antes de que se ejecute APIboatLoan. En este método, se
	 * imprime
	 * "APIloginboat depende del método WebloginBoatLoan y MobilesignoutboatLoan" en
	 * la consola. Este método podría utilizarse para realizar pruebas de
	 * automatización de APIs que dependen de acciones realizadas en los métodos
	 * anteriores.
	 * 
	 * En resumen, este código se utiliza para crear una secuencia de pruebas donde
	 * primero se ejecutan los métodos WebloginBoatLoan y MobilesignoutboatLoan, y
	 * luego se ejecuta el método APIboatLoan. Esto permite realizar pruebas
	 * automatizadas en una aplicación web que involucra acciones tanto en la
	 * interfaz web como en servicios web (APIs).
	 */
	
	
	
	/*
 	<test name="RegressionV">
		<groups>
			<run>
				<exclude name="Grupitos"></exclude>
			</run>
		</groups>
		<classes>
			<class name="Seccion16.V132ImportanceXmlFileInTestingConfig" />
			<methods>
				<include name="Demito" />
			</methods>

			<class name="Seccion16.V138GroupsFuncionalityInTestNg" />
			<class name="Seccion16.V139AnnotationsHelpers" />
		</classes>
	</test> <!-
 */
	
	
	
	
	//para el segundo ejemplo del video 140
	@Parameters({ "ENLACEDOS" })
	@Test
	public void mparametro(String urlnombredos) {
		// selenium
		System.out.println("en el 139 para ver segundo ejemplo del v140 metodo donde uso parameters");
		System.out.println(urlnombredos);
		System.out.println("\n\n");
		// ystem.out.println(key);
	}
	

}
