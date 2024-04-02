public class Bowling
{
    // Each Row is 1 bowlers score.  Each column is 1 game
    public int[][] scores= 	{ 	{290, 203, 235},
                            	{215, 200, 225},
                            	{130, 235, 242},
                            	{245, 251, 254}, 
                            	{220, 235, 268},
                            	{275, 280, 289} };  
    
   
    /**
     * Constructor for objects of class Bowling
     */
  public Bowling()
  {
	  int [][] myScore = { 	{290, 203, 235},
      						{215, 200, 225},
      						{130, 235, 242},
      						{245, 251, 254}, 
      						{220, 235, 268},
      						{275, 280, 289} };
	  scores = myScore;
  }   
    
  public int getScore(int player) 
  {
	  int total = 0;
	  
      for(int i = 0; i<scores[0].length; i++)
      {                                      
    	  total += scores[player-1][i]; 
      }
      
      return total;
  }
     
  public int findWinner()
  {
	  int winner = 1;
	  for(int i = 2; i<scores.length; i++)
	  {
		  if(getScore(winner)<getScore(i))
		  {
			  winner = i+1;
		  }
	  }
	  
	  return winner;
  }
  

  public double averageGame(int game)
  {
	  double total = 0.0;
	  for(int i = 0; i<scores.length; i++)
	  {
		  total += scores[i][game];
	  }
	  
	  return total/scores.length;
  }

  public int maxScore() 
  {
	  int max = scores[0][0];
		for(int i = 0; i<scores.length; i++)
		{
			for(int n= 0; n<scores[0].length; n++)
				//size of the individual length of the row
			{
				if(scores[i][n]>max)
				{
					max = scores[i][n];
				}
			}
		}
		return max;
  }  
            
 public double average()
 {
	 double total = 0.0;
		for(int i = 0; i<scores.length; i++)
		{
			for(int n= 0; n<scores[i].length; n++)
			{
				total += scores[i][n];
			}
		}
		
		return total/(scores.length*scores[0].length);
  }           
  
public void displayScores()
{
	for(int i = 0; i<scores.length; i++)
	{
		for(int n= 0; n<scores[i].length; n++)
			//size of the individual length of the row
		{
			System.out.print(scores[i][n] + " ");
		}
		System.out.println();
	}
  } 

public static void main(String[]args)
{
	Bowling bowling = new Bowling();
	System.out.println("Player 3's Score is: " + bowling.getScore(3));
	System.out.println();
	System.out.println("Last Game average: " + bowling.averageGame(2));
	System.out.println();

	bowling.displayScores();
	System.out.println("The average score is : " + bowling.average());
	System.out.println("Player " + bowling.findWinner() + " is the winner");
	System.out.println("The highest score is: " + bowling.maxScore());
}
}
   

