import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Statistics 
{
	
private int[] myData = new int[1000];

private int count;

public Statistics(String fileName)
{
count = 0;
loadFile(fileName);
}

/* Loads text file numbers.txt into array data. Values are stored from
positions 0..count-1. */

public void loadFile (String fileName)
{
int index = 0;
File file = new File(fileName);
try 
{
Scanner inFile = new Scanner(file);
while (inFile.hasNext()) 
{
myData[index] = inFile.nextInt();
index++;
count++;
}
}

catch (FileNotFoundException e) 
{
//e.printStackTrace();
System.out.println("The file is in the wrong directory");
}
}

// returns average of values in array data
public double average () 
{
	double sum = 0;
	
	for(int i = 0; i<myData.length; i++)
	{
		sum+=myData[i];
	}
	
return sum/(myData.length-1);
}

// finds standard deviation of values in array data
public double stdDev () 
{
	double sum = 0;
	
	for(int i = 0; i<myData.length; i++)
	{
		sum += Math.pow(myData[i] - average(),2);
	}
	
	return Math.sqrt((sum/count));
}

/* finds the largest integer in array scores. This array is sized from
0..100, with each element storing the quantity of each number from
0..100. */
private int findLargest (int[] scores)
{
	int big = 0;
for(int i = 0; i<scores.length; i++)
{
	if(big<scores[i])
	{
		big = i;
	}
}
return big;
}
/* The array data is analyzed and transferred into a smaller array
smallList (0..100). For each occurrence of n in array data,
smallList[n] is incremented +1. The function findLargest is then called
to find the largest quantity in are smallList. The mode(s)
is/are printed out. */
public void findMode ()
{

	String mode = "Print mode(s) here: ";
	int []smallList = new int[101];
	
	for(int i = 0; i<myData.length; i++)
	{
		smallList[myData[i]]++;
	}
	
	int largestCount = smallList[findLargest(smallList)];
	
	for(int i = 0; i<smallList.length; i++)
	{
		if(largestCount == smallList[i])
		{
				mode += i + " ";
		}
	}

System.out.println(mode);
}

public static void main(String[]args)
{
	Statistics fileStats = new Statistics("numbers.txt");
	
	System.out.println(fileStats.average());
	System.out.println(fileStats.stdDev());
	fileStats.findMode();
}
}