package second_version;

public class Main2 {
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
