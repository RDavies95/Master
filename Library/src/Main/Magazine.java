package Main;

public class Magazine extends Item {
	
	String mCategory;

	public Magazine(int iId, String iName, String iCode, int iIssueNum, boolean iCheckedOut, String mCategory) {
		super(iId, iName, iCode, iIssueNum, iCheckedOut);
		this.mCategory = mCategory;
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
	 return super.toString() + " Category = " + this.mCategory;
	}
	
	public String toString2()
	{
		return "m" + super.toString2() + this.mCategory + "/?";
	}

	public String getmCategory() {
		return mCategory;
	}

	public void setmCategory(String mCategory) {
		this.mCategory = mCategory;
	}
	
	
	
	

}
