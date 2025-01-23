package com.yedam;

import java.util.Scanner;

public class Todo3 {
public static void main(String[] args) {
	String[][] friendAry = new String[100][3];
//	friendAry[0] = "홍길동,010-1234-5678,남";
//	friendAry[1] = "정은애,010-7777-7777,여";
//	friendAry[2] = "김민식,010-8888-8888,남";

	friendAry[0][0]="정은애";
	friendAry[0][1]="010-111-222";
	friendAry[0][2]="여";
	
	friendAry[1][0]="김기철";
	friendAry[1][1]="010-111-222";
	friendAry[1][2]="남";
	
	friendAry[2]=new String[] {"김은애","010-2323-1112","여"};
	
	
	Scanner scn = new Scanner(System.in);
	boolean run = true;
	int num = 0;

	while (run) {

		System.out.println("1.목록(이름,연락처,성별)  2.등록 3.조회(성별) 4삭제  9.종료");
		System.out.println("선택하세요>");
		int menu = Integer.parseInt(scn.nextLine());

		switch (menu) {
		case 1:
			System.out.println("이름   전화번호  성별 ");
			for (int i = 0; i < friendAry.length; i++) {

				if (friendAry[i] !=null && friendAry[i][0] !=null) {
					String name = friendAry[i][0];
					String phone = friendAry[i][1];
					String gender = friendAry[i][2];
					
					System.out.printf("%s %s %s\n", name, phone, gender);

				}
				
					

			}
			
			System.out.println("===============================");
			break;

		case 2:

			System.out.println("이름을 입력>>");
			String name=scn.nextLine();
			System.out.println("연락처를 입력>>");
			String phone=scn.nextLine();
			System.out.println("성별을 입력>>");
			String gender=scn.nextLine();
			
			String inform = scn.nextLine();
			for (int i = 0; i < friendAry.length; i++) {
				
					if(friendAry[i][0]==null) {
						friendAry[i][0]=name;
						friendAry[i][1]=phone;
						friendAry[i][2]=gender;
						//friendAry[i]= new String[]{name,phone,gender};
						System.out.printf("등록이 완료되었습니다 %d 자리에 저장됨",i);
						break; 
					}
			
			}

//			System.out.printf("총 %d명의 정보가 등록되어있습니다\n", num);
			break;

		case 3:
			System.out.println("성별을 입력하세요");
			String searchGen = scn.nextLine();
			for (int i = 0; i < friendAry.length; i++) {
				
				if(friendAry[i] !=null && friendAry[i][0] !=null) {
					if(friendAry[i][2] .equals(searchGen) ) {
						
						System.out.printf("%s   %s    %s \n",friendAry[i][0],friendAry[i][1],friendAry[i][2]);
						
					}
					
					
					
				}
				
				
			
			} // null 이 아닐때 실행

			break;
		
		case 4: 
			String remove = scn.nextLine();
			for(int i=0; i<friendAry.length; i++) {
				
				if(friendAry[i] !=null && friendAry[i][0] !=null) {
					if(friendAry[i][0].equals(remove)) {
						
					
						friendAry[i]=null; 
						System.out.println("요청하신 정보가 삭제 되었습니다");
						
					}
					
					else {
						
					}						
					
				} //정보가 존재할때 if문 
				
				
				
			} //for문 끝 
			
			break;
			
			
//		case 5: 
//				System.out.println("바꾸실분의 이름을 입력>>")
//				String  reviseName=scn.nextLine();
//				System.out.println("바꿀 전화번호를 입력>>")
//				String  revisePhone=scn.nextLine();
//			System.out.println("성별을 입력>>")
//				String reviseGen=scn.nextLine();
//				
			
//				for(int i=0; i<friendAry.length; i++) {
//					
////					if(friendAry[i] !=null && friendAry[i][0] !=null) {
////					
////					if(revise.split(",")[0]==friendAry[i].split(",")[0]) {
////						
////						System.out.printf("수정할 사람의 이름:%s",revise.split(",")[0]);
////						
////						
////					}
////					
////					}  else if(friendAry[i]==null) {
////						
////						System.out.println("null 입니다");
////						
////					}
//					
//					if (friendAry[i] != null) {
//						if(friendAry[i].split(",")[0].equals(revise)) {
//							
//							
//							friendAry[i]=null; 
//							System.out.println("요청하신 정보 수정요청 되었습니다");
//							friendAry[i]=revisePhone; 
//							System.out.println("수정이 완료되었습니다 ");
//						}
//						
//						
//						
//						
//						
//					}
//
//					else if (friendAry[i] == null) {
//						
////						System.out.print("null");
//						
//					}
//					
//					
//					
//					
//				}//for문 끝나는 시점 
//				
//			
//			
//			
//			break;
			
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

	
	
	
	
	
	
	
	
}//end of main. 
}
