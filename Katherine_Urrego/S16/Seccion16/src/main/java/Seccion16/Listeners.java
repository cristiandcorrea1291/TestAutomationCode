package Seccion16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			
		//	System.out.println("I successfully executed Listeners Pass code");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			//screenshot code 
			//response if API is failed
			
			System.out.println("I failed executed Listeners Pass code" +result.getName());

		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		
		
		//comomcongitar el XML para los LISTENERS
		// Se agregan estas estiquetas
		//<listener class-name="NOMBRE PACKAGE . NOMBRE DE LA CLASE "></listener>
		//Es decir <listener class-name="Seccion16.V143ListenersTestNg"></listener>
		/* 
		 
		 /*
		 
		 <listeners> 
			<listener class-name="Seccion16.Listeners></listener>
		</listeners>
		*/
		
		
		/*el testng4.xml quedó así
		 
		 <?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		
		<suite name="Suite">
				
				 <listeners> 
					<listener class-name="Seccion16.Listeners"></listener>
				</listeners>
			
		
				<parameter name="URL" value="qaclickacademy.com"></parameter>
		
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


		 
		 */
}
