package seccion13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V108MaximizingWindowAndDeletingCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//video 108. Maximizing window and deleting cookies
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximizar la ventana del browser
		driver.manage().window().maximize();
		
		//como borrar cookies
		driver.manage().deleteAllCookies();
		
		//como borrar el cookie name
		//driver.manage().deleteCookieNamed("sessionKey");
		
		//como add the cookies at runtime from your browser
		
		//Scenario 1
		//want to delete the session cookie and make sure thet secure login gets log out
		//and it has to navigate to the homepage
		//So, how do you automate that?
		
		
		//click on any link 
			//(then you will redirected to loging page, verify login, URL)
		
		
		driver.get("http://google.com");
		
		

		
	}

}
