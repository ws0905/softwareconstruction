/***********************************************************************
 * Module:  Exercise.java
 * Author:  Œ‚ ¢
 * Purpose: Defines the Class Exercise
 ***********************************************************************/

package second_version;

import java.util.*;

public class Exercise {
	private ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();
	int current = 0;

	public BinaryOperation generBinaryOperation() {
		Random random = new Random();
		int op = random.nextInt(2);
		if(op == 0)
			return new AdditionOperation();
		else
			return new SubstractOperation();
	}

	public void generBinaryExercise(int operationCount) {
		while(operationCount>0) {
			BinaryOperation bo;
			do {
				bo = generBinaryOperation();
			}while(operationList.contains(bo));
			operationList.add(bo);
			operationCount--;
		}
	}

	public void generAdditionExercise(int operationCount) {
		while(operationCount>0) {
			BinaryOperation bo;
			do {
				bo = new AdditionOperation();
			}while(operationList.contains(bo));
			operationList.add(bo);
			operationCount--;
		}
	}

	public void generSubstractExercise(int operationCount) {
		while(operationCount>0) {
			BinaryOperation bo;
			do {
				bo = new SubstractOperation();
			}while(operationList.contains(bo));
			operationList.add(bo);
			operationCount--;
		}
	}

	public boolean hasNext() {
		return current<operationList.size();
	}

	public BinaryOperation next() {
			return operationList.get(current++);
	}
	
}