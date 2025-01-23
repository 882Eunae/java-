package com.yedam.reference;

import java.util.Scanner;

public class BookExe {
    public static void main(String[] args) {
        // 1.전체목록 2.도서등록 3.조회(출판사) 9.종료
        Book[] bookRepository = new Book[100];

        bookRepository[0]=new Book("책1","작가1","출판사1",3000);
        bookRepository[1]=new Book("책2","작가2","출판사2",3000);
        bookRepository[2]=new Book("책2","작가2","출판사2",4000);
        Scanner scn = new Scanner(System.in);


        boolean run = true;
        while (run) {
            System.out.println("1.책 전체 목록 보기 2.도서등록 3.출판사 조회 9.종료");

            int menu = Integer.parseInt(scn.nextLine());


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
                            System.out.println();
                        }



                    }//for문 모두확인 함
                    System.out.println("책정보를 모두 확인함!");
                    break;

                case 2:


                    System.out.println("책정보를 (이름,작가,출판사,가격) 순으로 입력하세요");
                    String inform = scn.nextLine(); // 책정보 입력

                    String name = inform.split(",")[0];
//			name=name;
                    String writer = inform.split(",")[1];
                    String company = inform.split(",")[2];
                    int price = Integer.parseInt(inform.split(",")[3]);
                    for (int i = 0; i < bookRepository.length; i++) {
                        if (bookRepository[i] == null) {

                            bookRepository[i] = new Book(name, writer, company, price);
                            System.out.println("책정보가 무사히 들록 되었습니다");

                            break;

                        }

                    }//end of for

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



                            }
                        } // null 이 아닐때 실행
                    }
                    break;

                case 4:

                    break;//

                case 9:
                    System.out.println("end of pro");
                    run = false;
                    System.out.println("프로그램을 종료합니다");
                    break;

            }// switch 끝

        } // while 끝
        //....

        // end of main

    }}
