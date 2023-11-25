package Sesion17;

import org.testng.annotations.Test;

public class HijoPs1 extends PadrePs {// herencia de las clases para llamas los metodos
//tener en cuenta en este ejercio estamos herado el metodo que tiene la clase do this

	@Test
	public void testRun()
	{
//crea una instancia de la clase hijops2, llama la hijops2 y elvalor 3 como argumento
		//al constructor de la clase 
		//hereda de la clase hijo2
		HijoPS2 Hijops2 =new HijoPS2(3);//parametros del  constructor
		int a = 3;
		//hereda de la clase padre 
		doThis();// Hereda el metodo doThis de la clase Padreps
		System.out.println("la suma de la clase Hijops2 (3+1):" +Hijops2.increment(3));//argumento 3, un suma con la clase Hijo2
		System.out.println("la resta de la clase Hijops2 (3-1):"+ Hijops2.decrement(3));//argumento 3 resta con la clase Hijo2
	
		//hereda de la clase Hijo 3 para la mutipliacion
		HijoPS3 HijoPS3 =new HijoPS3(3);//varible global
	
		//System.out.println("Multiplicacion  clase ps3, toma (9*3):"+ HijoPS3.multiplyTwo ());
	System.out.println("Multiplicacion  clase ps3, toma (8*3):"+ HijoPS3.multiplyTwo ());
	System.out.println("Multiplicacion  clase ps3, toma (8*3):"+ HijoPS3.multiplyThree (3));
		//aca da otro valor diferente.
		
	}
}