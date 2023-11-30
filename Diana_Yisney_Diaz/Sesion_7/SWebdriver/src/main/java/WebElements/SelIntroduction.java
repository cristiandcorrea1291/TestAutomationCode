package WebElements;
//Video 52 Handling Static dropdowns with select web driver API
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelIntroduction {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		System.out.println("Selección opcion Currency");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
															  
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println("Fin del Registro ");
		
		System.out.println("Cierre del Navegador ");
		driver.quit();
	}

	private static Object getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
