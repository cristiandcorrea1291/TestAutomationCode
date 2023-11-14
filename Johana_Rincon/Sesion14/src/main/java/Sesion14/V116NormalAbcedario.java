package Sesion14;

import java.util.ArrayList;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.testng.annotations.Test;

public class V116NormalAbcedario {
	 public static void main(String[] args) {
	        regular();
	        streamFilter();
	    }

	    public static void regular() {
	        ArrayList<String> names = new ArrayList<String>();
	        names.add("Abhijeet");
	        names.add("Abhijeet");
	        names.add("don");
	        names.add("Aleya");
	        names.add("Alsss");
	        names.add("Alsss");

	        int count = 0; // Initialize the count variable to 0

	        for (int i = 0; i < names.size(); i++) {
	            String actual = names.get(i);

	            if (actual.startsWith("Als")) {
	                count++;
	            }
	        }

	        System.out.println("Count of names starting with 'Als': " + count);
	    }
@Test
	    public static void streamFilter() {
	        ArrayList<String> names = new ArrayList<String>();
	        names.add("Abhijeet");
	        names.add("Abhijeet");
	        names.add("don");
	        names.add("Aleya");
	        names.add("Alsss");
	        names.add("Alsss");

	        Long c = names.stream().filter(s -> s.startsWith("A")).count();
	        System.out.println(c);
	    }
	}
