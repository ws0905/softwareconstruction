package first_version;

import java.util.Random;

public class Formula {
	static final int N=50;
	static int[] result=new int[N+5];//存储结果
	static String[] formula_storage=new String[N+5];//存储算式

	static void produce(){	//算式产生功能
		int a,b,c;
		int consequence=0;//记录结果
		String s=null;//记录算式
		Random random=new Random(); //产生随机数的方法
		for(int i=1;i<=N;i++){
			a=random.nextInt(101);//产生100以内的随机数
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
			if(consequence<0||consequence>100){//检测范围
				i--;
				continue;
			}
			for(int j=1;j<i;j++){//检测重复
				if(s==formula_storage[j]){
					i--;
					break;
				}
			}
		}
	}

	static void print_problem(){//题目打印功能
		System.out.println("----------------------------------------------题目-------------------------------------------");
		for(int i=1;i<=50;i++){
			System.out.print("第"+i+"题："+formula_storage[i]);	
			if(i%6==0){
				System.out.println();
			}
			else{
				System.out.print("\t");
			}
		}
		System.out.println();
	}

	static void print_result(){//答案打印功能
		System.out.println("----------------------------------------------算式答案----------------------------------------");
		for(int i=1;i<=50;i++){
			System.out.print("第"+i+"题答案：");
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
