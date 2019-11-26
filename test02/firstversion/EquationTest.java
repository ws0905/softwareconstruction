package firstversion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EquationTest {
	Equation equation1;
	Equation equation2;
	
	@Before
	public void setUp() throws Exception {
		equation1 = new Equation();
		equation2 = new Equation();
		equation1.construct(10, 20, "+");
		equation2.construct(25, 12, "-");
	}

	@Test
	public void testGetLeftOperand() {
		assertEquals(equation1.getLeftOperand(), 10);
	}

	@Test
	public void testGetRightOperand() {
		assertEquals(equation2.getRightOperand(), 12);
	}

	@Test
	public void testGetOperator() {
		assertEquals(equation1.getOperator(), "+");
	}

	@Test
	public void testGetValue() {
		assertEquals(equation1.getValue(), 30);
	}

	@Test
	public void testEqualsEquation() {
		assertEquals(equation1.equals(equation2), false);
	}

	@Test
	public void testToString() {
		assertEquals(equation1.toString(), "10+20=");
	}

}
