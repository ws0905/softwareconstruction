package second_version;
/***********************************************************************
 * Module:  SubstractOperation.java
 * Author:  Œ‚ ¢
 * Purpose: Defines the Class SubstractOperation
 ***********************************************************************/

import java.util.*;

public class SubstractOperation extends BinaryOperation {
	public SubstractOperation() {
		generateBinaryOperation("-");
	}
   public int calculate(int left, int right) {
      return left - right;
   }

}