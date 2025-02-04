package com.yedam.Inheritance;

public class FriendManger {
public static void main(String[] args) {
	//홍길동,010-1111-2222
	//김민수,010-2222-3333,예담,역사학과
//	
//    Friend[] friendAry=new Friend[10];
//    friendAry[0]=new Friend("홍길동","010-1111-2222");
//	friendAry[1]=new ComFriend("박민규","010-2222-4444","구글","개발팀");
//    friendAry[2] = new UnivFreind("김민수", "010-1111-3333","예담","역사학과");
//  
	
	FriendExe app=FriendExe.getInstance(); //싱글톤 인스턴스 하나만 가져옴 
	app.run();  
    
    
}
}
