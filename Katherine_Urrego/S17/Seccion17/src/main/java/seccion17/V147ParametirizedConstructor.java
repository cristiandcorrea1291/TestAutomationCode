package seccion17;

import org.testng.annotations.Test;

public class V147ParametirizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//147. How to pass values from test through Parameterized Constructor & this keyword
		
		//Tipos o fomas de llamar metodos
		//FORMA 1 (Video 146) por medio de la herencia o Inheritance
		//FORMA 2 (Video 147) por medio de un objeto de la clase XXX
		//Metodos reusables, 
		//creación de un constructor parametrizado
		//Uso de la palabra clave "this"
		
		
		
		//Tenemos
		// la clase padre PS
		//La clase hija PS1 
		//Creamos la clase PS2
		
		//declaro la variable a con un 3 -> int a=3;
		
		//Creamos la clase PS2 
		//creamos en PS2 un reusable method which actually increments the number by one digit
		//Se crea una instancia u objeto de la clase PS2 llamado "ps2obj" dentro y/o en la clase PS1
		
		//al ejecutar el codigo se imprime 1 en vez de cuatro
		//entendido que a=a+1 -> a=3+1=4
		//ya que no hay conexion entre los metodos,
		//se declaran argumentos en los metodos: -> public int increment(int a)
		//se enviar ARGUMENTOS a los mismos -> ps2obj.increment(3)
		//entonces se crea un CONSTRUCTOR
		
		//RESUMEN:
		//So that is how you can use your reusabel methods,
		//call them by creating objects
		//and also sending the all values that reusabñes methods needed on one single go
		//on object creationg  instead of again sending them as a parameters every time
		
		
		
		
		
		
		
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//Que es un CONSTRUCTOR
		/*
		public class Persona {
		    private String nombre;
		    private int edad;

		    // Constructor sin parámetros
		    public Persona() {
		        nombre = "Sin Nombre";
		        edad = 0;
		    }

		    // Constructor con parámetros
		    public Persona(String nombre, int edad) {
		        this.nombre = nombre;
		        this.edad = edad;
		    }

		    // Métodos para acceder a los campos (getters y setters)...
		}
		 
		 
		 * En este ejemplo, la clase Persona tiene dos constructores: uno sin parámetros
		 * y otro con parámetros. El constructor sin parámetros inicializa una instancia
		 * de Persona con valores predeterminados, mientras que el constructor con
		 * parámetros permite especificar el nombre y la edad al crear una instancia.
		 * 
		 * Puedes usar constructores para crear objetos y asegurarte de que estén en un
		 * estado inicial coherente. Los constructores son esenciales en la programación
		 * orientada a objetos para garantizar que los objetos se inicialicen
		 * correctamente antes de que se utilicen
		 
		 */
		
		
		/*
		 * En Java, un constructor es un tipo especial de método que se utiliza para
		 * inicializar un objeto de una clase. Los constructores tienen el mismo nombre
		 * que la clase en la que se definen y no tienen un tipo de retorno explícito.
		 * Su propósito principal es asignar valores iniciales a los campos (variables
		 * de instancia) de un objeto cuando se crea una nueva instancia de esa clase.
		 * 
		 * Aquí hay algunas características clave de los constructores en Java:
		 * 
		 * Mismo nombre que la clase: Un constructor tiene el mismo nombre que la clase
		 * a la que pertenece. Esto permite que Java lo identifique como el constructor
		 * de esa clase.
		 * 
		 * No tienen tipo de retorno: A diferencia de otros métodos en Java, los
		 * constructores no tienen un tipo de retorno explícito. No se utiliza void ni
		 * ningún otro tipo. Su objetivo es inicializar el objeto, no devolver un valor.
		 * 
		 * Pueden aceptar parámetros: Los constructores pueden aceptar parámetros, lo
		 * que les permite recibir valores iniciales que se utilizarán para configurar
		 * el objeto. Estos parámetros se utilizan para asignar valores a los campos de
		 * la clase.
		 * 
		 * Pueden sobrecargarse: Puedes definir múltiples constructores en una clase
		 * utilizando diferentes listas de parámetros. Esto se llama sobrecarga de
		 * constructores y te permite crear instancias de la clase de diferentes
		 * maneras.
		 */
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		
		
		
		//EVIDENCIA DEL EJERCICIO DEL VIDEO
		/*
		public class PS1 extends PS {		
			@Test
			public void testRun() {	

				//PS1 es hija de PS, NO de PS2... (no usa el "extends PS2")
				//por lo que para usar los metodos de PS2 DEBEMOS crear una instancia/objeto de la clase PS2
				//con este objeto "ps2obj" podemos llamar a todos los metodos presentes en la clase PS2
				
				PS2 ps2obj = new PS2(3); //CONSTRUCTOR PARAMETRIZADO - PARAMETERIZED CONSTRUCTOR
				int a = 3;
				doThis(); // clase padre
				System.out.println(ps2obj.increment());
				System.out.println(ps2obj.decrement());
		
			}
		}
		
		//----------------------------------------------------------------------------------------------
		
		package seccion17;
		public class PS2 {
			//it is set here
			int a; //It is called GLOBAL and CLASS VARIABLE
			
			public PS2(int a) { //It is called INSTANCE VARIABLE
				// TODO Auto-generated constructor stub
				
				//you can call your own class variables with this dot keyword 
				//this.keyword
				 this.a = a; //"this" Keyword,  refers to the current CLASS Variables
				 
				 //that means you are assigning the variable A what you are getting from ypur class to another class local variable
				 //it happens automatically, this assignment happens by default
			}

			
			//Default ConstructoR
			//¿cómo funciona el metodo "increment" //si se envia cualquier valor a este metodo
			//este metodo va a incrementar el valor del numero en 1 unidad //y enviará de regreso el numero a
			public int increment() {
				a = a+1; //add 1 number to the variable "a"
				return a; //return that integer
			}
			
			
			public int decrement() {
				a = a-1; //add 1 number to the variable "a"
				return a; //return that integer
			}
				
		}
		
		*/
		
		
		
		
	}
	
}
