package Java_Concepts;

public class Metodos {
	public static void main(String[] args) {
		
		Metodos d = new Metodos();
		String name = d.getData();
		//String name = getData();
		System.out.println(name);
		
		Metodos_2 d1 = new Metodos_2();
		d1.getUserData();
		getData2();
		
			}

    //Why Metodo
	public  String getData()
	{
	System.out.println("hello World");
	return "Rahul Shetty";
	}
	
	public static String getData2()
	{
	System.out.println("hello World");
	return "Rahul Shetty";
	}
	
}
