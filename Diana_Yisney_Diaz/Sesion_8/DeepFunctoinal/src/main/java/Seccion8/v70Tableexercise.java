package Seccion8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v70Tableexercise {
	
	public static void main(String[] args)
	{
		int sum=0;
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Inicio del Navegador");
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt]"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cd-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cd-col-100 cb-scrd-itms'] div:nth"));
		
		for(int i = 0; i < count-2; i++)
		{
			String value = table.findElements(By.cssSelector("div[class='cb-col cd-col-100 cb-scrd-itms']")).size();
			int valueinteger = Integer.parseInt(value);
			sum = sum + valueinteger;
		}
		//System.ot.println(sum);
		
		String Extras = driver.findElements(By.spath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int totalSumValue = sum + extrasValue;
		
		System.out.println(totalSumValue);
		
		String ActualTotal = driver.findElements(By.spath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue = Integer.parseInt(ActualTotal);

			if(ActualTotalValue==totalSumValue) {
				System.out.println("Count Maches");
			}
				else{
					System.out.println("Count Fails");
				}
		
		
		
		
	}
	
}
