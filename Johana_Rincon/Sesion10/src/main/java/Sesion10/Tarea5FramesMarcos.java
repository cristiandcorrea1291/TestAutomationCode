package Sesion10;

//
import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea5FramesMarcos {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//ingresa a la pagina 
		driver.get("http://the-internet.herokuapp.com/");

		//hace clic en el enlace de Nested Framer

		driver.findElement(By.linkText("Nested Frames")).click();

		//luego hace referencia al general  frame top
		// contenido dentro del frame llamado "frame-top"
		// switchTo(): Este es un método de WebDriver que permite cambiar el contexto de
		// interacción.

		driver.switchTo().frame("frame-top");

		//selector para la posicion del medio 

		driver.switchTo().frame("frame-middle");

		//Trae el texto middle  de la caja del centro
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.close();

	}

}
