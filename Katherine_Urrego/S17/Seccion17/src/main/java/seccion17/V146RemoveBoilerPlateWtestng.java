package seccion17;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class V146RemoveBoilerPlateWtestng {

	public static void main (String[] args)  {
		//video 146. How TestNG Annotations help with Inheritance to remove boilerPlate code in Test
		
		//que es INHERITANCE o   en java?
		//It means you can acquire que properties of ypur parent class
		//En Java, la herencia se implementa mediante la palabra clave "extends"
		
		
		//EJERCICIO 1
		//Clase padre PS
		//Clase hija PS1
		//"extends" para herencia

		
		//------------------------------------------------------------------------------------------------------------------------
		/*
		 CLASE PADRE
		public class PS {
			public void doThis() {
				System.out.println("I am here... Clase padre PS");
			}
			
			@BeforeMethod
			public void beforeRun() {
				System.out.println("Run me first");
			}
			
			@AfterMethod
			public void afterRun() {
				System.out.println("Run me last");
			}
		}
		
		#############################################################################3
		CLASE HIJA
		//Clase padre PS
		//Clase hija PS1
		//"extends" para herencia
		
		public class PS1 extends PS {
			//video 146. How TestNG Annotations help with Inheritance to remove boilerPlate code in TesT
			//Methods, variables
			
			@Test
			public void test() {			
				doThis(); //se puede llamar DIRECTAMENTE a un metodo de otra clase por el "extends" aue permite heredar los metodos de la clase padre
			}
		}
		 */
		
		
		
		
		
		//---------------------------------------------------------------------------------------------------------------
		/*
		 * La HERENCIA o INHERITANCE s un concepto fundamental de la programación
		 * orientada a objetos (POO) que permite la creación de clases nuevas basadas en
		 * clases existentes
		 * 
		 * La herencia permite que una clase (llamada subclase o clase derivada), herede
		 * atributos y métodos de otra clase (llamada superclase o clase base)
		 * 
		 * Esto implica que la subclase adquiere las características (campos y métodos)
		 * de la superclase y puede agregar sus propios campos y métodos o modificar los
		 * heredados según sea necesario
		 * 
		 * En Java, la herencia se implementa mediante la palabra clave "extends"
		 * 
		 * La herencia en Java permite:
		 * 1. la reutilización de código, lo que significa que
		 * no es necesario volver a escribir el mismo código en múltiples clases si
		 * varias clases comparten ciertas características. 
		 * 
		 * 2. También facilita la organización y la jerarquía de clases, 
		 * lo que puede hacer que el código sea más claro y mantenible. 
		 * 
		 * 
		 * OJO: Sin embargo, la herencia debe utilizarse con cuidado para evitar problemas de diseño como:
		 * -  la dependencia excesiva de las clases base o
		 * -  una jerarquía de clases compleja.
		 * 
		
				class Animal {
				    String nombre;
				    
				    public void comer() {
				        System.out.println(nombre + " está comiendo.");
				    }
				}
				
				class Perro extends Animal {
				    public void ladrar() {
				        System.out.println(nombre + " está ladrando.");
				    }
				}
				
				public class Main {
				    public static void main(String[] args) {
				        Perro miPerro = new Perro();
				        miPerro.nombre = "Max";
				        miPerro.comer();  // Método heredado de la clase Animal
				        miPerro.ladrar(); // Método de la subclase Perro
				    }
				}



		 * En este ejemplo, la clase Perro hereda de la clase Animal. 
		 * Esto significa que:
		 * 1. Perro tiene acceso al campo nombre y al método comer() de la clase Animal.
		 * 2. Además, la subclase Perro agrega su propio método ladrar(). 
		 * 3. Cuando se crea un objeto Perro, puede acceder a todos estos métodos y campos.

		 */
		
	}
	
	
}
