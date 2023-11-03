package Sesion16;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.ITestContext;
import org.testng.ITestListener;


public class Listeners implements ITestListener {


private static final AssertJUnit Asert = null;

//reportes de screen

//en Java se utiliza para anotar un método que tiene la intención de sobrescribir
//(o reemplazar) un método de una superclase
    @Override
    public void onTestStart(ITestResult result) {
        // Se llama al inicio de cada prueba
      //  System.out.println("La prueba Hola fallo :... " + result.getName());
  
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Se llama cuando una prueba tiene éxito
    System.out.println("prueba fallida...demo "+ result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Se llama cuando una prueba falla
       // System.out.println("Prueba fallida: "´+ result.getName);
    }

    // Otros métodos de la interfaz ITestListener

    @Override
    public void onFinish(ITestContext context) {
        // Se llama al final de la ejecución de todas las pruebas en un contexto
    }
}

	
	
		
	
	
