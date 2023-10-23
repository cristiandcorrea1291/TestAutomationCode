package Sesion6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V47Parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver una variable que estás declarando. El nombre driver
				//new ChromeDriver(): Esta parte crea una nueva instancia
				WebDriver driver = new ChromeDriver();//crea una clase	WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//muestra por consola el Login 
				//padre hijo hermano
				System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
				//hijos a padre 
				//muestra el login por consola
				System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}

}
