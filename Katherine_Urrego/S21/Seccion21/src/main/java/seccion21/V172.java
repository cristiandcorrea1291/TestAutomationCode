package seccion21;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import rahultshettyacademy.pageobjects.CartPage;
import rahultshettyacademy.pageobjects.CheckoutPage;
import rahultshettyacademy.pageobjects.ConfirmationPage;
import rahultshettyacademy.pageobjects.OrderPage;
import rahultshettyacademy.pageobjects.ProductCatalogue;

public class V172 {

	//Video 172: Agenda of implementing Parameterization into tests with TestNG Data provide

	
	//PARTE 1
	/*
		@Test (dataProvider="getData", groups= {"Purchase"}) //video 172
		public void submitOrder(String email, String password, String productName) throws IOException, InterruptedException {
	    	
	    	// login usando Action Methods
			ProductCatalogue productCatalogue = landingPage.loginApplication(email, password);
	    	
	    	//codigo ..... que hay en el submit test
		
		}
		
		// video 172
		@DataProvider
		public Object[][] getData() {
			return new Object[][] { { "katherine-melissa.urrego@capgemini.com", "Katherine2023*", "ZARA COAT 3" },
					{ "katherine-melissa.urrego@capgemini.com", "Katherine2023*", "ADIDAS ORIGINAL" } };
		}
		
	}



	Se crea el Test.xml llamado Purchase para ejecutar el test agrupado en PURCHASE   <include name="Purchase"></include> Como se muestra a continuación:
	
			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
			<suite parallel="tests" name="Suite">
			  
			  <groups>
				  <run>
					  <include name="Purchase"></include>
				  </run>
			  </groups>
			  
			  <test thread-count="5" name="Submit Order Test">
			    <classes>
			      <class name="rahultshettyacademy.test.SubmitOrderTest"/>
			    </classes>
			  </test> <!-- Test -->
			  
			    <test thread-count="5" name="Error Validationt">
			    <classes>
			      <class name="rahultshettyacademy.test.ErrorValidationsTest"/>
			    </classes>
			  </test> <!-- Test -->
			  
			</suite> <!-- Suite -->
	
	
	 * */
	
	
}
