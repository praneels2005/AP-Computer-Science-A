public class Student {
// the student's full name
private String name;
// the student ID
private String id;
// the amount of credits for study taken so far
private int credits;

public Student() {
name = "Jane Doe";
id = "89078";
credits = 0;
}
/**
* Create a new student with a given name and ID number.
*/
public Student(String fullName, String studentID, int tempCredits)
{
name = fullName;
id = studentID;
credits = tempCredits;
}
/**
* Return the full name of this student.
*/
public String getName() 
{
return name;
}
/**
* Set a new name for this student.
*/
public void changeName(String replacementName)
{
name = replacementName;
}
/**
* Return the student ID of this student.
*/
public String getStudentID()
{
return id;
}


/**
* Add some credit points to the student&#39;s accumulated credits.
*/
public void addCredits(int additionalPoints) {
credits += additionalPoints;
// credits = credits + additionalPoints;
}
/**
* 7. Return the number of credit points this student has accumulated.
*/
public int getCredits() {
return credits;
}

//1. return the average credits of the class
public static double getAverageCredits(Student[][] myChart)
{
	double total = 0.0;
	
	for(int i = 0; i<myChart.length; i++)
	{
		for(int j = 0; j<myChart[i].length; j++)
		{
			total += myChart[i][j].getCredits();
		}
	}
	
	return total/(myChart.length * myChart[0].length);
}

//2. returns the maximum value for credits in the class
public static int getMaxCredits(Student[][] myChart)
{
int max = myChart[0][0].getCredits();
	
	for(int i = 1; i<myChart.length; i++)
	{
		for(int j = 1; j<myChart[i].length; j++)
		{
			if(max<myChart[i][j].getCredits())
			{
				max = myChart[i][j].getCredits();
			}
		}
	}
	
	return max;
}
//3. return the Student object with fullNme
public static Student lookUp(Student[][] myChart, String fullName) 
{
	for(Student[] row : myChart)
	{
		for(Student j: row)
		{
			if(j.getName().equals(fullName))
			{
				return j;
			}
		}
	}
	return null;
}


//4. add additionaCredits to the Student with fullName. Return true if change is made.
//return false if Student is not in myChart
public static boolean addCredits (Student[][]myChart, String fullName, int additionalCredits)
{
	Student found = lookUp(myChart, fullName);
	
	if(found == null)
	{
		return false;
	}
	else
	{
		found.addCredits(additionalCredits);
		return true;
	}
}

//5. returns a one dimensional array of Student objects with zero credits
public static Student[] getZeroCredits(Student[][] myChart)
{
	int count = 0;
	for(int i = 0; i<myChart.length; i++)
	{
		for(int j = 0; j<myChart[0].length; j++)
		{
			if(myChart[i][j].getCredits() == 0)
			{
				count++;
			}
		}
	}
	
	Student []zero = new Student[count];
	int pos = 0;
	
	for(Student[] row: myChart)
	{
		for(Student i : row)
		{
			if(i.getCredits() == 0)
			{
				zero[pos++] = i;
			}
		}
	}
	
	return zero;
}

public static void main(String[] args) 
{
Student a = new Student("Mary Smith", "11011", 0);
Student b = new Student("Jorge Gonzalez", "21011", 32);
Student c = new Student("Arushi Patel", "31011", 32);
Student d = new Student("Dan Ye", "41011", 32);
Student e = new Student("Samhith Gupta", "51011", 32);
Student f = new Student("Jacob Evers", "61011", 42);
Student g = new Student("Sven Millers", "71011", 32);
Student h = new Student("Jackie Lu", "81011", 0);
Student i = new Student("Pooja Shah", "91011", 0);

Student[][]chart = new Student[][]{{a,b,c},{d,e,f},{g,h,i}};

System.out.println("Avg: "+Student.getAverageCredits(chart));
System.out.println("Max: "+Student.getMaxCredits(chart));
System.out.println(Student.addCredits(chart, "Praneel", 17));
System.out.println("Name: " + lookUp(chart, "Dan Ye").getName() + " Id: " + lookUp(chart, "Dan Ye").getStudentID() + " Credits: " + lookUp(chart, "Dan Ye").getCredits());
Student[] freshman = getZeroCredits(chart);
System.out.println();
for (Student x: freshman)
System.out.println ("Name: " + x.getName() + " Id: " + x.getStudentID() + " Credits: " + x.getCredits());
//display(chart);
}
}