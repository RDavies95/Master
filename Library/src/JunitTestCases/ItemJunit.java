package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Magazine;

public class ItemJunit {


	@Test
	public void testToString() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		String s = "ID = 4 Name = Top Of The Pops Code = m1 Issue Number = 1 Item checked out = false Category = Music";
		assertEquals(s, m0.toString());
	}

	@Test
	public void testGetiId() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		int s = m0.getiId();
		assertEquals(3, s);
	}

	@Test
	public void testSetiId() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m0.setiId(8);
		assertEquals(8, m0.getiId());
	}

	@Test
	public void testGetiName() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		String s = m0.getiName();
		assertEquals("Cool Weekly", s);
	}

	@Test
	public void testSetiName() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m0.setiName("Cool Monthly");
		assertEquals("Cool Monthly", m0.getiName());
	}

	@Test
	public void testGetiCode() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		String s = m0.getiCode();
		assertEquals("m0", s);
	}

	@Test
	public void testSetiCode() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m0.setiCode("m10");
		assertEquals("m10", m0.getiId());
	}

	@Test
	public void testGetiIssueNum() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		int s = m0.getiIssueNum();
		assertEquals(1, s);
	}

	@Test
	public void testSetiIssueNum() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m0.setiIssueNum(3);
		assertEquals(3, m0.getiIssueNum());
	}

	@Test
	public void testgetiCheckedOut() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		boolean s = m0.getiCheckedOut();
		assertEquals(false, s);
	}

	@Test
	public void testSetiCheckedOut() {
		Magazine m0 = new Magazine(3, "Cool Weekly", "m0", 1, false, "Pop");
		m0.setiCheckedOut(true);
		assertEquals(true, m0.getiCheckedOut());
	}

}
