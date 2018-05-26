package unitFunctions;

public class Calc
{
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int prod(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public boolean checkEven(int number)
	{
		if(number%2 == 0)
			return true;
		else
			return false;
	}
		
	public void counting(int value)
	{
		//for performance testing.
		int a = 0;
		for (int i = 0; i < value; i++)
		{
			a = a +i;
			System.out.println(a);
		}
	}
	
	public int[] incrementArray(int[] sampleArray)
	{
		for (int count = 0; count < sampleArray.length; count++)
		{
			sampleArray[count] = sampleArray[count] + 1;
		}
		return sampleArray;
	}
}
