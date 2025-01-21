package com.yedam;
//객체(object) 지향 언어 
//class :객체를 자바언어로 표현 
// HelloWorld.java 소스코드. => HelloWorld.class(실행) 
public class HelloWorld {
	
	public static void main(String[] args) {
		
		//method: 기능 
		System.out.println("Hello world");
		
		int myAge=20; 
		myAge=25;
		int sum=0;
		
		for(int i=1; i<=10;i++) {
			if(i %2 ==0) {
			System.out.println("i의값은"+i);
			sum +=i;
			}
		}
		System.out.println("sum의 값은"+ sum);
	}

}
