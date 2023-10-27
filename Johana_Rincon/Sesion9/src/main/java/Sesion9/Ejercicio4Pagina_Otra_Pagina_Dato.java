package Sesion9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio4Pagina_Otra_Pagina_Dato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();// crea una clase WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// Maximiza la pagina
		driver.navigate().to("https://the-internet.herokuapp.com//");// Abre la pagina
		// driver.get("https://the-internet.herokuapp.com/");//ingresa a la pagina
		// ingresa al link MULTIPLE WINDOS
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		// traer el texto Opening a new window
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		// CLICK al link clic here
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		//cambia a ventana secundaria trae el texto New window 
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parenId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(
		driver.findElement(By.cssSelector("body:nth-child(2) div.example > h3:nth-child(1)")).getText());

		System.out.println("fin del ejercio 4 ");
		driver.close();
		//johana Rincon
		// String
		// emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("
		// ")[0];//vector//
		// driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//abre
		// la misma pestaña
		// driver.navigate().back();//regresa a la principal de google
		// driver.navigate().forward();//para navegar hacia adelante en la historia de
		// navegación de un navegador web controlado por Selenium
		// https://rahulshettyacademy.com/dropdownsPractise/para practicar

	}

}
