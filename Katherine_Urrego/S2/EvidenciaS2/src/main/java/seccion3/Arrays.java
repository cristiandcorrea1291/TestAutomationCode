package seccion3;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//******************************************
		//ARRAYS in JAVA
		//arrays can store more tha one value or  multiple values in one sigle variable.
		//if you have a requirement of storing more than one value into a variable
		//so that variable it is called an array
		
		//I what t store multiple variables in a variable
		//SYNTAX
		// datatype SquareBrackets VariableName		
		// you give an operator called "new", you will actually create a memory for those many values what you are going to store in this variable
		// put the data type again, and the number of values that will be hold for the array.
		// this array is storing five ELEMENTS not values
		//this is how to declare an array in java
		int [] arr = new int[5]; //aqui digo cuantos elementos/posiciones voy a almacenar 
		//arr [index] = [value];  Inicializamos el arreglo con valores para cada posición o index
		arr [0]=1;		//we are storing value 2 in the zero index of an array
		arr [1]=2;		//en la posición uno vamos a asignar el número o valor 
		arr [2]=4;		//e
		arr [3]=5;		//e
		arr [4]=6;		//aqui completamos los 5 valores del arreglo
		
		
		
		//crearemos otro array inicializando los valores directame4nte
		int[] arr2 = {1,2,4,5,6,8,9,10,122}; //en este array estamos asignado los valores a la variable directamente
		
		// How to access to any item in this array
		// this will retrieve traer the value which is present in the second index of this array
		System.out.println("El valor del arreglo número 2 en la posición o index 2 es igual a: " + arr2[2]);
		System.out.println("El valor del arreglo número 2 en la posición o index 0 es igual a: " + arr2[0]);
		
		// we can also print all the values from an array by simply wrapping them
		//in one loop and you can iterate them
		
		//******************************************************
		//ARRAYS FOR LOOPS
		//This for loop can itarate over each element
		//and every element of this array
		//and can print values of it
		
		//--------------------------------
		//Syntax FOR LOOP using arrays
		//1. Create a variable, which will loop into the array . i=0
		//2. idicate how many times i will iterate on this array
		//lenght is a method to give you the size of the array
		//arr.leng helps
		//for  (variable iniciatizated in zero; 
		//i<arr.length;  is the condition/how many times the loop iterates 
		//i++  the increment of the value)
		for  (int i = 0; i<arr.length; i++) {
			System.out.println("En la iteración " +i+ " el array es: "+ arr[i]);
			
		}
		//the array stops till the condition will be agree
		
		
		//Example 2, we will print the values of the array
		for(int j=0; j<arr2.length; j++) {
			System.out.println("En el arreglo 2, en la posición: "+j+ " el valor es: "+ arr2[j]);
		}
		
		
		//Example 3
		//An array with strings o characters in their values
		// when is an String array use {} curly brackets to declare the values of the element in every index
		String[] nombre ={"Katherine", "Estefania", "Samuel"};
		for ( int i=0; i<nombre.length;i++) {
			System.out.println("Ejemplo 3, El nombre guardado en la posición "+i+ " es: "+nombre[i]);
		}
				
				
				

	}

}
