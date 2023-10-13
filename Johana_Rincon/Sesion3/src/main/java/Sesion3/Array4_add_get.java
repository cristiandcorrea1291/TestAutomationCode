package Sesion3;

import java.util.ArrayList;

public class Array4_add_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array de lista ejemplo con a.dd a get
		ArrayList <String>a =new ArrayList();//clase
		a.add("Raul");
		a.add("Diana");
		a.add("Academy");
		a.add("Selenium");
		//trae la posocion del arreglo 3 
		//System.out.println("Esta es la parte normal trayendo una parte especifica la posicion 3 del arreglo");
		//System.out.println(a.get(3));
		
		//registros 
	//	System.out.println("\n Este for hace lo mismo pero con get trae todos los registros del arreglo");
		//for (int i=0; i<a.size();i++)
	//	{
		//	System.out.println(a.get(i));
		//}
		
		//trae todos los registros con val 
	//	System.out.println(" \n Esta parte hace lo mismo con val trae los datos del arreglo");
	//	for (String val :a)
	//	{
	//		System.out.println(val);
	//	}
		// para validar una lista en automtizacion buscar un nombre en especifico
		System.out.println("Util en automatizacion para validar listas respuestra true o false");
		System.out.println(a.contains("selenium"));
		
		//trae el arreglo 3 es decir Selenium
		System.out.println(a.get(3));
		
			//trae a todo los datos del arrego con size
		//for( int i=0; i<a.size(); i++)
	//	{
		//	System.out.println("Trae todos los datos del arreglo " ");
		//	System.out.println(a.get(i));
		//}
		
		//no va
		//metodo con val del arreglo 
		//for (String val :a)
		//{
			//int i = 0;
			//System.out.println(a.get(i));
		}

	}


