package com.yedam.interfac;

import com.yedam.Inheritance.ComFriend;

public class RemoteControlExe {
	public static void main(String[] args) {
		//상속관계 => 부모클래스 참조변수 =자식인스턴스. 
		//인터페이스 => 인터페이스 참조변수 =구현객체의 인스턴스.
		
		ComFriend friend=new ComFriend("","","","");
		RemoteControl rc=new Television();
		System.out.println(RemoteControl.MAX_VOLUME);
		rc.turnOn();
		
		rc=new Radio();
		rc.turnOff();
		rc.turnOn();
		
		
		
	}
}
