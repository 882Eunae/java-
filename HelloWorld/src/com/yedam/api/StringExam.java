package com.yedam.api;

public class StringExam {
	
	static void 연습() {
		String str="hello";
		String str1="world"; 
		StringUtil.연결하기(str,str1); 
	}
	
	static void no1() {
	String ssn1="9803061234123"; //7번째값 성 
	String ssn2="021112-3341234"; //8번째값이성   
	String ssn3="991112 2341234"; // ssn3[7] 자리가 성별 
	StringUtil.checkgender(ssn1);
	}
	
	static void no2() {
		//파일경로 확장자 
		String file1="C:/temp/flower.jpg"; 
		String file2="D:/web/project/guide.mp3"; 
		StringUtil.checkExtension(file1);
	}
	
	static void no3() {
		String str1=" suggest "; 
		String str2=" currently  "; 
		String str3=" particular  "; 
		StringUtil.getLength(str1);
	}
	
public static void main(String[] args) {
	연습();
	no1();
	no2(); 
	no3(); 
	
}
	
}

