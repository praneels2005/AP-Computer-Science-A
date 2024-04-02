
public class IfStatementsWorkSheet 
{
	
	public static String one(int m, int n)
	{
		if(m>0 && n>0)
		{
			return "POSITIVE";
		}
		else if(m<0 && n<0)
		{
			return "NEGATIVE";
		}
		else
		{
			return "NEITHER";
		}
	}
	
	public static double two(double a, double b, double c, double d)
    {
        if(a>b && a>c && a>d)
        {
            return a;
        }
        else if(b>a && b>c && b>d)
        {
            return b;
        }
        else if(c>b && c>a && c>d)
        {
            return c;
        }
        else
        {
            return d;
        }
    }
	
	public static void main(String[]args)
	{
		System.out.println(one(3,4));
		System.out.println(   two(8,7,6,5));
	    
	}

}
