package Seccion16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	

	@Parameters({ "URL" })
	@Test
	
	public void WebloginHomeLoanGroups(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
  /*  public void WebloginHomeLoan(String URL) {
        // Selenium
        System.out.println("webloginhomePersonalLoan");
        System.out.println(URL);
    }*/
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoanGroups()
	{
		//Appium
		System.out.println("Smoke - MobileloginHome");
	}
	
	@Test(groups={"Grupitos"})
	public void Dinamicos()
	{
		//Appium
		System.out.println("Grupitos - Dinamicos");
	}
	
	@Test
	public void LoginAPIHomeLoanGroups()
	{
		//Rest API automation
		System.out.println("APIloginHome");
	}
	
	
	
	
	/*###########################################################
	 * 
	 //Before executing al classes, we give clear indication to our XML file that
	//go and identify the groups
	//go and run those groups which have tag name called "Smoke" o "Grupitos"
	 * 
	 * para los archivos DAYS use el XML ->testng4.xml
			<?xml version="1.0" encoding="UTF-8"?>
			<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
			
			<suite name="Suite">			
				<test name="Regreday">
				
					<groups>
						<run>
							<include name="Smoke"></include>
						</run>
					</groups>
					
					<classes>
						<class name="Seccion16.day1" />
						<methods>
							<include name="DemoDay" />
						</methods>
			
						<class name="Seccion16.day2" />
						<class name="Seccion16.day3" />
						<class name="Seccion16.day4" />
					</classes>
				</test> <!--
				Test -->
		</suite> 
		
	 * 
	 * */
	
}
