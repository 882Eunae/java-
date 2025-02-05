package com.yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static <String> void main(
			String[] args) {
//		
//		(infoAry[0]); 
//		System.out.println(Integer.parseInt(infoAry[1]));
//		System.out.println(Integer.parseInt("80") * Integer.parseInt("70")); 
		Scanner scn = new Scanner(System.in);

//		System.out.println("이름,점수 값을 입력");

		// System.out.printf("이름은 %s 이고 점수는 %s입니다 ",infoAry[0],infoAry[1]);

		String[] studentAry = new String[3];
		String userVal = null;
		boolean run = true;
		int max = 0;
		while (run) {
			System.out.println("1.학생이름, 2점수,최고점수0 9.종료");
			System.out.println("선택하세요>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					userVal = scn.nextLine(); // userval 입력
				
					
				}
				
				System.out.println("등록완료!");
				break;

			case 2:

				for (int i = 0; i < studentAry.length; i++) {

					String[] infoAry = userVal.split(",");
					
					int score = Integer.parseInt(infoAry[1]);
					if (max < score) {

						max = score;
						
					}

				}

				System.out.printf("최고점수는 %d 입니다\n", max);
				break;

			case 9:
				System.out.println("end");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");

			}
			System.out.println("프로그램 종료 ");

		} // end of main
	}
}
// end of class
