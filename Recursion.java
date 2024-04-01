import java.util.ArrayList;
public class Recursion 
{
	//iterative solution
	public static long factorialA(int y)
	{
		long ans = 1;
		for(long i = y; i>=2; i--)
			ans *=i;
		return ans;
	}
	
	//recursive solution
	public static long factorial(int y)
	{
		if(y==1)
		{
			return y;
		}
		
		return y * factorial(y-1);
	}
	
	public static long power(int base, int n)
	{
		if (n==0)
		{
			return 1;
		}
		else if(n==1)
		{
			return base;
		}
		else
		{
			return power(base,n-1) * base;
		}
	}
	
	public static int sumDigits(int n)
	{
		if(n<10)
		{
			return n;
		}
		else
			return n%10 + sumDigits(n/10);
	}
	
	public static String Reverse(String n) {
		if (n.length() == 1)
			return n;
		else 
		{
			return n.charAt(n.length()-1) + Reverse(n.substring(0,n.length()-1));
		}
	}

	//.01, .02, .04, .08
	public static double birthdayGift(int year)
	{
		if(year == 1)
		{
			return 0.01;
		}
		else
		{
			return birthdayGift(year-1) * 2;
		}
	}
	
	public static int Fib(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			return Fib(n-1) + Fib(n-2);
		}
	}
	
	public static int multiply(int a, int b)
	{
		if(b==1)
		{
			return a;
		}
		else
		{
			return a + multiply(a, b-1);
		}
	}
	
	public static int square(int y)
	{
		if(y == 1)
		{
			return 1;
		}
		else
		{
			return (int)(Math.pow((y-1),2) + (2*(y-1)) + 1);
		}
	}
	
	public static int findSum(ArrayList<Integer> a) 
	{
		int sum = 0;
		if(a.size() == 1)
		{
			return a.get(0);
		}
		else
		{
			sum+=a.get(0);
			a.remove(0);
			return findSum(a) + sum;
		}
	}

	
	public static void main(String[]args)
	{
		ArrayList<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(5);
		values.add(1);
		
		
		//System.out.println(factorial(5));
		System.out.println(power(6,3));
		System.out.println(findSum(values));
		/*
		 * System.out.println(sumDigits(12345));
		System.out.println(Reverse("racecar"));
		System.out.println(Fib(13));
		System.out.println(multiply(4,8));
		System.out.println(square(1));
		System.out.printf("$%,20.2f", birthdayGift(55));
		 */
	}

}
