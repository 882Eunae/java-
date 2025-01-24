package com.yedam.reference;

import java.util.Date;

public class Calculator {
	//1월달 출력. 
	public void showCalendar() {
		
		String[] days= {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"}; 
		for(String day:days) {
			System.out.printf(" %4s",day);
		}
		
		System.out.println("\n----------------------------------");
		
		//공백,말일 계산
		
		Date now=new Date();
		
		int space=3;
		int lastDate=31;
		String[]dateAry=new String[space+lastDate];
		for(int i=0; i<dateAry.length; i++) {
			if(i<space) {
				dateAry[i]="";
			} else {
				dateAry[i]=""+(i-1-space);
			}
		}
		
		for(int i=0; i<space; i++) {
			
			System.out.printf("%5s"," ");
			
		}//공백
		
		for(int i=1; i<=lastDate; i++) {
			if((space+i)%7==0) {//토요일
				System.out.printf("%4d",i);
				System.out.println();
			}
			//토요일이 아닌경우
			else {
					System.out.printf("%5d",i);
			}
			
			
		}//마지막 날까지 쓰기 
		
	}

	public Book getBookInfo(String btitle, Book[] bookAry) {
		Book[] bookRepo = { new Book("이것이자바다", "신용권", "한빛미디어", 10000), new Book("자바스크립트 기초", "김자바", "자바출판사", 15000),
				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000) };
		// 배열검색
		for (int i = 0; i < bookAry.length; i++) {

			if (bookAry[i].getName().equals(btitle)) {

				return bookAry[i];
			} // if문 끝
		} // for문 끝
		return null;
	}

	// 1~100 사이의 임의값을 n개 반환.
	public int[] randomAry(int n) {

		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {

			result[i] = (int) (Math.random() * 100) + 1;
		}

		return result;

	}

	// 두 숫자중에서 큰값을 반환
	public int getMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

//		if (num1 > num2) {
//			return num1;
//		} 
//			return num2;

	// *
	// **
	// ***
	public void printStar(int times) {
		for (int i = 0; i < times; i++) {
			printStar(i, "*");
			System.out.println();
		} // 전체
	}

	// 별 출력하는 메소드
	public void printStar(int times, String types) {// 매개변수.
		for (int i = 1; i <= times; i++) {
			System.out.print(types);
		}
	}// 함수

	public int sum() {
		return 10 + 20;
	}

	// 두수의 합을 반환
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	// 동일한 메소드명을 중복정의:overloading
	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	}

	public int aryMax(int[] Ary1, int[] Ary2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < Ary1.length; i++) {

			sum1 += Ary1[i];
			sum2 += Ary2[i];

		} // 단 배열의 크기가 똑같아야함

		return sum1 > sum2 ? sum1 : sum2;
	}

}// class
