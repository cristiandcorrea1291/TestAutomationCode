package seccion10;

import java.security.DrbgParameters.NextBytes;
import java.util.Set;

import java.util.Iterator; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V88WindowHandleConceptsRealTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VIDEO 88
		//EXERCISE:Capture the email ID FROM the child window and paste it in your parent window username field
		
		//configurar el browser y el browserDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//url del cuadro verde "Free Access to InterviewQues/ResumeAssistance/Material"
		driver.findElement(By.cssSelector(".blinkingText")).click(); 

		
		//driver.getWindowHandles(); ->traer el id de las ventasnas abiertas durante la automatización (en este caso las dos ventanas)
		//Set<String> windows -> sitting las dos ventanas en el objeto "windows"
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId] 
		
		//Iteretor -> it's a method to pull the id from this set data structure
		//this variable "it" extract the values present in the set collection
		Iterator<String>it = windows.iterator(); 
		// .next()->help to get the next index of your set

		//whaterver hat the set has, is grabbed by simply calling the iterator method on the set object
		String parentId = it.next(); // .next()->help to get the next index of your set

		String childId = it.next(); // .next()->help to get the next index of your set
		 //Switch to CHILD window 
		//window(childId -> pasamos el string ID de la ventana en el argumento
		driver.switchTo().window(childId); 
		
		
		//Extraer un párrafo de la child web page
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); 

		
	}

}
