import static org.junit.Assert.fail;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestPeople {

	@Test
	public void test() {
		Person p = new Person("Rhys",22,"QA");
		String result = p.returninfo("Rhys", 22, "QA");
		String expresult = "Rhys 22 QA";
		if(!result.equals(expresult))
		{
			fail("The two strings did not match");
		}
	
			
		
	}
	
	
	

}
