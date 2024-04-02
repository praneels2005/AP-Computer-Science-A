
public class SatStudent
{
	private String name;
	private int math;
	private int verbal;
	private int writing;
	
	public SatStudent()
	{
		name = "Praneel";
		math = 650;
		verbal = 650;
		writing = 650;
	}
	
	public SatStudent(String nam, int ma, int ve, int wr)
	{
		name = nam;
		math = ma;
		verbal = ve;
		writing = wr;
	}
	
	public void setMath(int newMath)
	{
		math = newMath; 
	}
	
	public int getMath()
	{
		return math;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setVerbal(int newVerbal)
	{
		verbal = newVerbal;
	}
	
	public int getVerbal()
	{
		return verbal;
	}
	
	public void setWriting(int newWrite)
	{
		writing = newWrite;
	}
	
	public int getWriting()
	{
		return writing;
	}
	
	public int total()
	{
		return math + writing + verbal;
	}
	
	public String toString()
	{
		return name + "\t" + total();
	}
	
}
