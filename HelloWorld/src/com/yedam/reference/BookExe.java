package com.yedam.reference;

import java.util.Scanner;

public class BookExe {
	

	static	Book[] bookRepository = new Book[100];
	//저장공간에 값을 초기값을 생성 
	public static void init() {
		bookRepository[0] = new Book("책1", "작가1", "출판사1", 3000);
		bookRepository[1] = new Book("책2", "작가2", "출판사2", 3000);
		bookRepository[2] = new Book("책2", "작가2", "출판사2", 4000);

	}//end of init()
	
	//목록출력
	public static void printList() {
		System.out.println("   책이름       작가       출판사       가격      ");
		System.out.println("==============================================");
		for (int i = 0; i < bookRepository.length; i++) {

			if (bookRepository[i] != null) {

				String name = bookRepository[i].getName();
				String writer = bookRepository[i].getWriter();
				String company = bookRepository[i].getCompany();
				int price = bookRepository[i].getPrice();

				// System.out.printf("%s %s %s %d",name,writer,company,price);

				System.out.println(bookRepository[i].showBookInfo());
			}

		} // for문 모두확인 함
		System.out.println("==============================================");
		System.out.println("책정보를 모두 확인함!");
		
		
	}//end of printList()
	
	static	Scanner scn = new Scanner(System.in);
	//도서등록
	public static void addBook() {
		
		
		  System.out.println("도서명 입력>>");
          String name=scn.nextLine();
            System.out.println("작가 입력>>");
           String writer=scn.nextLine();
            System.out.println("출판사 입력>>");
           String company=scn.nextLine();
            System.out.println("가격 입력>>");
          int price=Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
					bookRepository[i] = new Book(name, writer, company, price);
					System.out.println("책정보가 무사히 등록 되었습니다");
					break;
			}
		} // end of for
		
	}//end of addBook()
	
	public static void searchList() {
		
		System.out.println("출판사를 입력>>");
		String searchCom = scn.nextLine();

		for (int i = 0; i < bookRepository.length; i++) {

			if (bookRepository[i] != null && bookRepository[i].getCompany().equals(searchCom)) {


				System.out.println(bookRepository[i].showBookInfo());

			} // null 이 아닐때 실행 if끝
		}
		System.out.println("===========================================");

		
		
		
	}// end of searchList() 
	
	//가격수정
	public static void modifyBook() {
		
		System.out.println("바꾸실책의 이름을 입력>>");
		String reviseName = scn.nextLine();
		System.out.println("바꿀 가격 입력>>");

		boolean isExist = false;
		int revisePrice = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getName().equals(reviseName)) {
				bookRepository[i].setPrice(revisePrice);
				;
				System.out.printf("%s 책의 가격이 %d로 무사히 수정 되었습니다\n", reviseName, revisePrice);
				isExist = true;
				break; // 수정완료되면 반복문 종료
			}
		} // for문 끝나는 시점
		if (!isExist) {
			System.out.println("찾는 도서가 없습니다");
		}
		
	}//end of modifyBook
	
	//상세조회
	public static void showDetail() {
		
		System.out.println("도서명 입력>>");
		String search = scn.nextLine(); 
		Calculator cal=new Calculator();
		cal.getBookInfo(search, bookRepository).showDetailInfo();

		
		
	}//end of showDetail()
	
	
	
	
	public static void main(String[] args) {
		//초기데이터 생성
		init();
	
		boolean run = true;
		
		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료

		while (run) {
			System.out.println("1.책 전체 목록 보기 2.도서등록 3.출판사 조회 5가격수정 9.종료");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case 1:
				printList();break;
			case 2:
				addBook();break;
				
			case 3:
				searchList();break;
				
			case 4://상세조회
				showDetail();break; 

			case 5:
				modifyBook();break; 
				
			case 9:
				System.out.println("end of pro");
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요");

			}// switch 끝

		} // while 끝

	}//end of main 
}
