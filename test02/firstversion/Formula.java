package firstversion;
/***********************************************************************
 * Module:  Formula.java
 * Author:  ��ʢ
 * Purpose: Defines the Class Formula
 ***********************************************************************/


public class Formula {
	private final int OPERATION_NUMBER = 50;//ϰ�������
	private Equation[] equation = new Equation[OPERATION_NUMBER];//����ϰ��Ķ�������

	public void generateEquation() {//����ϰ��
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

	public boolean contains(Equation anEquation,int length) {//�Ƚ�ϰ�����Ƿ����ظ�
		// TODO: implement
		int i=0;

		for(i = 0; i <= length; i++){
			if(equation[i].getOperator() == anEquation.getOperator()){//���������
				if(equation[i].getValue() == anEquation.getValue()){//������
					if(equation[i].getLeftOperand() == anEquation.getLeftOperand() || equation[i].getLeftOperand() == anEquation.getRightOperand()){//������������Ҳ�������������������������
						return true;
					}
				}
			}
		}
		return false;
	}

	public void formateAndDisplay() {//��ӡϰ��
		// TODO: implement
		int i = 0;
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-                                                   ϰ��                                                                                                              -");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		for(i = 0; i < OPERATION_NUMBER; i++){
			System.out.printf("%-20s","��Ŀ"+(i+1)+":"+equation[i].toString());
			if((i + 1) % 5 == 0)
				System.out.println();
		}
	}
	
	public void AnswerPrint(){//��ӡ��
		// TODO: implement
		int i = 0;
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.println("-                                                   ��                                                                                                             -");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		for(i = 0; i < OPERATION_NUMBER; i++){
			System.out.printf("%-20s","��Ŀ"+(i+1)+"�Ĵ�:"+equation[i].getValue());
			if((i + 1) % 5 == 0)
				System.out.println();
		}
	}
}