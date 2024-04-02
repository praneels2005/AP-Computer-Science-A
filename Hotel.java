public class Hotel
{
// list[] stores reservations for each room. The index is the room number. All elements are null at the beginning
private Reservation[] list ;
public Hotel(int numbRooms)
{
list = new Reservation[numbRooms];
//list[0] == null TRUE
}
//Displays room numbers and reservation information.
public void display()
{
	for(int i = 0; i<list.length; i++)
	{
		System.out.println("Room: " + i + " " + list[i]);
	}
}

//returns true if room is occupied
public boolean isOccupied( int room)
{
	return list[room] != null;
}
//Find and return number of rooms with a reservation - 6
public int reservedRoomCount()
{
	int count = 0;
	for(int i = 0; i<list.length; i++)
	{
		if(isOccupied(i) == true)
		{
			count++;
		}
	}
	
	return count;
}
// find and return the average room rate of the occupied rooms. - 95.658
public double averageRoomRate()
{
	double sum = 0;
	
	for(int i = 0; i<list.length; i++)
	{
		if(isOccupied(i))
		{
		sum += list[i].getRate();
		}
	}
	
	return sum/reservedRoomCount();
}
// Assigns a new Reservation to the first available room.
//Print out reservation with room number or indicate that hotel is full
public void reserveRoom( String name, double rate)
{
	int i = 0;
	while(i<list.length && isOccupied(i))
	{
		i++;
	}
	
		if(i<list.length)
		{
			list[i] = new Reservation(name,rate);
			System.out.println(list[i] + " Room: " + i);
		}
		else
		{
			System.out.println("No Reservations available");
	}
	
}
// Assigns a new Reservation to an inputted room.
// if room is occupied, find the first available room in the array
//Print out reservation with room number or indicate that hotel is full
public void reserveRoom( String name, double rate, int room)
{
	if(isOccupied(room))
	{
		reserveRoom(name,rate);
	}
	else
	{
		list[room] = new Reservation(name,rate);
	}
}

public boolean discount(String lookForName, int disc)
{
	for(int i = 0; i<list.length; i++)
	{
		if(isOccupied(i))
		{
		if(list[i].getName().equals(lookForName))
		{
			return true;
			double currentRate = list[i].getRate();
			double newRate = currentRate * (1-disc/100.0);
			list[i].setRate(newRate);
		}
		}

	return false;
	}
}

public static void main(String[] args) 
{
// TODO Auto-generated method stub
Hotel hilton = new Hotel(10);
//hilton.display();

hilton.reserveRoom("Jones", 99);
hilton.reserveRoom("Patel", 94.99);
hilton.reserveRoom("Garcia", 94.99);
hilton.reserveRoom("Chen", 94.99);
hilton.reserveRoom("Connolly", 94.99, 7);
hilton.reserveRoom("McLaughlin", 94.99, 2);
hilton.display();
System.out.println("Reserved Rooms: " + hilton.reservedRoomCount());
System.out.println("Average Reservation: " + hilton.averageRoomRate());
System.out.println(hilton.discount("Conolly", 10));
hilton.display();
}
}
