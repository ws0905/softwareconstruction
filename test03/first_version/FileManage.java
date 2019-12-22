package first_version;

import java.util.ArrayList;

public class FileManage {
	ArrayList<String> exerciseFileList = new ArrayList<String>();
	ArrayList<String> practiceFileList = new ArrayList<String>();

	ExerciseFile productExerciseFile(String path){
		ExerciseFile exerciseFile = new ExerciseFile(path);
		exerciseFileList.add(path);
		return exerciseFile;
	}
	
	 practiceFile productPracticeFile(String path){
		practiceFile pf = new practiceFile(path);
		practiceFileList.add(path);
		return pf;
	}
}
