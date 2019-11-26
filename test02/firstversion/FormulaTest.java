package firstversion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FormulaTest {
	Formula formula;
	
	@Before
	public void setUp() throws Exception {
		formula = new Formula();
		formula.generateEquation();
	}

	@Test
	public void testContains() {
		assertEquals(formula.contains(formula.getEquation(10), 10),true);
	}
	
}
