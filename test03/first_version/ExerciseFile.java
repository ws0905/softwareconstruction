package first_version;

import java.io.IOException;
import java.nio.charset.Charset;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class ExerciseFile{
	String path;//�ļ�·��
	int problem_num = 50;
	int answer_num = 50;
	ExerciseFile(String path) {//����һ����path������·��
		this.path = path;
		ExerciseSheet ex = new ExerciseSheet();
		try{
			CsvWriter cs = new CsvWriter(this.path+".csv",',',Charset.forName("gb2312"));
			
			for(int i = 0; i < ex.problem.size(); i++){
				String csvContent = ex.problem.get(i);
				String[] csvContent1 = {csvContent," "};
				cs.writeRecord(csvContent1);
			}
			for(int i = 0; i < ex.answer.size(); i++){
				String csvContent = ex.answer.get(i);
				String[] csvContent1 = {csvContent,""};
				cs.writeRecord(csvContent1);
			}
			System.out.println("--------------������һ���µ�ϰ���ļ�"+path+"!------------------------");
			cs.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void read(int num) {
		// TODO Auto-generated method stub
		ExerciseSheet exerciseSheet = new ExerciseSheet();
		
		try {
			int i;
			
			CsvReader reader = new CsvReader(path,',',Charset.forName("gb2312"));
			for(i = 1;i <= problem_num; i++){
				//System.out.println(reader.getRawRecord());
				exerciseSheet.problem.add(reader.getRawRecord());//��ȡһ��
			}
			for(i = 1;i <= answer_num; i++){
				//System.out.println(reader.getRawRecord());
				exerciseSheet.answer.add(reader.getRawRecord());//��ȡһ��
			}
			exerciseSheet.print_problem(num);
			exerciseSheet.print_answer(num);
			reader.close();
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void write() {
		// TODO Auto-generated method stub
		System.out.print("��֧�ָ�дϰ���ļ���");
	}

}
