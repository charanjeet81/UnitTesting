package unitTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner
{
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(CalcTest.class);
		for (Failure failure : result.getFailures()) 
		{
			System.out.println("Failure: "+failure.toString());
		}
		
		System.out.println("Test Result: "+result.wasSuccessful());
	}
}