package com.yedam.Inheritance;
/*
 * 학교정보
 */

public class UnivFreind extends Friend{
	//필드
	private String friendName; 
	private String phoneNumber;
	private String univName;
	private String univMajor;
	
	//생성자
	public UnivFreind(String friendName, String phoneNumber, String univName, String univMajor) {
		
		super(friendName,phoneNumber); 
		this.univName = univName;
		this.univMajor = univMajor;
	}
	//getter,setter
	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivMajor() {
		return univMajor;
	}

	public void setUnivMajor(String univMajor) {
		this.univMajor = univMajor;
	}
	//showlist 재정의 ->학교 정보추가 
	@Override
	public String showlist() {

		return super.showlist()+",학교: "+univName;
		
	}
	
	
	
}
