package Sesion17;

public class HijoPS2 extends HijoPS3  {

	int a;//variable goblal
	//Nombre del constructor: El nombre del constructor debe coincidir exactamente 
	//con el nombre de la clase. 
	public HijoPS2(int a){//constructor
	super (a);//clase padre para activar el constructor
	this.a=a;//variable  goblal(a.varible global),(a local del color cafe )
	}


	public int increment(int p)//Metodo increment 
	{
		//constructor
		p= p+1;
		return p;
	}
	
	
	public int decrement(int a)//Metodo decrement 
	{
		a= a-1;
		return a;
	}



	}
	


