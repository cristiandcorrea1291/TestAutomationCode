package Sesion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Assert;

import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V40Sesion6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//CREACION DE VARIABLE 
		String name ="Johana Rincon Cespedes ";//variable principal almacena un rol de tarjetas de valor
		
		//System.setProperty("webdriver.chrome.driver", 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//crea una clase
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//tiempo de espera
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//ingresa a la url
		//uso la variable name por lo tanto no se puede dejar
		driver.findElement(By.id("inputUsername")).sendKeys(name); // las variables no poner las comillas
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");//la clave
		driver.findElement(By.className("signInBtn")).click();//accion de click
		Thread.sleep(2000);
		
		//video 40
		//es la unica p 
		
		System.out.println(driver.findElement(By.tagName("p")).getText());  //muestra en consola lo que tiene la Etiqueta You are successfully logged in
		//Realiza la validacion de resultado del text 
		//Asset no devuelve el resultado y todo es estaba bien muestra un true
//metedo dos parametros 
		//Assert.assertEquals(one expected , with what you want to compare);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");//compar con p con el texto 
		System.out.println("La compracion usando assert fue exitosa");
		
		
		//Muestra el nombre de la variable Name
		// de padre a hijo con sintaxis CSS

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		System.out.println("muestra el valor de la variable name ");
	
		// video 42
		//ingresa al boton de salir		
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		//funciona pero no lo entiendo
      //driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		System.out.println("Boton salir o cerrar sesion");

     driver.close();

	}
	
	

}
