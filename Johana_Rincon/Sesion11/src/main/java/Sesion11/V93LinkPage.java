package Sesion11;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class V93LinkPage {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//link de paginas
			//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//size obtiene el valor de 27 link presentes
			System.out.println(driver.findElements(By.tagName("a")).size());
			
			//cuantas sesiones hay en footer sesion
			WebElement  footerdriver=driver.findElement(By.id("gf-BIG"));
			System.out.println(driver.findElements(By.tagName("a")).size());
			
		
		//
		}
		

	}
