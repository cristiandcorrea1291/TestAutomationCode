package Sesion11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V96FooterLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		// 1. Give me the count of links on the page.
		// 2. Count of footer section-

		// System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// abre la pagina
		driver.get("http://qaclickacademy.com/practice.php");
		// muestra los links con a
		System.out.println(driver.findElements(By.tagName("a")).size());
		// Muestra todos los footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		// imprime el dato 27
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3-
		// seleccionamos el selector y muestra el 20 de todos los footer
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		// 4- click on each link in the coloumn and check if the pages are opening-
		// apertura de todos los enlaces encontrados dentro del elemento coloumndriver
		// en pestanas sepadas del navegador
		//validar los links que estan el footer de las paginas y mostrarlos por su texto en consola
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
		// utilizando la combinación de teclas "Control + Enter".
		String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		// Cada enlace se abre en una pestaña separada.
		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		// el tiempo
		Thread.sleep(5000L);

		}

		// El bucle while y el iterador permiten cambiar el enfoque a cada ventana y
		// obtener su título
		//abre todas las paginas.
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();// iterador para recorrer los elementos del conjunto abc.
//pregunta si la primera ventana esta
		while (it.hasNext()) {

		driver.switchTo().window(it.next());//pagina siguiente
		System.out.println(driver.getTitle());

		}

	}

}