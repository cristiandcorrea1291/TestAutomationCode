package seccion7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V62Assigment {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//video 61. Importance of Assertions in Automation testing and how to use them
		/*
		 Questions for this assignment
		 1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again 
		 	to verify if it is successfully Unchecked
		 2. How to get the Count of number of check boxes present in the page
		 
		 */ 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000L);//con esto no tendre fallas por sincronización	
		
        WebElement firstCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']:first-child"));
        
        // Verifica que el checkbox esté deseleccionado inicialmente
        System.out.println("Verificando que el primer checkbox esté deseleccionado inicialmente...");
        Assert.assertFalse(firstCheckbox.isSelected(), "El primer checkbox no está deseleccionado inicialmente.");

        // Selecciona el checkbox
        System.out.println("Seleccionando el primer checkbox...");
        firstCheckbox.click();

        // Verifica que el checkbox esté seleccionado
        System.out.println("Verificando que el primer checkbox esté seleccionado...");
        Assert.assertTrue(firstCheckbox.isSelected(), "El primer checkbox no se seleccionó con éxito.");

        // Desmarco el checkbox
        System.out.println("Deseleccionando el primer checkbox...");
        firstCheckbox.click();

        // Verifica que el checkbox esté desmarcado nuevamente
        System.out.println("Verificando que el primer checkbox esté SIN MARCAR/deseleccionado nuevamente...");
        Assert.assertFalse(firstCheckbox.isSelected(), "El primer checkbox no se deseleccionó con éxito.");

        // Obtiene el recuento de checkboxes presentes en la página
        int numberOfCheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println("Número de checkboxes en la página: " + numberOfCheckboxes);

        // Cierra el navegador
        driver.quit();
		

		
        
        
        
        /*
		 * Check the first Checkbox and verify if it is successfully checked and Uncheck
		 * it again to verify if it is successfully Unchecked
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ; //Should Print True
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ; //Should Print false
		 * 
		 * 
		 * 
		 * 
		 * How to get the Count of number of check boxes present in the page
		 * 
		 * driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * 
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).
		 * getSize());
		 * 
		 */
		
				
	}

}
