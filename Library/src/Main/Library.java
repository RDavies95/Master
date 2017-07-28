package Main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Library {

	// ArrayLists for Person and Item
 public	ArrayList<Person> pAL = new ArrayList<Person>();
 public	ArrayList<Item> iAL = new ArrayList<Item>();

 public ArrayList<String> itemsOut = new ArrayList();

	// Register Person
	public void registerPerson(Person p) {
		pAL.add(p);
		System.out.println(p.pName + " has been successfully added");
		System.out.println("\n");
	}

	// Remove Person
	public void removePerson(int id) {
		for (int i = 0; i < pAL.size(); i++) {
			Person p = pAL.get(i);

			if (id == p.pId) {
				pAL.remove(i);
			}
		}
		System.out.println("Person succesffuly removed");
	}

	// Update Person
	public void updatePerson(int pId, String pName, int pAge, String pOccupation, String pAddress) {
		for (int i = 0; i < pAL.size(); i++) {
			Person p = pAL.get(i);

			if (pId == p.pId) {

				pAL.get(i).setpName(pName);
				pAL.get(i).setpAge(pAge);
				pAL.get(i).setpOccupation(pOccupation);
				pAL.get(i).setpAddress(pAddress);

			}
		}
		System.out.println("Person succesffuly updated");
	}

	// Add Item
	public void addItem(Item i) {
		iAL.add(i);
		System.out.println(i.iName + " has been successfully added");
		System.out.println("\n");
	}

	public void removeItem(int id) {
		for (int i = 0; i < iAL.size(); i++) {
			Item j = iAL.get(i);

			if (id == j.iId) {
				iAL.remove(i);
			}
		}
		System.out.println("Item succesffuly removed");
	}

	public void outputAllPerson() {
		for (Person p : pAL) {
			System.out.println(p);
		}
	}

	public void outputAllItem() {
		for (Item i : iAL) {
			System.out.println(i);
		}
	}

	public void outputPerson(int pId) {
		for (int i = 0; i < pAL.size(); i++) {
			if (i == pId) {
				System.out.print(pAL.get(i));
			}
		}
	}

	public void outputItem(int iId) {
		for (int i = 0; i < iAL.size(); i++) {
			if (i == iId) {
				System.out.print(iAL.get(i));
			}
		}

	}

	public void checkOutItem(int pId, int iId) {
		String itemTakenOut = Integer.toString(pId) + Integer.toString(iId);
		itemsOut.add(itemTakenOut);

	}

	public void outputCheckedOutItems() {
		for (int i = 0; i < itemsOut.size(); i++) {

			String s = itemsOut.get(i);
			Character s1 = s.charAt(0);
			Character s2 = s.charAt(1);
			int ty = Integer.parseInt(s1.toString());
			int yt = Integer.parseInt(s2.toString());
			System.out.println("---OUTPUT PERSON---");
			outputPerson(ty);
			System.out.println("\n");
			System.out.println("---OUTPUT ITEM---");
			outputItem(yt);
			System.out.println("\n");

		}
	}

	public void removeCheckoutItem(int pId, int iId) {
		String spId = Integer.toString(pId);
		String ipId = Integer.toString(iId);
		String toFind = spId + ipId;
		for (int i = 0; i < itemsOut.size(); i++) {
			if (itemsOut.get(i).equals(toFind)) {
				itemsOut.remove(i);
			}
		}
	}

	public void writeContentsToFile() throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("LibraryContents.txt", "UTF-8");

		for (int i = 0; i < pAL.size(); i++) {
			String s = pAL.get(i).toString2();
			writer.println(s);
		}

		for (int i = 0; i < iAL.size(); i++) {
			String s = iAL.get(i).toString2();
			writer.println(s);
		}

		writer.close();
	}

	public void readContentsFromFile() throws IOException {
		String cLine;
		InputStream fis = new FileInputStream("LibraryContents.txt");
		InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		BufferedReader br = new BufferedReader(isr);

		while ((cLine = br.readLine()) != null) {

			Character s1 = cLine.charAt(0);
			String char1 = s1.toString();

			switch (char1) {
			case "p":
				String[] outputP = cLine.split(Pattern.quote("/"));
				Person p = new Person(Integer.parseInt(outputP[1]),outputP[2],Integer.parseInt(outputP[3]),outputP[4],outputP[5]);
				registerPerson(p);
				break;

			case "b":
				String[] outputB = cLine.split(Pattern.quote("/"));
				Book b = new Book(Integer.parseInt(outputB[1]),outputB[2],outputB[3],Integer.parseInt(outputB[4]),Boolean.getBoolean(outputB[5]),outputB[6],outputB[7],Boolean.getBoolean(outputB[8]));
				addItem(b);
				break;
				
			case "g":
				String[] outputG = cLine.split(Pattern.quote("/"));
				GovernmentDocument gd = new GovernmentDocument(Integer.parseInt(outputG[1]),outputG[2],outputG[3],Integer.parseInt(outputG[4]),Boolean.getBoolean(outputG[5]),outputG[6]);
				addItem(gd);
				break;

			case "m":
				String[] outputM= cLine.split(Pattern.quote("/"));
				Magazine m = new Magazine(Integer.parseInt(outputM[1]),outputM[2],outputM[3],Integer.parseInt(outputM[4]),Boolean.getBoolean(outputM[5]),outputM[6]);
				addItem(m);
				break;
			}

		}
		br.close();

	}
	
	public void clearPeople()
	{
		pAL.clear();
	}
	
	public void clearItem()
	{
		iAL.clear();
	}
	
	
	
	

}
