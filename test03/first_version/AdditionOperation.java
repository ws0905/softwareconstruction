package first_version;

import java.util.*;

public class AdditionOperation extends BinaryOperation {
	public AdditionOperation() {
		generateBinaryOperation("+");
	}
   public int calculate(int left, int right) {
      return left + right;
   }
   
}