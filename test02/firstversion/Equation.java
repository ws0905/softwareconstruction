package firstversion;
/***********************************************************************
 * Module:  Equation.java
 * Author:  ��ʢ
 * Purpose: Defines the Class Equation
 ***********************************************************************/

import java.util.*;

public class Equation {//��ʽ��
	private int leftOperand = 0;//�������
	private int rightOperand = 0;//�Ҳ�����
	private String operator = "+";//������
	private int value = 0;//���
	private final int LOWER = 0;//���в���������Сֵ
	private final int UPPER = 100;//���в����������ֵ

	public void construct(int left,int right,String op) {//���캯��
		// TODO: implement
		leftOperand = left;
		rightOperand = right;
		operator = op;
		if (op == "+")
			value = left + right;
		else
			value = left - right;
	}

	public Equation generAdditionOperation() {//����һ���ӷ���ʽ
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

	public Equation generSubstractOperation() {//����һ��������ʽ
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

	public Equation geneOperation() {//�������һ���ӷ��������ʽ
		// TODO: implement
		int rd;

		Random random = new Random();
		rd = random.nextInt(2);//�������0��
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

	public boolean equals(Equation equation) {//�򵥵��ж�������ʽ�ǲ�����ȫ���
		// TODO: implement
		return equation.getLeftOperand() == leftOperand & equation.getRightOperand() == rightOperand & equation.getOperator() == operator;
	}

	public String toString() {
		// TODO: implement
		return leftOperand + operator + rightOperand + "=";
	}
}