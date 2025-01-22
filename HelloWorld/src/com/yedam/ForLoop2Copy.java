package com.yedam;

import java.util.Scanner;

public class ForLoop2Copy {

	public static void main(String[] args) {
//		
//		(infoAry[0]); 
//		System.out.println(Integer.parseInt(infoAry[1]));
//		System.out.println(Integer.parseInt("80") * Integer.parseInt("70")); 
		Scanner scn = new Scanner(System.in);

//		System.out.println("이름,점수 값을 입력");

		// System.out.printf("이름은 %s 이고 점수는 %s입니다 ",infoAry[0],infoAry[1]);

//		String[] strAry = new String[100];
//		strAry[0] = "홍길동";
//		String name = "김길동";
//		for (int i = 0; i < strAry.length; i++) {
//			if (strAry[i] == null) {
//				strAry[i] = name;
//				break;
//			}
//
//		}
//		
//		for(int i=0; i<strAry.length;i++) {
//			if(strAry[i] !=null) {
//				System.out.println(strAry[i]);
//			
//			}
//			
//		}
//		
//		

		String[] studentAry = new String[100]; // {"","",""}
		String userVal = null;
		boolean run = true;
		int max = 0;
		int num = 0;
		
		studentAry[0]="홍길동,60";
		studentAry[1]="정은애,70";
		studentAry[2]="김민식,80";
		
		while (run) {
			System.out.println("1.학생이름  2최고점수 3.학생입력(단건) 4.조회(이름) 9.종료");
			System.out.println("선택하세요>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					userVal = scn.nextLine(); // userval 입력
					studentAry[i] = userVal;
				}
				System.out.println("등록완료!");
				break;
			case 2:
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						int score = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < score) {
							max = score;
						}
					}
				}
				System.out.printf("최고점수는 %d 입니다\n", max);
				break;

			case 3:

				String inform = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {

					if (studentAry[i] == null) {
						studentAry[i] = inform;
						System.out.println("등록을 완료(단건정보)");
						num = i + 1;
						break;

					} else if (studentAry[i] != null) {
					}

				}

				System.out.printf("총 %d명의 정보가 등록되어있습니다", num);
				break;
			case 4:
				
				String searchName = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {

					
					if(studentAry[i]!=null) {
					
					
					
					if(studentAry[i].split(",")[0].equals(searchName)) {

int searchScore = Integer.parseInt(studentAry[i].split(",")[1]);
						System.out.printf("%s의 점수는 %d입니다\n", searchName, searchScore);
						break;

					}
					
					else {
						
						System.out.println("찾으시는 정보가 없습니다");
					}

				}}//null 이 아닐때 실행 

				break;
			case 9:
				System.out.println("end of pro");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
			System.out.println("프로그램 종료 ");
		} // end of while
	}
// end of class
}
