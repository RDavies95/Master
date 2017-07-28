package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Book;

public class BookJunit {

	@Test
	public void testToString() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		String s = "ID = 0 Name = Chocolate Factory Code = b0 Issue Number = 1 Item checked out = false Author = Roald Dahl Publication = First Hardback = false";
		assertEquals(s, b0.toString());
	}


	@Test
	public void testGetbAuthor() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		String s = b0.getbAuthor();
		assertEquals("Chocolate Factory", s);
	}

	@Test
	public void testSetbAuthor() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		b0.setbAuthor("Rhys");
		assertEquals("Rhys", b0.getbAuthor());
	}

	@Test
	public void testGetbPublication() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		String s = b0.getbPublication();
		assertEquals("First", s);
	}

	@Test
	public void testSetbPublication() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		b0.setbPublication("Third");
		assertEquals("Rhys", b0.getbPublication());
	}

	@Test
	public void testIsbHardBack() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		Boolean s = b0.getisbHardBack();
		assertEquals(false, s);
	}

	@Test
	public void testSetbHardBack() {
		Book b0 = new Book(0, "Chocolate Factory", "b0", 1, false, "Roald Dahl", "First", false);
		b0.setbHardBack(true);
		assertEquals(true, b0.getisbHardBack());
	}

}
