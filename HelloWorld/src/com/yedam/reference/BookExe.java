package com.yedam.reference;

import java.util.Scanner;

public class BookExe {
	public static void main(String[] args) {
		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		Book[] bookRepository = new Book[100];

		Scanner scn = new Scanner(System.in);

		int menu = Integer.parseInt(scn.nextLine());
		boolean run = true;
		while (run) {
			switch (menu) {

			case 1:

				System.out.println("책이름  작가   출판사   가격  ");
				for (int i = 0; i < bookRepository.length; i++) {

					if (bookRepository[i] != null) {

						String name = bookRepository[i].name;
						String writer = bookRepository[i].writer;
						String company = bookRepository[i].company;
						int price = bookRepository[i].price;

						System.out.printf("%s   %s   %s   %d",name,writer,company,price);

					}
					System.out.println();

				}

				break;

			case 2:
				String inform = scn.nextLine(); // 책정보 입력

				String name = inform.split(",")[0];
//			name=name;
				String writer = inform.split(",")[1];
				String company = inform.split(",")[2];
				int price = Integer.parseInt(inform.split(",")[3]);
				for (int i = 0; i < bookRepository.length; i++) {
					if (bookRepository[i] == null) {

						bookRepository[i] = new Book(name, writer, company, price);
//객체 정보 등록 					

						break;

					}

				}

				break;

			case 3:
				System.out.println("출판사를 입력하세요");
				String searchCom = scn.nextLine();

				for (int i = 0; i < bookRepository.length; i++) {

					if (bookRepository[i] != null) {

						if (bookRepository[i].company.equals(searchCom)) {
							System.out.printf(bookRepository[i].company);
							System.out.printf(bookRepository[i].name);
							System.out.printf(bookRepository[i].writer);
							System.out.print(bookRepository[i].price);
							System.out.println();
						}

						else if (bookRepository == null) {

//				System.out.println("찾으시는 정보가 없습니다");
						}

					}
				} // null 이 아닐때 실행

				break;

			case 4:

				break;

			case 9:
				System.out.println("end of pro");
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;

			}// switch 끝

		} // while 끝
		//....

	}// end of main

}
