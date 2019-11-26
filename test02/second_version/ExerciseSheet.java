/***********************************************************************
 * Module:  ExerciseSheet.java
 * Author:  吴盛
 * Purpose: Defines the Class ExerciseSheet
 ***********************************************************************/

package second_version;

import java.util.*;

public class ExerciseSheet {
	private final int COLUMNNUMBER= 5;

	public void formattedDisplay(Exercise ex, int columns) {
		int i=1;//对题目进行计数

		while(ex.hasNext()) {
			System.out.printf("%-20s", "第"+i+"题:"+ex.next().toString());
			if(ex.current % columns == 0)
				System.out.println();
			i++;
		}
	}
	
	public void formattedDisplay(Exercise ex) {
		int i=1;//对题目计数

		while(ex.hasNext()) {
			System.out.printf("%-20s", "第"+i+"题:"+ex.next().toString()); 
			if(ex.current % 5 == 0)
				System.out.println();
			i++;
		}
	}
	
	public void valueDisplay(Exercise ex) {
		int i=1;
		ex.current=0;
		
		while(ex.hasNext()) {
			System.out.printf("%-20s", "第"+i+"题的答案:"+ex.next().getvalue()); 
			if(ex.current % 5 == 0)
				System.out.println();
			i++;
		}
	}
	
	public void print(String str) {
		System.out.println(str);
	}

}