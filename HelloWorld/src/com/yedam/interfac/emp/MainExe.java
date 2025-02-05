package com.yedam.interfac.emp;

import java.util.Scanner;

/*
 * 사원관리 app v.1
 * 실행클래스:MainExe
 * 인터페이스 활용. (배열,컬렉션) 
 * Employee, EmpAryExe,EmpListExe, EmpDAO(인터페이스)
 */

public class MainExe {
	public static void main(String[] args) {

		// 스캐너,run
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		// 배열,컬렉션
		EmpDAO dao = new EmpAryExe();

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회9.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {

			case 1: // 추가 사원번호 이름 전화번호
				System.out.println("사원번호");
				int empNo = Integer.parseInt(scn.nextLine());
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
				System.out.println("사원번호");
				empNo = Integer.parseInt(scn.nextLine());

				if (dao.removeEMP(empNo)) {
					System.out.println("삭제완료");
				}
				break;

			case 4: // 목록
				// 조회조건(급여 이상)

				System.out.println("조회 급여조건 >> ");
				sal=Integer.parseInt(scn.nextLine());  

				System.out.println("조회 이름조건 >>");
				String name = scn.nextLine();

				Employee emp = new Employee();// 기본생성자
				emp.setName(name); // emp의 sal 설정

				// 조회결과
				Employee[] result = dao.search(emp);
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
}// end of class
