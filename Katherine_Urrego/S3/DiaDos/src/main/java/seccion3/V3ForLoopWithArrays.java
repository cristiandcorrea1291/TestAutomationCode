package seccion3;

public class V3ForLoopWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//******************************************
				//Example1
				int [] arr = new int[5]; //aqui digo cuantos elementos/posiciones voy a almacenar 
				//arr [index] = [value];  Inicializamos el arreglo con valores para cada posición o index
				arr [0]=1;		//we are storing value 2 in the zero index of an array
				arr [1]=2;		//en la posición uno vamos a asignar el número o valor 
				arr [2]=4;		//e
				arr [3]=5;		//e
				arr [4]=6;		//aqui completamos los 5 valores del arreglo
						
				//Example2
				//array inicializando los valores directame4nte
				int[] arr2 = {1,2,4,5,6,8,9,10,122}; //en este array estamos asignado los valores a la variable directamente
				System.out.println("El valor del arreglo número 2 en la posición o index 2 es igual a: " + arr2[2]);
				System.out.println("El valor del arreglo número 2 en la posición o index 0 es igual a: " + arr2[0]);
				
				
				
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
				
				
				//*************************************************
				//ENHANCED FOR LOOP DECLARATION
				//In this lopp with element will be pick out
				// for (delcare variable : arrayName) 
				//1. Create another variable "S" type String to store the values
				//Ya que el array "nombre" es de tipo String, creamos la variables "s" de tipo stgring
				//
				//From this array "nombre" in every iteration, pick out one value that will be store in the s variable
				for(String s: nombre) {
					System.out.println("Ejemplo de Bucle For Mejorado o Enhanced For Loop: "+s);
				}
				
				//en el example 3 de array, se esta hacendo EXPLICITAMENTE el incremento en cada iteración 
				//y la condicion 
				//Mientras que en ENHACEND FOR LOOP se hace
				// la declaración, condicion e incremento automaticamente
				

	}

}
