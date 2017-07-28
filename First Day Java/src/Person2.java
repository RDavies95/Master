import java.io.Serializable;

public class Person2 implements Serializable {

	String pName;
	String pOccupation;
	int age;
	
	
	
	public Person2(String name, String occupation, int age)
	{
		this.pName = name;
		this.pOccupation = occupation;
		this.age = age;
	}
	
	
	public String returninfo(String name, String occupation, int age)
	{
		String person = name + " , " + occupation + " , " + age;
		return person;
	}
	
	
	
	public String toString()
	{
		String s = "Person name: " + this.pName + " Occupation: " + this.pOccupation + " Age: " + this.age;
		return s;
	}
	
}
