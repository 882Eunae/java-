package com.yedam.reference;
/*
 * 도서명,저자,출판사,가격
 * 
 * */
//public class Book {
//	String name; 
//	String writer;
//	String company;
//	int price;
//	Book(String name,String writer,String company,int price ){
//		this.name=name;
//		this.writer=writer;
//		this.company=company;
//		this.price=price;
//	}
//	
//	
//}





public class Book {
	// 필드 (속성):이름,영어,수학
	String name;
	String writer;
	String company;
	int price; 

	// 생성자: 필드의 초기값을 지정해서 인스턴스 생성
	Book() {

	}

	

	Book(String name, String writer, String company ,int price) {
		this.name = name;
		this.writer = writer;
		this.company = company;
		this.price=price;
	}//

	
	

}
