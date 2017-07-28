package Main;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
	//ArrayList to store people	
	
	
	Library l = new Library();
	
	//Creation of people

	Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
	Person p1 = new Person(1, "Bob", 68 , "Retired", "40 Rochdale");
	Person p2 = new Person(2, "Rob", 27 , "Unemployed", "12 Lane");	
	Person p3 = new Person(3, "Ben", 25 , "Reviewer", "65 Close");	
	Person p4 = new Person(4, "Dave", 29 , "Scientist", "16 Heart");
	Person p5 = new Person(5, "Jamie", 33 , "Technician", "19 Close");
	Person p6 = new Person(6, "Kevin", 89 , "Retired", "90 Sky");
	Person p7 = new Person(7, "Katie", 34 , "Doctor", "15 YellowLane");
	Person p8 = new Person(8, "Beth", 18 , "Student", "67 Keys");
	Person p9 = new Person(9, "Hannah", 45 , "Engineer", "12 Salford");
	
	//Adding People to ArrayList
	l.pAL.add(p0);
	l.pAL.add(p1);
	l.pAL.add(p2);
	l.pAL.add(p3);
	l.pAL.add(p4);
	l.pAL.add(p5);
	l.pAL.add(p6);
	l.pAL.add(p7);
	l.pAL.add(p8);
	l.pAL.add(p9);
	
	//Displaying all people
	l.outputAllPerson();
	System.out.println("\n");
	
	//Creation of Items

	//Creation of Books
	Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
	Book b1 = new Book(1, "Lion King", "b1", 1, false, "Disney", "Second", true);
	Book b2 = new Book(2, "Mice of men", "b2", 1, false, "John Steinbeck", "First", true);
	
	//Adding books to ArrayList
	l.iAL.add(b0);
	l.iAL.add(b1);
	l.iAL.add(b2);
	
	
	//Creation of magazines
	//int iId, String iName, String iCode, int iIssueNum, boolean iCheckedOut, String mCategory
	Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
	Magazine m1 = new Magazine(4, "Top Of The Pops", "m1", 1, false, "Music");
	Magazine m2 = new Magazine(5, "Eastenders", "m2", 1, false, "Television");
	
	//Adding magazines to ArrayList
	l.iAL.add(m0);
	l.iAL.add(m1);
	l.iAL.add(m2);
	
	
	//Creation of Government Documents

	GovernmentDocument gd0 = new GovernmentDocument(6, "Salford Plans", "gd0", 1, false, "Manchester");
	GovernmentDocument gd1 = new GovernmentDocument(7, "Plymouth parks", "gd1", 1, false, "Plymouth");
	GovernmentDocument gd2 = new GovernmentDocument(8, "Brighton Pier", "gd2", 1, false, "Brighton");
	GovernmentDocument gd3 = new GovernmentDocument(9, "Deaglen secret mission", "gd3", 1, false, "FBI");
	
	//Adding Documents to ArrayList
	l.iAL.add(gd0);
	l.iAL.add(gd1);
	l.iAL.add(gd2);
	l.iAL.add(gd3);
	//Displaying all items
	l.outputAllItem();
	System.out.println("\n");
	
	
	//Output a single person
	System.out.println("OUTPUT A SINGLE PERSON");
	l.outputPerson(p9.getpId());
	System.out.println("\n");
	
	
	//Person 0 checks out Item 0
	System.out.println("OUTPUT ALL CHECKEDOUT ITEMS");
	l.checkOutItem(0, 0);
	l.checkOutItem(1, 3);
	l.checkOutItem(2, 5);
	l.checkOutItem(6, 9);
	l.outputCheckedOutItems();
	System.out.println("\n");
	
	
	//Remove a certain checkedout item
	System.out.println("REMOVE CERTAIN CHECKEDOUT ITEM");
	l.removeCheckoutItem(2, 5);
	l.outputCheckedOutItems();
	System.out.println("\n");
	
	
	//Write Contents to a file
	System.out.println("WRITE ALL CONTENTS TO FILE");
	l.writeContentsToFile();
	
	
	//Clear all library
	l.clearPeople();
	l.clearItem();
	
	
	//Read People and Items back into Library to Populate it
	System.out.println("READ BACK IN CONTENTS FROM FILE AND POPULATE");
	l.readContentsFromFile();
	l.outputAllPerson();
	System.out.println("\n");
	l.outputAllItem();
	System.out.println("\n");
	
	
	
	}

}
