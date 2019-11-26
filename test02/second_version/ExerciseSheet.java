/***********************************************************************
 * Module:  ExerciseSheet.java
 * Author:  ��ʢ
 * Purpose: Defines the Class ExerciseSheet
 ***********************************************************************/

package second_version;

import java.util.*;

public class ExerciseSheet {
	private final int COLUMNNUMBER= 5;

	public void formattedDisplay(Exercise ex, int columns) {
		int i=1;//����Ŀ���м���

		while(ex.hasNext()) {
			System.out.printf("%-20s", "��"+i+"��:"+ex.next().toString());
			if(ex.current % columns == 0)
				System.out.println();
			i++;
		}
	}
	
	public void formattedDisplay(Exercise ex) {
		int i=1;//����Ŀ����

		while(ex.hasNext()) {
			System.out.printf("%-20s", "��"+i+"��:"+ex.next().toString()); 
			if(ex.current % 5 == 0)
				System.out.println();
			i++;
		}
	}
	
	public void valueDisplay(Exercise ex) {
		int i=1;
		ex.current=0;
		
		while(ex.hasNext()) {
			System.out.printf("%-20s", "��"+i+"��Ĵ�:"+ex.next().getvalue()); 
			if(ex.current % 5 == 0)
				System.out.println();
			i++;
		}
	}
	
	public void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		ExerciseSheet sheet = new ExerciseSheet();
		Exercise exercise = new Exercise();
		exercise.generBinaryExercise(50);//����50����Ŀ
		sheet.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          ��Ŀ                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------");
		sheet.formattedDisplay(exercise, 5);
		sheet.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          ��                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------");
		sheet.valueDisplay(exercise);
	}

}