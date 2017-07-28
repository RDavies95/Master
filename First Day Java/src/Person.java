
public class Person {

	public String name;
	public int age;
	public String title;

	public Person(String personName, int personAge, String personTitle) {
		name = personName;
		age = personAge;
		title = personTitle;
		
		
	}
	
	public String returninfo(String personName, int personAge, String personTitle)
	{
				String info = personName +  " " +  personAge + " " + personTitle;
				return info;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;

	}

	public String getTitle() {
		return title;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
