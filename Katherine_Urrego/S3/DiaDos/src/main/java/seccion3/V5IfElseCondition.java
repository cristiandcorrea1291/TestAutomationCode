package seccion3;

public class V5IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,8,9,10,122};
		
		//Example 1:
		//from this array, Validate and print the values which are multiples of 2 
		//the output must be : 2,4,8,10,122
		
		//IF 
		// if (condition ){
		//      Si la condicion es TRUE
		//		que pasa si cumple la condición
		//	}
		// else {
		//		si la condicion es FALSE
		//		que vamos a ejecutar cuando la condicion es falsa o no se cumple
		// }
		
		//repetiremos la iteración segun el length del arreglo
		for (int i=0; i<arr2.length;i++) {
			if(arr2[i] % 2 ==0) {	//solo los valores que al dividir por dos su residuo sea cero
				System.out.println(arr2[i] + " es multiplo de 2");
				//break;
			}	
			else {
				System.out.println(arr2[i] + " NO es multiplo de 2");
			}
		}
		
		System.out.println("\\n\\n\\n");
		//break;
		//It a keyword which simply exit the for loop
		for (int i=0; i<arr2.length;i++) {
			if(arr2[i] % 2 ==0) {	//solo los valores que al dividir por dos su residuo sea cero
				System.out.println(arr2[i] + " es multiplo de 2");
				//break;
			}	
			else {
				System.out.println(arr2[i] + " NO es multiplo de 2");
			}
		}
		
	}

}
