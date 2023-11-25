package seccion9;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prueba {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");		
				driver.manage().window().maximize();		
				WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(5));
				driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");		
				driver.findElement(By.id("password")).sendKeys("learning");		
				System.out.println(driver.findElement(By.xpath("(//label[@class='customradio']/span[@class='checkmark'])[2]")).isSelected());		
				driver.findElement(By.xpath("(//label[@class='customradio']/span[@class='checkmark'])[2]")).click();		
				w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));		
				driver.findElement(By.id("okayBtn")).click();		
				WebElement w = driver.findElement(By.cssSelector("*[data-style='btn-info']"));		
				w.click();		
				Select s = new Select(w);		
				s.selectByVisibleText("Consultant");
				driver.findElement(By.cssSelector("#terms")).click();		
				driver.findElement(By.id("signInBtn")).click();		
				w1.until(ExpectedConditions.titleContains("ProtoCommerce"));		
				String arr[] = { "iphone", "Samsung", "Nokia", "Blackberry" };		
				List RequiredItems = Arrays.asList(arr);		
				List<WebElement> l = driver.findElements(By.xpath("//h4[@class='card-title']"));
				for (int i = 0; i < l.size(); i++) {			
					String[] name = l.get(i).getText().split(" ");			
					String MobileName = name[0];			
					if (RequiredItems.contains(MobileName)) {				
						driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();			
						}		
					}		
				driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();


	}

}
