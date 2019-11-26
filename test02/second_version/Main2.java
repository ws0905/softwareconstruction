package second_version;

public class Main2 {
	public static void main(String[] args) {
		ExerciseSheet sheet = new ExerciseSheet();
		Exercise exercise = new Exercise();
		exercise.generBinaryExercise(50);//生成50道题目
		sheet.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          题目                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------");
		sheet.formattedDisplay(exercise, 5);
		sheet.print("----------------------------------------------------------------------------------------"
				  +"\n"
				  + "-                                          答案                                        -"
				  +"\n"
				  + "----------------------------------------------------------------------------------------");
		sheet.valueDisplay(exercise);
	}
}
