package com.yedam.reference;
/*
 * 도서명,저자,출판사,가격
 * 
 * */

public class Book {
	// 필드 (속성):이름,영어,수학
	private String name;
	private String writer;
	private String company;
	private int price;
	
	//public,default,private => 접근제한자 
	// 생성자: 필드의 초기값을 지정해서 인스턴스 생성
	Book() {

	}

	Book(String name, String writer, String company, int price) {
		this.name = name;
		this.writer = writer;
		this.company = company;
		this.price = price;
	}//

	// 제목,저자,가격
	String showBookInfo() {
		return name + "     " + writer + "     " + company + "      " + price;

	}

	void showDetailInfo() {
		// 도서명: 이것이 자바다 출판사:한빛 미디어
		// 저자 : 가격:
		String strFormat = "도서명: %6s\t출판사: %6s\n 저자: %6s\t\t가격: %5d \n ";
		System.out.printf(strFormat, name, company, writer, price);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
