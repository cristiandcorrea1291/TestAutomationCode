package seccion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class V7ConvertFromArrayToArrayList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Video 26, sección 3
			List<String> a = new ArrayList<String>(); //arraylist que guarda valores de tipo List
			a.add("Katherine"); //Access to method of the class-->Object.Method
			a.add("Dana");		//add more values to the arraylist using add method
			a.add("Angela");
			a.add("Max");
			a.add("Samuel");
			a.add("Tres");
			a.remove(5); //eliminar el valor de la /index indicado
			System.out.println(a.get(3)); 
			System.out.println("##########################");
			
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
			
			//imprimir en pantalla
			System.out.println(a.contains("Selenium"));// el valor selenium NO está incluido en el array ==False
			System.out.println(a.contains("Max"));// el valor Max SI está incluido en el array == TRUE
			System.out.println("::::::::::::::::::::::::::::::");
			
			//validar si un item  está presente en un arraylist
			System.out.println(a.contains("selenium"));
			
			
			
			
			//ARRAY LIST has so extra methods that are flexible
			// with those methods we can add,remove, clear an array list
			
			//******************************************
			//CONVERT AN ARRAY to ARRAYLIST
			
			String[] frutas = {"Manzana","Fresa", "Uvas", "Piña"};
			//in java there is a class called "Arrays"
			//there is a method called "asList" ---> for convert a normal array to arraylist
			//el arreglo "frutas" se convierte a un arraylist "variosArrayList"
			List <String> variosArrayList = Arrays.asList(frutas); //
			System.out.println( "\n");
			variosArrayList.contains("Fresa");
			System.out.println(variosArrayList.contains("Fresa"));
			

		
	}
}
