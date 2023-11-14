package Sesion14;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class V116TestIng {

    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Abhijeet");
        names.add("don");
        names.add("Aleya");
        names.add("Alsss");
        names.add("Alsss");

        int count = 0; // Inicializa la variable de conteo en 0

        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);

            if (actual.startsWith("Als")) {
                count++;
            }
        }

        System.out.println("Count of names starting with 'Als': " + count);
    }

    @Test
    public void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("A");
        names.add("Abhij");
        names.add("don");
        names.add("johana");
        names.add("ssap");
       

      
        
        // Contar la cantidad de nombres que comienzan con "A"
        long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
        
        
        long d=Stream.of("Abhijeet","don","Abhijeet","don","Aleya").filter(s->
        {
        	s.startsWith("A");
        	return true;
        }).count();
        System.out.println("imprimie el total de nombres con la letra A"+d);
        
     
        
        //print all the names of array
      
     // Imprimir todos los nombres que tienen más de 4 caracteres
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println("Imprime los que tienen 4 caracteres"+s));
        
        }
        		
        	
    }


