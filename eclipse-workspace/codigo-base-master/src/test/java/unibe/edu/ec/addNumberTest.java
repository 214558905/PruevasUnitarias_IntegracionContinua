package unibe.edu.ec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class addNumberTest {
	
	private AddNumber addNumber;
	
	@Before
	
	public void before() {
		
		this.addNumber = new AddNumber(2,5);
	}
	
	@Test
	
	public void getResult() {
		
		assertEquals(7, this.addNumber.getResult());
	}

}
