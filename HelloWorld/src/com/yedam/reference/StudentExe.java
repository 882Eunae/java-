package com.yedam.reference;

import java.util.Scanner;

public class StudentExe {
     public static void main(String[] args) {
		Student[] students =new Student[5]; 
		
		Student std1 =new Student("홍길동"); 
//		std1.studentName="홍길동"; 
		std1.engScore=80;
		std1.mathScore=85;
		
		Student std2 =new Student();
		std2.studentName="김민수"; 
		std2.mathScore=90;
		std2.engScore=70;
		students[0]=std1;
		students[1]=std2;
	
		Student std3=new Student();
		std3.studentName="홍정학";
		std3.mathScore=75;
		std3.engScore=90; 
		students[2]=std3;
		
		System.out.println(students[0] instanceof Student);
		
		//학생의 이름은 입력받는 변수 :studName
		//학생의 평균을 출력하는 프로그램을 작성 
		
		Scanner scn=new Scanner(System.in);
		System.out.println("평균점수를 구할 학생의 이름을 입력하세요>>");
		String stuName=scn.nextLine();
		double average=0;
		for(int i=0; i<students.length;i++) {
			
			if(students[i] !=null) {
				if(students[i].studentName.equals(stuName)) {	
					average=students[i].getAverage();
					System.out.printf("평균은 %.2f 입니다\n",average);
				}	
			}//null 값이 아닐때 if문   
		}//end of for 
		
		
		
		
		
//		for(int i=0; i<students.length;i++) {
//			if(students[i] !=null && students[i].getAverage()>=85) {
//				
////				System.out.printf("이름은 %s, 영어는 %d, 수학은 %d\n",students[i].studentName
////						,students[i].engScore
////						,students[i].mathScore);		
//				students[i].printInfo(); 
//		}
//		//
//		
//     }
}}
