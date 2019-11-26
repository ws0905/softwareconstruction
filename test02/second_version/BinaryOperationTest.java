package second_version;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryOperationTest {
	BinaryOperation bo1;
	BinaryOperation bo2;
	@Before
	public void setUp() throws Exception {
		bo1=new AdditionOperation();
		bo2=new SubstractOperation();
	}

	@Test
	public void testCalculate() {
		assertEquals(bo1.calculate(10, 20),30);
	}

	@Test
	public void testCheckingCalculation() {
		assertEquals(bo1.checkingCalculation(), true);
	}

	@Test
	public void testEqualsBinaryOperation() {
		assertEquals(bo1.equals(bo2), false);
	}

}
