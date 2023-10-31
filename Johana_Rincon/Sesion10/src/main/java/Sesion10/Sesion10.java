package Sesion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sesion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//link de paginas
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//size optiene el valor
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//cuantas sesiones hay en footer sesion
		WebElement  footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(driver.findElements(By.tagName("a")).size());
	//lista de la primera lista de footer
		WebElement columna1footer= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("El numero total columana posicion 1 es :");
		System.out.println(columna1footer.findElements(By.tagName("a")).size());
		//
		//for (i=0; i=)
		
		
		//columna 2
		WebElement columna2footer= footerdriver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		System.out.println("El numero total columana posicion 2 es :");
		System.out.println(columna2footer.findElements(By.tagName("a")).size());
		//columnna 3
		WebElement columna3footer= footerdriver.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
		System.out.println("El numero total columana posicion 3 es :");
		System.out.println(columna3footer.findElements(By.tagName("a")).size());
		//columna4
		WebElement columna4footer= footerdriver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
		System.out.println("El numero total columana posicion 4 es :");
		System.out.println(columna4footer.findElements(By.tagName("a")).size());
	//
	}
	

}
