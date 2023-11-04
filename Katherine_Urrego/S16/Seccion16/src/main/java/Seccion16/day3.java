package Seccion16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void befoclas() {
		System.out.println("before executing any methods in the class");
	}

	@Parameters({ "URL", "APIKey/usrname" })
	@Test
	public void WebloginCarLoan(String urlname, String key) {
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);

	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println(" I will execute before every test method in day 3 class");
	}

	@AfterMethod
	public void afterevery() {
		System.out.println(" I will execute after  every test method in day 3 class");
	}

	@AfterClass
	public void afteclas() {
		System.out.println("After executing all methods in the class");
	}

	@Test(groups = { "Smoke" })
	public void MobileLogincarLoan() {
		// Appium
		System.out.println("Mobilelogincar");
	}

	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" I am no 1");
	}

	@Test(enabled = false)
	public void MobilesignimcarLoan() {
		// Appium
		System.out.println("Mobile SIGIN");
	}

	@Test(dataProvider = "getData")
	public void MobilesignoutcarLoan(String username, String password) {
		// Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);

	}

	@Test(dependsOnMethods = { "WebloginCarLoan", "MobilesignoutcarLoan" })
	public void APIcarLoan() {
		// Rest API automation
		System.out.println("APIlogincar");
	}

	
	
	//Deifnimos un OBJETO ARRAY MULTIDIMENSIONAL - multidimensional object array
	// de 3 filas y 2 columnas
	//recordemos que se inicia desde el index 0 para filas y columnas
	//Object[3 filas][2 columnas];
	
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

	}
	 
	//we have to trigger this test case with FIRST SET this data
	//So that means 3 times  this test case should run , with different set data (los 3 conjuntos de datos que hemos configurado)
	
	
}
