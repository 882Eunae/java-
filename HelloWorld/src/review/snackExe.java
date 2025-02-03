package review;

import java.util.Scanner;

public class snackExe {

	public static void main(String[] args) {
		
		boolean run=true; 
		Scanner scn= new Scanner(System.in);
		
		snack[] snackStore=new snack[100];  //과자가 모여있는 배열을 만듦 
		snack snack=new snack(); 
		snackStore[0]=new snack("포카칩",2500,"2025-12-01","오리온");
		snackStore[1]=new snack("썬칩",3000,"2025-10-01","롯데");
		snackStore[2]=new snack("오예스",5000,"2025-08-01","오리온"); //일단 과자 정보 어느정도 저장 해놓음 
		//....
		
		while(run) {
			System.out.println("1.목록 전체 보기 2.상품등록 3.상품정보확인 4.가격수정 5.유통기한 월별 확인 6.상품삭제하기 9.종료 ");
			int menu=Integer.parseInt(scn.nextLine());// menu 선택  
			switch(menu) {
			
			case 1:
				
				for(int i=0; i<snackStore.length; i++) {
					
					if(snackStore[i] !=null) {
						
						snack.showSnack(snackStore,i);
						
					}//if 
					
				}//과자 전체 배열 정보 for문(snackStore) 
				
				System.out.println("========과자 정보 모두확인==================================================");
				
				
				
				break; 
			
			case 2:
				break;
			case 3:
				break; 
				
			case 4:
				break; 
			case 5: 
				break; 
			case 6:
				break; 
			case 9:
				System.out.println("프로그램 종료");
				
				run=false;
				break;
			
			}
			
			
			
			
			
			
		}//end of while 
		
		
		
		
		
		
	}
	
}
