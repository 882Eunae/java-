package com.yedam;

import com.yedam.reference.ReferenceExe1;


public class Reference {
	public static void main(String[] args) {
		
		ReferenceExe1.main(args); //static method 클래스,메소드() ,변수선언 안하고 바로 사용가능함 
		
		ReferenceExe1 ref1;
		
		ref1=new ReferenceExe1(); //인스턴스를 생성하야지 사용가능 
		
		ref1.method1();
//		ref1.method2();
	}

}
