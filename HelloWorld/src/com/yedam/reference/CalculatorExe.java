package com.yedam.reference;

public class CalculatorExe {
	public static void main(String[] args) {
		// 별 출력하는 메소드
		Calculator cal = new Calculator();
		
		Book[] bookStore = { new Book("이것이자바다", "신용권", "한빛미디어", 10000), 
							new Book("자바스크립트 기초", "김자바", "자바출판사", 15000),
							new Book("혼자공부하는CSS", "혼공자", "한빛미디어", 20000)
							};
		
		Book author=cal.getBookInfo("혼자공부하는CSS",bookStore);
		
		if(author !=null) {
			author.showDetailInfo();
			
		} else  {
			System.out.println("조회결과 없음");
		}
		
		int[] randomA=cal.randomAry(5);
		for(int num:randomA) {
			System.out.println(num);
		}
		
		System.out.println(cal.sum(randomA));
		
		int[] ary1= {14,23,11,14,24};
		int[] ary2= {33,23,6,12,9};
		
		cal.printStar(3, "♥♡"); //매개값 
		
		double n1=10.5;
		double n2=20.5;
		double result=cal.sum(n1, n2);
		
		//double >float >long >int >short >byte 
		result=cal.sum(new int[]{10,20,30,40});
		
		System.out.println("결과 :"+result);
		cal.printStar(4);
		System.out.println("합이 더큰 배열의 값은 "+cal.aryMax(ary1,ary2));
		
		int max=cal.getMax(cal.sum(ary1),cal.sum(ary2)); 
		System.out.println("배열의 합의 큰값은"+max);
		cal.showCalendar();
		
	}// main 끝

}// calculator 클래스의 끝
