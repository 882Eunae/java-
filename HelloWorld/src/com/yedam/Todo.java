package com.yedam;

import java.util.Scanner; //단축키 ctrl +shift + o  

//com.yedam.Todo
public class Todo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; // 예금액 54000 50000 10만원 초과
		int money = 0;
		int before = 0;

		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요> ");
			int num = Integer.parseInt(scn.nextLine()); // 문자타입반환.

			if (num == 1) { // 입금
				System.out.print("입금액을 입력> ");

				balance += Integer.parseInt(scn.nextLine());

				if (balance > 100000) {
					System.out.println("10만원을 초과하여 입급할수 없습니다");
					balance = before;
				} else {

					balance = balance;
					before = balance;
				}

			} else if (num == 2) { // 출금

				System.out.println("출금액을 입력>");
				balance -= Integer.parseInt(scn.nextLine());
				if (balance < 0) {
					balance = before;
					System.out.println("잔액을 확인하세요");
				}
				else {
					balance = balance;
					before = balance; // before를 지금 값으로 저장
				}

			} else if (num == 3) { // 잔액조회
				System.out.printf("현재 잔액은 %d 입니다\n", balance);


			} else if (num == 4) {

					break;// 종료

			}

		}

	}
}
