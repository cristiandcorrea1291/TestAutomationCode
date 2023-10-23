package seccion6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V47TraverseWithChildToParentXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VIDEO 47:How to Traverse from child element to parent element with xpath - Example
		//Sibling - Child to Parent Traverse
		
		// Configura el controlador de Chrome/navegador utilizando WebDriverManager.
		WebDriverManager.chromedriver().setup();
		//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia //"driver" es un objeto en la clase ChromeDriver
		WebDriver driver = new ChromeDriver();
		//Implicit WAIT ---se DEBE declarar despues del browserDriver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		
		
		//Xpath Relative: no empieza desde el cominexo de l,con esa sintaxis ayuda a encontrar el sigienue sibling
		// comienza con slashes dobles 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		//XPATH with child to parent with traveser mox
		//header/div/button[1]/following-sibling::button[1] 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); 
		
		//video 47
		//Traverse from parent o child IS NOT possible with css
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText()); 
		
	}

}
