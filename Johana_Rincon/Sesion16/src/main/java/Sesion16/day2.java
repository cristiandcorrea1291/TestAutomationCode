package Sesion16;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups= {"smoke"})
	public void prueba3()
	{
		System.out.print("Paso 3 ");

	}
	@BeforeTest
	public void prerrequistos()
	{
		System.out.print("Ejecutar primero BeforeTest");
	}
	
	

}
