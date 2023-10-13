package Sesion3;

public class Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//metodo 
		Metodo d=new Metodo();
		String name=d.getData();
		//String name=getData();// se llama directo por que le metodo es estatico
		System.out.println(name);
		Metodo2 m1=new Metodo2();//clase
		m1.getUserData();//llamar al metodo 
		
	}
	
//public static String getData()//metodo como estatico pertenece  a la clase no al objeto
public  String getData()
	{
	System.out.println("hello");
	return "nombre";
	}
	public static String getData2()//metodo estatico
	{
		System.out.println("hello");
		return "nombre";
	}
	}
