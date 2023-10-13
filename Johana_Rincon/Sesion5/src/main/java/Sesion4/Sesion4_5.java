package Sesion4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sesion4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//localizadores 
		
		//automatizar una pagina web login 
		//WebDriverManager.chromedriver().setup();
		//web driver es la interface
		// new=ChromeDriver() clase
		//driver objeto 
		WebDriver driver = new ChromeDriver();//crea una clase
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));//tiempo de espera
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//ingresa a la url
		driver.findElement(By.id("inputUsername")).sendKeys("jjj@gmail.com");//correo
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");//la clave
		driver.findElement(By.className("signInBtn")).click();//accion de click
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//muestra el error en consola
	

		//el link olvide la contraseña 
	   driver.findElement(By.linkText("Forgot your password?")).click();
	   
		//registra el nombre input 1 del nombre 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Johana");
		
		//registra el correo electronico
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rinconjoahana2014@gmail.com");
		//limpia la caja de texto
		//driver.findElement(By.xpath("//input[@type=' text'][2]")).clear();
		//registra el correo en  css 
		//telefono del hijo Posicion3 
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("345");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
	}

}
