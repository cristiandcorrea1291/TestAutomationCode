package Sesion17;

public class HijoPS2 extends HijoPS3  {

	int a;//variable goblal
	//Nombre del constructor: El nombre del constructor debe coincidir exactamente 
	//con el nombre de la clase. 
	public HijoPS2(int a){//constructor
	super (a);//clase padrepara activar el constructor
	this.a=a;//variable de la clase de otra variable
	}


	public int increment(int a)//Metodo increment 
	{
		//constructor
		a= a+1;
		return a;
	}
	
	
	public int decrement(int a)//Metodo decrement 
	{
		a= a-1;
		return a;
	}



	}
	


