package second_version;

import java.util.Random;

public class Formula {
	final int N=50;
	public class Equation{//存储算式的数据结构
		int left_operand=0,right_operand=0;
		char operator=0;
		int value=0;
	}
	Equation equation[]=new Equation[N+5];//对象声明
	
	void produce(){	//算式产生功能
		int a,b,c;
		int consequence=0;//记录结果
		Random random=new Random(); //产生随机数的方法
		for(int i=1;i<=N;i++){
			a=random.nextInt(101);//产生100以内的随机数
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
			Equation et=new Equation();//对象实例化
			et.left_operand=a;
			et.right_operand=b;
			et.operator=ch;
			et.value=consequence;
			this.equation[i]=et;
			if(consequence<0||consequence>100){//检测范围
				i--;
				continue;
			}
			for(int j=1;j<i;j++){//检测重复
				if(equation[i]==equation[j]){
					i--;
					break;
				}
			}
		}
	}

	void print_problem(){//题目打印功能
		System.out.println("-------------------------------------------------------------------------------------------------\n"
				+"                                                      题目                                                   			 \n"
				+"---------------------------------------------------------------------------------------------------");
		for(int i=1;i<=N;i++){
			System.out.print("第"+i+"题："+equation[i].left_operand+equation[i].operator+equation[i].right_operand+'=');	
			if(i%4==0){
				System.out.println();
			}
			else{
				System.out.print("\t\t");
			}
		}
		System.out.println();
	}

	void print_result(){//答案打印功能
		System.out.println("-------------------------------------------------------------------------------------------------\n"
				+"                                                      答案                                                   			 \n"
				+"---------------------------------------------------------------------------------------------------");
		for(int i=1;i<=50;i++){
			System.out.print("第"+i+"题答案：");
			if(i%4==0)
				System.out.println(equation[i].value);
			else
				System.out.print(equation[i].value+"\t\t");
		}
	}
}
