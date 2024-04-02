
public class TwoDimQuiz 
{
	public static String[] vocab(String[][] words)
	{
	int count = 0;

	for(int r = 0; r<words.length; r++)
	{
		for(int c = 0; c<words[0].length; c++)
		{
			if(words[r][c].length() > 5)
			{
				count++;
			}
		}
	}

	String[]vocabs = new String[count];
	int pos = 0;

	for(int r = 0; r<words.length; r++)
	{
		for(int c = 0; c<words[0].length; c++)
		{
			if(words[r][c].length() > 5)
			{
				vocabs[pos] = words[r][c];
				pos++;
			}
		}
	}
	return vocabs;
	}
	
	public static double evaluate (int[][] poly, int x)
	{
	double total = 0.0;

	for(int r = 0; r<poly.length; r++)
	{
		for(int c = 0; c<poly[0].length-1; c++)
		{
			total += (poly[r][c]) * (Math.pow(x,poly[r][c+1]));
		}
	}
	return total;
	}
	
	
	public static boolean areAllPositive(int[][] sales)
	{
	for(int r = 0; r<sales.length; r++)
	{
		for(int c = 0; c<sales[0].length; c++)
		{
			if(sales[r][c] < 0)
			{
				return false;
			}
		}
	}

	return true;
	}
	
	public static void display(String[] x) {
		for (int r = 0; r < x.length; r++) {
				System.out.println(x[r]);
			}
			System.out.println();
		}
	
	
	public static void main(String[]args)
	{
		 String[][] words= 	{ 	{"Paco", "Taco", "Amigos"},
             	{"little", "Boy", "Trying"}, };  
		display(vocab(words));
		int[][] values = {{3,4}, {0,3}, {-5,2}, {1,1}, {6,0}};
		System.out.println(evaluate(values, -1));
		int[][] value = {{3}, {2}, {1}, {9}, {5}};
		System.out.println(areAllPositive(value));
	}
}
