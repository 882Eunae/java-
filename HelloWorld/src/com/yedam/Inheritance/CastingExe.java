package com.yedam.Inheritance;

public class CastingExe {
	
		
		public static void main(String[] args) {
			//byte < short < int < long
			int n1=100;
			long n2=0;
			n1=(int)n2;
			n2=(long) n1; //promotion 
			
			//Object <-Friend <- ComFriend,UnivFriend
			
			Friend f1=new ComFriend("","","",""); //promotion 
			//ComFriend f2=(ComFriend)new Friend("",""); //casting 큰요소 -> 작은요소
			f1=new Friend("홍길동","0101-1212");
			System.out.println(f1.toString());
			
			if(f1 instanceof ComFriend) {
				ComFriend f2=(ComFriend)f1;
				System.out.println(f2.showlist());
			} else {
				System.out.println("형변환 못함.");
			}
			
			
			
		}
}
