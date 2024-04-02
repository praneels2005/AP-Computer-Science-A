
public class selfDivisor 
{
	 private static boolean isSelfDivisor(int number)
	 {
	 while(number > 0)
	 {
	 		if(number%10 == 0)
	 {
	 	return false;
	 }
	 else if(number%(number%10) == 0)
	 		{
	 			number/=10;
	 		}
	 else
	 {
	 return false;
	 }
	 }
	 return true;
	 }
	 
	 private static int[] firstNumSelfDivisors(int start, int num)
	 {

	 int[]SelfDiv = new int[num];
	 int pos = 0;
	 int i = start;

	 while(i>=start)
	 {
	 	if(isSelfDivisor(i) == true)
	 	{
	 	if(pos<num)
	 	{
	 		SelfDiv[pos] = i;
	 		pos++;
	 		i++;
	 	}
	 	else
	 	{
	 		break;
	 	}
	 }
	 else
	 {
	 i++;
	 }
	 }

	 return SelfDiv;
	 }
	 
	 public static void display(int []num)
	 {
		 for(int i = 0; i<num.length; i++)
		 {
			 System.out.print(num[i] + " ");
		 }
	 }
	 public static void main(String[]args)
	 {
		 System.out.println(isSelfDivisor(10));
		 display(firstNumSelfDivisors(10,3));
	 }


}
