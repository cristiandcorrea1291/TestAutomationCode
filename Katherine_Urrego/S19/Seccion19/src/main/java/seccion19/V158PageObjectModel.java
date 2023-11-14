package seccion19;

public class V158PageObjectModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//video 158. What is Page object model? Advantages of its implementation
		
		
		/*
		 
		 PAGE OBJECT CLASES
		 
		 Login							Tests
		 
		 Producto
		 Catalogue
		 
		 Checkout
		 
		 
		 Confirmation
		 
		 
		 * Put all locator in one single test, so that all of our test simly blindly
		 * access them to reduce maintanance
		 
		 * */
		
		/*
		 * Understand PAGE OBJECT design patern
		 * 

	
		 * Page Object Model (POM) 
		 * Es un patrón de diseño utilizado en automatización
		 * de pruebas con Selenium WebDriver en Java (u otros lenguajes) para organizar
		 * y mantener las pruebas de forma más eficiente y legible. 
		 * 
		 * El POM se utiliza para separar la lógica de la prueba de la estructura y los elementos de la
		 * página web que se está probando. Esto hace que el código sea más mantenible y
		 * escalable.
	

		 * A continuación, se describen los conceptos clave del Page Object Model en
		 * Java para Selenium WebDriver:
		 *

		 * 1. Page Objects: 
		 * Los Page Objects son clases Java que representan las páginas o
		 * componentes de una aplicación web. Cada Page Object contiene métodos para
		 * interactuar con los elementos de esa página, como hacer clic en botones,
		 * llenar formularios, verificar contenido, etc. Los Page Objects encapsulan la
		 * lógica de interacción con la página.
		

		 * 2. Element Locators: 
		 * Los Page Objects contienen localizadores de elementos (como
		 * IDs, nombres, clases, selectores CSS, XPath, etc.) que se utilizan para
		 * identificar y acceder a los elementos en la página web.
		

		 * 3. Acciones y Comportamiento:
		 *  Los Page Objects también contienen métodos que
		 * definen las acciones que se pueden realizar en la página, como hacer clic en
		 * un botón, enviar texto a un campo de entrada, seleccionar elementos de una
		 * lista desplegable, etc.
		

		 * 4. Separación de Capas: 
		 * El POM fomenta la separación de la lógica de la prueba
		 * (escritura de pruebas) de la lógica de interacción con la página (los Page
		 * Objects). Esto mejora la modularidad y facilita la reutilización de código.
		

		 * 5. Mantenimiento Sencillo: 
		 * Si la estructura de la página web cambia, solo
		 * necesitas actualizar el Page Object correspondiente en lugar de modificar
		 * todas las pruebas.
		

		 * 6.Mejora la Legibilidad: Las pruebas se vuelven más legibles y concisas, ya que
		 * se centran en lo que se está probando y no en los detalles de la interacción
		 * con la página.
	

		 * 7. Reutilización de Código: Puedes reutilizar Page Objects en múltiples pruebas,
		 * lo que ahorra tiempo y esfuerzo.
	

		 * 8. Facilita la Colaboración: El equipo de desarrollo y el equipo de pruebas
		 * pueden trabajar de manera más eficiente, ya que los Page Objects definen una
		 * interfaz clara para la interacción con la aplicación web.


		 * En resumen:
		 * El Page Object Model es una práctica recomendada en
		 * automatización de pruebas con Selenium WebDriver en Java que promueve la
		 * organización, mantenibilidad y reutilización del código de prueba al separar
		 * la lógica de la prueba de la lógica de interacción con la página web. Cada
		 * página o componente de la aplicación web tiene su propio Page Object, lo que
		 * facilita la administración de las pruebas en proyectos más grandes.
		 * 
		 * 
		 */

	}

}
