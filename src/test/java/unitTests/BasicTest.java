package unitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.Timeout;

import unitFunctions.Calc;


public class BasicTest
{
	Calc cal = new Calc();
	
	@BeforeClass
	public static void startingTestSuite()
	{
		System.out.println("StartingTestSuite");
	}
	
	@Before
	public void startingBeforeEveryTest()
	{
		System.out.println("StartingBeforeEveryTest");
	}
	
	@AfterClass
	public static void stopingTestSuite()
	{
		System.out.println("StopingTestSuite");
	}
	
	@After
	public void stopingAfterEveryTest()
	{
		System.out.println("StopingAfterEveryTest");
	}
	
	@Test
	public void testSum()
	{
		int actual = cal.sum(4, 6);
		Assert.assertEquals(10, actual);
		System.out.println("public void testSum()");
	}
	
	@Test
	public void testSub()
	{
		int actual = cal.sub(8, 2);
		Assert.assertEquals(6, actual);
		System.out.println("public void testSub()");
	}
	
	@Test
	public void testProd()
	{
		int actual = cal.prod(4, 6);
		Assert.assertEquals(24, actual);
		System.out.println("public void testProd()");
	}
	
	@Test
	public void testDiv()
	{
		int actual = cal.div(4, 2);
		Assert.assertEquals(2, actual);
		System.out.println("public void testDiv()");
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException()
	{
		int actual = cal.div(4, 0);
		Assert.assertEquals(10, actual);
		System.out.println("public void testException()");
	}
	
	@Test
	public void testArray()
	{
		int[] actual = cal.incrementArray(new int[]{2, 4, 6});
		Assert.assertArrayEquals(new int[]{3, 5, 7}, actual);
		System.out.println("public void testArray()");
	}
	
	@Test(timeout = 18000)
	public void testPerformance()
	{
		cal.counting(1000);
		System.out.println("public void testPerformance()");
	}
	
	@Test()
	public void testCheckEven_Even()
	{
		boolean actual = cal.checkEven(4);
		Assert.assertTrue("Number is not even", actual);
		System.out.println("public void testCheckEven_Even()");
	}
	
	@Test()
	public void testCheckEven_Odd()
	{
		boolean actual = cal.checkEven(5);
		Assert.assertTrue("Number is not even", actual);
		System.out.println("public void testCheckEven_Even()");
	}
	
}
