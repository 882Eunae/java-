package com.yedam.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 
 * 실행클래스.
 * 1.글목록 2.글등록 3.삭제 9.종료
 * 
 * 
 * */
public class BoardExe {

	static Board[] boardRepo = new Board[100]; // 게시글등록 배열
	static Scanner scn = new Scanner(System.in);
	static String loginId; // 로그인 아이디를 저장.

	public static void initData() throws ParseException {
		// 배열의 샘플데이터.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		boardRepo[0] = new Board("게시글제목1", "내용입니다1,", "user01", sdf.parse("2025-02-03"));
		boardRepo[1] = new Board("게시글제목2", "내용입니다2,", "user02", sdf.parse("2025-02-03"));
		boardRepo[2] = new Board("게시글제목3", "내용입니다3,", "user03", sdf.parse("2025-02-03"));
		boardRepo[3] = new Board("게시글제목4", "내용입니다4,", "user04", sdf.parse("2025-02-03"));
		boardRepo[4] = new Board("게시글제목5", "내용입니다5,", "user05", sdf.parse("2025-02-03"));

		boardRepo[5] = new Board("게시글제목6", "내용입니다6,", "user06", sdf.parse("2025-02-03"));
		boardRepo[6] = new Board("게시글제목7", "내용입니다7,", "user07", sdf.parse("2025-02-03"));
		boardRepo[7] = new Board("게시글제목8", "내용입니다8,", "user08", sdf.parse("2025-02-03"));
		boardRepo[8] = new Board("게시글제목9", "내용입니다9,", "user09", sdf.parse("2025-02-03"));
		boardRepo[9] = new Board("게시글제목10", "내용입니다10,", "user010", sdf.parse("2025-02-03"));

		boardRepo[10] = new Board("게시글제목11", "내용입니다11,", "user08", sdf.parse("2025-02-03"));
		boardRepo[11] = new Board("게시글제목12", "내용입니다,", "user09", sdf.parse("2025-02-03"));
		boardRepo[12] = new Board("게시글제목13", "내용입니다10,", "user010", sdf.parse("2025-02-03"));

	}

	public static void boardList() {
		// 글목록.
		// 1페이지 0~4 2페이지 5~9 3페이지 10~14
		// 제목:5글자 이상 ~15글자 이하. 콘솔출력("등록 불가합니다")
		// 똑같은 글제목이 있으면 콘솔출력("이미 있는 제목입니다")
		int page = 1;
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0);

		while (true) {
			// 1page:1~5 2page 6~10 3page 11~15
			int endCnt = page * 5; // 5,10,15...
			int startCnt = endCnt - 5; // 0,5,10
			int loopCnt = 0;
			System.out.println("--------------------------------------------------");

			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null) {
					loopCnt++;
					if (loopCnt > startCnt && loopCnt <= endCnt)
						System.out.println(boardRepo[i].showBoard());
				}

			}

			System.out.println("이전페이지:p, 이후페이지:n, 종료: q");

			String paging = scn.nextLine();
			if (paging.equals("n")) { // 이후페이지 n
				// 마지막페이지 보다는 작은값
				if (page < lastPage) {
					page++;
				}

			} else if (paging.equals("p")) { // 이전페이지 p
				// 1보다는 큰페이지
				if (page > 1) {
					page--;
				}

			} else if (paging.equals("q")) { // 종료 q
				return; // 메소드 종료 할때 return
			}

		} // end of while
	}// end of boardList()

	// 배열 매개값으로 전달하면 건수가 몇건 반환 메소드.
	public static int getMaxCount() {
		int count = 0; // 전체건수.
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++;
			}
		}
		return count; // 건수 반환
	}

	public static void addBoard() {
		boolean exist = false;
		// 글등록.
		System.out.print("제목을 입력>> ");
		String title = scn.nextLine();
		if (title.length() > 5 && title.length() <= 15) {
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i]!=null &&boardRepo[i].getTitle().equals(title)) {

					exist = true;
					break;
				}

			} // end of for 존재 하는지 안하는지 체크 같은제목

			if (exist == false) {
				System.out.print("내용을 입력>> ");
				String content = scn.nextLine();

				// 배열의 빈공간에 등록
				for (int i = 0; i < boardRepo.length; i++) {
					if (boardRepo[i] == null) {
						boardRepo[i] = new Board(title, content, loginId, new Date());
						System.out.println("등록완료");
						break; // 한건만 등록.
					}

				} // end of for

			}
			
			 else if(exist==true){System.out.println("이미 있는 제목입니다");}

		}

		else {

			System.out.println("5글자 ~15글자 이하만 등록가능 등록불가합니다");

		}

		// else if(exist==true){System.out.println("이미 있는 제목입니다");}

	}// end of addBoard

	public static void removeBoard() {
		// 글삭제.글제목 입력 => 삭제는 null 대입하면 삭제
		System.out.println("삭제할게시글 제목입력>");
		String title = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
				boardRepo[i] = null;
				System.out.println("삭제 되었습니다");

				break;
			}
		}
	}// end of removeBoard()

	public static void main(String[] args) {
		// MemberExe exe =new MemberExe(); // 정적필드가 아닌경우에 인스턴스 생성

		while (true) {
			// id password 일치하면 글ㄹ목록 기능 사용
			System.out.println("아이디 입력>>");
			String id = scn.nextLine();
			System.out.println("비밀번호 입력>>");
			String pw = scn.nextLine();

			String name = MemberExe.login(id, pw);
			if (name != null) {
				// 환영메세지 !! "홍길동님,환영합니다"

				System.out.println("환영메세지!! " + name + "님,환영합니다");
				break;
			} else {
				System.out.println("아이디와 비번을 확인하세요");
			}
		} // end of login

		boolean run = true;
		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 초기데이터 생성

		while (run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료");
			System.out.print("선택>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				boardList();
				break; // 목록
			case 2:
				addBoard();
				break; // 등록
			case 3:
				removeBoard();
				break; // 삭제
			case 9:
				System.out.println("프로그램을 종료합니다");
				run = false;
				break; // 종료
			default: // 1,2,3,9 외의 경우
				System.out.println("메뉴를 확인하세요.");
			}

		} // end of while
		System.out.println("end of prog.");

	}// end of main

}
