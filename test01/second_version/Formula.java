package second_version;

import java.util.Random;

public class Formula {
	final int N=50;
	public class Equation{//�洢��ʽ�����ݽṹ
		int left_operand=0,right_operand=0;
		char operator=0;
		int value=0;
	}
	Equation equation[]=new Equation[N+5];//��������
	
	void produce(){	//��ʽ��������
		int a,b,c;
		int consequence=0;//��¼���
		Random random=new Random(); //����������ķ���
		for(int i=1;i<=N;i++){
			a=random.nextInt(101);//����100���ڵ������
			b=random.nextInt(101);
			c=random.nextInt(2);
			char ch;
			if(c==1){
				consequence=a+b;
				ch='+';
			}		
			else{
				consequence=a-b;
				ch='-';
			}
			Equation et=new Equation();//����ʵ����
			et.left_operand=a;
			et.right_operand=b;
			et.operator=ch;
			et.value=consequence;
			this.equation[i]=et;
			if(consequence<0||consequence>100){//��ⷶΧ
				i--;
				continue;
			}
			for(int j=1;j<i;j++){//����ظ�
				if(equation[i]==equation[j]){
					i--;
					break;
				}
			}
		}
	}

	void print_problem(){//��Ŀ��ӡ����
		System.out.println("-------------------------------------------------------------------------------------------------\n"
				+"                                                      ��Ŀ                                                   			 \n"
				+"---------------------------------------------------------------------------------------------------");
		for(int i=1;i<=N;i++){
			System.out.print("��"+i+"�⣺"+equation[i].left_operand+equation[i].operator+equation[i].right_operand+'=');	
			if(i%4==0){
				System.out.println();
			}
			else{
				System.out.print("\t\t");
			}
		}
		System.out.println();
	}

	void print_result(){//�𰸴�ӡ����
		System.out.println("-------------------------------------------------------------------------------------------------\n"
				+"                                                      ��                                                   			 \n"
				+"---------------------------------------------------------------------------------------------------");
		for(int i=1;i<=50;i++){
			System.out.print("��"+i+"��𰸣�");
			if(i%4==0)
				System.out.println(equation[i].value);
			else
				System.out.print(equation[i].value+"\t\t");
		}
	}
}
