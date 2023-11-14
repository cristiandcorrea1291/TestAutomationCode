package Seccion16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class V141DataProviderAnnotation {

	// video 141 - DataProvider Annotation -Parameterizing Testcases - 
	
	//pass one parametised value usen parameter ..como en el video 140
	
	//Pero tambien de pueden pasar mas de un parametro
	
	@Parameters({ "URL","APIKey/usrname" })
	@Test
	public void Wvideo(String urlname,String key)
	{
		//selenium
		System.out.println("\npara el video 141 ... pasar varios parametros\n");
		System.out.println(urlname);
		System.out.println(key);
		System.out.println("\nlalalal\n");
	}
	
	
	//there are some paramethers which ypu need to pass there could be specific to test level
	//global envieronment variables can be incorporated through selenium
	//Parameterizing with multipe data sets by running test with multiple combinantion
	
	@DataProvider
	public void getData() {
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
	
	}
	 
	//we have to trigger this test case with FIRST SET this data
	//So that means 3 times  this test case should run , with different set data (los 3 conjuntos de datos que hemos configurado)
	
	//Now our requirement is ....
	//we have to trigger this test case whit all the data
	//whole tests case should run with 1st set, snd set, and 3rd set
	
	
	//in the next video 142... we will see:
	// ?? HOW do you integrate whatever data you provided here
	// and HOW do you pass this datra to particular test or method
	
	
}
