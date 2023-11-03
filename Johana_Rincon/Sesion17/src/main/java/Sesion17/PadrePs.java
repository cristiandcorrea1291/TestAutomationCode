package Sesion17;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PadrePs {

	public void doThis()// metodo
	// unicamente llama al metoto en la otra clase hijops1

	{
		System.out.println("Estoy aqui PadrePS clase padre");
	}

	@BeforeMethod // se ejecuta primero
	public void beforeRun() {
		System.out.println("BeforeRun me frist clase padre");
	}

	@AfterMethod // se ejecuta despues
	public void AfterRun() {
		System.out.println("AfterRun me frist ClasePadre");
		
		System.out.print("clase padre ");
	}
}