package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//crea la varibale para el driver
				WebDriver driver = new ChromeDriver();//crea una clase	WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				//devuelve una cadena de texto que contiene el título de la página.
				System.out.print(driver.getTitle());
				//Este método se utiliza para obtener la URL actual de la página web 
				System.out.print(driver.getCurrentUrl());
				driver.findElement(By.xpath("//li[contains(., 'Check-In')]")).click();
				
				//a/span[@class='text-label text-active'])[2]
	}

}
