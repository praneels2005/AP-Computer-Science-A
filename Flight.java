public class Flight {
	public int distance;
	
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
public boolean isWindowSeatAvailable(Passenger[][] seats)
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
public void updateMiles (Passenger[][] seats) 
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

public static void main(String[]args)
{
	Passenger a = new Passenger("Mary Smith", 11010);
	Passenger b = new Passenger("Jorge Gonzalez", 2101);
	Passenger c = new Passenger("Arushi Patel", 11231);
	Passenger d = new Passenger("Dan Ye", 111);
	Passenger e = new Passenger(null, 0);
	Passenger f = new Passenger(null, 0);

	Passenger[][]chart = new Passenger[][]{{a,b,c},{d,e,f},};
	System.out.println(Passenger.averageMiles(chart));
}
}
