package seccion19;

import java.util.List;

import org.openqa.selenium.WebElement;

import rahultshettyacademy.pageobjects.ProductCatalogue;

public class V161 {

	//VIDEO 161. Creating Abstract Components to reuse the common methods/code in framework
	
	
	//como crear codigo reusable, para acciones que se repiten varias veces a lo largo de los test
	//como las esperas explicitas, 
	
	//entonces organizamos todo por paquetes
	
	//1. creamos un paquete que se llama : -> rahulshettyacademy.AbstractComponents
	//2.y dentro de ese package creamos la clase ->AbstractComponents
	
	//queremos que la clase "rahulshettyacademy.AbstractComponents" se vuelva la clase padre de las otras PageObject clases
	//porque la clase "AbstractCompinets" va a contener/guardar todo el codigo para cosas que serán reusables
	
	//3. entonces, y para ello usaremos el concepto de herencia o inheritance con la palabra clave "extends"
	
	//4. Se crea el Action Method para codifgo resusable -> waitForElementToAppear
	
	//se ajusta la invocación de la super clases y sus contructores con la palabra reservada super(driver);
	
	
	
	/*
	 //en la clase SubmitOrderTest
	 se cambia la espera por el selector .mb-3 con el istado de productos
	 se guardan los productos en una lita de tipo webelement
	 
	 Así:
	 
			 //Action Method
			//esperar hasta que cargue la pagina del cart con los productos
			ProductCatalogue productCatalogue = new ProductCatalogue(driver);
				
			//Obtener todos los articulos y guardarlos en una lista
			List<WebElement> products = productCatalogue .getProductList();
		
		
	 * */
	
	
	
	
	
	
	
	
	
}
