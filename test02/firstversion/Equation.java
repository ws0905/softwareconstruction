package firstversion;
/***********************************************************************
 * Module:  Equation.java
 * Author:  吴盛
 * Purpose: Defines the Class Equation
 ***********************************************************************/

import java.util.*;

public class Equation {//算式类
	private int leftOperand = 0;//左操作数
	private int rightOperand = 0;//右操作数
	private String operator = "+";//操作符
	private int value = 0;//结果
	private final int LOWER = 0;//所有操作数的最小值
	private final int UPPER = 100;//所有操作数的最大值

	public void construct(int left,int right,String op) {//构造函数
		// TODO: implement
		leftOperand = left;
		rightOperand = right;
		operator = op;
		if (op == "+")
			value = left + right;
		else
			value = left - right;
	}

	public Equation generAdditionOperation() {//生成一个加法算式
		// TODO: implement
		Random random = new Random();

		int left , right , result;
		left = random.nextInt(101);
		do{
			right = random.nextInt(101);
			result = left+right;
		}while(result > UPPER);
		Equation fp = new Equation();
		fp.construct(left, right, "+");
		return fp;
	}

	public Equation generSubstractOperation() {//生成一个减法算式
		// TODO: implement
		Random random = new Random();

		int left , right , result;
		left = random.nextInt(101);
		do {
			right = random.nextInt(101);
			result = left - right;
		} while (result<LOWER);
		Equation fp = new Equation();
		fp.construct(left, right, "-");
		return fp;
	}

	public Equation geneOperation() {//随机生成一个加法或减法算式
		// TODO: implement
		int rd;

		Random random = new Random();
		rd = random.nextInt(2);//随机生成0或
		if (rd == 0){
			return generAdditionOperation();
		}
		else
			return generSubstractOperation();
	}

	public int getLeftOperand() {
		// TODO: implement
		return leftOperand;
	}

	public int getRightOperand() {
		// TODO: implement
		return rightOperand;
	}

	public String getOperator() {
		// TODO: implement
		return operator;
	}
	
	public int getValue(){
		// TODO: implement
		return value;
	}

	public boolean equals(Equation equation) {//简单的判断两个算式是不是完全相等
		// TODO: implement
		return equation.getLeftOperand() == leftOperand & equation.getRightOperand() == rightOperand & equation.getOperator() == operator;
	}

	public String toString() {
		// TODO: implement
		return leftOperand + operator + rightOperand + "=";
	}
}