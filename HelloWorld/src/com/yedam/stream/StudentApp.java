package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	Scanner scn = new Scanner(System.in);
	boolean run = true;

	// 임시저장.
	List<Student> students = new ArrayList<>();
	
	public StudentApp() {
		init(); 
	}
	

	public void start() {
		while(run) {
		System.out.println("1.목록2.추가3.삭제9.종료");
		System.out.println("선택>>");

		int menu = Integer.parseInt(scn.nextLine());
		switch (menu) {
		case 1:
			studentList();
			break;
		case 2:
			addStudent();
			break;
		case 3:
			removeStudent();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다");
			save();
			run=false; 
		}
		}
		System.out.println("end of prog");

	}// end of prog

	public void studentList() {
		// 이름 점수
		// --------
		// 홍길동 90

		System.out.println("이름    점수");
		System.out.println("----------");
		for (Student std : students) {
			System.out.println(" " + std.getName() + "   " + std.getScore() + "");

		} // end of for

	}// end of studentList

	public void addStudent() {
		System.out.println("학생이름 입력>>");
		String name = scn.nextLine();
		System.out.println("학생키 입력>>");
		double height = Double.parseDouble(scn.nextLine());
		System.out.println("학생몸무게 입력>>");
		double weight = Double.parseDouble(scn.nextLine());
		System.out.println("학생점수 입력>>");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score)); // 추가
		System.out.println("등록완료!");

	}// end of add student

	public void removeStudent() {
		System.out.println("학생이름 입력>>");
		String name = scn.nextLine();

		// 삭제하기
		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제완료.");
				return; // 반복문 종료
			}

		} // end of for

	}// end of remove student

	public void save() {
		// c:/temp/studentList.txt
		try {
			Writer writer = new FileWriter("c:/temp/studentList.txt");
			// 갯수만큼 반복저장
			for (Student std : students) {
				writer.write(
						std.getName() + " " +
						std.getHeight() + " " +
						std.getWeight() + " " + 
						std.getScore() + "\n");
			}
			writer.flush();
			writer.close(); 

		} catch (IOException e) {
			e.printStackTrace();
		}
			System.out.println("saved.");
	}// end of save
	
	//파일 읽어서 컬렉션저장 
	public void init() {
		
		try {
		Reader reader=new FileReader("c:/temp/studentList.txt");
		BufferedReader br=new BufferedReader(reader);
		
		
		while(true) {
		String str=br.readLine();
		if(str==null) break; 
		String[] ary=str.split(" "); 
		Student student =new Student(ary[0],Double.parseDouble(ary[1]),
											Double.parseDouble(ary[2]), 
											Integer.parseInt(ary[3])); 
						students.add(student); //컬렉션 추가. 
						
						
		}
		br.close(); 
		reader.close();
		
		}
		catch(IOException e) {
			e.printStackTrace(); 
		}
		
		
		
		
	}
	
	

}
