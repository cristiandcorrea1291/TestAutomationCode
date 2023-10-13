package seccion3;

import java.util.ArrayList;

public class ArraylistVsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video 25, sección 3
		
		//ARRAYLIST
		//You can increase/grow the size of an array dynamically using the arrayList
		// ArrayList es una clase de java y proviene del paquete importado import java.util.ArrayList;
		//create object of that class
		// then you can access the methods of the class by calling Object.Method
		//I'm creating object "a" of the array list here
		// claseArrayList Objeto = new ArraList();
		// asi ArrayList a =  new ArrayList()
		//creo el objeto a de tipo String
		ArrayList<String> a = new ArrayList<String>(); //arraylist que guarda valores de tipo string
		//Access to method of the class-->Object.Method
		a.add("Katherine"); //agregar valores al arrayList
		a.add("Dana");
		a.add("Angela");
		a.add("Max");
		a.add("Samuel");
		a.add("Tres");
		
		a.remove(5); //eliminar el valor de la /index indicado
		
		a.get(1);	//Extraer el valor del index indicado
	
		System.out.println(a.get(3)); //extraer el vlaor del index indicado e imorimirlo en la consola
		
		
		//   ARRAYS
		//You're getting values and initializated later in the script
		//the memory allocation is done from the beginning
		// it wont be posible increase the SIZE of the array
		//Also you are  initializing in the beginning only
		//Static array == array initialized with values and a defined size
		//int [] arr = new int[5]; //aqui digo cuantos elementos/posiciones voy a almacenar 
		//arr [index] = [value];  Inicializamos el arreglo con valores para cada posición o index
		//arr [0]=1;		
		//arr [1]=2;		
		//arr [2]=4;		
		//arr [3]=5;		
		//arr [4]=6;
		//
		//int[] arr2 = {1,2,4,5,6,8,9,10,122};
		
		
	}

}
