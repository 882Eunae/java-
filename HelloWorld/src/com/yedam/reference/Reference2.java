package com.yedam.reference;

import java.util.Scanner;

public class Reference2 {

	public static void main(String[] args) {

		String[][] nameAry=new String[5][2];
		//...
		nameAry[0][0]="홍길동";
		nameAry[0][1]="80";
		nameAry[1][0]="김민수";
		nameAry[1][1]="85";
		nameAry[2][0]="박헌수";
		nameAry[2][1]="88";
		nameAry[3][0]="심산형";
		nameAry[3][1]="90";
		nameAry[4][0]="최기동";
		nameAry[4][1]="75";

		

		String info;
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		String maxPer = " ";
		for (int i = 0; i < nameAry.length; i++) {
			System.out.println("점수=> " + nameAry[i][1]);
			sum += Integer.parseInt(nameAry[i][1]);

		}
		System.out.printf("합계는 %d 입니다\n", sum);

		for (int i = 0; i < nameAry.length; i++) {

			if (max < Integer.parseInt(nameAry[i][1])) {

				max = Integer.parseInt(nameAry[i][1]);
				maxPer = nameAry[i][0];
			}
		}
		
		System.out.printf("가장 큰 점수 : %d 사람 : %s \n",max,maxPer);
		
		System.out.printf("(이름,점수) %d개 입력하세요",nameAry.length);
		
		
		 // end of for
		


		for (int j = 0; j < nameAry.length; j++) {

				info=scn.nextLine(); //한번만 물어봄 
				String name=info.split(",")[0];
				String score=info.split(",")[1];
				nameAry[j][0]=name;
				nameAry[j][1]=score; 		


			info = scn.nextLine(); // 한번만 물어봄
			 name = info.split(",")[0];
			 score = info.split(",")[1];

			nameAry[j][0] = name;
			nameAry[j][1] = score;
		}

	}//end of main
		//

//		System.out.printf(nameAry[4][0]);
//		System.out.printf(nameAry[4][1]);
//		

	}// end of main


