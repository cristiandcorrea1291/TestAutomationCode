package Sesion16;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void weblogincar() {
		// selenium
		System.out.println("1. weblogincar");
	}

	@Test
	public void MobileLogincarLoan() {
		System.out.println(" 2.MobileLogincarLoan..");
	}
	//v137
	@BeforeSuite//emergencia 
	@Test
	public void rapido()
	{
	System.out.print("Beforesuite rapido");
	}
	
	//Agregan mas v135
	
	@Test(enabled=false)//este método no se ejecutará cuando ejecutes la suite de pruebas
	public void MobileSibgInLoan() {
		System.out.println(" Mobile Sing In ");
	}
	
	  @Test(dataProvider = "getData")
	    public void MobileSingOutCarLoan(String username, String password) {
	        System.out.println("MobileSingOutCarLoan con datos:");
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	    }
	
	@Test
	public void MobileSingOutLoad() {
	System.out.println(" Mobile Sing Out ");
	}

	@Test
	public void LoginAPIHomecarLoan() {
		System.out.println("3.LoginAPIHomecarLoan");
	}
	@Test
	public void weblogincartLoart()
	{
		System.out.println("webLoginLoart ");
	}
	//primero se verificará si el método "weblogincartLoart" se ejecutó correctamente. Si 
	//"weblogincartLoart" se ejecuta sin errores, entonces "APICarLoan
	@Test(dependsOnMethods= {"weblogincartLoart"})
	public void APICarLoan()
	{
		System.out.println("APIlogincar");
	}
	 @DataProvider// se usa los datos para hacer las pruebas 
	    public Object[][] getData() {
	        Object[][] data = new Object[3][2];//matriz de datos 
	        // 1er conjunto de datos
	        data[0][0] = "primerusuario";
	        data[0][1] = "primerpassword";
	        // 2do conjunto de datos
	        data[1][0] = "segundousuario";
	        data[1][1] = "segundopassword";
	        // 3er conjunto de datos
	        data[2][0] = "tercerusuario";
	        data[2][1] = "tercerpassword";
	        return data;
		
	}
	
}
