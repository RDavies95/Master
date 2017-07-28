package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.GovernmentDocument;
import Main.Person;

public class PersonJunit {


	@Test
	public void testToString() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		String s = "ID = 0 Name = Rhys Age = 22 Occupation = QA Address = 10 Avenue";
		assertEquals(s, p0.toString());
	}

	@Test
	public void testGetpId() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		int s = p0.getpId();
		assertEquals(0, s);
	}

	@Test
	public void testSetpId() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		p0.setpId(1);
		assertEquals(1, p0.getpId());
	}

	@Test
	public void testGetpName() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		String s = p0.getpName();
		assertEquals("Rhys", s);
	}

	@Test
	public void testSetpName() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		p0.setpName("Dave");
		assertEquals("Dave", p0.getpName());
	}

	@Test
	public void testGetpAge() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		int s = p0.getpAge();
		assertEquals(22, s);
	}

	@Test
	public void testSetpAge() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		p0.setpAge(26);
		assertEquals(26, p0.getpAge());
	}

	@Test
	public void testGetpOccupation() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		String s = p0.getpOccupation();
		assertEquals("QA", s);
	}

	@Test
	public void testSetpOccupation() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		p0.setpOccupation("Lawyer");
		assertEquals("Lawyer", p0.getpOccupation());
	}

	@Test
	public void testGetpAddress() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		String s = p0.getpAddress();
		assertEquals("10 Avenue", s);
	}

	@Test
	public void testSetpAddress() {
		Person p0 = new Person(0, "Rhys", 22 , "QA", "10 Avenue");
		p0.setpAddress("Heaven");
		assertEquals("Heaven", p0.getpAddress());
	}

}
