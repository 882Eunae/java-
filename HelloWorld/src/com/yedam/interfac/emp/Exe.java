package com.yedam.interfac.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.Inheritance.ComFriend;
import com.yedam.Inheritance.Friend;
import com.yedam.reference.Student;

/*
 * String[] strAry; 
 * Collection 1) List 2) Set 3) Map 
 */
public class Exe {
	public static void main(String[] args) {
		
		System.out.println("홍길동".indexOf("길동")); //
		System.out.println("홍길동".contains("길동"));//true 반환
		
		//학생정보를 저장하는 컬렉션 선언 
		//3명 추가.
		List<Student> students= new ArrayList<Student>();
		students.add(new Student("정은애",80));
		students.add(new Student("고길동",90));
		students.add(new Student("김길동",100));
		
		//삭제 
		for(int i=0; i<students.size();i++) {
			if(students.get(i).getStudentName().equals("김민수")) {
				//students[i]
				students.remove(i);
				break; //반복문 종료 
			}
		}
		
		
		
		//출력.
		
		for(int i=0; i<students.size(); i++) {
			System.out.println("이름: "+students.get(i). getStudentName()+"  영어점수: "+students.get(i).getEngScore());
		}
		
		
	}
	
	
	void method() {
		
		String[] strAry=new String[10];  //배열.
		List<String> strList=new ArrayList<String>(); //컬렉션 
		List<Friend> friends= new ArrayList<Friend>();  //
		
		friends.add(new Friend("홍길동","010-111"));
		friends.add(new ComFriend("김길동","010-222","국민은행","신용보증팀"));
		
		friends.remove(new Friend("홍길동","010-111")); 
		System.out.println("friends크기: "+friends.size());
		
		System.out.println(friends.get(1).showlist());
		
		//추가 
		strList.add("안녕하세요");
		strList.add("Hello");
		strList.add("반갑습니다"); 
		System.out.println("strList크기: "+strList.size());
		
		//삭제
		strList.remove(0);
		strList.remove("Hello"); 
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
	}	
}




