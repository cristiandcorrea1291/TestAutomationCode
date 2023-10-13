package seccion3;

import java.util.ArrayList;
import java.util.Arrays;

public class V7ArrayListWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Video 26, sección 3
		
		ArrayList<String> a = new ArrayList<String>(); //arraylist que guarda valores de tipo string
		a.add("Katherine"); //Access to method of the class-->Object.Method
		a.add("Dana");		//add more values to the arraylist using add method
		a.add("Angela");
		a.add("Max");
		a.add("Samuel");
		a.add("Tres");
		a.remove(5); //eliminar el valor de la /index indicado
		System.out.println(a.get(3)); 
		
		System.out.println("----------------------");
		
		//ArrayList With For Loop
		//to get the size of an araylist, use the size method
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));//Retrieve/Extraer e imprimir el valor del index dinamicamente
		}
		
		System.out.println("----------------------");
		
		//arraylist con for Mejorado o Enhanced for
		for(String valorval :a) {
			System.out.println(valorval);
		}
		
		System.out.println( "\n*************************");
		
		//If I want to know if whether item is present  or not in the array
		////contains method returns TRUE if this list contains the specified element.
		//More formally, returns true if and only if this list contains at least one element
		a.contains("Selenium");  //validar si el arraylist contiene "selenium" dentro de sus elementos
		
		//imprimir en pantalla
		System.out.println(a.contains("Selenium"));// el valor selenium NO está incluido en el array ==False
		System.out.println(a.contains("Max"));// el valor Max SI está incluido en el array == TRUE
		
		System.out.println("----------------------");
		//If we hace an arraylist with so many values inside it, and
		//if you want to check any value presented in the arraylist
		// use contains method
		
		
	}

}
