package com.yedam.Inheritance;
/*
 * 친구목록 -일반(이름,연락처) 
 * 		  -학교(학교의정보) 
 * 		  -회사(회사의정보) 
 */
public class Friend {
	
	//필드.
	private String friendName; 
	private String phoneNumber;
	private BloodType btype;
	//생성자
	public Friend(String friendName,String phoneNumber) {
		this.friendName=friendName; 
		this.phoneNumber=phoneNumber;
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
	public BloodType getBtype() {
		return btype;
	}
	public void setBtype(BloodType btype) {
		this.btype = btype;
	}
	
	public String showlist() {
		return "이름: " +friendName+", 연락처: "+phoneNumber; 
	}
	
	
	
	
	
}
