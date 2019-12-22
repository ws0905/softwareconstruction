package first_version;

public class Main3 {
	public static void main(String[] args) {
		FileManage fileManage = new FileManage();
		ExerciseFile ef = fileManage.productExerciseFile("d:\\test");
		practiceFile pf = fileManage.productPracticeFile("d:\\test");
		pf.read(5);
		pf.write();
	}
}