package sesion7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class V52HandlingStaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Menus desplegables en selenium
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//desplegables estáticos son aquellos en los que las opciones no cambian dinámicamente. 
		//Puedes utilizar la clase Select 
		//se crea la variable  staticDropdrown que se utiliza para almacenar una referencia a un elemento web en la página.
		WebElement staticDropdrown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//guardamos elemento dentro de la variable esa varible debe pasar por dentro del argumento
		//crea un objeto de la clase select para que trabaje con el elemento desplegable dropdrown
		Select dropdrown =new Select(staticDropdrown);
		//selecciona el indice 3 usd
		dropdrown.selectByIndex(3);
		//muestra en la consola 
		System.out.println(dropdrown.getFirstSelectedOption().getText());
		dropdrown.selectByVisibleText("AED");
		//cambia y muestra los dos por consola uSD, AED
		System.out.println(dropdrown.getFirstSelectedOption().getText());
		//cambia y muestra los tres por consola uSD, AED INR
		dropdrown.selectByVisibleText("INR");
		System.out.println(dropdrown.getFirstSelectedOption().getText());
		//<select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency" class="valid">
		
		driver.close();

	}

}
