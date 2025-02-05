package com.yedam.Inheritance;

import java.util.Scanner;

/*
 * 친구목록,등록,수정,삭제. 
 * 수정:이름, 연락처입력.
 */
public class FriendExe {
	/*
	 * 싱글톤 1.필드선언
	 */
	private static FriendExe instance = new FriendExe();

	// 2.생성자 은닉.
	private FriendExe() {

	}

	// 3.인스턴스를 반환하는 메소드 .
	public static FriendExe getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[100]; // 저장공간.

	public void init() {
		friends[0] = new Friend("홍길동", "010-1111-2222");
		friends[1] = new UnivFreind("고길동", "010-1111-2222", "우리대학교", "복지학과");
		friends[2] = new ComFriend("정길동", "010-1111-2222", "인포젠", "개발팀");
	}//end of init 

	Scanner scn = new Scanner(System.in);

	// 시작메소드.
	public void run() {
		init();

		boolean run = true;
		while (run) {
			System.out.println("1.친구목록 2.등록 3.수정 4삭제 9.종료");
			System.out.println("메뉴선택>> ");
			int menu = scn.nextInt();
			switch (menu) {
			case 1:
				friendList();
				break;
			// 목록
			case 2:
				addFriend();
				break;

			case 3:
				editFriend();
				break;

			case 4:
				deleteFriend();
				break;

			case 9:
				System.out.println("end of prog");
				run = false;
			default:
				System.out.println("메뉴를 확인하세요");

			}// end of switch
		} // end of while
	}// end of run

	// 친구:이름,연락처
	// 학교:친구+학교명,전공
	// 회사:친구+회사명,부서
	void addFriend() {
		boolean run = true;
		while (run) {
			System.out.println("1.친구 2.학교친구 3.회사친구 4.종료");
			System.out.print("선택>> ");
			int choice = scn.nextInt(); // 메뉴선택
			scn.nextLine();

			// 이름,연락처
//    	System.out.println("이름입력>> ");
//		String name=scn.nextLine();
//		
//		System.out.println("번호입력>> ");
//		String phone=scn.nextLine();

			Friend friend = null;
			if (choice == 4) {
				System.out.println("친구등록 종료");
//    		run=false;
//    		break;
				return;
			} // 종료인지 아닌지 체크

			else {
				String name = "";
				while (true) {
					System.out.println("이름입력>> ");
					name = scn.nextLine();
					if (name.length() >= 2 && name.length() <= 10) {
						break;
					}

					else {
						System.out.println("번호를 다시 입력하세요");
					}

				} // end of while 이름 입력

				System.out.print("번호입력>> ");
				String phone = scn.nextLine();

				if (choice == 1) {

					friend = new Friend(name, phone);

				} else if (choice == 2) {

					System.out.println("학교명입력>> ");
					String school = scn.nextLine();
					System.out.println("전공입력>> ");
					String major = scn.nextLine();

					friend = new UnivFreind(name, phone, school, major);
				} else if (choice == 3) {

					System.out.println("회사명입력>> ");
					String company = scn.nextLine();
					System.out.println("부서입력>> ");
					String sector = scn.nextLine();

					friend = new ComFriend(name, phone, company, sector);

				} // 빈공간에 저장
				for (int i = 0; i < friends.length; i++) {

					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}

				} // end of for
			} // 계속 등록(1,2,3)일 경우의 else 문

		} // end of while
	}// end of addFriend



	void deleteFriend() {
		// 삭제
		boolean isExist=false; 
		System.out.println("친구삭제");
		System.out.println("삭제할 친구의 이름을 기입하시오");
		// 친구연락처 변경. 작성!!
		scn.nextLine();
		String target = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			
			if (friends[i] !=null && friends[i].getFriendName().equals(target) ) {
				friends[i]=null; 
				isExist=true; 
				System.out.println("삭제완료");
				break; 
			}  else if(!isExist) {
				
				System.out.println("요청하신 정보가 없습니다");
			}//end of else if
		}//end of for 
	}//end of deleteFriend

	void editFriend() {
		boolean isExist=false; 
		System.out.println("수정할 친구의 이름을 기입하시오");
		// 친구연락처 변경. 작성!!
		scn.nextLine();
		String target = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			
			if (friends[i] !=null && friends[i].getFriendName().equals(target) ) {
				System.out.println("어떤 번호로 수정하시겠습니까?");
				String editPhone = scn.nextLine();
				friends[i].setPhoneNumber(editPhone);
				System.out.println("수정완료");
				isExist=true; 
				break; 
			} else if(!isExist &&friends[i] !=null) {
				
				System.out.println(target+"의 정보가 없습니다");
				
			}
		}
	}// end of editFriend

	// 추가메소드. 목록
	void friendList() {
		System.out.println("친구목록");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].showlist());
			}
		} // end of for
	}// end of friendList

}
