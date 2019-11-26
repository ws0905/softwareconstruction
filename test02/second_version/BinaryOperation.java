package second_version;
/***********************************************************************
 * Module:  BinaryOperation.java
 * Author:  吴盛
 * Purpose: Defines the Class BinaryOperation
 ***********************************************************************/

import java.util.*;

public abstract class BinaryOperation {
	private int upper = 100;
	private int lower = 0;
	private int leftOperand = 0;
	private int rightOperand = 0;
	private int value = 0;
	private String operate = "+";
	
	protected void generateBinaryOperation(String anOperator) {
		Random random = new Random();
		operate = anOperator;
		leftOperand = random.nextInt(upper+1);
		
		do {
			rightOperand = random.nextInt(upper+1);
			value = calculate(leftOperand, rightOperand);
		}while(!(checkingCalculation()));
	}
	
	public abstract int calculate(int left, int right);
	
	public boolean checkingCalculation() {
		if(value < lower)
			return false;
		else if(value > upper)
			return false;
		else
			return true;
	}

	public boolean equals(BinaryOperation binaryOperation) {
		if(binaryOperation.value == value) {//结果相等
			if(binaryOperation.rightOperand == rightOperand && binaryOperation.leftOperand == leftOperand)//左右操作数对应相等 
				return true;
			else if(binaryOperation.rightOperand == leftOperand && binaryOperation.leftOperand == rightOperand)//左右操作数交叉相等
				return true;
			else
				return false;
		}
		else
			return false;
	}

	public String toString() {
		return leftOperand + operate + rightOperand + "=";
	}
	public int getvalue() {
		return value;
	}
}