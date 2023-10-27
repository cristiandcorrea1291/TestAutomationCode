package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V53WhileDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(10000);
	int i=1;
	while(i<7)
	{
	
	 driver.findElement(By.id("hrefIncAdt")).click();
	// <span id="spanAudlt">8</span>
	 i++;
	 System.out.println("Agrega 6 adultos" + i);
	}
	 driver.findElement(By.id("btnclosepaxoption")).click();
	 System.out.println("Clic en el boton");
	//<input class="buttonN" id="btnclosepaxoption" value="Done" type="button">
	 driver.close();
}	

}
