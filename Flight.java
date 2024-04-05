public class Flight 
{
	public static int distance;
	
//4. return the average miles of the all of passengers on the flight
public static double averageMiles(Passenger[][] seats)
{
double average = 0.0;
int count = 0;

for(int r = 0; r<seats.length; r++)
{
	for(int c = 0; c<seats[0].length; c++)
	{
		if(seats[r][c].getName() != null)
		{
			average += seats[r][c].getMiles();
			count++;
		}
	}
}

return average/count;

}
//5. This method determines if there are any window seats available. 
//(Any open seats in the first or last column)
//Return true if yes, false otherwise.
public static boolean isWindowSeatAvailable(Passenger[][] seats)
{
		for(int r = 0; r<seats.length; r++)
		{
			for(int c = 0; c<seats[0].length; c++)
			{
				if(c == 0 || c == seats.length-1)
				{
					if(seats[r][c].getName() == null)
					{
						return true;
					}
				}
			}

		}

return false;
}
//6.This method will increase each passenger's total miles by the distance of the flight based on the following criteria. Add the distance to all passengers unless the passenger is a gold member (more than 100,000 miles) then add 3 times the distance.  
public static void updateMiles (Passenger[][] seats) 
{
	for(int r = 0; r<seats.length; r++)
	{
		for(int c = 0; c<seats[0].length; c++)
		{
			if(seats[r][c].getName() != null)
			{
				if(seats[r][c].getMiles() < 100000)
				{
					seats[r][c].setMiles(seats[r][c].getMiles() + distance);
				}
				else
				{
					seats[r][c].setMiles(seats[r][c].getMiles() + (3 * distance));
				}	
			}
		}
	}
}

public  static void print(Passenger[][]seats)
{
	for(int r = 0; r<seats.length; r++)
	{
		for(int c = 0; c<seats[0].length; c++)
		{
			System.out.println("Name: " + seats[r][c].getName() + "	Miles traveled: " + seats[r][c].getMiles());
		}
	}
}

public static void main(String[]args)
{
	Passenger a = new Passenger("Mary Smith", 11010);
	Passenger b = new Passenger("Jorge Gonzalez", 2101);
	Passenger c = new Passenger("Arushi Patel", 11231);
	Passenger d = new Passenger("Dan Ye", 111);
	Passenger e = new Passenger(null, 0);
	Passenger f = new Passenger(null, 0);
	
	distance = 3000;

	Passenger[][]chart = new Passenger[][]{{a,b,c},{d,e,f},};
	System.out.println("BEFORE miles of each passenger is updated");
	print(chart);
	System.out.println("\nAFTER miles of each passenger is updated");
	updateMiles(chart);
	print(chart);
	System.out.println("\nAre any window seats available?");
	System.out.println(isWindowSeatAvailable(chart));
	System.out.println("\naverage miles of the all of passengers on the flight: ");
	System.out.println(averageMiles(chart));
}
}
