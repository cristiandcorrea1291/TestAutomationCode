package Seccion16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class V143ListenersTestNg  implements ITestListener {

	// video 143. Listeners Interface in TestNG framework
	// para usar Listener tenemos que mplementat el ITestListener interfaces which
	// implements testng isteners

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
		System.out.println("I failed executed Listeners Pass code"+ result.getName());
		
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
	
	
	
	//en el archivo TESTNG XML
	//para dar la info de los listeners al TesTNG xml, After del suite y Before del suite
	//los test folders como listeners
	//Para confiruar los listenes en el archov XML se: agregamos la etiqueta plural "listeners"  y dentro de esta la etiqueta en singular "listener"
	//<listener class-name="NOMBRE PACKAGE . NOMBRE DE LA CLASE "></listener>
	//Es decir <listener class-name="Seccion16.V143ListenersTestNg"></listener>
	
	/*
		 <listeners> 
			<listener class-name="Seccion16.V143ListenersTestNg"></listener>
		</listeners>
		
	 */
	
	
	/*
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Suite">
			
			<listeners> 
				<listener class-name="Seccion16.V143ListenersTestNg"></listener>
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
		</suite> 
	 */
	
	
	
	
	
	/*
	 * Los listeners en TestNG se configuran en el archivo XML de configuración de
	 * la suite de pruebas, donde puedes especificar cuáles listeners deseas
	 * utilizar y cómo se deben comportar. También puedes implementar tus propios
	 * listeners personalizados extendiendo las interfaces proporcionadas por
	 * TestNG. Los listeners son una herramienta poderosa para la personalización y
	 * la automatización avanzada de pruebas en TestNG.
	 * 
	 * 
	 * En el contexto de TestNG (Test Next Generation), los "listeners" son clases
	 * que se utilizan para personalizar y controlar el comportamiento de las
	 * pruebas. Los listeners actúan como ganchos o puntos de extensión que permiten
	 * interceptar eventos específicos durante la ejecución de las pruebas y tomar
	 * medidas adicionales, como registrar información, realizar acciones
	 * específicas antes o después de las pruebas, o manipular el flujo de
	 * ejecución.
	
	
	 * TestNG proporciona una variedad de listeners incorporados que cubren
	 * diferentes aspectos de la ejecución de pruebas. Algunos de los listeners más
	 * comunes en TestNG incluyen:
	 
	 
	 * IInvokedMethodListener: Permite realizar acciones antes y después de la
	 * invocación de métodos de prueba.
	 
	 
	 * ITestListener: Permite controlar eventos relacionados con las pruebas, como
	 * el inicio y la finalización de una suite de pruebas, la suite de pruebas, los
	 * grupos, los métodos de prueba, etc.
	 
	 
	 * ISuiteListener: Permite controlar eventos relacionados con las suites de
	 * pruebas, como el inicio y la finalización de suites.
	 
	 
	 * IReporter: Permite personalizar la generación de informes y la salida de
	 * resultados de pruebas.
	 
	 
	 * IAnnotationTransformer: Permite transformar y personalizar las anotaciones de
	 * prueba antes de que se utilicen en la ejecución de las pruebas.
	 
	 
	 * IHookable: Permite habilitar o deshabilitar la ejecución de métodos de prueba
	 * en función de condiciones específicas.
	 
	 
	 * IConfigurationListener: Permite controlar la configuración y carga de clases
	 * de prueba.
	 
	 
	 * IExecutionListener: Permite controlar eventos globales de inicio y
	 * finalización de la ejecución de pruebas.
	 
	 
	 * etc....
	 * 
	 * 
	 */
	
}
