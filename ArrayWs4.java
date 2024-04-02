
public class ArrayWs4 
{
	/*
	 * An Array price[] exists and contains the selling price of all homes in the area over the previous year. 
	 *  Write the code that will traverse through the array and print out the lowest selling price. 
	 */
	public static double Price(double[]price)
	{	
		double min = 0;
		price[0] = min;
		for(int i = 1; i< price.length; i++)
		{
			if(price[i]<min)
			{
				min = price[i];
			}
		}
		
		return min;
	}
	
	/*
	 * Create an array of the first 100 perfect squares starting with 1. Traverse through
the array from the end to print the numbers in reverse order.
	 */
	public static void Square()
	{
		int[]squares= new int[100];
		
		for(int i = 0; i<squares.length; i++)
		{
			squares[i] = (i+1) * (i+1);
		}
		
		for(int i = squares.length-1; i>0; i--)
		{
			System.out.print(squares[i] + " ");
		}
	}
	
	
	/*
	 * Create an Array that contains 5 last names. Traverse through the array to count the
number of letters.
	 */
	public static void three()
	{
		String[]names = {"Boris", "Donald", "Conolly", "Obama", "Bob"};
		
		int sum = 0;
		for(int i = 0; i<names.length; i++)
		{
			sum += names[i].length();
		}
		
		System.out.println("Letters: " + sum);
	}
	
	/*
	 * Create a String array that contains 6 animals. Traverse through the array to
display every other animal starting with the last.
	 */
	public static void four()
	{
		String[]animals = {"ape", "bear", "cat", "dog", "elephant", "gnu"};
		
		for(int i = animals.length - 1; i>=0; i-=2)
		{
			System.out.println(animals[i]);
		}
		
	}
	
	/*
	 * A String array exists that contains words (lower case) 
	 * Create 2 new arrays aToM(contains words starting with a through m) and 
	 * nToZ (contains words starting with n through z) that will 
	 * separate the initial list into 2 others.
	 */
	public static void five()
	{
		String[][]lowerCase = {"dog", "cat", "bear", "horse"}, {"doge", "Cat", "Man"};
		String[]aToM = {"a", "b","c","d","e","f","g","h","i","j","k","l","m"};
		String[]nToZ = {"n", "o","p","q","r","s","t","u","v","w","x","y","z"};
		
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < lowerCase.length; i++)
		{
			for(int n = 0; n<aToM.length; n++)
			{
				for(int letter = 0; letter<lowerCase[i].length();letter++)
				{
				if((lowerCase[i].substring(letter,letter+1)).equals(aToM[n]))
				{
					count1++;
				}
				}
			}
			
			for(int m = 0; m<nToZ.length; m++)
			{
				for(int letter = 0; letter<lowerCase[i].length();letter++)
				{
				if((lowerCase[i].substring(letter, letter+1)).equals(nToZ[m]))
				{
					count2++;
				}
				}
			}
		}
		
		String[]result1 = new String[count1];
		String[]result2 = new String[count2];
		
		int pos = 0;
		int pos2 = 0;
		for(int i = 0; i < lowerCase.length; i++)
		{
			for(int n = 0; n<aToM.length; n++)
			{
				for(int letter = 0; letter<lowerCase[i].length();letter++)
				{
				if((lowerCase[i].substring(letter,letter+1)).equals(aToM[n]))
				{
					result1[pos] = aToM[n];
					pos++;
				}
				}
			}
			
			for(int m = 0; m<nToZ.length; m++)
			{
				for(int letter = 0; letter<lowerCase[i].length();letter++)
				{
				if((lowerCase[i].substring(letter, letter+1)).equals(nToZ[m]))
				{
					result2[pos2] = nToZ[m];
					pos2++;
				}
				}
			}
		}
		
		for(int n = 0; n<result1.length; n++)
		{
			System.out.print(result1[n] + " ");
		}
		System.out.println();
		for(int m = 0; m<result2.length; m++)
		{
			System.out.print(result2[m] + " ");
		}
		
	}
	
	/*
	 * An array words[] contains each word of the Gettysburg Address. 
	 * Determine how many words have 1 letter, 2 letters, 3 letters, etc.  
	 * The largest word is 14 letters. 
	 * Print out a table of possible word lengths and how many words have that length. 
                LENGTH      COUNT
                1           18
                2           48
                3           101

		   14		    1
	 */
	public static void six()
	{
		String[]words = {"a", "to", "cat", "dog", "puppy"};
		int[]letterCount = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		System.out.println("LENGTH" + "\t" + "COUNT");
		
		for(int i = 0; i<letterCount.length; i++)
		{
			int count = 0;
			for(int n = 0; n<words.length; n++)
			{
				if(i+1 == words[n].length())
				{
					count++;
				}
			}
			System.out.println(letterCount[i] + "\t" + count);
		}
		
	}
	
	public static void seven()
	{
		String[]words = {"a", "to", "cat", "dog", "puppy","aaaaaaaa", "aaaaaaaa", "aaaaaaaa"};
		int count = 0;
		
			for(int n = 0; n<words.length; n++)
			{
				if(8 == words[n].length())
				{
					count++;
				}
				
			}
			
			String[]vocab = new String[count];
			int pos = 0;
			
			for(int n = 0; n<words.length; n++)
			{
				if(8 == words[n].length())
				{
					vocab[pos] = words[n];
					pos++;
				}
				
			}
			
			System.out.println("Vocab: ");
			for(int i = 0; i<vocab.length; i++)
			{
				System.out.println(vocab[i] + " ");
			}
	}
	
	public static void main(String[]args)
	{
		Square();
		System.out.println();
		three();
		System.out.println();
		four();
		System.out.println();
		five();
		System.out.println();
		six();
		System.out.println();
		seven();
		System.out.println();
	}
}
