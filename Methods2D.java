//APCS  2Dim Algorithms
//Complete the following methods.  I have included helper methods and a tester					

public class Methods2D {
// 1. This will create an nxn multiplication table
//multTable[3][7] ==> 21
//multTable[4][3] ==> 12
public static double [][] multTable(int n)
{
	double [][]table = new double[n+1][n+1];
	
	for(int i = 0; i<table.length; i++)
	{
		for(int j= 0; j<table[i].length; j++)
		{
			if(i == 0)
			{
			table[i][j] = j;
			}
			else if(j == 0)
			{
				table[i][j] = i;
			}
			else
			{
				table[i][j] = j*i;
			}
		}
	}
	return table;
}

// display method for multiplicationTable and powerTable 	
public static void display(double[][] x) {
	for (int r = 0; r < x.length; r++) {
		for (int c = 0; c < x[r].length; c++) {
			System.out.printf("%5.0f", x[r][c]);
		}
		System.out.println();
	}
}

//2. returns an array of strings from words that are 
//more than 5 letters
public static String[] vocab(String[][] words)
{
	int count = 0;
	for(int i = 0; i<words.length; i++)
	{
		for(int j = 0; j<words[i].length; j++)
		{
			if(words[i][j].length() > 5)
			{
				count++;
			}
		}
	}
	
	String [] strings = new String[count];
	int pos = 0;
	
	for(int i = 0; i<words.length; i++)
	{
		for(int j = 0; j<words[i].length; j++)
		{
			if(words[i][j].length() > 5)
			{
				strings[pos] = words[i][j];
				pos++;
			}
		}
	}
	
	return strings;
}
//display method for  vocab	
public static void display(String[] x)
{
	for (String a:x)
			System.out.print(a + " ");
	System.out.println();
}

//3. returns a boolean array of true/false values for corresponding
//values of  2 dim int array  x;
public static boolean[][] isOdd(int[][] x)
{
	boolean [][]TruFals = new boolean[x.length][x[0].length];
	
	for(int i = 0; i<x.length; i++)
	{
		for(int j = 0; j<x[i].length; j++)
		{
			if(x[i][j] % 2 == 1)
			{
				TruFals[i][j] = true;
			}
			else
			{
				TruFals[i][j] = false;
			}
		}
	}
	
	return TruFals;
}

//display method for isOdd	
public static void display(boolean[][] x) {
	for (int r = 0; r < x.length; r++) {
		for (int c = 0; c < x[r].length; c++) {
			System.out.printf("%7b",x[r][c]);
		}
		System.out.println();
	}
}

/* 4. Write a program that creates an integer power table where each element is equal to the row number raised to the power of the column number. The array returned  after buildTable(6,4)   will look like:     (4 points)     (125 = 5^3   5th row 3rd col)
1		0		  0		0
1		1		  1		1
1		2		  4		8
1		3		  9		27
1		4		16		64
1		5		25		125*/
//# of rows, # of columns
public static double[][] powerTable(int r, int c)
{
	double [][]powers = new double[r][c];
	
	for(int i = 0; i<powers.length; i++)
	{
		for(int j = 0; j<powers[i].length; j++)
		{
			powers[i][j] = Math.pow(i, j);
		}
	}
	
	return powers;
}

public static void main(String[] args) {
	display (multTable(9));
	System.out.println();
	
	String[][] fruits = {{"apple", "watermelon","kiwi"},
						{"lime", "banana", "apricot"},
						{"lemon", "papaya", "grapefruit"},
						{"pear", "mango", "starfruit"}};
	display(vocab(fruits));
	System.out.println();
	
	int[][] temp = {{1,2,3},
					{4,5,6},
					{7,8,9},
					{10,11,12}};
	display(isOdd(temp));
	System.out.println();
	
	display(powerTable(8,4));
	
}
}
