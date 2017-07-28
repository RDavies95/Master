package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Book;
import Main.Item;
import Main.Library;
import Main.Magazine;
import Main.Person;

public class LibraryTestCase {
	
	Library l;
	Person p,p2;
	Magazine m, m2;
	
	@Before
	public void setUp()
	{
		l = new Library();
		p = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		p2 = new Person(1, "Bob", 68 , "Retired", "40 Rochdale");
		m = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m2 = new Magazine(4, "Top Of The Pops", "m1", 1, false, "Music");
	}
	

	@Test
	public void testRegisterPerson() {
		l.pAL.add(p);
		assertNotNull(l.pAL);
	}

	@Test
	public void testRemovePerson() {
		l.pAL.add(p);
		l.removePerson(p.getpId());
		assertEquals(l.pAL.size(), 0);
		
	}

	@Test
	public void testUpdatePerson() {
		l.pAL.add(p);
		l.updatePerson(0, "Rhys", 22 , "HSBC", "10 Avenue");
		assertEquals(p.getpOccupation(),"HSBC");
	}

	@Test
	public void testAddItem() {
		l.iAL.add(m);
		assertNotNull(l.iAL);
	}

	@Test
	public void testRemoveItem() {
		l.iAL.add(m);
		l.removeItem(m.getiId());
		assertEquals(l.iAL.size(), 0);
		
	}

	@Test
	public void testOutputAllPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputAllItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testOutputItem() {
		l.outputItem(3);
		
	}

	@Test
	public void testCheckOutItem() {
		l.checkOutItem(1,3);
		assertEquals(l.itemsOut.size(),1);
		
		
		
		
	}

	@Test
	public void testOutputCheckedOutItems() {
		l.checkOutItem(1,3);
		l.checkOutItem(2, 6);
		l.removeCheckoutItem(2, 6);
		assertEquals(l.itemsOut.size(),1);
	}

	@Test
	public void testRemoveCheckoutItem() {
		
	}

	@Test
	public void testWriteContentsToFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadContentsFromFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testClearPeople() {
		l.pAL.add(p);
		l.pAL.add(p2);
		l.clearPeople();
		assertEquals(l.pAL.size(),0);
	}

	@Test
	public void testClearItem() {
		l.iAL.add(m);
		l.iAL.add(m2);
		l.clearItem();
		assertEquals(l.iAL.size(),0);
	}

}
