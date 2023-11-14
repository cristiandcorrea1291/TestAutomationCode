package seccion17;

public class V148SuperKeyword {
	
	//video 148. Usage of Super keyword in the Constructor to pass values to Parent Clas
	
	//Ejercicio
	//add some more methods regarding to multiplication 
	//the say no to use utility clas sbecause they wil use for the additions and subtracction operations
	//so for  multiplicatios they were asked to create a separate utility class
	
	//attenduig the requirements
	//we create a new utiluty class -> PS3
	//create the multiply method
	//create an instace of the object PS3 in the PS1 class
	
	//heredo los metodos de la clase PS3 a la clase PS2 con "estends"
	//Entonces los metodos de PS3 ahora estan disponibles en PS2
	
	//public class PS2 extends PS3{}

		//Clase padre PS3
		//Clase hija PS2
		//"extends" para herencia
	
	
	
	//minuto 9 del video....en el constructor de la clase PS2 usamos la KEYWORD -> super(a);
	
	//super (a);
		// means -> your parent class constructor is Invoked ->> invoca a constructor de la clase padre , en este caso PS3 = PADRE
	
	
	/*
	 * La instrucción super(a); que se encuentra en el constructor de la clase PS2
	 * se utiliza para invocar el constructor de la clase base (superclase) PS3 con
	 * el argumento a. Esta es una forma de inicializar la parte heredada de la
	 * clase PS2.
	 * 
	 * Cuando una subclase como PS2 se extiende de una superclase como PS3, la
	 * superclase puede tener uno o más constructores. En el constructor de la
	 * subclase, puedes usar super(...) para llamar a uno de los constructores de la
	 * superclase. En este caso, super(a) se utiliza para llamar a un constructor de
	 * PS3 que toma un argumento a.
	 * 
	 * La razón para hacer esto es asegurarse de que la superclase (en este caso,
	 * PS3) pueda inicializar sus propios campos o realizar otras acciones
	 * necesarias antes de que la subclase (en este caso, PS2) realice su propia
	 * inicialización.
	 * 
	 * En resumen, super(a); en el constructor de PS2 llama al constructor de PS3
	 * con el argumento a, permitiendo que la superclase realice su inicialización
	 * antes de que la subclase realice la suya. Esto es útil para garantizar que el
	 * estado inicial de la superclase sea coherente antes de que la subclase
	 * agregue su propia lógica de inicialización.
	 */
	
	
	//La keyword SUPER(); solo se usa cuando hay HERENCIA o INHERITANCE en el lugar.... 
	//cuando NO HAY una superclase padre la palabra clave "super();"  NO VA a ningu lado
	
	
}
