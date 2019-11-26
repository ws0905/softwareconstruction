package second_version;
/***********************************************************************
 * Module:  AdditionOperation.java
 * Author:  Œ‚ ¢
 * Purpose: Defines the Class AdditionOperation
 ***********************************************************************/

import java.util.*;

public class AdditionOperation extends BinaryOperation {
	public AdditionOperation() {
		generateBinaryOperation("+");
	}
   public int calculate(int left, int right) {
      return left + right;
   }
   
}