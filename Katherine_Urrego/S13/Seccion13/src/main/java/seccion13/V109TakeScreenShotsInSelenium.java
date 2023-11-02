package seccion13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V109TakeScreenShotsInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//video 109. How to take Screenshots in Selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximizar la ventana del browser
		driver.manage().window().maximize();
		//como borrar cookies
		driver.manage().deleteAllCookies();
		//como borrar el cookie name
		//driver.manage().deleteCookieNamed("sessionKey");
	
		//click on any link 
			//(then you will redirected to loging page, verify login, URL)
	
		driver.get("http://google.com");
		System.out.println("Ir a la pagina web");
		
		//109. How to take Screenshots in Selenium
		//1. convert the driver object into Screenshot object to change the behavior
		//casting the driver into the takesscreeshot emthod ->((TakesScreenshot)driver)
		//so that is ready to capute the screenshot
		// By using this method .getScreenshotAs(); -> this method will be visible only when
		//you cast your driver object to takes Screenshot method
		//With the parameter OutputType.FILE -> we ar parsing the file...
		//that means we are telling to our web driver script is...get the output as a file format so that we can view it
		//lo estamos guardando en el objeto "src"
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("Se hizo el screenshot o captura de pantalla");
		//copy the file on the source object "src",  to our local machine with a filename called screenshot.png
		FileUtils.copyFile(src, new File("C://screenshot.png"));
		//C:\Users\KURREGO\OneDrive - Capgemini\Pictures\Screenshots
		FileUtils.copyFile(src, new File("C:\\Users\\KURREGO\\OneDrive - Capgemini\\Pictures\\Screenshots\\screenshot.png"));
		System.out.println("La captura de pantalla se guardó con el nombre screenshot.png\" ");

		
		
		
	}

}
