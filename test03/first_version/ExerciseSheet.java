package first_version;

import java.util.*;

public class ExerciseSheet {
	ArrayList<String> answer = new ArrayList<String>(); ;//�����洢���
	ArrayList<String> problem = new ArrayList<String>();//�����洢��ʽ

	ExerciseSheet(){
		Exercise exercise = new Exercise();
		exercise.generBinaryExercise(50);//����50����Ŀ
		formatted(exercise);
		value(exercise);
	}
	
	public void formatted(Exercise ex) {
		int i=1;//����Ŀ����

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

	public void print_problem(int column) {//ÿ�ж�����
		int i;//������
		
		System.out.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          ��Ŀ                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------\n");
		for(i = 1; i <= problem.size(); i++) {
			System.out.printf("%-20s", "��"+ i +"��:"+problem.get(i-1));
			if(i % column == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	public void print_answer(int column) {
		int i;
		
		System.out.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          ��                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------\n");
		for(i = 1; i <= answer.size(); i++) {
			System.out.printf("%-20s", "��"+ i +"��Ĵ�:"+answer.get(i-1));
			if(i % column == 0)
				System.out.println();
		}
		System.out.println();
	}
}