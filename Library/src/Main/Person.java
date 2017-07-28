package Main;

public class Person {
	
	int pId;
	String pName;
	int pAge;
	String pOccupation;
	String pAddress;
	
	public Person(int pId, String pName, int pAge, String pOccupation, String pAddress)
	{
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
		this.pOccupation = pOccupation;
		this.pAddress = pAddress;
	}
	
	
	public String toString()
	{
		return "ID = " + this.pId + " Name = " + this.pName + " Age = " + this.pAge + " Occupation = " + this.pOccupation + " Address = " + this.pAddress;
	}
	
	public String toString2()
	{
		return "p" + "/" + this.pId + "/" + this.pName + "/" + this.pAge + "/" + this.pOccupation + "/" + this.pAddress + "/?";
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpOccupation() {
		return pOccupation;
	}

	public void setpOccupation(String pOccupation) {
		this.pOccupation = pOccupation;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	
	

}
