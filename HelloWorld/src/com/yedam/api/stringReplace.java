package com.yedam.api;

public class stringReplace {
	public static void main(String[] args) {
		String oldStr="자바는 객체 지향언어 입니다. 자바는 풍부한 API를 지원합니다"; 
		String newStr=oldStr.replace("자바", "JAVA"); 
		System.out.println(newStr);
		//문자열 잘라내기 substring 
		String ssn="880815-1234567";
		String firstNum=ssn.substring(0,6); 
		System.out.println(firstNum);
		
		//알파벳 대문자 toLowerCase toUpperCase 
		String str1="Java Programming"; 
		String str2="JAVA Programming"; 
		System.out.println(str2.toLowerCase());
		//trim() 
		String tel1="  02"; 
		
		
		
	}
}
