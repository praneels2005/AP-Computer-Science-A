
public class PopQuiz
{
	public static boolean  isIncreasing (double []data){

		for(int i = 1; i<data.length; i++)
		{
			if(data[i-1]>=data[i])
			{
			return false;
			}
		}
		return true;
	}
	
	public static  boolean changeName (String []names, String lookFor, String replaceWith)
	{
	for(int i = 0; i<names.length; i++)
	{
		if(names[i].equals(lookFor))
	{
		names[i] = replaceWith;
	return true;
	}
	}

	return false;
	}

	public static void main(String[]args)
	{
		double[]words = {2,2,3,4,5};
		String[]names = {"AAA", "BBB"};
		System.out.println(isIncreasing(words));
		System.out.println(changeName(names, "Cat", "A"));
	}

}
