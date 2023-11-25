package seccion9;

public class V78WhatIsExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VIDEO 78: What is explicit wait? Explain with real time scenario
		
		/*SINCRONIZACIÓN:en Java con Selenium WebDriver, los "Implicit Wait", "Explicit Wait", "Thread Sleep" y "Fluent Wait" 
		 * son técnicas para manejar la sincronización de las pruebas automatizadas con elementos en una página web. 
		 * Cada uno de estos enfoques aborda el problema de esperar a que un elemento específico esté disponible antes de realizar una acción sobre él.
			//esperar hasta que la pagina cambie

		 * IMPLICIT WAIT:
		 * El Implicit Wait es una configuración que se aplica a NIVEL GLOBAL (defined for something global) para toda la instancia de WebDriver.
		 * Define un tiempo máximo que el WebDriver debe esperar antes de lanzar una excepción si un elemento no está presente o interactuable.
		 * Ayuda a reducir la necesidad de incluir pausas explícitas en tu código.
		 * Se puede configurar de la siguiente manera: driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	Wait for 10 o n seconds BEFORE you throw any error/exception
		//	se indica al driver que cualquier cosa que se haga clic y no encuentre respuesta, no muestre error inmediatamente. SIno que de un tiempo de espera antes de mostrar una excepción
		 * 	Si la aplicación es visible dentro del n tiempo de espera, este saldrá de él y reanudará su ejecución.
		 *	
		 	VENTAJAS
		 	:-> se define a nivel global (antes de cada paso, clic, accion hay un tiempo de espera)
		 *	es time limited
		 *	IT WILL KEEP ON LISTENIGN TO THE DOM - DOCUMENT OBJECT MODEL
		 *
		 *DESVENTAJAS:
 
 
	
		 * EXPLICIT WAIT:
		 * El Explicit Wait permite ESPERAR DE FORMA ESPECÍFICA (Target a specific element/scenario) a que ocurra una condición particular antes de continuar con la ejecución del código.
		 * Se utiliza con ExpectedConditions para definir una condición que se debe cumplir antes de continuar.
		 * Ejemplo de uso:
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
		 * 


		 * THREAD SLEEP:
		 * Thread.sleep() no es una técnica de espera recomendada para pruebas automatizadas, ya que pausa la ejecución de manera estática sin tener 
		 * en cuenta si un elemento está disponible o no.(It HALTS the execution)
		 * Puede causar retrasos innecesarios y hacer que las pruebas sean menos eficientes.
		 * Su uso puede ser ocasional, pero se debe evitar en favor de las esperas explícitas o implícitas.
		 * NO es parte de Selenium web driver, es parte de JAVA
		 * It will no listen DOM, an dyou will no know the results that are loading
		 * It will no resume it execution , it will keep on waiting for n seconds
		 * Because there no reason to wail n number of second if the page is already loaded
		 * Implicit wait has an smart mechanism to come out that
		 * Explciit wait has an smart mechanis to target one location or specific scenario
		 * Thread.slepp is listening to DOM


		 * FLUENT WAIT:
		 * El Fluent Wait es similar al Explicit Wait, pero ofrece una mayor flexibilidad en términos de configuración y definición de condiciones.
		 * Permite definir un período de espera personalizado, intervalos de tiempo y condiciones personalizadas.
		 * Ejemplo de uso:
		 * Wait<WebDriver> wait = new FluentWait<>(driver)
		 * .withTimeout(Duration.ofSeconds(30))
		 * .pollingEvery(Duration.ofSeconds(5))
		 * .ignoring(NoSuchElementException.class);
		 * WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("elementId")));

 
		 * NOTA:
		 * se recomienda el uso de Esperas Explícitas (Explicit Wait) o Esperas Fluídas (Fluent Wait) en lugar 
		 * de Esperas Implícitas (Implicit Wait) o pausas estáticas (Thread Sleep) en pruebas automatizadas, 
		 * ya que ofrecen un mayor control y flexibilidad para garantizar que las acciones se realicen cuando los elementos estén listos
		 * 


		 * QUESTION INTERVIEW: * What was the ideal strategy of using sychronization in selenium web driver?
		 * Implicit and Explicit combination of this both is an ideal solution
		 * Both are combined and used to achieve synchronization successfully in real time projects
		 * */
		
	}

}
