
public class TwoDimMethods 
{
	
	//int[][]student = new int[24][5] (24 x 5)
	//rows: student.length
	//columns: student[0].length
	private int[][] numbers;

	public TwoDimMethods() {
	int[][] myNumbers = { { 11, 73, 5, 70 },
						{ 78, 276, 75, 34 },
						{ 21, 70, 94, 17 } };
	//3x4 array
	numbers = myNumbers;
	}
	
	public void display()
	{
		for(int i = 0; i<numbers.length; i++)
		{
			for(int n= 0; n<numbers[i].length; n++)
				//size of the individual length of the row
			{
				System.out.print(numbers[i][n] + " ");
			}
			System.out.println();
		}

	}
	
	public void display2()
	{
		for(int[]x : numbers)
		{
			for(int y:x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
	
	public double average()
	{
		double total = 0.0;
		for(int i = 0; i<numbers.length; i++)
		{
			for(int n= 0; n<numbers[i].length; n++)
				//size of the individual length of the row
			{
				total += numbers[i][n];
			}
		}
		
		return total/(numbers.length*numbers[0].length);
		
	}
	
	public double average2()
	{
		double total = 0.0;
		for(int[]x : numbers)
		{
			for(int y:x)
			{
				total +=y;
			}
		}
		
		return total/(numbers.length*numbers[0].length);
	}
	
	public int minimum()
	{
		int smallest = numbers[0][0];
		for(int i = 0; i<numbers.length; i++)
		{
			for(int n= 0; n<numbers[0].length; n++)
				//size of the individual length of the row
			{
				if(numbers[i][n]<smallest)
				{
					smallest = numbers[i][n];
				}
			}
		}
		return smallest;
	}
	
	public int minimum2()
	{
		int smallest = numbers[0][0];
		for(int x[]: numbers)
		{
			for(int y: x)
				//size of the individual length of the row
			{
				if(y<smallest)
				{
					smallest = y;
				}
			}
		}
		return smallest;
	}

	public static void main(String args[]) {
	TwoDimMethods p = new TwoDimMethods();
	p.display();
	System.out.println();
	p.display2();
	System.out.println();
	System.out.println("AVERAGE:" + p.average());
	System.out.println("AVERAGE2:" + p.average2());
	System.out.println("MINIMUM:" + p.minimum());
	System.out.println("MINIMUM2:" + p.minimum2());
	TwoDimMethods q = new TwoDimMethods(3,9);
	System.out.println();
	q.display();
	System.out.println("AVERAGE:" + q.average());
	System.out.println("MINIMUM:" + q.minimum());

}
	
	public TwoDimMethods(int rows, int cols)
	{
		numbers = new int[rows][cols];
		for(int i = 0; i<numbers.length; i++)
		{
			for(int n = 0; n<numbers[i].length; n++)
			{
				numbers[i][n] = (int)(Math.random() * 100 + 0);;
			}
		}
	}
}
