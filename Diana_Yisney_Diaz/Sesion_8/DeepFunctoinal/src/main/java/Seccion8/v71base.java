package Seccion8;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v71base {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//String mousePad= 
		   // System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del Navegador");
//Creacion de una lista de productos a seleccionar en el carrito por medio de su path de cssSelector de H4
		//https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/ ver
		String[] itemsNeeded={"Cucumber","Brocolli","Cauliflower","Beetroot"};

		driver.get("http://rahulshettyacademy.com/seleniumPractise/#/");
		 List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		 
			 for (int i=0; i<products.size(); i++)
			 {
			String name = products.get(i).getText();
			//convert array into array list for easy search
			//check whether name you extracdris present in arraylist or not
			//Adiccion de funcion v73
			List itemsNeededList = Arrays.asList((itemsNeeded));
			
				if(name.contains("Cucumber"))
				{
					//Adicionar carrito
		
				//	driver.findElements(By.xpath("(//button[text()='ADD TO CART']")).get(i).click();
				//break;
				}
			 }

		
	}
	
}
