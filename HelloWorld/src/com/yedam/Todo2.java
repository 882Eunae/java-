package com.yedam;

import java.util.Scanner;

/*
 * 친구정보관리
 * 이름,연락처,성별,남여  => 홍길동,010-1234-5678,남 
 * 1.목록 (이름 ,연락처 ,성별) 2.등록 3.조회(성별) 4.삭제(이름)5수정  9종료 
 * 
*/
public class Todo2 {
	public static void main(String[] args) {

		String[] friendAry = new String[100];
		friendAry[0] = "홍길동,010-1234-5678,남";
		friendAry[1] = "정은애,010-7777-7777,여";
		friendAry[2] = "김민식,010-8888-8888,남";

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int num = 0;

		while (run) {

			System.out.println("1.목록(이름,연락처,성별)  2등록 3.조회(성별) 4삭제  9.종료");
			System.out.println("선택하세요>");
			
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				System.out.println("이름   전화번호  성별 ");
				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] != null) {
						String name = friendAry[i].split(",")[0];
						String phone = friendAry[i].split(",")[1];
						String gender = friendAry[i].split(",")[2];

						System.out.printf("%s %s %s\n", name, phone, gender);

					}

					else if (friendAry[i] == null) {

						System.out.print("");
						
					}

				}
				
				System.out.println("===============================");
				break;

			case 2:

				String inform = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] == null) {
						friendAry[i] = inform;
						System.out.println("등록을 완료(단건정보)");
						num = i + 1;
						break;

					} else if (friendAry[i] != null) {

					}
				}

				System.out.printf("총 %d명의 정보가 등록되어있습니다\n", num);
				break;

			case 3:
				System.out.println("성별을 입력하세요");
				String searchGen = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] != null) {

						if (friendAry[i].split(",")[2].equals(searchGen)) {

							String searchName = friendAry[i].split(",")[0];
							String searchPhone = friendAry[i].split(",")[1];
							String searchgen = friendAry[i].split(",")[2];
							System.out.printf("%s   %s   %s \n", searchName, searchPhone, searchgen);

						}

						else if(friendAry[i]==null) {

//					System.out.println("찾으시는 정보가 없습니다");
						}

					}
				} // null 이 아닐때 실행

				break;
			
			case 4: 
				String remove = scn.nextLine();
				for(int i=0; i<friendAry.length; i++) {
					
					if(friendAry[i] !=null) {
						if(friendAry[i].split(",")[0].equals(remove)) {
							
							
							friendAry[i]=null; 
							System.out.println("요청하신 정보가 삭제 되었습니다");
							
						}
						
						else {
							
						}						
						
					} //정보가 존재할때 if문 
					
					
					
				} //for문 끝 
				
				break;
				
				
			case 5: 
					System.out.println("전화번호수정할 사람을 입력하세요");
					String  revise=scn.nextLine();
					System.out.println("바꾸실분의 (이름,수정할 전화번호,성별) 를 주어진 양식대로 입력하세요")
					;
					String revisePhone=scn.nextLine();
					System.out.println();
					for(int i=0; i<friendAry.length; i++) {
						
//						if(friendAry[i] !=null) {
//						
//						if(revise.split(",")[0]==friendAry[i].split(",")[0]) {
//							
//							System.out.printf("수정할 사람의 이름:%s",revise.split(",")[0]);
//							
//							
//						}
//						
//						}  else if(friendAry[i]==null) {
//							
//							System.out.println("null 입니다");
//							
//						}
						
						if (friendAry[i] != null) {
							if(friendAry[i].split(",")[0].equals(revise)) {
								
								
								friendAry[i]=null; 
								System.out.println("요청하신 정보 수정요청 되었습니다");
								friendAry[i]=revisePhone; 
								System.out.println("수정이 완료되었습니다 ");
							}
							
							
							
							
							
						}

						else if (friendAry[i] == null) {
							
//							System.out.print("null");
							
						}
						
						
						
						
					}//for문 끝나는 시점 
					
				
				
				
				break;
				
			case 9:
				System.out.println("end of pro");
				run = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요");

			}// switch문 끝

		} // while끝
		//ㅠㅠㅠ 
		System.out.println("프로그램 종료 ");

	}
}
