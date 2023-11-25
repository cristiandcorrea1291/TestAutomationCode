package AdvancLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.chrome.driver", "//Users/Diana(/OneDrive/Documentos/ProyectoAutomatizacion/chromedriver");
		// Reemplaza el llamado a System.setpropertiy
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Ingreso a la URL correcta");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		System.out.println("Validacion de Inicio de Sesion");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		System.out.println("Validacion de mensaje de error");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Thread.sleep(1000);//
		System.out.println("Realizar validacion de recuperacion de contraseña");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println("Validacion de Datos");
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		//Thread.sleep(1000);
		System.out.println("Ingreso de Datos Validos");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		System.out.println("Clic en Recordar Datos");
		driver.findElement(By.id("chkboxOne")).click();
		System.out.println("Clic en enviar Información");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		
	}
}
