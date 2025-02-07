package com.yedam.interfac.emp;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 * 사원관리 app v.1
 * 실행클래스:MainExe
 * 인터페이스 활용. (배열,컬렉션) 
 * Employee, EmpAryExe,EmpListExe, EmpDAO(인터페이스)
 */

public class MainExe {

	static Scanner scn = new Scanner(System.in);
	static EmpDAO dao = new EmpAryExe();

	public static void main(String[] args) {

		// 스캐너,run
		boolean run = true;

		// 배열,컬렉션

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회9.종료");
			System.out.println("선택>> ");
			int menu = 0;

			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				// 정상실행이 진행되도록 구성.
				System.out.println("메뉴를 확인하세요.");
				scn.nextLine();
				continue; // 아래쪽으로 안가고 다시 처음부터 실행
			}

			scn.nextLine();
			switch (menu) {
			case 1: // 추가 사원번호 이름 전화번호
				int empNo = 0;
				while (true) {
					System.out.println("사원번호>>");
					try {
						empNo = Integer.parseInt(scn.nextLine());
						break; // while문 종료
					} catch (NumberFormatException e) {
						System.out.println("다시 사원번호를 입력하세요");
					}
				} // end of while
				System.out.println("이름>>");
				String eName = scn.nextLine();

				System.out.println("전화번호>>");
				String tel = scn.nextLine();

				if (dao.registerEMP(new Employee(empNo, eName, tel))) {

					System.out.println("등록성공");

				}
				;

				break;
			case 2:// 전화번호,입사일자,급여. + 사원번호
				System.out.println("수정하실분의 사원번호를 적어주세요");

				int editNo = Integer.parseInt(scn.nextLine());
				System.out.println("전화번호>>");
				tel = scn.nextLine();
				System.out.println("입사일자>>");
				String hdate = scn.nextLine();
				if (hdate.equals("")) {
					hdate = "1900-01-01"; // 값을 엔터치고 넘어가면
				}

				System.out.println("급여>>");
				String salString = scn.nextLine();
				if (salString.equals("")) { // 엔터치고 넘어가면 0인식
					salString = "0";
				}

				int sal = Integer.parseInt(salString);

				if (dao.modifyEmp(new Employee(editNo, "", tel, hdate, sal))) {
					System.out.println("수정완료");
				}
				;

				break;
			case 3:
				try {
					remove();
				}
				catch(NumberFormatException e) {
					System.out.println("사원번호 확인");
				}
				break;

			case 4: // 목록
				// 조회조건(급여 이상)

				System.out.println("조회 급여조건 >> ");
				sal = Integer.parseInt(scn.nextLine());

				System.out.println("조회 이름조건 >>");
				String name = scn.nextLine();

				Employee emp = new Employee();// 기본생성자
				emp.setName(name); // emp의 sal 설정
				// 조회결과
				List<Employee> result = dao.search(emp);
				// 출력
				for (Employee empl : result) {
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				} // end of for

				break;
			case 9:
				System.out.println("종료합니다");
				run = false;
				break;

			default:
				System.out.println("메뉴를 확인하세요.");

			}

		} // end of while

		System.out.println("end of prog");

	}// end of main

	// 예외 떠넘기기 예제. remove 호출한곳에서 예외를 처리하겠다  
	static void remove() throws NumberFormatException{

		System.out.println("사원번호");
		int empNo = Integer.parseInt(scn.nextLine());
		if (dao.removeEMP(empNo)) {
			System.out.println("삭제완료");
		}
	}//end of remove 
	
}// end of class
