package Sesion16;
	
import static org.testng.AssertJUnit.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.ITestContext;
import org.testng.ITestListener;



	public class day1 {
	private static final String Asert = null;

		@AfterTest
		public void lastexcution()
		{
		System.out.print("Excuete ultimo");
		}
		//@AfterTest//
		//@AfterSuite//se ejecuta al final del tescast
		//@BeforeMethod //configuraciones específicas que necesitan ser 
		//repetidas antes de cada prueba individual
	    @BeforeMethod 
	    
	    public void demo ()
	    {
	        System.out.println("Hello, paso 1 BeforeMethod");
	        // Verificar que la condición sea verdadera
	        Assert.assertTrue(false);
	    }
	    @AfterSuite
	    @Test
	    public void aftersuit()
	    {
	    System.out.print("Afther Suite realiza limpieza ahorro de la memoria");
	    }

	    @Test
	    public void secondTest() {
	        System.out.println("Paso dos");
	    }
	}
