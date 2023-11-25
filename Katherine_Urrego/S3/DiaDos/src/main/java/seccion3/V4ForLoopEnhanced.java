package seccion3;

public class V4ForLoopEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENHANCED FOR LOOP DECLARATION
		//In this lopp with element will be pick out
		// for (declare variable : arrayName) 
		//1. Create another variable "S" type String to store the values
		//Ya que el array "nombre" es de tipo String, creamos la variables "s" de tipo stgring
		
		
		String[] nombre = {"Max", "Milo","Maru"};
		
		//From this array "nombre" in every iteration, pick out one value that will be store in the s variable
		// for (DataType Variable : array){
		//              content
		//}
		for(String s: nombre) {
			System.out.println("Ejemplo de Bucle For Mejorado o Enhanced For Loop: "+s);
		}
				
		//en el example 3 de array, se esta hacendo EXPLICITAMENTE el incremento en cada iteración 
		//y la condicion 
		//Mientras que en ENHACEND FOR LOOP se hace
		// la declaración, condicion e incremento automaticamente
		// the variable S is cathing the elements inte output		
		
		
	}

}
