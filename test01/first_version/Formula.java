package first_version;

import java.util.Random;

public class Formula {
	static final int N=50;
	static int[] result=new int[N+5];//�洢���
	static String[] formula_storage=new String[N+5];//�洢��ʽ

	static void produce(){	//��ʽ��������
		int a,b,c;
		int consequence=0;//��¼���
		String s=null;//��¼��ʽ
		Random random=new Random(); //����������ķ���
		for(int i=1;i<=N;i++){
			a=random.nextInt(101);//����100���ڵ������
			b=random.nextInt(101);
			c=random.nextInt(2);
			if(c==1){
				consequence=a+b;
				s=a+"+"+b+"=";
			}		
			else{
				consequence=a-b;
				s=a+"-"+b+"=";
			}
			formula_storage[i]=s;
			result[i]=consequence;
			if(consequence<0||consequence>100){//��ⷶΧ
				i--;
				continue;
			}
			for(int j=1;j<i;j++){//����ظ�
				if(s==formula_storage[j]){
					i--;
					break;
				}
			}
		}
	}

	static void print_problem(){//��Ŀ��ӡ����
		System.out.println("----------------------------------------------��Ŀ-------------------------------------------");
		for(int i=1;i<=50;i++){
			System.out.print("��"+i+"�⣺"+formula_storage[i]);	
			if(i%6==0){
				System.out.println();
			}
			else{
				System.out.print("\t");
			}
		}
		System.out.println();
	}

	static void print_result(){//�𰸴�ӡ����
		System.out.println("----------------------------------------------��ʽ��----------------------------------------");
		for(int i=1;i<=50;i++){
			System.out.print("��"+i+"��𰸣�");
			if(i%6==0)
				System.out.println(result[i]);
			else
				System.out.print(result[i]+"\t");
		}
	}

	public static void main(String args[]){
		produce();
		print_problem();
		print_result();
	}
}
