package JunitTestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.GovernmentDocument;

public class GovermentDocumentsJunit {

	@Test
	public void testToString() {
		GovernmentDocument gd = new GovernmentDocument(6, "Salford Plans", "gd0", 1, false, "Manchester");
		String s = "ID = 6 Name = Salford Plans Code = gd0 Issue Number = 1 Item checked out = false Owning Goverment = Manchester";
		assertEquals(s,gd.toString());
	}


	@Test
	public void testGetGdOwningGoverment() {
	GovernmentDocument gd = new GovernmentDocument(6, "Salford Plans", "gd0", 1, false, "Manchester");
	String s = gd.getGdOwningGoverment();
	assertEquals("Manchester", s);
	}

	@Test
	public void testSetGdOwningGoverment() {
		GovernmentDocument gd = new GovernmentDocument(6, "Salford Plans", "gd0", 1, false, "Manchester");
		gd.setGdOwningGoverment("Plymouth");
		assertEquals("Plymouth", gd.getGdOwningGoverment());
	}
	
	@Test
	public void testSetGdOwningGoverment2() {
		GovernmentDocument gd = new GovernmentDocument(6, "Salford Plans", "gd0", 1, false, "Manchester");
		gd.setGdOwningGoverment(null);
		assertNull(gd.getGdOwningGoverment());
	}
	

}
