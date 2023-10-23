package Sesion6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V49Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ingresar al padre
		//crea la varibale para el driver
		WebDriver driver = new ChromeDriver();//crea una clase	WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//li[contains(., 'Check-In')]")).click();
		
		//a/span[@class='text-label text-active'])[2]
		
		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		


	}

}
