package Seccion16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class V144RunningTestsinParallelAndGeneratingReport  implements ITestListener  {
	// video 144. Running Tests in parallel and generating Reports
	
	
	//Usar los LISTENERS 
	// para usar Listener tenemos que mplementat el ITestListener interfaces which
	// implements testng isteners
	
	//Activar los LISTENERS en el testng.xml
	//si quiero ejecutar el test folder  o suite:
	//1.Se agrega el atributo "parallel" en la etiqueta suite del xml
		//<suite name="Suite" parallel="tests"> -> if you wan totrun test para lel evevry time
	//2. "thread-count"-> También debo inidcar cuantos triggers de una sola vez ...usaremos el atributo 
		//<suite name="Suite" parallel="tests" thread-count="2">
	
	
	
	
	//PARA obtener el REPORTE 
	//a corer el xml tesng.. 
	//1. vamos a la carpeta "test-output" -> index.html
	//2. clic detecho en el archivo index.xml
	//3. seleccionar properties
	//4. copiar la LOCATION:C:\Users\KURREGO\eclipse-workspace\Seccion16\test-output\index.html
	//5. Copiarla en el navegador
	// 6 o simplemente dobe click en el archivo index.xml
	
	
	
	
	public void onTestStart(ITestResult result) {
		// Este método se ejecuta al inicio de cada prueba (método de prueba) antes de
		// su ejecución. Puedes agregar lógica personalizada para realizar acciones
		// específicas antes de que cada prueba comience.
	}

	
	public void onTestSuccess(ITestResult result) {
		// Este método se ejecuta si una prueba se ejecuta con éxito, es decir, sin
		// ningún error. Puedes agregar lógica personalizada para registrar información
		// o realizar acciones específicas cuando una prueba tiene éxito.
		System.out.println("I successfully executed Listeners Pass code");
	}

	
	public void onTestFailure(ITestResult result) {
		// screenshot code
		// response if API is failed
		// el método onTestFailure imprime un mensaje cuando una prueba falla.
		//trae el nombre del test que la falla
		System.out.println("I failed executed Listeners Pass code" + result.getName());
		
		// Este método se ejecuta cuando una prueba falla, es decir, cuando se produce
		// una excepción o error durante la ejecución de la prueba. Aquí, puedes agregar
		// lógica para manejar la falla, como capturar capturas de pantalla, notificar
		// sobre la falla o realizar acciones de recuperación.
	}
	

	public void onTestSkipped(ITestResult result) {
		// Este método se ejecuta si una prueba se omite, por ejemplo, cuando se
		// especifica que no debe ejecutarse. Puedes agregar lógica para manejar las
		// pruebas omitidas.
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Este método se ejecuta cuando una prueba falla pero está dentro del
		// porcentaje de éxito especificado. Puede ser útil para tomar medidas
		// adicionales en función de la tasa de éxito.
	}

	@Override
	public void onStart(ITestContext context) {
		// : Este método se ejecuta al inicio de un contexto de prueba, es decir, cuando
		// comienza la ejecución de una suite de pruebas. Puedes agregar lógica
		// personalizada para configurar el entorno de prueba.

	}

	@Override
	public void onFinish(ITestContext context) {
		// Este método se ejecuta al final de un contexto de prueba, es decir, cuando se
		// completa la ejecución de una suite de pruebas. Puedes agregar lógica para
		// realizar limpieza o acciones de finalización.
	}
	
	
	
	
	//How do you know the test case name?
	//we can have a class called ITestResult, and this class actually describes the result of a test
	
	
	//if you want to trigger all the casses apralety at a time, you have to:
	//1. use Parallel Y thread-count en la etiqueta suite de xml
	
	/*
	 <suite name="Suite" parallel="tests" thread-count="10">
	
		<listeners> 
			
			<listener class-name="Seccion16.V144RunningTestsinParallelAndGeneratingReport"></listener>
			
		</listeners>

	
		<parameter name="URL" value="www.google.com" />
		
		<test name="test141">
			<parameter name="APIKey/usrname" value="1234567890" />
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
	

	 */
	
	
	
	
}
