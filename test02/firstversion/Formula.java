package firstversion;
/***********************************************************************
 * Module:  Formula.java
 * Author:  吴盛
 * Purpose: Defines the Class Formula
 ***********************************************************************/


public class Formula {
	private final int OPERATION_NUMBER = 50;//习题的数量
	private Equation[] equation = new Equation[OPERATION_NUMBER];//保存习题的对象数组

	public void generateEquation() {//生成习题
		// TODO: implement
		int i = 0;

		Equation opCreator = new Equation();
		for(i = 0; i < OPERATION_NUMBER; i++){
			Equation anOperation = opCreator.geneOperation();
			while(contains(anOperation, i-1)){
				anOperation=opCreator.geneOperation();
			}
			equation[i] = anOperation;
		}
	}

	public boolean contains(Equation anEquation,int length) {//比较习题中是否有重复
		// TODO: implement
		int i=0;

		for(i = 0; i <= length; i++){
			if(equation[i].getOperator() == anEquation.getOperator()){//操作符相等
				if(equation[i].getValue() == anEquation.getValue()){//结果相等
					if(equation[i].getLeftOperand() == anEquation.getLeftOperand() || equation[i].getLeftOperand() == anEquation.getRightOperand()){//左操作数等于右操作数或左操作数等于左操作数
						return true;
					}
				}
			}
		}
		return false;
	}

	public void formateAndDisplay() {//打印习题
		// TODO: implement
		int i = 0;
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-                                                   习题                                                                                                              -");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		for(i = 0; i < OPERATION_NUMBER; i++){
			System.out.printf("%-20s","题目"+(i+1)+":"+equation[i].toString());
			if((i + 1) % 5 == 0)
				System.out.println();
		}
	}
	
	public void AnswerPrint(){//打印答案
		// TODO: implement
		int i = 0;
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-                                                   答案                                                                                                             -");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		for(i = 0; i < OPERATION_NUMBER; i++){
			System.out.printf("%-20s","题目"+(i+1)+"的答案:"+equation[i].getValue());
			if((i + 1) % 5 == 0)
				System.out.println();
		}
	}
}