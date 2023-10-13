package seccion3;

public class V9HowCreateMethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 28, seccion 3
		//¿CÓMO CREAR METODOS EN JAVA?
		//¿CÓMO ACCEDER A LA CLASE?
		//**************************************		
		//Metodo: lineas de código que se pueden reusar en cualquier momento
		//Why method - It wrapp a  set of lines of code in a block, and that block has a name
		//Para crear un método se hace FUERA del bloque del main
		
		
		//¿CÓMO ACCEDER A LA CLASE?
		//1.Crear un objeto de la  clase V9HowCreateMethodsInJava 
		V9HowCreateMethodsInJava  d = new V9HowCreateMethodsInJava (); 
		String nombre = d.getData();
		System.out.println(nombre);
		
		V8MethodsDemo2 d1 = new V8MethodsDemo2();
		d1.getUserData();
		
		
		//¿cómo podemos acceder a los metodos de la clase SIN crear un objeto?
		// solo marcamos al metodo como "static"
		//STATIC means that X method will be belong to class, NOT object
		System.out.println("\n\nMetodo con el acceso de nivel STATIC:");
		String libre = getData2(); //como acceder al metodo (que es STATIC) Sin usar objetos para llamar al metodo
		System.out.println(libre);
		
		System.out.println("\n\n llamo al Metodo SIN crear Objeto de la clase:");
		getData2(); //llamar al metodo getData2 SIN crear un objeto para la clase
		
	}
	
	//¿CÓMO CREAR METODOS EN JAVA?
	//Metodo: lineas de código que se pueden reusar en cualquier momento
	//Why method - It wrapp a  set of lines of code in a block, and that block has a name
	//Para crear un método se hace FUERA del bloque del main
	//Se declara el metodo pero se ejecuta a demanda
	
	// public/private void/int/String methodName (){
	//   
	//}
	
	//el "public" es un access modifier que permite que se pueda acceder al método que estoy creando desde otras clases
	//SÍ el public method RETURNS algo poner int/String
	//Sí el metodo NO RETORNA nada, poner VOID
	
	//
	public String getData() {
		System.out.println("Hello world");
		return "KMUC";
	}
	
	
	//*****************************
	//¿cómo podemos acceder a los metodos de la clase SIN crear un objeto?
			// solo marcamos al metodo como "static"
			//STATIC means that X method will be belong to class, NOT object
	//Eso significa que cualquier metodo, variable , etc que  declare estará atado al objeto de esa clase
	public static String getData2() {
		System.out.println("Hello world");
		return "KMUC";
	}
	
	
	
	//Class level access is NOT provided by giving "static" keyword
	
	
	
	
}
