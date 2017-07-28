package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Magazine;

public class MagazineJunit {

	@Test
	public void testToString() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		String s = "ID = 3 Name = Cool Weekly Code = m0 Issue Number = 1 Item checked out = false Category = Pop";
		assertEquals(s, m0.toString());
	}


	@Test
	public void testGetmCategory() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		String s = m0.getmCategory();
		assertEquals("Pop", s);
	}

	@Test
	public void testSetmCategory() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m0.setmCategory("Rock");
		assertEquals("Rock", m0.getmCategory());
	}

}
