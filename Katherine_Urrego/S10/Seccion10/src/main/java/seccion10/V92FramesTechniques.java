package seccion10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V92FramesTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Ir a la pagina web - pagina padre
		driver.get("https://jqueryui.com/droppable/");
		
		//Los frames comienzan con la etiqueta "iframe"
		//"iframe[class='demo-frame]"
		//iframe.demo-frame
	
		
		//CREAR UNA ACCION para arrastrar una caja sobre la otra
		Actions a = new Actions(driver); 
		
		//imprimir la cuneta de iframes que tiene la aplicacion
		System.out.println("El número de iframes presentes en la ´página es:");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//USO DEL FRAME con el METODO 1 frame (int index)
		// index o, que indica la caja 1
		driver.switchTo().frame(0);
		
		//USO DEL FRAME con el METODO 2
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

	
		//Clic en la caja "Drag me to my target"
		driver.findElement(By.id("draggable")).click();
		WebElement source = driver.findElement(By.id("draggable")); //caja pequeña que se sostiene y arrasta
		WebElement tarjet = driver.findElement(By.id("droppable")); //caja grande , donde se va adejar la caja pequeña
		
		//Metodo .dragAndDrop -> Ppara arrastrar una caja sobre la otra
		a.dragAndDrop(source, tarjet).build().perform();
		
		
		//DEBEMOS HACER CLIC EN LA OPCION "accept/ que la caja EXAMPLES
	
		//decirle al driver que retorne al default content
		//restablece el contexto a la ventana normal del navegador
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
