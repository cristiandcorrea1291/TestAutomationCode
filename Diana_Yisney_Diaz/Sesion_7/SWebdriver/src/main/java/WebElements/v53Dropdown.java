package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v53Dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Inicio del navegador ");
		//driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println("Temporizador del navegador");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000L);
		
		
		System.out.println("Iniciacion de contador");
		
		System.out.println("Validacin de While");
		/*int i =1;
		  while(true)
		{
			while (i < 5)
			{

				driver.findElement(By.id("hrefIncAdt")).click();
			}*/

		System.out.println("Validacion del For");
			for (int i=1; i<5; i++)
			{
				Thread.sleep(1000);
				driver.findElement(By.id("hrefIncAdt")).click();
				
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//}

			Thread.sleep(1000);
			driver.quit();
	}
}
