package review;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.yedam.reference.Board;

public class boardExe {
	static Scanner scn=new Scanner(System.in);
	static board[] boardRepo=new board[100];
	
	public static void initData() throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		boardRepo[0] = new board("게시글제목1", "내용입니다1,", "user01", sdf.parse("2025-02-03"));
		boardRepo[1] = new board("게시글제목2", "내용입니다2,", "user02", sdf.parse("2025-02-03"));
		boardRepo[2] = new board("게시글제목3", "내용입니다3,", "user03", sdf.parse("2025-02-03"));
		boardRepo[3] = new board("게시글제목4", "내용입니다4,", "user04", sdf.parse("2025-02-03"));
		boardRepo[4] = new board("게시글제목5", "내용입니다5,", "user05", sdf.parse("2025-02-03"));

		boardRepo[5] = new board("게시글제목6", "내용입니다6,", "user06", sdf.parse("2025-02-03"));
		boardRepo[6] = new board("게시글제목7", "내용입니다7,", "user07", sdf.parse("2025-02-03"));
		boardRepo[7] = new board("게시글제목8", "내용입니다8,", "user08", sdf.parse("2025-02-03"));
		boardRepo[8] = new board("게시글제목9", "내용입니다9,", "user09", sdf.parse("2025-02-03"));
		boardRepo[9] = new board("게시글제목10", "내용입니다10,", "user010", sdf.parse("2025-02-03"));

		boardRepo[10] = new board("게시글제목11", "내용입니다11,", "user08", sdf.parse("2025-02-03"));
		boardRepo[11] = new board("게시글제목12", "내용입니다,", "user09", sdf.parse("2025-02-03"));
		boardRepo[12] = new board("게시글제목13", "내용입니다10,", "user010", sdf.parse("2025-02-03"));
		
	}
	
	public static int getMax() {
		int count=0;
		for(int i=0; i<boardRepo.length; i++) {
			
			if(boardRepo[i] !=null) {
				
				count++; 
			}
			
			
		}
		
		return count;
	}
	
	
	public static void boardList() {
		
		
		
		while(true) {
			int page=1;
			int lastPage = (int) Math.ceil(getMax() / 5.0);
			//page1:0~4 page2:5~9 
			int firCnt=(page-1) *5;//
			int endCnt=(page*5); 
			
			//한페이지씩  보여주는 for 
			for(int i=firCnt; i<endCnt ; i++) {
				
				if(boardRepo[i]==null) {
					endCnt++; 
				}
				
				if(boardRepo[i] !=null ) {
			
			boardRepo[i].showboard();}
			
			}//end of for 
			
			String menu=scn.nextLine(); //뭐할지 선택 
			
			
			
			if(menu.equals("n") && page<lastPage) {	
				page++;
				
			} else if(menu.equals("p") &&page>1) {
				page--;
				
			} else if(menu.equals("q")) {	
				return; //종료 
			}
			
		}//while 구문의 끝 
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		boolean run=true; 
		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(run) {
			
		int menu=Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		//1.게시글 목록 2.게시글등록 3.게시글삭제 9.프로그램 종료 
		
		case 1:
			boardList(); 
			break; 
		
		case 9:
			run=false;
			
		
		
		}// end of switch
		
		
			
			
			
		
			
			
			
		}
		
		
		
		
	}
	
			
			
	
}//end of class
