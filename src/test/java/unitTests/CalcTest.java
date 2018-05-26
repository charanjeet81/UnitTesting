package unitTests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import unitFunctions.Calc;

// - If we don't specify any type as a parameter, the runtime will choose BlockJunit4ClassRunner by default.
// - This class is responsible for tests to run with a new test instance. It is responsible for invoking 
//   JUnit lifecycle methods such as setup(associate resources) and teardown(release resources).
@RunWith(value = Parameterized.class)
public class CalcTest 
{
	private int a;
	private int b;
	private int expectedResult;
	private Calc calc;
	
	public CalcTest(int a, int b, int expectedResult)
	{
		this.a = a;
		this.b = b;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialize()
	{
		calc = new Calc();
	}
		
	@Parameters(name = "{index}: testSum({0}+{1}) = {2}")
	public static Collection<Object[]> inputForSum()
	{
		return Arrays.asList(new Object[][]{{2, 4, 6}, {5, 6, 11}, {9, 2, 14}});
	}
	
	@Test
	public void testSumWithParameters()
	{
		System.out.println("a=> "+a);
		System.out.println("b=> "+b);
		System.out.println("expectedResult=> "+expectedResult);
		assertEquals(expectedResult, calc.sum(a, b));
	}
}
