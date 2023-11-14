package seccion17;

//Clase padre PS3
//Clase hija PS2
//"extends" para herencia
public class PS2 extends PS3{
	
	//it is set here
	int a; //It is called GLOBAL and CLASS VARIABLE
	
	
	public PS2(int a) { //It is called INSTANCE VARIABLE
		// TODO Auto-generated constructor stub
		
		//v148
		super (a); //your parent class constructor is Invoked ->> invoca a constructor de la clase padre , en este caso PS3 = PADRE
		
		//you can call your own class variables with this dot keyword 
		//this.keyword
		 this.a = a; //"this" Keyword,  refers to the current CLASS Variables
		 
		 //that means you are assigning the variable A what you are getting from ypur class to another class local variable
		 //it happens automatically, this assignment happens by default
	}

	
	//Default ConstructoR

	//¿cómo funciona el metodo "increment"
	//si se envia cualquier valor a este metodo
	//este metodo va a incrementar el valor del numero en 1 unidad
	//y enviará de regreso el numero a
	public int increment() {
		a = a+1; //add 1 number to the variable "a"
		return a; //return that integer
	}
	
	
	public int decrement() {
		a = a-1; //add 1 number to the variable "a"
		return a; //return that integer
	}
	
	
	/* EN a linea 6 , Al declarar -> public class PS2 extends PS3{} se aplica que PS3 hereda a PS2 sus metodos....
	 * entonces el PADRE =  CLASE BASE  = SUPERCLASE es PS3
	 * y la clase HIJA = SUBCLASE es PS2
	 * 
	 * 
	 * En resumen,el "super(a); " de la linea 16 en el constructor de PS2, llama al constructor de PS3 con el argumento a, 
	 * permitiendo que la superclase realice su inicialización antes de que la subclase realice la suya. 
	 * 
	 * Esto es útil para garantizar que el estado inicial de la superclase sea coherente antes de que la subclase
	 * agregue su propia lógica de inicializació
	 * 
	 */
	

	
	//La keyword SUPER(); en la linea 16...  solo se usa cuando HAY HERENCIA o INHERITANCE en el lugar.... 
	//cuando NO HAY una superclase padre la palabra clave "super();"  NO VA a ningu lado
	
}
