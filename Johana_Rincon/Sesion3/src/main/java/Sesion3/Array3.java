package Sesion3;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //arrays
			int[] arr=new int [6];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=4;
			arr[4]=5;
			arr[5]=6;	
			int [] arr2= {1,2,3,4,5,123,12};
			
		
			///ejemplo para la varible arr2 muestra el ante penultimo valor
			for (int i= 0; i<arr2.length; i++)//.length de un array en Java devuelve el número de elementos en ese array.
			{
				//muestra el ultimo valor del array
					System.out.println("Ejercicio del clico Loop muestra el ultimo y antepenultimo valor de arreglo ");
					System.out.println(arr2[i]);
			}
			
			

	}

}
