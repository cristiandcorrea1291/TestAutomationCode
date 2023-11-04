package Seccion16;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	// TODO Auto-generated method stub
@AfterTest
public void lastexecutionDay()
{
	System.out.println("I will execute last");
	
}

@Test
public void DemoDay()
{
	System.out.println("hello day en el metodo DemoDay");//automation

}

@AfterSuite

public void afSyiteDay()
{
	System.out.println("I am the no 1 from last ");
}
@Test
public void SecondTestDay()
{
	System.out.println("bye");
}


}
