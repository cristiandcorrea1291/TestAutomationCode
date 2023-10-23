package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V69Alertas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crea una variable
		String text = "Johana Rincon";

		// clase que chorome driver
		WebDriver driver = new ChromeDriver();
		// url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// ingresa el nombre
		driver.findElement(By.id("name")).sendKeys(text);
		readSleep(2000);
		// boton de la alerta.
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// Muestra el mensaje por consola de alerta
		System.out.println(driver.switchTo().alert().getText());
		// click para aceptar la alerta
		driver.switchTo().alert().accept();
		// boton de confirmar el alerta
		driver.findElement(By.id("confirmbtn")).click();
		// click para confrimar el alerta del boton final
		System.out.println(driver.switchTo().alert().getText());

		// dismiss cancelar o aceptar una alerta
		driver.switchTo().alert().dismiss();
		driver.close();

	}

	private static void readSleep(int i) {
		// TODO Auto-generated method stub

	}

}
