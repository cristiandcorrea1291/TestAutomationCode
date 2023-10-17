package Java_Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayslist_Arrays {
	public static void main(String[] args) {
		
		//Arrays
		int[] arr = new int[5]; //5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
	int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
	//2,4,6,8,10,122
	//check if array has mulktiple of 2
	
	for(int i = 0; i<arr2.length;i++)
	{
		if (arr2[i] % 2 == 0)
				{
			System.out.println(arr2[i]);	
			break;
				}
		else
		{
			System.out.println(arr2[i] +"is nor multiple of 2");	
		}
	}

	List<String> a = new ArrayList<String>();	//creacion del objeto de la class - objeto . method
	a.add("rahul");
	a.add("shetty");
	a.add("academy");
	a.add("selenium");
	System.out.println(a.get(3));
	
	for(int i = 0; i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	System.out.println("*******");
	for(String val :a)
	{
		System.out.println(val);
	}
	
//item is present in Arraylist
	System.out.println(a.contains("Selenium"));
	String[] name = {"rahul","shetty","selenium"};
	List<String>  nameArraysList = Arrays.asList(name);
	nameArraysList.contains("selenium");
	
	}
}
