package Main;

public class GovernmentDocument extends Item {
	
	String gdOwningGoverment;

	public GovernmentDocument(int iId, String iName, String iCode, int iIssueNum, boolean iCheckedOut, String gdOwningGoverment) {
		super(iId, iName, iCode, iIssueNum, iCheckedOut);
		this.gdOwningGoverment = gdOwningGoverment;
		// TODO Auto-generated constructor stub
	}

	
	public String toString()
	{
		String s =  super.toString() + " Owning Goverment = " + this.gdOwningGoverment;
		return s;
	}
	
	public String toString2()
	{
		return "g" + super.toString2() + this.gdOwningGoverment + "/?";
	}
	
	
	
	public String getGdOwningGoverment() {
		return gdOwningGoverment;
	}

	public void setGdOwningGoverment(String gdOwningGoverment) {
		this.gdOwningGoverment = gdOwningGoverment;
	}
	
	
	

}
