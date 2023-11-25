package seccion11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V97CodeForExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.ebay.com/");
		
		// 1. Count of the Link in the Entire Page
		// System.out.println("Links in the Page");
		// System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. Count of links in the footer section of the page
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		// System.out.println("Links in the footer section");
		// System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		// System.out.println("Links in the 2nd coloumn of the section");
		// System.out.println(col.findElements(By.tagName("a")).size());
		
		String Beforeclicking = null;
		
		String Afterclicking;
		
		for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++) {

			if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				Beforeclicking = driver.getTitle();

				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		
		Afterclicking = driver.getTitle();
		
		if (Beforeclicking != Afterclicking) {
			if (driver.getPageSource().contains("sitemap"))

				System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
	}

}
