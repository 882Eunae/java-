package com.yedam.Inheritance;

import java.util.Scanner;

/*
 * 실행클래스(main)
 * mysql 
 * oracle
 *  
 */
public class DaoExe {
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in); 
			boolean run=true; 
			
			//MysqlDao dao=new MysqlDao();
			OracleDao dao=new OracleDao(); 
			
			while(run) {
				System.out.println("1.등록2.삭제3.조회9종료");
				System.out.println("선택>>");
				int menu=scn.nextInt();
				
				switch(menu) {
				case 1://등록 
					dao.register();
				case 2: //삭제
					dao.remove();
				case 3://조회.
					dao.search();
				case 9:
					run=false; 
				}//end of switch 
				
			}
			
			
		}
}
