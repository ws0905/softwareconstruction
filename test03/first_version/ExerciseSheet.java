package first_version;

import java.util.*;

public class ExerciseSheet {
	ArrayList<String> answer = new ArrayList<String>(); ;//用来存储结果
	ArrayList<String> problem = new ArrayList<String>();//用来存储算式

	ExerciseSheet(){
		Exercise exercise = new Exercise();
		exercise.generBinaryExercise(50);//生成50道题目
		formatted(exercise);
		value(exercise);
	}
	
	public void formatted(Exercise ex) {
		int i=1;//对题目计数

		while(ex.hasNext()) {
			problem.add(ex.next().toString());
		}
	}

	public void value(Exercise ex) {
		int i=1;
		ex.current=0;

		while(ex.hasNext()) {
			answer.add(ex.next().getvalue());
		}
	}

	public void print_problem(int column) {//每行多少列
		int i;//计数器
		
		System.out.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          题目                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------\n");
		for(i = 1; i <= problem.size(); i++) {
			System.out.printf("%-20s", "第"+ i +"题:"+problem.get(i-1));
			if(i % column == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public void print_answer(int column) {
		int i;
		
		System.out.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          答案                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------\n");
		for(i = 1; i <= answer.size(); i++) {
			System.out.printf("%-20s", "第"+ i +"题的答案:"+answer.get(i-1));
			if(i % column == 0)
				System.out.println();
		}
		System.out.println();
	}
}