package com.yedam.reference;

import java.util.Scanner;

public class BookExe2 {
	public static void main(String[] args) {

		Book[] bookRepository = new Book[100];

		bookRepository[0] = new Book("책1", "작가1", "출판사1", 3000);
		bookRepository[1] = new Book("책2", "작가2", "출판사2", 3000);
		bookRepository[2] = new Book("책2", "작가2", "출판사2", 4000);

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		

		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료

		while (run) {
			System.out.println("1.책 전체 목록 보기 2.도서등록 3.출판사 조회 5가격수정 9.종료");
			boolean overlap=false;
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case 1:

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
				break;

			case 2:

				System.out.println("책정보를 (이름,작가,출판사,가격) 순으로 입력하세요");

				System.out.println("도서명 입력>>");
				String name = scn.nextLine();
				System.out.println("작가 입력>>");
				String writer = scn.nextLine();
				System.out.println("출판사 입력>>");
				String company = scn.nextLine();
				System.out.println("가격 입력>>");
				int price = Integer.parseInt(scn.nextLine());

				for (int i = 0; i < bookRepository.length; i++) {
					
					if (bookRepository[i].getName().equals(name)) {
						overlap=true; 
						System.out.println("중복된 이름의 책이 존재합니다 그래도 등록하시겠습니까? 1:등록 2:등록취소");
						int yn = Integer.parseInt(scn.nextLine());
						if (yn == 1) {
							for(int j=0; j<bookRepository.length; j++) {
								
								if (bookRepository[j] == null) {
									bookRepository[j] = new Book(name, writer, company, price);
									break;
								}
								
							}//중복된 제목 책정보 저장 빈자리 찾는 for문 
							
							System.out.println("책정보가 무사히 등록 되었습니다");
							break;
						} else if (yn == 2) {
							System.out.println("등록이 취소 되었습니다");
							break;
						}

						else {
							System.out.println("등록이 취소 되었습니다");
							break;
						}

					} // 중복된 제목의 책이 있을때 if문

					else {
					} // 중복된게 없으면 그냥 넘어가고 null자리를 찾아봄

					if (bookRepository[i] == null && (overlap=false)) {
						bookRepository[i] = new Book(name, writer, company, price);
						System.out.println("책정보가 무사히 등록 되었습니다");
						break;
					}
				} // end of for
				break;
			case 3:
				System.out.println("출판사를 입력하세요");
				String searchCom = scn.nextLine();

				for (int i = 0; i < bookRepository.length; i++) {

					if (bookRepository[i] != null && bookRepository[i].getCompany().equals(searchCom)) {
//                                System.out.printf(bookRepository[i].company+" : ");
//                                System.out.printf(bookRepository[i].name+"  ");
//                                System.out.printf(bookRepository[i].writer+"  ");
//                                System.out.print(bookRepository[i].price);
//                                System.out.println();

						System.out.println(bookRepository[i].showBookInfo());

					} // null 이 아닐때 실행 if끝
				}
				System.out.println("===========================================");

				break;

			case 4:// 상세조회
				System.out.println("도서명 입력>>");
				String search = scn.nextLine();
				for (int i = 0; i < bookRepository.length; i++) {

					if (bookRepository[i] != null && bookRepository[i].getName().equals(search)) {

						bookRepository[i].showDetailInfo();
						break;

					}

				}

				break;

			case 5:
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

				break; // case4 끝나는 부분
			case 9:
				System.out.println("end of pro");
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요");

			}// switch 끝

		} // while 끝
			// ....

		// end of main

	}
}
