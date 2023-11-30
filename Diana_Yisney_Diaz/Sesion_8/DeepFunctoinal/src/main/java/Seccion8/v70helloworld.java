package Seccion8;

import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v70helloworld {
	public static void main(String[] args) throws Exception
	{
		ExcelUtils eu = new ExcelUtils();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del Navegador");
		driver.get("http://gmail.com");
		
		String et = null;
		String nam =null;
		String atr;
		
		ExcelUtils.setExcelFile("C:\\Users\\Diana\\OneDrive\\Documentos\\Automatizacion_Curso\\Sesion8\\Emails.xlsx");
		
			for(int i=3635; i<=8000; i++)
			{
				try
				{
					et = driver.findElement(By.cssSelector("div.gE.hI tr span")).getAttribute("email");
					et = driver.findElement(By.cssSelector("div.gE.hI tr span")).getAttribute("name");
					System.out.println(et);
				}
			}
		
	}
}
