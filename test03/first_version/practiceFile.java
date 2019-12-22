package first_version;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class practiceFile {
	String path;//存放路径
	int problem_num=50;
	int answer_num=50;
	ArrayList<String> answer= new ArrayList<String>();
	ArrayList<String> judge= new ArrayList<String>();
	CsvReader csvReader;
	CsvWriter csvWriter;

	public practiceFile(String name){
		// TODO Auto-generated constructor stub
		try {
			csvReader = new CsvReader(name+".csv",',',Charset.forName("gb2312"));
			csvWriter = new CsvWriter(name+"_practice"+".csv",',',Charset.forName("gb2312"));
			this.path=name+"_practice"+".csv";
			while(csvReader.readRecord()) {
				String[] exercise;
				exercise = csvReader.getValues();
				csvWriter.writeRecord(exercise);
			}
		}catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------创建了一个新的练习文件"+path+"!------------------------");
		csvReader.close();
		csvWriter.close();
	}

	public void read(int num) {
		// TODO Auto-generated method stub
		ExerciseSheet exerciseSheet = new ExerciseSheet();
		exerciseSheet.problem.clear();
		exerciseSheet.answer.clear();
		ArrayList<String[]> listFile = new ArrayList<String[]>();

		try {
			int i;
			CsvReader reader = new CsvReader(path,',',Charset.forName("gb2312"));

			while(reader.readRecord()){
				//System.out.println(reader.getRawRecord());
				listFile.add(reader.getValues());
			}
			for(i = 0; i < problem_num; i++) {
				exerciseSheet.problem.add(listFile.get(i)[0].toString());
			}
			for(i = 0; i < answer_num; i++) {
				answer.add(listFile.get(problem_num+i)[0].toString());
			}
			exerciseSheet.print_problem(num);
			reader.close();
		} catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String write() {
		// TODO Auto-generated method stub
		int i;

		System.out.println("-----------------------------------请输入你的答案！中途退出时输入Close---------------------------------------------------------------");
		Scanner wr = new Scanner(System.in);
		for(i = 0; i < problem_num; i++) {
			String in = wr.next();
			if(in.equals("Close"))
			{
				System.out.println("-------------------------保存结果输入YES！-----------------------------");
				String choice = wr.next();
				if(choice.equals("YES")) {
					CsvWriter csvWriter1 = new CsvWriter(path+"_judge"+".csv",',',Charset.forName("gb2312"));
					for(int j=0;j< judge.size();j++) {
						try {
							String[] contend = {judge.get(j),""};
							csvWriter1.writeRecord(contend);
						}catch (IOException  e) {
							e.printStackTrace();
						}
					}
					csvWriter1.close();
					System.out.println("结果已保存！");
				}
				else {
					csvWriter.close();
					continue;
				}

			}
			else {
				//System.out.println(answer.get(i)+"  "+in);
				if(answer.get(i).equals(in)) {
					
					judge.add("true");
				}
				else {
					judge.add("false");
				}
				//				try {
				//					String[] contend = {in,""};
				//					csvWriter.writeRecord(contend);
				//				}catch (IOException  e) {
				//					e.printStackTrace();
				//				}
			}

		}
		wr.close();
		return path+"_judge";
	}

}
