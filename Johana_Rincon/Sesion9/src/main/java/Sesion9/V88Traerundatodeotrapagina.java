package Sesion9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V88Traerundatodeotrapagina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		System.out.println("Se ingresó  a la página web");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		// 	Cambiar las ventanas  cambiar de padre a hijo
		// vamos a la pagina y regresamos
		// se imprime el texto de un elemento en esa ventana secundaria.
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parenId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());//trae la informacion  de la pagina 2 
		//vector 
		String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];//vector//trim parte//slim espacios derecha Izquierda
		//String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[0];//solo la posicion o 
		
		System.out.println(emailId );
		

	driver.switchTo().window(parenId);
		driver.findElement(By.id("username")).sendKeys(emailId);	}
	

}
