package Main;

public abstract class Item {

 int iId;
 String iName;
 String iCode;
 int iIssueNum;
 boolean iCheckedOut;
 
 
 public Item(int iId, String iName, String iCode, int iIssueNum, boolean iCheckedOut)
 {
	 this.iId = iId;
	 this.iName = iName;
	 this.iCode = iCode;
	 this.iIssueNum = iIssueNum;
	 this.iCheckedOut = iCheckedOut;
 }
 
 public String toString()
 {
	 String s = "ID = " + this.iId + " Name = " + this.iName + " Code = " + this.iCode + " Issue Number = " + this.iIssueNum + " Item checked out = " + this.iCheckedOut;
	 return s;
 }
 
 public String toString2()
 {
	return "/" + this.iId + "/" + this.iName + "/" + this.iCode + "/" + this.iIssueNum + "/" + this.iCheckedOut + "/"; 
 }
 
 
 
 


public int getiId() {
	return iId;
}


public void setiId(int iId) {
	this.iId = iId;
}


public String getiName() {
	return iName;
}


public void setiName(String iName) {
	this.iName = iName;
}


public String getiCode() {
	return iCode;
}


public void setiCode(String iCode) {
	this.iCode = iCode;
}


public int getiIssueNum() {
	return iIssueNum;
}


public void setiIssueNum(int iIssueNum) {
	this.iIssueNum = iIssueNum;
}


public boolean getiCheckedOut() {
	return iCheckedOut;
}


public void setiCheckedOut(boolean iCheckedOut) {
	this.iCheckedOut = iCheckedOut;
}
	
	
	
	
	
}
