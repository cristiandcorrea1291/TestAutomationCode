
package Sesion11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class V94LinkFooter {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				//link de paginas
				//WebDriver es la interfaz, ChromeDriver es la clase y driver es la instancia
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//size obtiene el valor de 27 link presentes
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				//cuantas sesiones hay en footer sesion
				
				WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
				System.out.println(footerdriver.findElements(By.tagName("a")).size());

				//v94
				//padres a hijos
	
				WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(columnDriver.findElements(By.tagName("a")).size());
				//realiza click en los link abre las url y muestra el resultado en consola
				
				for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++)
				{
					String clickOnNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

				    columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnNewTab);
				}
				
				
				driver.close();
				
			
			//
			}
			

		}
