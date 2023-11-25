package seccion3;

public class V8StringUseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 27, seccion 3
		//String: in JAVA is an OBJECT that represents a secuence of characters
		//object created with string literal
		
		//NOTE: ¿How many ways you can create an string?
				//In two ways/forms
				//First form: as an String Literal
				//Second form: using new memory allocate operator
		
		//String s= "Katherine Melissa Urrego";
		//String s1 = "Melissa Urrego";
		//NOTE: If both values are same, then ONE object is created...
		// so Java wont create a new object, Java just will refer to the existing
		
		//String s3= "Hello";
		
		// in the object "s2" I am creating a value called "welcome"
		// object created with "new" keyword
		// SO with new keyword, no matter if it's the same value.
		//It will create a new object explicitly in the memory space.
		//String s2 = new String ("Welcome");
		
		
		//SPLIT METHOD IN JAVA
		//how to access the methods present in the class? ->>Object.method
		//object.method(show a list of methods  that can be used with the object)
		String s= "Katherine Melissa Urrego";
		//s.split(" ");	 //Divide esta cadena entre coincidencias de la expresión regular dada.
		String [] splittedString = s.split("Melissa");//quita elemetos y ajusta el array
		System.out.println(splittedString[0]); //katherine
		System.out.println(splittedString[1]);//agrega espacio la posicion 2 del array , que ahora es Urrego 
		
		
		System.out.println(splittedString[1].trim());//Quita el espacio al principio del elemento en el index indicado
		
		System.out.println("\n\n*****************");
		//imprimir todos los caracteres del arreglo s
		for(int i=0; i<s.length(); i++) {
			s.charAt(i); //Give me the character present on the specified index
			System.out.println(s.charAt(i));//Imprime todos los caractes del arreglo s
			
		}
		
		System.out.println("\n\n*****************");
		//Imprimir del ultimo al primero, de reves
		// i equals to s.length()-1 because it starts from zerro index
		//en el arreglo s="Katherine Melissa Urrego"
		//El ciclo comienza desde ogerru assileM ....
		for(int i=s.length()-1; i>0; i--) {
			s.charAt(i); //Give me the character present on the specified index
			System.out.println(s.charAt(i));//Imprime todos los caractes del arreglo s

		}
		
		
		
	}

}
