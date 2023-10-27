package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;

public class V53ForDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(10000);
	
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		 for( int i=1; i<8;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 System.out.println("Agrega 6 adultos" +i);
			 
	}	
		 driver.findElement(By.id("btnclosepaxoption")).click();
		// System.out.println("Clic en el boton");
		
//mensaje en texto de total de adultos
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.close();
	}


	}

