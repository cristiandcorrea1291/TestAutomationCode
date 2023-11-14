package seccion17;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Clase padre PS
//Clase hija PS1
//"extends" para herencia

public class PS1 extends PS {

	//video 146. How TestNG Annotations help with Inheritance to remove boilerPlate code in TesT
	//Methods, variables

	
	@Test
	public void testRun() {	
		/*
		PS obj = new PS(); //creamos un objeto de a clase PS
		obj.doThis();	//se accede a los metoso a traves de un objeto de la clase PS
		*/
		
		
		//PS1 es hija de PS, NO de PS2... (no usa el "extends PS2")
		//por lo que para usar los metodos de PS2 DEBEMOS crear una instancia/objeto de la clase PS2
		//con este objeto "ps2obj" podemos llamar a todos los metodos presentes en la clase PS2
		
		PS2 ps2obj = new PS2(3); //CONSTRUCTOR PARAMETRIZADO - PARAMETERIZED CONSTRUCTOR
		int a = 3;
		doThis(); // clase padre
		System.out.println(ps2obj.increment());
		System.out.println(ps2obj.decrement());
		
		
		//PS3 ps3obj = new PS3(3); //CONSTRUCTOR
		//puedo declararlo así, ya que PS2 es hijo de PS3, es decir PS3 le extiende a PS2 sus metodos
		System.out.println(ps2obj.multiplyThree());
		System.out.println(ps2obj.multiplyTwo());
		
	}
	
	

}
